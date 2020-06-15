package com.architecture.mvp.feature.connexion.data.local;

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
