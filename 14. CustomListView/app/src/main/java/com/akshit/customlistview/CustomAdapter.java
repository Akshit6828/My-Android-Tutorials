package com.akshit.customlistview;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomAdapter extends ArrayAdapter<String> {

    Activity activity;
    Integer picArray[];
    String stdname[];
    String stdcourse[];
 public CustomAdapter(Activity activity,Integer picArray[],String stdname[], String stdCourse[])
 {
     super(activity,R.layout.activity_main);
     this.activity=activity;
     this.picArray=picArray;
     this.stdname=stdname;
     this.stdcourse=stdCourse;       //making variables global/instance variables

 }

    @Override
    public int getCount() {
     return picArray.length;
    }

    @Override
    public View getView(int position,  View convertView,  ViewGroup parent) {
        LayoutInflater inf= activity.getLayoutInflater();

        View mylayout= inf.inflate(R.layout.custom_layout,null);
        ImageView iv= mylayout.findViewById(R.id.imageview1);
        TextView user= mylayout.findViewById(R.id.tv1);
        TextView course= mylayout.findViewById(R.id.tv2);
        iv.setImageResource(picArray[position]);
        user.setText(stdname[position]);
        course.setText(stdcourse[position]);
        return mylayout;


       // return super.getView(position, convertView, parent);
    }
}
