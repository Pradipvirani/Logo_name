package com.example.logo_name;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button play,rank,growth,trophy;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        play=findViewById(R.id.play);
        rank=findViewById(R.id.rank);
        growth=findViewById(R.id.growth);
        trophy=findViewById(R.id.trophy);
        play.setOnClickListener(this);
        rank.setOnClickListener(this);
        growth.setOnClickListener(this);
        trophy.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        if (play.getId()==view.getId()) {
            Intent intent = new Intent(MainActivity.this, Level_show.class);
            startActivity(intent);
        }

    }
}