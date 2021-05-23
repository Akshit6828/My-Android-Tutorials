package com.akshit.cameraandimage;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
   Button b1;
   ImageView imgview;
   Bitmap bmp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=findViewById(R.id.b1);
        imgview=findViewById(R.id.imgv1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              Intent i= new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
              startActivityForResult(i,5);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {

        if(requestCode==5&&resultCode==RESULT_OK&&data!=null)
        {

            Bundle b=data.getExtras();
            bmp=(Bitmap) b.get("data");
            imgview.setImageBitmap(bmp);
        }
        else
        {
            Toast.makeText(this, "Please Try again", Toast.LENGTH_SHORT).show();
        }


        super.onActivityResult(requestCode, resultCode, data);
    }
}
