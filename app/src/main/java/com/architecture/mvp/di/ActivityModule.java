package com.architecture.mvp.di;

import com.architecture.mvp.feature.connexion.di.MainModule;
import com.architecture.mvp.feature.connexion.ui.ConnexionActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class ActivityModule {

    @ActivityScope
    @ContributesAndroidInjector(modules = {MainModule.class})
    abstract ConnexionActivity contributesMainActivity();
}
