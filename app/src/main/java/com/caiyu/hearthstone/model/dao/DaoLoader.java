package com.caiyu.hearthstone.model.dao;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by 渝 on 2016/1/30.
 */
public class DaoLoader {
    private static final String DATABASE_NAME = "hearth_stone.db";
    private static DaoSession daoSession;

    public static void init(Context context) {
        if (daoSession == null) {
            MyDevOpenHelper helper = new MyDevOpenHelper(context, DATABASE_NAME, null);
            SQLiteDatabase db = helper.getWritableDatabase();
            DaoMaster daoMaster = new DaoMaster(db);
            daoSession = daoMaster.newSession();
        }
    }

    public static DaoSession getDaoSession() {
        return daoSession;
    }
}
