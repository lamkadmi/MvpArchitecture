package com.fouzi.architecture.mvparchitecture.app.base;


/**
 * Created by pfli04961 on 15/01/2019.
 */

public interface BasePresenter<T> {

    void attachView(T view);

    void detachView();
}