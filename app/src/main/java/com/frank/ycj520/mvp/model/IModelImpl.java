package com.frank.ycj520.mvp.model;

import com.frank.ycj520.mvp.R;
import com.frank.ycj520.mvp.bean.Person;

import java.util.ArrayList;
import java.util.List;

public class IModelImpl implements IModel{

    @Override
    public void loadData(DataOnLoadListener dataOnLoadListener) {
        List<Person> data=new ArrayList<>();
        data.add(new Person(R.drawable.test,"张三","上层社会的流氓。"));
        data.add(new Person(R.drawable.test,"张三","上层社会的流氓。"));
        data.add(new Person(R.drawable.test,"张三","上层社会的流氓。"));
        data.add(new Person(R.drawable.test,"张三","上层社会的流氓。"));
        data.add(new Person(R.drawable.test,"张三","上层社会的流氓。"));
        data.add(new Person(R.drawable.test,"张三","上层社会的流氓。"));
        data.add(new Person(R.drawable.test,"张三","上层社会的流氓。"));
        data.add(new Person(R.drawable.test,"张三","上层社会的流氓。"));
        data.add(new Person(R.drawable.test,"张三","上层社会的流氓。"));
        data.add(new Person(R.drawable.test,"张三","上层社会的流氓。"));

        dataOnLoadListener.onComplete(data);
    }
}
