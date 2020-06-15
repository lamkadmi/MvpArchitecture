package com.architecture.mvp.feature.connexion.ui;


public class ConnexionPresenter implements ConnexionContrat.Presenter {

    private ConnexionContrat.View view;

    public ConnexionPresenter() {

    }

    @Override
    public void attachView(ConnexionContrat.View mView) {
        this.view = mView;
    }

    @Override
    public void detachView() {
        view = null;
    }

    @Override
    public void startSignInActivity() {
        view.onStartSignInActivity();
    }
}
