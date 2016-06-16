package com.caiyu.hearthstone.app;

import android.app.Application;

import com.caiyu.hearthstone.model.dao.DaoLoader;
import com.squareup.leakcanary.LeakCanary;

/**
 * Created by 渝 on 2016/6/15.
 */
public class HSApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        LeakCanary.install(this);
        DaoLoader.init(this);
    }
}
