package com.frank.ycj520.mvp.presenter;

import com.frank.ycj520.mvp.bean.Person;
import com.frank.ycj520.mvp.model.IModel;
import com.frank.ycj520.mvp.model.IModelImpl;
import com.frank.ycj520.mvp.view.IView;

import java.lang.ref.WeakReference;
import java.util.List;

/*
表示层
 */
public class IPresenter<T extends IView> extends BasePresenter<T>{

    //model的应用
    IModel iModel=new IModelImpl();

    //构造方法
    public IPresenter(T view){
        //mViewRef=new WeakReference<T>(view);
    }
    public IPresenter(){
    }

    //执行UI逻辑操作
    public void fetch(){
        if (mViewRef.get()!=null){
            mViewRef.get().showLoading();
            if (iModel!=null){
                iModel.loadData(new IModel.DataOnLoadListener() {
                    @Override
                    public void onComplete(List<Person> personList) {
                        mViewRef.get().showData(personList);
                    }
                });
            }
        }
    }
}
