package practice.bucky.lesson37;

import android.content.*;
import android.widget.Toast;
public class NoticeReceiver extends BroadcastReceiver {
    // The system calls onReceive on delivery of the explicit intent.
    @Override
    public void onReceive(Context context, Intent message) {
        Toast.makeText(context, "Broadcast received", Toast.LENGTH_SHORT).show();
    }
}
