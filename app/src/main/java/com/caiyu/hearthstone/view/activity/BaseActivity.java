package com.caiyu.hearthstone.view.activity;

import android.app.Activity;
import android.os.Bundle;

import butterknife.ButterKnife;

/**
 * Created by 渝 on 2016/6/15.
 */
abstract class BaseActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getContentViewId());
        ButterKnife.bind(this);
        afterViewCreated();
    }

    protected abstract int getContentViewId();

    protected void afterViewCreated() {}
}
