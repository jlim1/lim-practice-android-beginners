package practice.bucky.lesson47;

import android.content.Context;
import android.view.*;
import android.widget.*;
public final class CustomAdapter extends ArrayAdapter<String> {
    CustomAdapter(Context context, String[] items) {
        super(context, android.R.layout.simple_list_item_1, items);
    }
    @Override
    public View getView(int position, View recycled, ViewGroup parent) {
        // The base adapter binds the row text before the custom icon is attached.
        TextView row = (TextView) super.getView(position, recycled, parent);
        row.setCompoundDrawablesWithIntrinsicBounds(android.R.drawable.ic_menu_gallery, 0, 0, 0);
        return row;
    }
}
