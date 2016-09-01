package com.example.user.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by user on 2016/9/1.
 */
public class CrimeListActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
