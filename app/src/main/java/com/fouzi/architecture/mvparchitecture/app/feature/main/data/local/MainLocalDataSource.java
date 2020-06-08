package com.fouzi.architecture.mvparchitecture.app.feature.main.data.local;

import android.content.SharedPreferences;

import javax.inject.Inject;

public class MainLocalDataSource {

    @Inject
    public SharedPreferences sharedPreferences;


    /**
     * Constructeur
     */
    @Inject
    public MainLocalDataSource() {

    }


}
