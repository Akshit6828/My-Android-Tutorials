package com.akshit.imagebutton;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    ImageButton b1,b2,b3,b4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=findViewById(R.id.b1);
        b2=findViewById(R.id.b2);
        b3=findViewById(R.id.b3);
        b4=findViewById(R.id.b4);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    Intent i1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/search?q=hotstar&hl=en"));
                    startActivity(i1);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PackageManager pm = getPackageManager();
                String package_name = Uri.parse("us.zoom.videomeetings").toString();
                boolean isInstalled = isPackageInstalled(package_name, pm);
                if (isInstalled == true) {
                    Intent i2 = pm.getLaunchIntentForPackage("us.zoom.videomeetings");
                    startActivity(i2);
                } else {
                    Intent i2 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/search?q=zoom&hl=en"));
                    startActivity(i2);
                }
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i3=new Intent(Intent.ACTION_VIEW,Uri.parse("https://play.google.com/store/search?q=flipkart&c=apps&hl=en"));
                startActivity(i3);

            }
        });
        b4.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                PackageManager pm = getPackageManager();
                String package_name = Uri.parse("com.amazon.avod.thirdpartyclient").toString();
                boolean isInstalled = isPackageInstalled(package_name, pm);
                if (isInstalled == true) {
                    Intent i2 = pm.getLaunchIntentForPackage("com.amazon.avod.thirdpartyclient");
                    startActivity(i2);
                } else {
                    Intent i4 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=in.amazon.mShop.android.shopping&hl=e"));
                    startActivity(i4);
                }

              /*private boolean isPackageInstalled (String package_name, PackageManager pm) {
                try {
                    pm.getPackageInfo(package_name, 0);
                    return true;
                } catch (PackageManager.NameNotFoundException e) {
                    return false;
                }
            }*/
            }
        });
     }
    boolean isPackageInstalled(String package_name, PackageManager pm) {
        try {
            pm.getPackageInfo(package_name, 0);
            return true;
        } catch (PackageManager.NameNotFoundException e) {
            return false;
        }
    }
}
