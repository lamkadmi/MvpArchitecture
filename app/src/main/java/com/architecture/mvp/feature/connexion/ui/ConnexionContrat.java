package com.architecture.mvp.feature.connexion.ui;

import com.architecture.mvp.base.BasePresenter;
import com.architecture.mvp.base.BaseView;

public interface ConnexionContrat {

    interface View extends BaseView {
        void onStartSignInActivity();
    }

    interface Presenter extends BasePresenter<View> {
        void startSignInActivity();
    }

}
