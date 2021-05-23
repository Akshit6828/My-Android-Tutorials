package com.akshit.recyclerview;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.core.app.ActivityCompat;
import androidx.recyclerview.widget.RecyclerView;

public class ApnaAdapter extends RecyclerView.Adapter<ApnaAdapter.MyViewHolder> {

    String text[];
    Integer pics[];
    Activity activity;
    ApnaAdapter(String text[],Integer pics[],Activity activity)
    {
        this.text=text;
        this.pics=pics;
        this.activity=activity;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View mylayout=activity.getLayoutInflater().inflate(R.layout.custom_layout_recyclerview,parent,false);//ROOT FALSE HOTA JB HM KOI LAYOUT CONNECTED HO...
        MyViewHolder  holder=new MyViewHolder(mylayout);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
holder.tv.setText(text[position]);
holder.imageView.setImageResource(pics[position]);
    }

    @Override
    public int getItemCount() {
        return pics.length;//returns lenght of how many times (Calls at No1)
    }

    //This code executes only once
 class MyViewHolder extends RecyclerView.ViewHolder {
        TextView tv;
        ImageView imageView;
         public MyViewHolder(@NonNull View itemView) {
         super(itemView);
         tv=itemView.findViewById(R.id.tv);
         imageView=itemView.findViewById(R.id.imageview1);
     }
 }
}
