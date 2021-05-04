package com.akshit.datepickerdialog;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;

import java.util.Calendar;



public class MainActivity extends AppCompatActivity {
    EditText et;
    int m,d,y;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et=findViewById(R.id.et1);
        Calendar ca= Calendar.getInstance();
        y=ca.get(Calendar.YEAR);
        m=ca.get(Calendar.MONTH);
        d=ca.get(Calendar.DAY_OF_MONTH);
        et.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new DatePickerDialog(MainActivity.this,null,y,m,d).show();


            }
        });


    }
    //Always do this outside the onCreate
    DatePickerDialog.OnDateSetListener listener= new DatePickerDialog.OnDateSetListener() {
        @Override
        public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
            et.setText(dayOfMonth+"/"+(month+1)+"/"+year);
            d=dayOfMonth;
            m=month;
            y=year;
        }
    };

}
