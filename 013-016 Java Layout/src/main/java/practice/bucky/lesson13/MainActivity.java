package practice.bucky.lesson13;

import android.app.*;
import android.content.*;
import android.os.*;
import android.view.*;
import android.widget.*;

public final class MainActivity extends Activity {
    @Override
    public void onCreate(Bundle state) {
        super.onCreate(state);
        // The activity creates its views in Java before adding them to the vertical layout.
        LinearLayout box = new LinearLayout(this);
        box.setOrientation(LinearLayout.VERTICAL);
        setContentView(box);
        EditText entry = new EditText(this);
        entry.setHint("Enter text");
        box.addView(entry);
        Button login = new Button(this);
        login.setText("Log in");
        box.addView(login);
        TextView status = new TextView(this);
        box.addView(status);
        login.setOnClickListener(view -> status.setText(entry.getText()));
    }
}
