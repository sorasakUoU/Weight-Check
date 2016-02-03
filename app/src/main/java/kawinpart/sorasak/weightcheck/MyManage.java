package kawinpart.sorasak.weightcheck;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by User on 3/2/2559.
 */
public class MyManage {

    //Explicit
    private MyOpenHelper objMyOpenHelper;
    private SQLiteDatabase writeSqliteDatabase, readSqlLiteDatabase;


    public MyManage(Context context) {

        //Create & Connected
        objMyOpenHelper = new MyOpenHelper(context);
        writeSqliteDatabase = objMyOpenHelper.getWritableDatabase();
        readSqlLiteDatabase = objMyOpenHelper.getReadableDatabase();


    } //Constructor

}  // Main Class
