package com.architecture.mvp.di;

import android.content.Context;
import android.content.SharedPreferences;

import com.architecture.mvp.base.BaseApplication;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by PFLI04961 on 08/03/2018.
 */

@Module
public class SharedPreferencesModule {


    private static final String SESSION_FILE = "mageoSession.dat";

    @Provides
    @Singleton
    SharedPreferences provideSharedPreferences(BaseApplication application) {
        return application.getApplicationContext().getSharedPreferences(SESSION_FILE, Context.MODE_PRIVATE);
    }
}
