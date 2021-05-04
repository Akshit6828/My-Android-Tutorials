package com.akshit.a2progressdialog;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity {
    Button b1;
    ProgressDialog pd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=findViewById(R.id.button);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
           pd= new ProgressDialog(MainActivity.this);
           pd.setProgressStyle(ProgressDialog.STYLE_SPINNER);
           pd.setTitle("MY DB");
           pd.setMessage("Please Wait");
          // pd.setCancelable(false);---IT NEVER DISMISS THE DIALOG
           pd.setCanceledOnTouchOutside(false);//-- IT DISMISS THE DIALOG WITH BACK PRESSED. THE USER WISH TO DISMISS THE DIALOG WITH BACK BUTTON AND WHEN HE CHECKS THE TIME REMAINING AGAIN AND AGAIN...
           pd.show();//only shows a dialog with round and Round Scrolling
            }
        });
    }
}
