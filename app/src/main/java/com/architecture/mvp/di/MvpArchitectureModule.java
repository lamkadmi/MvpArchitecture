package com.architecture.mvp.di;

import android.content.Context;

import com.architecture.mvp.base.BaseApplication;

import javax.inject.Singleton;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class MvpArchitectureModule {

    @Binds
    @Singleton
    abstract Context provideApplicationContext(BaseApplication app);

}
