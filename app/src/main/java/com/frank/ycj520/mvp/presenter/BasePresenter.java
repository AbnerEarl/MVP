package com.frank.ycj520.mvp.presenter;

import java.lang.ref.WeakReference;

public class BasePresenter<T> {

    //View的引用
    //IView iView;
    WeakReference<T> mViewRef;

    //进行绑定
    public void attachView(T view){
        mViewRef=new WeakReference<T>(view);
    }

    //进行解绑
    public void detachView(){
        mViewRef.clear();
    }

}
