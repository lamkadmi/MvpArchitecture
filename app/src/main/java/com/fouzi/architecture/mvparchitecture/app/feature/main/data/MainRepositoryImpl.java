package com.fouzi.architecture.mvparchitecture.app.feature.main.data;

import com.fouzi.architecture.mvparchitecture.app.feature.main.data.local.MainLocalDataSource;
import com.fouzi.architecture.mvparchitecture.app.feature.main.data.remote.MainRemoteDataSource;

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
