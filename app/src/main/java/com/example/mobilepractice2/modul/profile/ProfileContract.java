package com.example.mobilepractice2.modul.profile;

import com.example.mobilepractice2.base.BasePresenter;
import com.example.mobilepractice2.base.BaseView;
import com.example.mobilepractice2.modul.login.LoginContract;

public interface ProfileContract {
    interface View extends BaseView<LoginContract.Presenter> {
        void redirectToLogin();
    }

    interface Presenter extends BasePresenter {
        void showUsername(String uname, String password);
        //void performLogin(String uname, String password);
    }
}
