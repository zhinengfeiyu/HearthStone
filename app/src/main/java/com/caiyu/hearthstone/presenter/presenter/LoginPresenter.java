package com.caiyu.hearthstone.presenter.presenter;

import android.os.Handler;

/**
 * Created by 渝 on 2016/6/15.
 */
public interface LoginPresenter {

    void login(String userName, String psw, Handler handler);
}
