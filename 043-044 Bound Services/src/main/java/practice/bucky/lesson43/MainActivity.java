package practice.bucky.lesson43;

import android.app.*;
import android.content.*;
import android.os.*;
import android.view.*;
import android.widget.*;

public final class MainActivity extends Activity {
    @Override
    public void onCreate(Bundle state) {
        super.onCreate(state);
        // Binding delivers the service binder to the activity through its connection.
        LinearLayout box = new LinearLayout(this);
        box.setOrientation(LinearLayout.VERTICAL);
        setContentView(box);
        Button clock = new Button(this);
        clock.setText("Current time");
        box.addView(clock);
        TextView status = new TextView(this);
        box.addView(status);
        clock.setOnClickListener(v -> {
            if (service != null)
                status.setText(service.time());
        });
    }
    private ClockService.ClockBinder service;
    private boolean bound;
    private final ServiceConnection connection = new ServiceConnection() {
        public void onServiceConnected(ComponentName name, IBinder binder) {
            service = (ClockService.ClockBinder) binder;
        }
        public void onServiceDisconnected(ComponentName name) {
            service = null;
        }
    };
    @Override
    protected void onStart() {
        super.onStart();
        bound = bindService(new Intent(this, ClockService.class), connection, BIND_AUTO_CREATE);
    }
    @Override
    protected void onStop() {
        if (bound)
            unbindService(connection);
        bound = false;
        service = null;
        super.onStop();
    }
}
