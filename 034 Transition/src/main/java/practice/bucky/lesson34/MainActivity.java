package practice.bucky.lesson34;

import android.app.*;
import android.content.*;
import android.os.*;
import android.view.*;
import android.widget.*;

public final class MainActivity extends Activity {
    @Override
    public void onCreate(Bundle state) {
        super.onCreate(state);
        // The transition manager animates the change in layout when the detail view is toggled.
        LinearLayout box = new LinearLayout(this);
        box.setOrientation(LinearLayout.VERTICAL);
        setContentView(box);
        Button toggle = new Button(this);
        toggle.setText("Toggle details");
        box.addView(toggle);
        TextView status = new TextView(this);
        box.addView(status);
        status.setText("Expanded details");
        toggle.setOnClickListener(v -> {
            android.transition.TransitionManager.beginDelayedTransition(box);
            status.setVisibility(status.getVisibility() == View.VISIBLE ? View.GONE : View.VISIBLE);
        });
    }
}
