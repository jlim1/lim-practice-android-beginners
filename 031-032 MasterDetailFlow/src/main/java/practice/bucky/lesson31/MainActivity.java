package practice.bucky.lesson31;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.*;

public final class MainActivity extends Activity {
    private static final String[] TITLES = {"Home", "Gallery", "About"};
    private static final String[] PAGES = {"Latest entries", "Photo collection", "Contact information"};
    private WebView detail;
    private int selected;

    @Override public void onCreate(Bundle state) {
        super.onCreate(state);
        boolean wide = getResources().getConfiguration().smallestScreenWidthDp >= 600;
        LinearLayout box = new LinearLayout(this);
        box.setOrientation(wide ? LinearLayout.HORIZONTAL : LinearLayout.VERTICAL);
        ListView master = new ListView(this);
        box.addView(master, new LinearLayout.LayoutParams(wide ? -2 : -1, -2));
        detail = new WebView(this);
        box.addView(detail, new LinearLayout.LayoutParams(wide ? 0 : -1, wide ? -1 : 0, 1f));
        setContentView(box);
        master.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, TITLES));
        master.setOnItemClickListener((list, row, index, id) -> showPage(index));
        showPage(state == null ? 0 : state.getInt("selected", 0));
    }

    private void showPage(int index) {
        selected = index;
        // The selected index supplies both the list title and the HTML shown in the detail pane.
        detail.loadDataWithBaseURL(null, "<h1>" + TITLES[index] + "</h1><p>" + PAGES[index] + "</p>",
                                   "text/html", "UTF-8", null);
    }
    @Override public void onSaveInstanceState(Bundle state) {
        super.onSaveInstanceState(state);
        state.putInt("selected", selected);
    }
}
