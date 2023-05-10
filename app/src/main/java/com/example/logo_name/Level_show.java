package com.example.logo_name;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

public class Level_show extends AppCompatActivity implements View.OnClickListener {
    Button back;
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level_show);
        back=findViewById(R.id.back);
        listView=findViewById(R.id.list_view);
        back.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

    }
}