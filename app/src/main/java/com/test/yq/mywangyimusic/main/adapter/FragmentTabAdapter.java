package com.test.yq.mywangyimusic.main.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.widget.Toast;

import com.test.yq.mywangyimusic.MainActivity;
import com.test.yq.mywangyimusic.R;
import com.test.yq.mywangyimusic.main.fragment.MainMusicFragment;

import java.util.List;

import butterknife.OnClick;

/**
 * Created by Administrator on 2017/9/11.
 */

public class FragmentTabAdapter implements View.OnClickListener {
    private List<Fragment> fragmentList;
    private MainActivity fragmentActivity;
    private int fragmentContentId;
    private int currentTab;

    public FragmentTabAdapter(MainActivity fragmentActivity, List<Fragment> fragmentList, int fragmentContentId) {
        this.fragmentActivity = fragmentActivity;
        this.fragmentList = fragmentList;
        this.fragmentContentId = fragmentContentId;
        FragmentTransaction ft = fragmentActivity.getSupportFragmentManager()
                .beginTransaction();
        ft.add(fragmentContentId, fragmentList.get(0));
        ft.commitAllowingStateLoss();
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.iv_option:

                break;
            case R.id.iv_friend:
                showFrags(2);
                break;
            case R.id.iv_music:
                showFrags(0);
                break;
            case R.id.iv_wymusic:
                showFrags(1);
                break;
            case R.id.iv_search:
                break;
        }
    }

    private void showFrags(int checkedId) {
        for (int i = 0; i < fragmentList.size(); i++) {
            if (i == checkedId) {
                Fragment fragment = fragmentList.get(i);
                FragmentTransaction ft = obtainFragmentTransaction(i);

                getCurrentFragment().onPause();

                if (fragment.isAdded()) {
                    fragment.onStart();
                } else {
                    ft.add(fragmentContentId, fragment);
                }
                showTab(i);
                ft.commit();
            }
        }
    }

    private void showTab(int idx) {
        for (int i = 0; i < fragmentList.size(); i++) {
            Fragment fragment = fragmentList.get(i);
            FragmentTransaction ft = obtainFragmentTransaction(idx);

            if (idx == i) {
                ft.show(fragment);
            } else {
                ft.hide(fragment);
            }
            ft.commit();
        }
        currentTab = idx;
    }

    private FragmentTransaction obtainFragmentTransaction(int index) {

        FragmentTransaction ft = fragmentActivity.getSupportFragmentManager()
                .beginTransaction();

        return ft;
    }

    public Fragment getCurrentFragment() {
        return fragmentList.get(currentTab);
    }
}
