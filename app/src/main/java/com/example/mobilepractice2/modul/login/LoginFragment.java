package com.example.mobilepractice2.modul.login;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.Nullable;
import com.example.mobilepractice2.R;
import com.example.mobilepractice2.base.BaseFragment;
import com.example.mobilepractice2.modul.profile.ProfileActivity;

public class LoginFragment extends BaseFragment<LoginActivity, LoginContract.Presenter> implements LoginContract.View {
    EditText etUsername;
    EditText etPassword;
    Button btnLogin;

    public LoginFragment() {
    }

    @Nullable
    @Override
    public android.view.View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState){
        super.onCreateView(inflater, container, savedInstanceState);
        fragmentView = inflater.inflate(R.layout.fragment_login, container, false);
        mPresenter = new LoginPresenter(this);
        mPresenter.start();

        etUsername = fragmentView.findViewById(R.id.etUsernameLogIn);
        etPassword = fragmentView.findViewById(R.id.etPasswordLogIn);
        btnLogin =fragmentView.findViewById(R.id.btnLogin);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setBtLoginClick();
            }
        });

        setTitle("Sign in");

        return fragmentView;

    }

    public void setBtLoginClick(){
        String uname = etUsername.getText().toString();
        String password = etPassword.getText().toString();
        mPresenter.performLogin(uname,password);
    }

    @Override
    public void setPresenter(LoginContract.Presenter presenter) {
        mPresenter = presenter;
    }

    @Override
    public void redirectToIndex(String username, String Password) {
        Intent intent = new Intent(activity, ProfileActivity.class);
        intent.putExtra("username", username);
        startActivity(intent);
        activity.finish();
    }
}
