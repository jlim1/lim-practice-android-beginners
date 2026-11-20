package practice.bucky.lesson10;

import android.app.*;
import android.content.*;
import android.os.*;
import android.view.*;
import android.widget.*;

public final class MainActivity extends Activity {
    @Override
    public void onCreate(Bundle state) {
        super.onCreate(state);
        // The lifecycle callbacks record when the screen enters and leaves the foreground.
        TextView message = new TextView(this);
        message.setText("Watch the Activity events in Logcat.");
        setContentView(message);
    }
    @Override
    protected void onStart() {
        super.onStart();
        android.util.Log.i("ActivityLifecycle", "onStart");
    }
    @Override
    protected void onResume() {
        super.onResume();
        android.util.Log.i("ActivityLifecycle", "onResume");
    }
    @Override
    protected void onPause() {
        super.onPause();
        android.util.Log.i("ActivityLifecycle", "onPause");
    }
    @Override
    protected void onStop() {
        super.onStop();
        android.util.Log.i("ActivityLifecycle", "onStop");
    }
    @Override
    protected void onRestart() {
        super.onRestart();
        android.util.Log.i("ActivityLifecycle", "onRestart");
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        android.util.Log.i("ActivityLifecycle", "onDestroy");
    }
}
