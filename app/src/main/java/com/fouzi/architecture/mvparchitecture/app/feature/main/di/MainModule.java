package com.fouzi.architecture.mvparchitecture.app.feature.main.di;

import com.fouzi.architecture.mvparchitecture.app.di.ActivityScope;
import com.fouzi.architecture.mvparchitecture.app.feature.main.ui.MainActivityContrat;
import com.fouzi.architecture.mvparchitecture.app.feature.main.ui.MainActivityPresenter;

import dagger.Module;
import dagger.Provides;

@Module
public class MainModule {


    @Provides
    @ActivityScope
    MainActivityContrat.Presenter provideMainContrat() {
        return new MainActivityPresenter();
    }


}
