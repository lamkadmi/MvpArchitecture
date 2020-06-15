package com.architecture.mvp.di;

import com.architecture.mvp.base.BaseApplication;
import com.architecture.mvp.feature.connexion.di.MainModule;

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
