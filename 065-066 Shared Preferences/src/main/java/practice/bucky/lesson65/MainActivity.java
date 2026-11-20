package practice.bucky.lesson65;

import android.app.*;
import android.content.*;
import android.os.*;
import android.view.*;
import android.widget.*;

public final class MainActivity extends Activity {
    @Override
    public void onCreate(Bundle state) {
        super.onCreate(state);
        // SharedPreferences restores the saved string when the activity is opened again.
        LinearLayout box = new LinearLayout(this);
        box.setOrientation(LinearLayout.VERTICAL);
        setContentView(box);
        EditText entry = new EditText(this);
        entry.setHint("Enter text");
        box.addView(entry);
        Button store = new Button(this);
        store.setText("Save");
        box.addView(store);
        TextView status = new TextView(this);
        box.addView(status);
        SharedPreferences prefs = getPreferences(MODE_PRIVATE);
        status.setText(prefs.getString("note", ""));
        store.setOnClickListener(v -> {
            String value = entry.getText().toString();
            prefs.edit().putString("note", value).apply();
            status.setText(value);
        });
    }
}
