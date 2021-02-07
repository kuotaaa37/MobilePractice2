package com.example.mobilepractice2.modul.input;

public class InputPresenter implements InputContract.Presenter {
    private final InputContract.View view;

    public InputPresenter(InputContract.View view) {
        this.view = view;
    }

    @Override
    public void start() {}
}
