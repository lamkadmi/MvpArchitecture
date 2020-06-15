package com.architecture.mvp.feature.connexion.data;

import com.architecture.mvp.feature.connexion.data.local.MainLocalDataSource;
import com.architecture.mvp.feature.connexion.data.remote.MainRemoteDataSource;

import javax.inject.Inject;

public class MainRepositoryImpl implements MainRepository {

    private MainLocalDataSource mLocal;

    private MainRemoteDataSource mRemote;

    @Inject
    public MainRepositoryImpl(MainLocalDataSource mLocal, MainRemoteDataSource mRemote) {
        this.mLocal = mLocal;
        this.mRemote = mRemote;
    }
}
