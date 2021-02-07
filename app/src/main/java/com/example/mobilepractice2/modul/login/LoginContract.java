package com.example.mobilepractice2.modul.login;

import com.example.mobilepractice2.base.BasePresenter;
import com.example.mobilepractice2.base.BaseView;

public interface LoginContract {
    interface View extends BaseView<Presenter>{
        void redirectToIndex(String username, String Password);
    }

    interface Presenter extends BasePresenter {
        void performLogin(String uname, String password);
    }
}
