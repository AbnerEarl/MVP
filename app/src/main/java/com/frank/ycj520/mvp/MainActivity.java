package com.frank.ycj520.mvp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.Toast;

import com.frank.ycj520.mvp.adapter.PersonAdapter;
import com.frank.ycj520.mvp.base.BaseActivity;
import com.frank.ycj520.mvp.bean.Person;
import com.frank.ycj520.mvp.presenter.IPresenter;
import com.frank.ycj520.mvp.view.IView;

import java.util.List;

public class MainActivity extends BaseActivity<IView,IPresenter<IView>> implements IView {

    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView=(ListView)findViewById(R.id.my_list_view);
        iPresenter.fetch();


    }

    @Override
    protected IPresenter<IView> createPresenter() {
        return new IPresenter<>();
    }



    @Override
    public void showLoading() {
        Toast.makeText(this,"正在加载……",Toast.LENGTH_LONG).show();
    }

    @Override
    public void showData(List<Person> personList) {
        PersonAdapter personAdapter =new PersonAdapter(this,personList);
        listView.setAdapter(personAdapter);
    }
}
