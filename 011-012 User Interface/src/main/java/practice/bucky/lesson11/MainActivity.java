package practice.bucky.lesson11;

import android.app.*;
import android.content.*;
import android.os.*;
import android.view.*;
import android.widget.*;

public final class MainActivity extends Activity {
    @Override
    public void onCreate(Bundle state) {
        super.onCreate(state);
        // Inflating the XML layout creates the widgets and attaches them to the activity.
        setContentView(R.layout.activity_main);
    }
}
