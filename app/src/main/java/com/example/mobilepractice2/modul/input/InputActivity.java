package com.example.mobilepractice2.modul.input;

import android.view.View;
import com.example.mobilepractice2.R;

import com.example.mobilepractice2.base.BaseFragmentHolderActivity;

public class InputActivity extends BaseFragmentHolderActivity {
    InputFragment inputFragment;
    private final int UPDATE_REQUEST = 2019;

    @Override
    protected void initializeFragment() {
        initializeView();

        inputFragment = new InputFragment();
        setCurrentFragment(inputFragment, false);
    }
}
