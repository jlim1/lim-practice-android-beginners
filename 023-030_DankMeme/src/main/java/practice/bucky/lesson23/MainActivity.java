package practice.bucky.lesson23;

import android.app.*;
import android.content.*;
import android.os.*;
import android.view.*;
import android.widget.*;

public final class MainActivity extends Activity {
    @Override
    public void onCreate(Bundle state) {
        super.onCreate(state);
        // The fragment manager connects the editor to the preview in the same activity.
        setContentView(R.layout.activity_main);
    }
    public void preview(String a, String b) {
        ((BottomPictureFragment) getFragmentManager().findFragmentById(R.id.picture))
            .showText(a, b);
    }
}
