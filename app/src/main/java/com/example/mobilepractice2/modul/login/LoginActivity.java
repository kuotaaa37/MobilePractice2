package com.example.mobilepractice2.modul.login;

import android.view.View;
import com.example.mobilepractice2.R;

import com.example.mobilepractice2.base.BaseFragmentHolderActivity;

public class LoginActivity extends BaseFragmentHolderActivity {
    LoginFragment loginFragment;
    private final int UPDATE_REQUEST = 2019;

    @Override
    protected void initializeFragment() {
        initializeView();

        findViewById(R.id.btBack).setVisibility(View.GONE);

        loginFragment = new LoginFragment();
        setCurrentFragment(loginFragment, false);

    }
}
