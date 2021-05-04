package com.akshit.optionmenu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.Settings;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.mymenu,menu);
        return super.onCreateOptionsMenu(menu);

    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch(item.getItemId())
        {
            case R.id.item1:
                Toast.makeText(this, "Home Selected", Toast.LENGTH_SHORT).show();
                break;
            case  R.id.item2:
                Toast.makeText(this, "About Selected", Toast.LENGTH_SHORT).show();
                Intent i= new Intent(Settings.ACTION_APN_SETTINGS);
                startActivity(i);
                break;
            case R.id.item3:
                Toast.makeText(this, "Settings Selected", Toast.LENGTH_SHORT).show();
                Intent i1= new Intent(Settings.ACTION_SETTINGS);
                startActivity(i1);
                break;
            case R.id.item4:
                Toast.makeText(this, "Press Back Button to EXIT!!", Toast.LENGTH_SHORT).show();
        }
        return super.onOptionsItemSelected(item);
    }

}
