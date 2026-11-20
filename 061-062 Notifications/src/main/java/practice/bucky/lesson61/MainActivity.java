package practice.bucky.lesson61;

import android.app.*;
import android.content.*;
import android.os.*;
import android.view.*;
import android.widget.*;

public final class MainActivity extends Activity {
    @Override
    public void onCreate(Bundle state) {
        super.onCreate(state);
        // A notification channel groups notifications and the permission controls whether they can
        // be shown.
        LinearLayout box = new LinearLayout(this);
        box.setOrientation(LinearLayout.VERTICAL);
        setContentView(box);
        Button notify = new Button(this);
        notify.setText("Show notification");
        box.addView(notify);
        notify.setOnClickListener(v -> {
            if (Build.VERSION.SDK_INT >= 33
                && checkSelfPermission("android.permission.POST_NOTIFICATIONS")
                    != android.content.pm.PackageManager.PERMISSION_GRANTED) {
                requestPermissions(new String[] {"android.permission.POST_NOTIFICATIONS"}, 1);
            } else
                publish();
        });
    }
    private void publish() {
        NotificationManager manager = getSystemService(NotificationManager.class);
        manager.createNotificationChannel(
            new NotificationChannel("lesson", "Practice", NotificationManager.IMPORTANCE_DEFAULT));
        manager.notify(1,
            new Notification.Builder(this, "lesson")
                .setSmallIcon(android.R.drawable.ic_dialog_info)
                .setContentTitle("Practice")
                .setContentText("Notification delivered")
                .build());
    }
    @Override
    public void onRequestPermissionsResult(int id, String[] names, int[] grants) {
        super.onRequestPermissionsResult(id, names, grants);
        if (id == 1 && grants.length > 0
            && grants[0] == android.content.pm.PackageManager.PERMISSION_GRANTED)
            publish();
    }
}
