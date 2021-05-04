package com.akshit.staticlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
 ListView lv;
 String poets[];
 String poet_name;
  //String pos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv=findViewById(R.id.lv1);
         poets=getResources().getStringArray(R.array.Hindi_poets);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_multiple_choice,poets);
        lv.setAdapter(adapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            }
                /*if(position==0)
                {
                    Intent i= new Intent(MainActivity.this,Display.class);
                    poet_name="Mahadevi Verma";
                    int pos=position;
                    i.putExtra("poet_name_key",poet_name);
                   // i.putExtra("pos",0);
                    startActivity(i);
                }
                else if(position==1)
                {
                    Intent i= new Intent(MainActivity.this,Display.class);
                    poet_name="Munshi PremChandar";
                    int pos=position;
                    i.putExtra("poet_name_key",poet_name);
                  //  i.putExtra("pos",1);
                    startActivity(i);
                }
                else if(position==2)
                {
                    Intent i= new Intent(MainActivity.this,Display.class);
                    poet_name="Gulzar";
                    int pos=position;
                    i.putExtra("poet_name_key",poet_name);
                   // i.putExtra("pos",2);
                    startActivity(i);
                }
                else if(position==3)
                {
                    Intent i= new Intent(MainActivity.this,Display.class);
                    poet_name="Mailthili Sharan Gupt";
                    int pos=position;
                    i.putExtra("poet_name_key",poet_name);
                   // i.putExtra("pos",3);
                    startActivity(i);
                }
                else if(position==4)
                {
                    Intent i= new Intent(MainActivity.this,Display.class);
                    poet_name="Kabir Das";
                    int pos=position;
                    i.putExtra("poet_name_key",poet_name);
                   // i.putExtra("pos",4);
                    startActivity(i);
                }

            }*/
        });
    }
}
