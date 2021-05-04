package com.akshit.ratingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RatingBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    RatingBar rb;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rb= findViewById(R.id.rb1);
        tv= findViewById(R.id.tv1);
        rb.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                Float rate= rb.getRating();
                if(rate<=1.5)
                {
                    tv.setText("Average🙂");
                }
                else if(rate>1.5&&rate<=2.5)
                {
                    tv.setText("Good😊");
                }
                else if(rate>2.5&&rate<=3.5)
                {
                    tv.setText("Very Good😃");
                }
                else if(rate>3.5&&rate<=4.5)
                {
                    tv.setText("Awesome🤗");
                }
                else if(rate>4.5)
                {
                    tv.setText("Excellent🤩");
                }

            }
        });

    }
}
