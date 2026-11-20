package practice.bucky.lesson63;

import android.app.*;
import android.content.*;
import android.os.*;
import android.view.*;
import android.widget.*;

public final class MainActivity extends Activity {
    @Override
    public void onCreate(Bundle state) {
        super.onCreate(state);
        // The activity theme supplies defaults while the text appearance customizes this view.
        TextView text = new TextView(this);
        text.setTextAppearance(R.style.OceanText);
        text.setText("Ocean theme");
        setContentView(text);
    }
}
