package com.frank.ycj520.mvp.base;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;

import com.frank.ycj520.mvp.presenter.BasePresenter;

public abstract class BaseActivity<V,T extends BasePresenter<V>> extends Activity {
    //表示层的引用
    public T iPresenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        iPresenter=createPresenter();
        iPresenter.attachView((V) this);
    }

    protected abstract T createPresenter();

    @Override
    protected void onDestroy() {
        super.onDestroy();
        iPresenter.detachView();
    }
}
