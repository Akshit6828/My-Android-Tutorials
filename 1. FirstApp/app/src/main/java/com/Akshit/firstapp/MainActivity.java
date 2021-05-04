package com.Akshit.firstapp;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
   private static final String TAG="Event";
    Button b1;
    EditText e1;

    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1= findViewById(R.id.Et1);
        b1=findViewById(R.id.btn1);


        b1.setOnClickListener(this);
       Log.d(TAG,"On Create Running");
    }



   @Override
    public void onClick(View v) {
        String str="";
        str= e1.getText().toString();
        int a=0;
         a=Integer.parseInt(str);
        if(a>=18)
        {
            Toast.makeText(this, "You are valid for Voting", Toast.LENGTH_SHORT).show();
        }
        else
        {
            Toast.makeText(this, "Beta Garh jau😋", Toast.LENGTH_SHORT).show();
        }
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG,"OnStart Running....");
    }
    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG,"OnStop Running....");
    }
    @Override
    protected void onPostResume() {
        super.onPostResume();
        Log.d(TAG,"On PostResume Running....");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG,"On Pause Running....");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG,"On Resume Running....");
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG,"On Destroy Running....");
    }

}