package practice.bucky.lesson49;

import android.app.*;
import android.content.*;
import android.os.*;
import android.view.*;
import android.widget.*;

public final class MainActivity extends Activity {
    @Override
    public void onCreate(Bundle state) {
        super.onCreate(state);
        // After a database change, the activity re-queries the product list.
        LinearLayout box = new LinearLayout(this);
        box.setOrientation(LinearLayout.VERTICAL);
        setContentView(box);
        EditText entry = new EditText(this);
        entry.setHint("Enter text");
        box.addView(entry);
        Button add = new Button(this);
        add.setText("Add product");
        box.addView(add);
        Button remove = new Button(this);
        remove.setText("Delete product");
        box.addView(remove);
        TextView status = new TextView(this);
        box.addView(status);
        database = new MyDBHandler(this);
        Runnable refresh = () -> {
            status.setText(database.listProducts());
            entry.setText("");
        };
        refresh.run();
        add.setOnClickListener(v -> {
            String name = entry.getText().toString().trim();
            if (!name.isEmpty())
                database.add(new Products(name));
            refresh.run();
        });
        remove.setOnClickListener(v -> {
            database.remove(entry.getText().toString().trim());
            refresh.run();
        });
    }
    private MyDBHandler database;
    @Override
    protected void onDestroy() {
        database.close();
        super.onDestroy();
    }
}
