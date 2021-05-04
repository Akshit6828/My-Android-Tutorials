package com.akshit.contextmenu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
ListView lv;
ArrayList<String> arrayList;
String selected_item;
int  pos;
    ArrayAdapter<String> adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv=findViewById(R.id.lv1);
        arrayList= new ArrayList<String>();
        arrayList.add("Alpha");
        arrayList.add("Beta");
        arrayList.add("Cupcake");

        adapter= new ArrayAdapter<String>(this,android.R.layout.simple_list_item_multiple_choice,arrayList);
        lv.setAdapter(adapter);
        registerForContextMenu(lv);
      lv.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
          @Override
          public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
              selected_item=arrayList.get(position);
              pos=position;
              adapter.notifyDataSetChanged();
              return false;
          }
      });
    }


    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        menu.add("Delete");
        menu.add("Rename");
      //  Toast.makeText(this, "Menu Info is"+menuInfo , Toast.LENGTH_SHORT).show();
        super.onCreateContextMenu(menu, v, menuInfo);
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {

        switch (item.getTitle().toString())
        {
            case "Delete":
                arrayList.remove(selected_item);
                adapter.notifyDataSetChanged();
                break;
            case "Rename":
                final Dialog dialog= new Dialog(MainActivity.this);
                dialog.setContentView(R.layout.custom_dialog_rename);
                final EditText e1=dialog.findViewById(R.id.e1);
                Button b1=dialog.findViewById(R.id.b1);
                e1.setText(selected_item);
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String getrename= e1.getText().toString();
                        arrayList.set(pos,getrename);
                        dialog.dismiss();
                        adapter.notifyDataSetChanged();
                    }
                });
                dialog.show();
                break;
        }
        return super.onContextItemSelected(item);
    }
}
