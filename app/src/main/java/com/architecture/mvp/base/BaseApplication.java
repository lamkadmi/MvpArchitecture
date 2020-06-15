package com.architecture.mvp.base;

import android.os.StrictMode;

import com.architecture.mvp.di.DaggerMvpArchitectureComponent;
import com.architecture.mvp.utils.AppLogger;

import dagger.android.AndroidInjector;
import dagger.android.DaggerApplication;


public class BaseApplication extends DaggerApplication {

    @Override
    public void onCreate() {
        super.onCreate();
        // Initialisation StrictMode
//        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder()
//                .detectAll()
//                .penaltyLog()
//                .build());
//        StrictMode.setVmPolicy(new StrictMode.VmPolicy.Builder()
//                .detectAll()
//                .penaltyLog()
//                .build());


        AppLogger.init();
    }

    @Override
    protected AndroidInjector<BaseApplication> applicationInjector() {
        return DaggerMvpArchitectureComponent
                .builder().create(this);
    }

}
