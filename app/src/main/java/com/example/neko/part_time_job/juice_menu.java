package com.example.neko.part_time_job;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class juice_menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_juice_menu);

        Button sendJuiceYakult =(Button)this.findViewById(R.id.yakult_juice);
        sendJuiceYakult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplication(),JuiceStyle.class);
                startActivity(intent);
            }
        });

        Button sendJuiceHoneyLemmot =(Button)this.findViewById(R.id.honylemon_juice);
        sendJuiceHoneyLemmot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplication(),JuiceStyle.class);
                startActivity(intent);
            }
        });

        Button sendJuiceGrapefruitjasmine =(Button)this.findViewById(R.id.grapefruits_jasmine_juice);
        sendJuiceGrapefruitjasmine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplication(),JuiceStyle.class);
                startActivity(intent);
            }
        });

        Button sendJuiceHoneyGrapefruits =(Button)this.findViewById(R.id.honeygrapefruits_juice);
        sendJuiceHoneyGrapefruits.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplication(),JuiceStyle.class);
                startActivity(intent);
            }
        });




    }
}
