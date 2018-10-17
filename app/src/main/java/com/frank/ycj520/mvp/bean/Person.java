package com.frank.ycj520.mvp.bean;

import android.widget.ImageView;

public class Person {
    private int imageViewId;
    private String name;
    private String introduce;

    public Person(int imageViewId, String name, String introduce) {
        this.imageViewId = imageViewId;
        this.name = name;
        this.introduce = introduce;
    }

    public int getImageViewId() {
        return imageViewId;
    }

    public void setImageViewId(int imageViewId) {
        this.imageViewId = imageViewId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce;
    }
}
