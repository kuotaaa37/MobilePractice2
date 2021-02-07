package com.example.mobilepractice2.modul.profile;

import android.content.Intent;
import android.view.View;

import com.example.mobilepractice2.R;
import com.example.mobilepractice2.base.BaseFragmentHolderActivity;
import com.example.mobilepractice2.modul.login.LoginFragment;

public class ProfileActivity extends BaseFragmentHolderActivity {
    ProfileFragment profileFragment;
    private final int UPDATE_REQUEST = 2019;

    @Override
    protected void initializeFragment() {
        initializeView();

        findViewById(R.id.btBack).setVisibility(View.GONE);
        Intent intent = getIntent();
        String username = intent.getStringExtra("username");
        profileFragment = new ProfileFragment(username);
        setCurrentFragment(profileFragment, false);
    }
}
