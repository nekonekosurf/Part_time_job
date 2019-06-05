
package com.example.neko.part_time_job;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class honey_menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_honey_menu);



        Button sendHoneyAssam = (Button)this.findViewById(R.id.assam_honey);
        sendHoneyAssam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(getApplication(),HoneyStyle.class);
                startActivity(intent);

            }
        });


        Button sendHoneyJasmine = (Button)this.findViewById(R.id.jasmine_honey);
        sendHoneyJasmine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(getApplication(),HoneyStyle.class);
                startActivity(intent);
            }
        });


        Button sendHoneyTikuan = (Button)this.findViewById(R.id.tikuan_honey);
        sendHoneyTikuan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(getApplication(),HoneyStyle.class);
                startActivity(intent);

            }
        });

        Button sendHoneyJinfon = (Button)this.findViewById(R.id.jinfon_honey);
        sendHoneyJinfon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(getApplication(),HoneyStyle.class);
                startActivity(intent);

            }
        });


    }
}
