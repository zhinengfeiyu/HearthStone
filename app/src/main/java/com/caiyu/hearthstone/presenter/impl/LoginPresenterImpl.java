package com.caiyu.hearthstone.presenter.impl;

import com.caiyu.hearthstone.model.impl.LoginModelImpl;
import com.caiyu.hearthstone.model.model.LoginModel;
import com.caiyu.hearthstone.model.model.OnLoginListener;
import com.caiyu.hearthstone.presenter.presenter.LoginPresenter;
import com.caiyu.hearthstone.view.view.ILoginView;

import android.os.Handler;

/**
 * Created by 渝 on 2016/6/15.
 */
public class LoginPresenterImpl implements LoginPresenter {

    private ILoginView loginView;
    private LoginModel loginModel;

    public LoginPresenterImpl(ILoginView loginView) {
        this.loginView = loginView;
        this.loginModel = new LoginModelImpl();
    }

    @Override
    public void login(String userName, String psw, final Handler handler) {
        loginModel.login(userName, psw, new OnLoginListener() {
            @Override
            public void loginSuccess() {
                handler.post(new Runnable() {
                    @Override
                    public void run() {
                        loginView.showSuccess();
                    }
                });
            }

            @Override
            public void loginFailed() {
                handler.post(new Runnable() {
                    @Override
                    public void run() {
                        loginView.showFailure();
                    }
                });
            }
        });
    }
}
