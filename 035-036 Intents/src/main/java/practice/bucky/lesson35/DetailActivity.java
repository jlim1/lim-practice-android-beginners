package practice.bucky.lesson35;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
public final class DetailActivity extends Activity {
    @Override
    protected void onCreate(Bundle state) {
        super.onCreate(state);
        // The extra is read using the same key that the first activity supplied.
        TextView message = new TextView(this);
        message.setText(getIntent().getStringExtra("message"));
        setContentView(message);
    }
}
