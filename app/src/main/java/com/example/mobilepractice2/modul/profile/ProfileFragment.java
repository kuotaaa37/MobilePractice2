package com.example.mobilepractice2.modul.profile;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;

import com.example.mobilepractice2.R;
import com.example.mobilepractice2.base.BaseFragment;
import com.example.mobilepractice2.modul.input.InputActivity;
import com.example.mobilepractice2.modul.login.*;
import com.example.mobilepractice2.modul.login.LoginContract;

public class ProfileFragment extends BaseFragment<ProfileActivity, ProfileContract.Presenter> implements ProfileContract.View{
    String username;
    TextView tvUsername;
    Button btnAddBook;

    public ProfileFragment(String username) {
        this.username = username;
    }

    @Nullable
    @Override
    public android.view.View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        fragmentView = inflater.inflate(R.layout.fragment_index, container, false);
        mPresenter = new ProfilePresenter(this);
        mPresenter.start();
        tvUsername = fragmentView.findViewById(R.id.usernameInIndex);
        tvUsername.setText("Welcome, " + username);
        setTitle("My Profile");

        btnAddBook = fragmentView.findViewById(R.id.btnAddBook);
        btnAddBook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                redirectToAddBook();
            }
        });

        return fragmentView;
    }

    @Override
    public void redirectToLogin() {
        Intent intent = new Intent(activity, LoginActivity.class);
        startActivity(intent);
        activity.finish();
    }


    public void redirectToAddBook() {
        Intent intent = new Intent(activity, InputActivity.class);
        startActivity(intent);
        activity.finish();
    }

    @Override
    public void setPresenter(LoginContract.Presenter presenter) {

    }
}
