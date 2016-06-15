package com.caiyu.hearthstone.model.impl;

import com.caiyu.hearthstone.model.model.LoginModel;
import com.caiyu.hearthstone.model.model.OnLoginListener;

/**
 * Created by 渝 on 2016/6/15.
 */
public class LoginModelImpl implements LoginModel {

    @Override
    public void login(final String userName, final String psw, final OnLoginListener loginListener) {
        new Thread() {
            @Override
            public void run() {
                try {
                    Thread.sleep(5000);
                }
                catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if ("caiyu".equals(userName) && "abc".equals(psw)) {
                    loginListener.loginSuccess();
                }
                else {
                    loginListener.loginFailed();
                }
            }
        }.start();
    }
}
