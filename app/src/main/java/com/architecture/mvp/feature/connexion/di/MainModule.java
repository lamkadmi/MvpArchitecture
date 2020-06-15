package com.architecture.mvp.feature.connexion.di;

import com.architecture.mvp.di.ActivityScope;
import com.architecture.mvp.feature.connexion.ui.ConnexionContrat;
import com.architecture.mvp.feature.connexion.ui.ConnexionPresenter;

import dagger.Module;
import dagger.Provides;

@Module
public class MainModule {


    @Provides
    @ActivityScope
    ConnexionContrat.Presenter provideMainContrat() {
        return new ConnexionPresenter();
    }


}
