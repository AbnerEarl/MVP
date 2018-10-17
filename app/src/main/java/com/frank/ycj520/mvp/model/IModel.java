package com.frank.ycj520.mvp.model;

import com.frank.ycj520.mvp.bean.Person;

import java.util.List;

/*
加载数据
 */
public interface IModel {
    void loadData(DataOnLoadListener dataOnLoadListener);
    interface DataOnLoadListener{
        void onComplete(List<Person> personList);
    }

}
