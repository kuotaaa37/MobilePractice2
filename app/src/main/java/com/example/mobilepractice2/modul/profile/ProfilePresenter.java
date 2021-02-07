package com.example.mobilepractice2.modul.profile;


public class ProfilePresenter implements ProfileContract.Presenter{
    private final ProfileContract.View view;

    public ProfilePresenter(ProfileContract.View view) {
        this.view = view;
    }

    @Override
    public void showUsername(String uname, String password) {
        view.redirectToLogin();
    }

    @Override
    public void start() {}
}
