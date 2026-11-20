package practice.bucky.lessonsqlite;

import android.content.*;
import android.database.Cursor;
import android.database.sqlite.*;
final class MyDBHandler extends SQLiteOpenHelper {
    MyDBHandler(Context context) {
        super(context, "products.db", null, 1);
    }
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE products (_id INTEGER PRIMARY KEY, name TEXT NOT NULL)");
    }
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        throw new IllegalStateException("Unknown schema version");
    }
    void add(Products p) {
        ContentValues row = new ContentValues();
        row.put("name", p.name);
        getWritableDatabase().insertOrThrow("products", null, row);
    }
    // Binding the name keeps punctuation in the product value separate from the SQL.
    void remove(String name) {
        getWritableDatabase().delete("products", "name = ?", new String[] {name});
    }
    String listProducts() {
        StringBuilder text = new StringBuilder();
        try (Cursor rows = getReadableDatabase().query(
                 "products", new String[] {"name"}, null, null, null, null, "_id")) {
            while (rows.moveToNext()) text.append(rows.getString(0)).append("\n");
        }
        return text.toString();
    }
}
