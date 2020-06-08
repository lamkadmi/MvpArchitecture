package com.fouzi.architecture.mvparchitecture.app.feature.main.ui;


public class MainActivityPresenter implements MainActivityContrat.Presenter {

    private MainActivityContrat.View view;

    public MainActivityPresenter() {

    }

    @Override
    public void attachView(MainActivityContrat.View mView) {
        this.view = mView;
    }

    @Override
    public void detachView() {
        view = null;
    }


}
