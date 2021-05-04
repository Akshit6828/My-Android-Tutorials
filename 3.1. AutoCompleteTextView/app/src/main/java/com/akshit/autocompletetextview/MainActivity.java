package com.akshit.autocompletetextview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class MainActivity extends AppCompatActivity {
    AutoCompleteTextView ac;
    String values[];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ac=findViewById(R.id.autoCompleteTextView);
        values=getResources().getStringArray(R.array.places);
        ArrayAdapter<String> adp= new ArrayAdapter<String >(this,android.R.layout.simple_list_item_1,values);
        ac.setAdapter(adp);
        ac.setThreshold(1);
    }
}
