package practice.bucky.lesson18;

import android.app.*;
import android.content.*;
import android.os.*;
import android.view.*;
import android.widget.*;

public final class MainActivity extends Activity {
    @Override
    public void onCreate(Bundle state) {
        super.onCreate(state);
        // The listener attached to the button updates the text when its gesture is recognized.
        LinearLayout box = new LinearLayout(this);
        box.setOrientation(LinearLayout.VERTICAL);
        setContentView(box);
        Button tap = new Button(this);
        tap.setText("Press here");
        box.addView(tap);
        TextView status = new TextView(this);
        box.addView(status);
        tap.setOnClickListener(view -> status.setText("Clicked"));
    }
}
