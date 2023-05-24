package com.example.logo_name;

import static android.widget.LinearLayout.*;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;


public class Level_show extends AppCompatActivity  {
    RecyclerView recyclerView;
    String level []={"level 1","level 2","level 3","level 4"};
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level_show);
        recyclerView=findViewById(R.id.recyclerview);
        recycler_Adapter recycler_adapter = new recycler_Adapter(this,level);
        LinearLayoutManager manager=new LinearLayoutManager( this, RecyclerView.VERTICAL,false);
        recyclerView.setLayoutManager(manager);
        recyclerView.setAdapter(recycler_adapter);

    }


}