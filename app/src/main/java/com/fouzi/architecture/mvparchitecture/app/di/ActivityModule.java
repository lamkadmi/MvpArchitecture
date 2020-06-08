package com.fouzi.architecture.mvparchitecture.app.di;

import com.fouzi.architecture.mvparchitecture.app.feature.main.di.MainModule;
import com.fouzi.architecture.mvparchitecture.app.feature.main.ui.MainActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class ActivityModule {

    @ActivityScope
    @ContributesAndroidInjector(modules = {MainModule.class})
    abstract MainActivity contributesMainActivity();
}
