package com.example.mobilepractice2.modul.input;

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
import com.example.mobilepractice2.modul.input.InputActivity;
import com.example.mobilepractice2.modul.login.LoginActivity;
import com.example.mobilepractice2.modul.profile.ProfileActivity;

public class InputFragment extends BaseFragment<InputActivity, InputContract.Presenter> implements InputContract.View{
    EditText etInputAddBook;
    Button btnInputAddBook;

    public InputFragment() {
    }

    @Nullable
    @Override
    public android.view.View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        fragmentView = inflater.inflate(R.layout.fragment_input, container, false);
        mPresenter = new InputPresenter(this);
        mPresenter.start();

        return fragmentView;
    }

    @Override
    public void setPresenter(InputContract.Presenter presenter) {
        mPresenter = presenter;
    }

/*    @Override
    public void redirectToIndex(String username, String Password) {
        Intent intent = new Intent(activity, ProfileActivity.class);
        intent.putExtra("username", username);
        startActivity(intent);
        activity.finish();
    }*/
}
