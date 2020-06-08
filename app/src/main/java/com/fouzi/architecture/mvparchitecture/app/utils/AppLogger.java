package com.fouzi.architecture.mvparchitecture.app.utils;


import com.fouzi.architecture.mvparchitecture.BuildConfig;

import timber.log.Timber;

/**
 * Created by PFLI04961 on 14/03/2018.
 */

public class AppLogger {

    private AppLogger() {
        // AppLogger constructor
    }

    public static void init() {
        Timber.plant(new Timber.DebugTree());
    }

    public static void d(String s, Object... objects) {
        Timber.d(s, objects);
    }

    public static void d(Throwable throwable, String s, Object... objects) {
        Timber.d(throwable, s, objects);
    }

    public static void i(String s, Object... objects) {
        Timber.i(s, objects);
    }

    public static void i(Throwable throwable, String s, Object... objects) {
        Timber.i(throwable, s, objects);
    }

    public static void w(String s, Object... objects) {
        Timber.w(s, objects);
    }

    public static void w(Throwable throwable, String s, Object... objects) {
        Timber.w(throwable, s, objects);
    }

    public static void e(String s, Object... objects) {
        Timber.e(s, objects);
    }

    public static void e(Throwable throwable, String s, Object... objects) {
        Timber.e(throwable, s, objects);
    }
}