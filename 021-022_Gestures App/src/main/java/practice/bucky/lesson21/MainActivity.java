package practice.bucky.lesson21;

import android.app.*;
import android.content.*;
import android.os.*;
import android.view.*;
import android.widget.*;

public final class MainActivity extends Activity {
    @Override
    public void onCreate(Bundle state) {
        super.onCreate(state);
        // The gesture detector recognizes patterns in the touch events delivered to the layout.
        LinearLayout box = new LinearLayout(this);
        box.setOrientation(LinearLayout.VERTICAL);
        setContentView(box);
        TextView status = new TextView(this);
        box.addView(status);
        status.setText("Tap, double tap, or swipe");
        GestureDetector detector =
            new GestureDetector(this, new GestureDetector.SimpleOnGestureListener() {
                @Override
                public boolean onDown(MotionEvent e) {
                    return true;
                }
                @Override
                public boolean onSingleTapConfirmed(MotionEvent e) {
                    status.setText("Single tap");
                    return true;
                }
                @Override
                public boolean onDoubleTap(MotionEvent e) {
                    status.setText("Double tap");
                    return true;
                }
                @Override
                public boolean onFling(MotionEvent a, MotionEvent b, float vx, float vy) {
                    status.setText("Swipe");
                    return true;
                }
            });
        box.setOnTouchListener((view, event) -> detector.onTouchEvent(event));
    }
}
