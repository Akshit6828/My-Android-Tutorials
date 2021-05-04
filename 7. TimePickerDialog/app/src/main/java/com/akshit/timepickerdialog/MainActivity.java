package com.akshit.timepickerdialog;

import androidx.appcompat.app.AppCompatActivity;

import android.app.TimePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TimePicker;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    EditText et;
    int hour, min;
    Calendar ca;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et = findViewById(R.id.e1);

        et.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ca = Calendar.getInstance();
                hour = ca.get(Calendar.HOUR_OF_DAY);
                min = ca.get(Calendar.MINUTE);
                new TimePickerDialog(MainActivity.this, listener, hour, min, true).show();//Remember to use .Show() with it.
            }
        });

    }

    TimePickerDialog.OnTimeSetListener listener = new TimePickerDialog.OnTimeSetListener() {
        @Override
        public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
            et.setText(hourOfDay + ":" + minute);
        }
    };
}

