package com.caiyu.hearthstone.model.model;

/**
 * Created by 渝 on 2016/6/15.
 */
public interface LoginModel {

    void login(String userName, String psw, OnLoginListener loginListener);
}
