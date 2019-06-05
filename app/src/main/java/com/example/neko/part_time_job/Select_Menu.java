package com.example.neko.part_time_job;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Select_Menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select__menu);


        Button sendStraight= (Button)this.findViewById(R.id.straight);
        sendStraight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplication(),straight_menu.class);
                startActivity(intent);
            }
        });




        Button sendHoney = (Button)this.findViewById(R.id.honey);
        sendHoney.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplication(),honey_menu.class);
                startActivity(intent);
            }
        });

        Button sendLatteMenu = (Button)this.findViewById(R.id.latte);
        sendLatteMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplication(),latte_menu.class);
                startActivity(intent);
            }
        });

        Button sendJuice = (Button)this.findViewById(R.id.juice);
        sendJuice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplication(),juice_menu.class);
                startActivity(intent);
            }
        });


    }
}
