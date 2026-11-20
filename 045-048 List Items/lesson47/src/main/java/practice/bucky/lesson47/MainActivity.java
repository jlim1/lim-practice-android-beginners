package practice.bucky.lesson47;

import android.app.*;
import android.content.*;
import android.os.*;
import android.view.*;
import android.widget.*;

public final class MainActivity extends Activity {
    @Override
    public void onCreate(Bundle state) {
        super.onCreate(state);
        // The adapter creates rows from the array and the clicked position identifies the item.
        String[] foods = {"Apples", "Bread", "Cheese", "Tuna"};
        ListView list = new ListView(this);
        setContentView(list);
        list.setAdapter(new CustomAdapter(this, foods));
        list.setOnItemClickListener(
            (a, b, i, id) -> Toast.makeText(this, foods[i], Toast.LENGTH_SHORT).show());
    }
}
