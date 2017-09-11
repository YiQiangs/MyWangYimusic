package com.test.yq.mywangyimusic.base.activity;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.test.yq.mywangyimusic.R;

/**
 * Created by Administrator on 2017/9/11.
 */

public class BaseToolBarActivity extends AppCompatActivity {
    public ImageView iVOption;
    public ImageView iVSearch;
    public ImageView iVMusic;
    public ImageView iVWyMusic;
    public ImageView iVFriend;
    public LinearLayout baseBar;
    public Toolbar mToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        super.setContentView(R.layout.activity_tool_bar_base);
        iVOption = (ImageView) findViewById(R.id.iv_option);
        iVSearch = (ImageView) findViewById(R.id.iv_search);
        iVMusic = (ImageView) findViewById(R.id.iv_music);
        iVWyMusic = (ImageView) findViewById(R.id.iv_wymusic);
        iVFriend = (ImageView) findViewById(R.id.iv_friend);
        baseBar = (LinearLayout) findViewById(R.id.basebar);
        mToolbar = (Toolbar) findViewById(R.id.toolbar);
    }

    @Override
    public void setContentView(int layoutResID) {
        setContentView(View.inflate(this, layoutResID, null));
    }

    @Override
    public void setContentView(View view) {
        baseBar.addView(view, new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
        initToolbar();
    }

    private void initToolbar() {
        if (mToolbar != null) {
            //将Toolbar显示到界面
            mToolbar.setTitle("");//不显示toolbar标题
            mToolbar.setContentInsetStartWithNavigation(0);//返回图标距离标题为0
            setSupportActionBar(mToolbar);
        }
    }
}
