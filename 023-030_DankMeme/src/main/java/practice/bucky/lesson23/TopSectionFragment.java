package practice.bucky.lesson23;

import android.app.Fragment;
import android.os.Bundle;
import android.view.*;
import android.widget.*;
public final class TopSectionFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup parent, Bundle state) {
        LinearLayout box = new LinearLayout(getActivity());
        box.setOrientation(LinearLayout.VERTICAL);
        EditText a = new EditText(getActivity()), b = new EditText(getActivity());
        a.setHint("Top caption");
        b.setHint("Bottom caption");
        Button submit = new Button(getActivity());
        submit.setText("Preview");
        box.addView(a);
        box.addView(b);
        box.addView(submit);
        // The hosting activity passes both captions to the preview fragment.
        submit.setOnClickListener(view
            -> ((MainActivity) getActivity())
                .preview(a.getText().toString(), b.getText().toString()));
        return box;
    }
}
