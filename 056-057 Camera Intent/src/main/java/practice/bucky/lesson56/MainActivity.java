package practice.bucky.lesson56;

import android.app.*;
import android.content.*;
import android.os.*;
import android.view.*;
import android.widget.*;

public final class MainActivity extends Activity {
    @Override
    public void onCreate(Bundle state) {
        super.onCreate(state);
        // The activity requests a camera thumbnail and displays the returned bitmap.
        LinearLayout box = new LinearLayout(this);
        box.setOrientation(LinearLayout.VERTICAL);
        setContentView(box);
        Button capture = new Button(this);
        capture.setText("Take photo");
        box.addView(capture);
        preview = new ImageView(this);
        box.addView(preview);
        capture.setOnClickListener(v -> {
            try {
                startActivityForResult(
                    new Intent(android.provider.MediaStore.ACTION_IMAGE_CAPTURE), 1);
            } catch (ActivityNotFoundException e) {
                Toast.makeText(this, "Camera unavailable", Toast.LENGTH_SHORT).show();
            }
        });
    }
    private ImageView preview;
    @Override
    protected void onActivityResult(int code, int result, Intent data) {
        super.onActivityResult(code, result, data);
        if (code == 1 && result == RESULT_OK && data != null && data.getExtras() != null) {
            Object image = data.getExtras().get("data");
            if (image instanceof android.graphics.Bitmap)
                preview.setImageBitmap((android.graphics.Bitmap) image);
        }
    }
}
