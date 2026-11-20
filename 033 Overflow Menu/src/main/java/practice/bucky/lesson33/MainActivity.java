package practice.bucky.lesson33;

import android.app.*;
import android.content.*;
import android.os.*;
import android.view.*;
import android.widget.*;

public final class MainActivity extends Activity {
    @Override
    public void onCreate(Bundle state) {
        super.onCreate(state);
        // The activity supplies commands for the system overflow menu.
        TextView text = new TextView(this);
        text.setText("Choose an item from the overflow menu.");
        setContentView(text);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add("Settings");
        menu.add("Help");
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Toast.makeText(this, item.getTitle(), Toast.LENGTH_SHORT).show();
        return true;
    }
}
