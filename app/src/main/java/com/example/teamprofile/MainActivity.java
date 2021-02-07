package com.example.teamprofile;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity
{
    Button buttonTianyiZhou, buttonSsuTingHung, btn_Bruce, button_robert;


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

        //Bruce's part
        btn_Bruce = findViewById(R.id.btn_toBWPage);
        btn_Bruce.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                sendMessageBW(v);
            }
        });

        //Robert Heller's part
        button_robert = findViewById(R.id.robertspage);
        button_robert.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                sendMessageRob(v);
            }
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

    //Bruce's part
    public void sendMessageBW(View view)
    {
        Intent intent = new Intent(this, BruceWengProfile.class);
        startActivity(intent);
    }

    //Robert Heller's part
    public void sendMessageRob(View view)
    {
        Intent intent = new Intent(this, RobertHellerProfile.class);
        startActivity(intent);
    }
}