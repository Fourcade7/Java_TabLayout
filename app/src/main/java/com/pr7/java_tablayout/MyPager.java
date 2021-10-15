package com.pr7.java_tablayout;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class MyPager extends FragmentPagerAdapter {
    Context context;
    int tab_count;

    public MyPager(@NonNull FragmentManager fm, Context context, int tab_count) {
        super(fm);
        this.context = context;
        this.tab_count = tab_count;
    }


    @NonNull
    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                BlankFragment blankFragment = new BlankFragment();
                return blankFragment;
            case 1:
                BlankFragment2 blankFragment2 = new BlankFragment2();
                return blankFragment2;
            case 2:
                BlankFragment3 blankFragment3 = new BlankFragment3();
                return blankFragment3;
        }
        return null;
    }

    @Override
    public int getCount() {
        return tab_count;
    }
}
