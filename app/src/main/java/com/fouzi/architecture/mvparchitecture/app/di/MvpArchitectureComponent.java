package com.fouzi.architecture.mvparchitecture.app.di;

import com.fouzi.architecture.mvparchitecture.app.base.BaseApplication;
import com.fouzi.architecture.mvparchitecture.app.feature.main.di.MainModule;

import javax.inject.Singleton;

import dagger.Component;
import dagger.android.AndroidInjectionModule;
import dagger.android.AndroidInjector;
import dagger.android.support.AndroidSupportInjectionModule;

@Singleton
@Component(modules = {
        AndroidInjectionModule.class,
        AndroidSupportInjectionModule.class,
        MvpArchitectureModule.class,
        ActivityModule.class,
        MainModule.class
})

public interface MvpArchitectureComponent extends AndroidInjector<BaseApplication> {

    @Component.Builder
    abstract class Builder extends AndroidInjector.Builder<BaseApplication> {

    }
}
