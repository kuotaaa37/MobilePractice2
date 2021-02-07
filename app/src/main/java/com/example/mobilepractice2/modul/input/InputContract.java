package com.example.mobilepractice2.modul.input;

import com.example.mobilepractice2.base.BasePresenter;
import com.example.mobilepractice2.base.BaseView;

public interface InputContract {
    interface View extends BaseView<InputContract.Presenter>{
//        void redirectToIndex(String username, String Password);
    }

    interface Presenter extends BasePresenter {
//        void performLogin(String uname, String password);
    }
}

