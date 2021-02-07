package com.example.mobilepractice2.modul.login;

public class LoginPresenter implements LoginContract.Presenter {
    private final LoginContract.View view;

    public LoginPresenter(LoginContract.View view){
        this.view =view;
    }

    @Override
    public void start() {}

    @Override
    public void performLogin(final String uname, final String password){
        view.redirectToIndex(uname, password);
    }
}
