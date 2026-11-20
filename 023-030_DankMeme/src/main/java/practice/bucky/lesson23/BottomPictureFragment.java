package practice.bucky.lesson23;

import android.app.Fragment;
import android.graphics.Color;
import android.os.Bundle;
import android.view.*;
import android.widget.*;

public final class BottomPictureFragment extends Fragment {
    private TextView top;
    private TextView bottom;

    @Override public View onCreateView(LayoutInflater inflater, ViewGroup parent, Bundle state) {
        FrameLayout frame = new FrameLayout(getActivity());
        ImageView photo = new ImageView(getActivity());
        photo.setImageResource(R.drawable.portrait);
        photo.setContentDescription("Portrait");
        photo.setScaleType(ImageView.ScaleType.FIT_CENTER);
        int height = Math.round(240 * getResources().getDisplayMetrics().density);
        frame.addView(photo, new FrameLayout.LayoutParams(-1, height));
        // The captions share the image frame and use opposite vertical edges.
        top = caption(frame, Gravity.TOP);
        bottom = caption(frame, Gravity.BOTTOM);
        if (state != null) showText(state.getString("top", ""), state.getString("bottom", ""));
        return frame;
    }

    private TextView caption(FrameLayout frame, int edge) {
        TextView text = new TextView(getActivity());
        text.setGravity(Gravity.CENTER);
        text.setTextColor(Color.WHITE);
        text.setBackgroundColor(0x80000000);
        frame.addView(text, new FrameLayout.LayoutParams(-1, -2, edge));
        return text;
    }

    void showText(String a, String b) { top.setText(a); bottom.setText(b); }

    @Override public void onSaveInstanceState(Bundle state) {
        super.onSaveInstanceState(state);
        state.putString("top", top.getText().toString());
        state.putString("bottom", bottom.getText().toString());
    }
}
