package practice.bucky.lesson41;

import android.app.*;
import android.content.*;
import android.os.*;
import android.view.*;
import android.widget.*;

public final class MainActivity extends Activity {
    @Override
    public void onCreate(Bundle state) {
        super.onCreate(state);
        // The service queues each start request for execution on a worker thread.
        LinearLayout box = new LinearLayout(this);
        box.setOrientation(LinearLayout.VERTICAL);
        setContentView(box);
        Button start = new Button(this);
        start.setText("Queue work");
        box.addView(start);
        start.setOnClickListener(v -> startService(new Intent(this, WorkService.class)));
    }
}
