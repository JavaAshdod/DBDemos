package tomer.edu.dbdemos;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by stud27 on 31/07/16.
 */
public class TodosDBHelper extends SQLiteOpenHelper {

    public TodosDBHelper(Context context) {
        super(context,
                "TodosDB", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String createTables = "CREATE TABLE Todos(" +
                "   id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL," +
                "   title TEXT, " +
                "   description TEXT" +
                " )";

        db.execSQL(createTables);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        String drop = "DROP TABLE Todos";
        db.execSQL(drop);
        onCreate(db);
    }
}
