package practice.bucky.lesson43;

import android.app.Service;
import android.content.Intent;
import android.os.*;
import java.text.DateFormat;
import java.util.Date;
public final class ClockService extends Service {
    // The local binder exposes the time to clients in the same process.
    public class ClockBinder extends Binder {
        public String time() {
            return DateFormat.getTimeInstance().format(new Date());
        }
    }
    @Override
    public IBinder onBind(Intent intent) {
        return new ClockBinder();
    }
}
