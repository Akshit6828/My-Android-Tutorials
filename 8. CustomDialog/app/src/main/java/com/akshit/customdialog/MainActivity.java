package com.akshit.customdialog;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import static java.lang.Thread.sleep;

public class MainActivity extends AppCompatActivity {
    Button b1,b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       b1=findViewById(R.id.button);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final Dialog dialog= new Dialog(MainActivity.this);
                dialog.setContentView(R.layout.custom_layout);
                final TextView e2= dialog.findViewById(R.id.t2);
                final EditText et=dialog.findViewById(R.id.et1);
                b2=dialog.findViewById(R.id.b1);
                //###################################################------------TIMER STARTS-------########################################################################
                new CountDownTimer(5000, 1000) {
                    @Override
                    public void onTick(long millisUntilFinished) {
                        e2.setText("Time Remaining  "+millisUntilFinished/1000);
                    }

                    @Override
                    public void onFinish() {
                       e2.setText("Times up");
                        /*try {
                           e2.setText("Times up");
                            sleep(1000);
                            dialog.dismiss();

                        } catch (InterruptedException e) {
                            e2.setText("Times up");
                            e.printStackTrace();
                        }*/
                        dialog.dismiss();
                        Toast.makeText(MainActivity.this, "Times Up!! Please Validate Again", Toast.LENGTH_SHORT).show();

                    }
                }.start();
                //################################################----------TIMER ENDS--------------#################################################################################

                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String otp=et.getText().toString();
                        Toast.makeText(MainActivity.this, "OTP is "+otp, Toast.LENGTH_SHORT).show();
                        dialog.dismiss();

                    }
                });
                dialog.show();


            }
        });


    }
}
