package practice.bucky.lesson39;

import android.app.*;
import android.content.*;
import android.os.*;
import android.view.*;
import android.widget.*;

public final class MainActivity extends Activity {
    @Override
    public void onCreate(Bundle state) {
        super.onCreate(state);
        // The worker calculates the sum and posts the result back to the UI thread.
        LinearLayout box = new LinearLayout(this);
        box.setOrientation(LinearLayout.VERTICAL);
        setContentView(box);
        Button start = new Button(this);
        start.setText("Run calculation");
        box.addView(start);
        TextView status = new TextView(this);
        box.addView(status);
        start.setOnClickListener(v -> new Thread(() -> {
            long sum = 0;
            for (int i = 1; i <= 100000; i++) sum += i;
            final String result = Long.toString(sum);
            runOnUiThread(() -> status.setText(result));
        }).start());
    }
}
