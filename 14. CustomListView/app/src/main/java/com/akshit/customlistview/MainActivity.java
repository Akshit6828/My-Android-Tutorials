package com.akshit.customlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ListView lv;
    Integer picArray[]={R.drawable.pic};
    String stdName[]={"Chintu",};
    String course[]={"Java"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv=findViewById(R.id.listview);

        CustomAdapter adapter= new CustomAdapter(this,picArray,stdName,course);
        lv.setAdapter(adapter);
    }
}
