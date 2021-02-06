package com.example.teamprofile;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity
{
    Button buttonTianyiZhou, buttonSsuTingHung;


    /*
    * Todo
    *  - everyone of us have to create one separate activity (profile page)
    *  - main activity contains button for each of you to develop functions that leads to your own profile page
    * */

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Tianyi Zhou's Part
        buttonTianyiZhou = findViewById(R.id.TianyiZhouPage);
        buttonTianyiZhou.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                sendMessage(v);
            }
        });

        //Ssu-Ting Hung's Part
        buttonSsuTingHung = findViewById(R.id.SsuTingHungPage);
        buttonSsuTingHung.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {sendMessage1(v); }
        });
    }

    //Tianyi Zhou's Part
    public void sendMessage(View view)
    {
        Intent intent = new Intent(this, TianyiZhouProfile.class);
        startActivity(intent);
    }
    //Ssu-Ting Hung's Part
    public void sendMessage1(View view)
    {
        Intent intent = new Intent(this, SsuTingHungProfile.class);
        startActivity(intent);
    }

}