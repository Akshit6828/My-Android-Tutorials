package com.akshit.dynamiclistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    Button btn,b2;
    EditText et;
    ArrayList<String> arrayList;
    ArrayAdapter<String> arrayAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView=findViewById(R.id.lv1);
        btn= findViewById(R.id.b1);
        et= findViewById(R.id.e1);
        b2=findViewById(R.id.b2);
        arrayList= new ArrayList<String>();
        arrayAdapter= new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,arrayList);
        listView.setAdapter(arrayAdapter);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value= et.getText().toString();
                if(value.isEmpty())
                {
                    et.setError("Please Enter Value");
                }
                else
                {
                    arrayList.add(value);
                    arrayAdapter.notifyDataSetChanged();
                }

            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String item=et.getText().toString();
                if(item.isEmpty())
                {
                    et.setError("Please Enter Value");
                }
                else
                {
                    arrayList.add(item);
                    arrayAdapter.notifyDataSetChanged();
                }
            }
        });

    }
}
