package com.akshit.mydbsqlite;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    MyDataBase dataBase;
   Button b1,b2,b3,b4,b5;
   EditText e1,e2,e3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dataBase= new MyDataBase(this);
        e1=findViewById(R.id.e1);
        e2=findViewById(R.id.e2);
        e3=findViewById(R.id.editText3);
        b1=findViewById(R.id.b1);
        b2=findViewById(R.id.b2);
        b3=findViewById(R.id.b3);
        b4=findViewById(R.id.b4);
        b5=findViewById(R.id.b5);
        b1.setOnClickListener(new View.OnClickListener() { //----SAVE BUTTON
            @Override
            public void onClick(View v) {
                int id=Integer.parseInt(e1.getText().toString());
                String name=e2.getText().toString();
                String course=e3.getText().toString();
                StudentRec record= new StudentRec(id,name,course);
               long result= dataBase.insertRecord(record);
                if(result>0)
                {
                    Toast.makeText(MainActivity.this, "Record inserted Sucessfully", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(MainActivity.this, "Query Problem", Toast.LENGTH_SHORT).show();
                }

            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id=Integer.parseInt(e1.getText().toString());
                StudentRec record=dataBase.getSingleRec(id);
                if(record!=null)
                {
                    Toast.makeText(MainActivity.this, "ID ="+record.getId()+
                            "\n Name ="+record.getName()+
                            "\n Course ="+record.getCourse(), Toast.LENGTH_SHORT).show();
                }

            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                List<StudentRec> list = dataBase.getAllRecord();
                int i;
                /*for (StudentRec record : list)
                    Toast.makeText(MainActivity.this, "ID =" + record.getId(), Toast.LENGTH_SHORT).show();*/
                String id="",name="",course="";
                for( i = 0; i < list.size(); i++) {
                    id += Integer.toString(list.get(i).getId()) + ",";
                    name += list.get(i).getName() + ",";
                    course += list.get(i).getCourse() + ",";
                }

                Toast.makeText(MainActivity.this, "TABLE NAME ="+ MyDataBase.DB_TABLE+"\n\nId's: " +id+"\nNames: "+name+"\nCourses :"+course+"\n\nRespectively........" , Toast.LENGTH_LONG).show();

            }

        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id=Integer.parseInt(e1.getText().toString());
                String name=e2.getText().toString();
                String course=e3.getText().toString();
                StudentRec rec= new StudentRec(id,name,course);
               long result= dataBase.updateRecord(rec);
               if(result>=0)
               {
                   Toast.makeText(MainActivity.this, "Record Updated", Toast.LENGTH_SHORT).show();
               }
               else
               {
                   Toast.makeText(MainActivity.this, "Update Problem...", Toast.LENGTH_SHORT).show();
               }
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id=Integer.parseInt(e1.getText().toString());
               long result= dataBase.deleteRecord(id);
               if(result>0)
               {
                   Toast.makeText(MainActivity.this, "Record Deleted Successfully", Toast.LENGTH_SHORT).show();
               }
               else
               {
                   Toast.makeText(MainActivity.this, "Delete Problem...", Toast.LENGTH_SHORT).show();
               }
            }
        });

    }
}
