package practice.bucky.lesson37;

import android.app.*;
import android.content.*;
import android.os.*;
import android.view.*;
import android.widget.*;

public final class MainActivity extends Activity {
    @Override
    public void onCreate(Bundle state) {
        super.onCreate(state);
        // The explicit broadcast delivers the event to this application’s receiver.
        LinearLayout box = new LinearLayout(this);
        box.setOrientation(LinearLayout.VERTICAL);
        setContentView(box);
        Button send = new Button(this);
        send.setText("Send broadcast");
        box.addView(send);
        send.setOnClickListener(v -> sendBroadcast(new Intent(this, NoticeReceiver.class)));
    }
}
