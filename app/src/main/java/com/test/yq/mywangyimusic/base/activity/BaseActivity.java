package com.test.yq.mywangyimusic.base.activity;

import android.os.Bundle;

import butterknife.ButterKnife;

/**
 * Created by Administrator on 2017/9/11.
 */

public abstract class BaseActivity extends BaseToolBarActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layoutId());
        ButterKnife.bind(this, baseBar);
        initView();
    }

    public void initView() {

    }


    protected abstract int layoutId();


    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
