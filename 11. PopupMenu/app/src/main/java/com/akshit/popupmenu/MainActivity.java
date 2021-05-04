package com.akshit.popupmenu;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.PopupMenu;
import android.widget.TextView;

import static android.graphics.Color.RED;
import static com.akshit.popupmenu.R.color.GREEN;

public class MainActivity extends AppCompatActivity {
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv=findViewById(R.id.tv1);
        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PopupMenu p= new PopupMenu(MainActivity.this,tv);
                p.getMenuInflater().inflate(R.menu.popup_menu,p.getMenu());
                p.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        switch (item.getItemId())
                        {
                            case R.id.item1:
                              tv.setTextColor(getResources().getColor(R.color.RED));
                              break;
                            case R.id.item2:
                                tv.setTextColor(getResources().getColor(GREEN));
                                break;
                            case R.id.item3:
                                tv.setTextColor(getResources().getColor(R.color.YELLOW));
                                break;
                        }
//your code here


                        return false;
                    }
                });
                p.show();
            }
        });
    }
}
