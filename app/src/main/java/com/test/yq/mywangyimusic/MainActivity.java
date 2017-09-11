package com.test.yq.mywangyimusic;


import android.support.v4.app.Fragment;
import android.view.View;
import android.widget.Toast;

import com.test.yq.mywangyimusic.base.activity.BaseActivity;
import com.test.yq.mywangyimusic.main.adapter.FragmentTabAdapter;
import com.test.yq.mywangyimusic.main.fragment.MainMusicFragment;

import java.util.ArrayList;
import java.util.List;

import butterknife.OnClick;

public class MainActivity extends BaseActivity {
    private FragmentTabAdapter fragmentTableAdapter;

    private List<Fragment> fragments = new ArrayList<>();
    private MainMusicFragment framentOne = new MainMusicFragment();

    @Override
    protected int layoutId() {
        return R.layout.activity_main;
    }

    @Override
    public void initView() {
        fragments.add(framentOne);
        fragmentTableAdapter = new FragmentTabAdapter(this, fragments, R.id.fl_content);
    }

    @OnClick({})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.iv_option:

                break;
            case R.id.iv_friend:

                break;
            case R.id.iv_music:

                break;
            case R.id.iv_wymusic:

                break;
            case R.id.iv_search:
                break;
        }
    }
}
