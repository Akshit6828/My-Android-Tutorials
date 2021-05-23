package com.akshit.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
RecyclerView rv;
String text[]={"RAM","SHYAM","ABC","XYZ"};
Integer pics[]={R.drawable.image1,R.drawable.image2,R.drawable.image3,R.drawable.image4};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rv=findViewById(R.id.recyclerview);
        ApnaAdapter adapter= new ApnaAdapter(text,pics,this);
        rv.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));//Recyclerview kaise dikhega?
        rv.setAdapter(adapter);
    }
}
