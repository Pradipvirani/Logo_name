package com.example.logo_name;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

public class Level_show extends AppCompatActivity implements View.OnClickListener {
    RecyclerView recyclerView;
    String level []={"level 1","level 2","level 3","level 4"};
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level_show);
        recyclerView=findViewById(R.id.recyclerview);
        recycler_Adapter recycler_adapter = new recycler_Adapter(this,level);


    }

    @Override
    public void onClick(View view) {

    }
}