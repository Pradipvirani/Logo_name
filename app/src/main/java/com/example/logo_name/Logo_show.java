package com.example.logo_name;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Logo_show extends AppCompatActivity {
   int position;
   RecyclerView recyclerView;
   ArrayList<String> imagearr;
   @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logo_show);
        position=getIntent().getIntExtra("position",0);
        recyclerView=findViewById(R.id.recyclerview_logo_show);
        String[] strings;
       try {
           if (position==0) {
               strings = getAssets().list("unsold 1");
               imagearr= new ArrayList<String>(Arrays.asList(strings));
           }
           if (position==1) {
               strings = getAssets().list("unsold 2");
               imagearr= new ArrayList<String>(Arrays.asList(strings));
           }
           if (position==2) {
               strings = getAssets().list("unsold 3");
               imagearr= new ArrayList<String>(Arrays.asList(strings));
           }
           if (position==3) {
               strings = getAssets().list("unsold 4");
               imagearr= new ArrayList<String>(Arrays.asList(strings));
           }


       } catch (IOException e) {
           throw new RuntimeException(e);
       }
       grid_adapter adapter = new grid_adapter(this,imagearr,position);
       GridLayoutManager layoutManager=new GridLayoutManager(this,2);
       recyclerView.setLayoutManager(layoutManager);
       recyclerView.setAdapter(adapter);
   }
}