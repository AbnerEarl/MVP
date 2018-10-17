package com.frank.ycj520.mvp.view;

import com.frank.ycj520.mvp.bean.Person;

import java.util.List;

/*
定义UI逻辑
 */
public interface IView {
    void showLoading();
    void showData(List<Person> personList);
}
