package com.fouzi.architecture.mvparchitecture.app.di;

import android.content.Context;

import com.fouzi.architecture.mvparchitecture.app.base.BaseApplication;

import javax.inject.Singleton;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class MvpArchitectureModule {

    @Binds
    @Singleton
    abstract Context provideApplicationContext(BaseApplication app);

}
