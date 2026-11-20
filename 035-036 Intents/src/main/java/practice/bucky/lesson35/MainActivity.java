package practice.bucky.lesson35;

import android.app.*;
import android.content.*;
import android.os.*;
import android.view.*;
import android.widget.*;

public final class MainActivity extends Activity {
    @Override
    public void onCreate(Bundle state) {
        super.onCreate(state);
        // The explicit intent carries the entered text to the second activity.
        LinearLayout box = new LinearLayout(this);
        box.setOrientation(LinearLayout.VERTICAL);
        setContentView(box);
        EditText entry = new EditText(this);
        entry.setHint("Enter text");
        box.addView(entry);
        Button open = new Button(this);
        open.setText("Open second activity");
        box.addView(open);
        open.setOnClickListener(v
            -> startActivity(new Intent(this, DetailActivity.class)
                    .putExtra("message", entry.getText().toString())));
    }
}
