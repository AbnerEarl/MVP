package com.frank.ycj520.mvp.adapter;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.frank.ycj520.mvp.R;
import com.frank.ycj520.mvp.bean.Person;

import java.util.List;

public class PersonAdapter extends BaseAdapter {

    private LayoutInflater inflater;
    private List<Person> personList;

    @Override
    public int getCount() {
        return personList.size();
    }

    public PersonAdapter(Context context,List<Person> personList) {
        inflater=LayoutInflater.from(context);
        this.personList = personList;
    }

    @Override
    public Object getItem(int i) {
        return personList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        ViewHolder holder;
        if (convertView==null){
            convertView=inflater.inflate(R.layout.person_info_item,null);
            holder=new ViewHolder();

            holder.imageView=(ImageView)convertView.findViewById(R.id.imageView);
            holder.name=(TextView)convertView.findViewById(R.id.name);
            holder.introduce=(TextView)convertView.findViewById(R.id.introduce);

            convertView.setTag(holder);
        }else {
            holder= (ViewHolder) convertView.getTag();
        }

        Person person=personList.get(position);
        holder.imageView.setImageResource(person.getImageViewId());
        holder.name.setText("姓名："+person.getName());
        holder.introduce.setText("背景："+person.getIntroduce());

        return convertView;
    }

    public final class ViewHolder{
        ImageView imageView;
        TextView name;
        TextView introduce;
    }
}
