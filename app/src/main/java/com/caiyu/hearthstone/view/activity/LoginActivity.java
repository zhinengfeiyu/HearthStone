package com.caiyu.hearthstone.view.activity;

import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.caiyu.hearthstone.R;
import com.caiyu.hearthstone.presenter.impl.LoginPresenterImpl;
import com.caiyu.hearthstone.presenter.presenter.LoginPresenter;
import com.caiyu.hearthstone.view.view.ILoginView;

import butterknife.BindView;
import butterknife.OnClick;

/**
 * Created by 渝 on 2016/6/15.
 */
public class LoginActivity extends BaseActivity implements ILoginView {

    @BindView(R.id.userNameEt)
    EditText userNameEt;
    @BindView(R.id.passwordEt)
    EditText pswEt;
    @BindView(R.id.loginBtn)
    Button loginBtn;

    private Handler mHandler = new Handler();

    private LoginPresenter loginPresenter = new LoginPresenterImpl(this);

    @Override
    public int getContentViewId() {
        return R.layout.activity_login;
    }

    @Override
    public void afterViewCreated() {

    }

    @OnClick(R.id.loginBtn)
    void clickLogin() {
        loginPresenter.login(userNameEt.getText().toString(), pswEt.getText().toString(), mHandler);
    }

    @Override
    public void showSuccess() {
        Toast.makeText(this, "登录成功", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showFailure() {
        Toast.makeText(this, "用户名或密码错误", Toast.LENGTH_SHORT).show();
    }
}
