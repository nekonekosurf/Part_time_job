package com.example.neko.part_time_job;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class straight_menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_straight_menu);


        Button sendStraightAssam= (Button)this.findViewById(R.id.assam_straight);
        sendStraightAssam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplication(),LatteStyle.class);
                startActivity(intent);
            }
        });

        Button sendStraightJasmine= (Button)this.findViewById(R.id.jasmine_straight);
        sendStraightJasmine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplication(),LatteStyle.class);
                startActivity(intent);
            }
        });

        Button sendStraightTikuan= (Button)this.findViewById(R.id.tikuan_straight);
        sendStraightTikuan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplication(),LatteStyle.class);
                startActivity(intent);
            }
        });

        Button sendStraightJinfon = (Button)this.findViewById(R.id.jinfon_straight);
        sendStraightJinfon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplication(),LatteStyle.class);
                startActivity(intent);
            }
        });




    }
}
