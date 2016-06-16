package com.caiyu.hearthstone.model.dao;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by 渝 on 2016/6/16.
 */
public class MyDevOpenHelper extends DaoMaster.OpenHelper{
    public MyDevOpenHelper(Context context, String name, SQLiteDatabase.CursorFactory factory) {
        super(context, name, factory);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        DaoMaster.dropAllTables(db, true);
        onCreate(db);
    }
}
