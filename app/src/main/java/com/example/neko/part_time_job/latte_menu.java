package com.example.neko.part_time_job;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class latte_menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_latte_menu);


        Button sendLatteAssam = (Button)this.findViewById(R.id.assam_latte);
        sendLatteAssam.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                //以下で注文したドリンク名を保存
                SharedPreferences data = getSharedPreferences("DATA",MODE_PRIVATE);
                SharedPreferences.Editor editor = data.edit();
                editor.putString("DRINK","アッサムブラックティーラテ");
                editor.commit();
                //ここまで
                Intent intent = new Intent(getApplication(),LatteStyle.class);
                startActivity(intent);
            }
        });

        Button sendLatteTikuan = (Button)this.findViewById(R.id.tikuan_latte);
        sendLatteTikuan.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                //以下で注文したドリンク名を保存
                SharedPreferences data = getSharedPreferences("DATA",MODE_PRIVATE);
                SharedPreferences.Editor editor = data.edit();
                editor.putString("DRINK","鉄観音ティーラテ");
                editor.commit();
                //ここまで
                Intent intent = new Intent(getApplication(),LatteStyle.class);
                startActivity(intent);
            }
        });


        Button sendLatteJasmine = (Button)this.findViewById(R.id.jasmine_latte);
        sendLatteJasmine.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                //以下で注文したドリンク名を保存
                SharedPreferences data = getSharedPreferences("DATA",MODE_PRIVATE);
                SharedPreferences.Editor editor = data.edit();
                editor.putString("DRINK","ジャスミングリーンティーラテ");
                editor.commit();
                //ここまで
                Intent intent = new Intent(getApplication(),LatteStyle.class);
                startActivity(intent);
            }
        });


        Button sendLatteJinfon = (Button)this.findViewById(R.id.jinfon_latte);
        sendLatteJinfon.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                //以下で注文したドリンク名を保存
                SharedPreferences data = getSharedPreferences("DATA",MODE_PRIVATE);
                SharedPreferences.Editor editor = data.edit();
                editor.putString("DRINK","ジンフォンティーラテ");
                editor.commit();
                //ここまで
                Intent intent = new Intent(getApplication(),LatteStyle.class);
                startActivity(intent);
            }
        });

        Button sendLatteAzuki = (Button)this.findViewById(R.id.azuki_late);
        sendLatteAzuki.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //以下で注文したドリンク名を保存
                SharedPreferences data = getSharedPreferences("DATA",MODE_PRIVATE);
                SharedPreferences.Editor editor = data.edit();
                editor.putString("DRINK","小豆ティーラテ");
                editor.commit();
                //ここまで
                Intent intent = new Intent(getApplication(),AzukiStyle.class);
                startActivity(intent);
            }
        });


        Button sendLatteAzukiMatya = (Button)this.findViewById(R.id.azuki_matya_latte);
        sendLatteAzukiMatya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //以下で注文したドリンク名を保存
                SharedPreferences data = getSharedPreferences("DATA",MODE_PRIVATE);
                SharedPreferences.Editor editor = data.edit();
                editor.putString("DRINK","あずき抹茶ラテ");
                editor.commit();
                //ここまで
                Intent intent = new Intent(getApplication(),MatyaStyle.class);
            startActivity(intent);
            }
        });

        Button sendlatteOkinawa= (Button)this.findViewById(R.id.okinawa_latte);
        sendlatteOkinawa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //以下で注文したドリンク名を保存
                SharedPreferences data = getSharedPreferences("DATA",MODE_PRIVATE);
                SharedPreferences.Editor editor = data.edit();
                editor.putString("DRINK","沖縄黒糖ラテ");
                editor.commit();
                //ここまで
                Intent intent = new Intent(getApplication(),OkinawaStyle.class);
                startActivity(intent);
            }
        });

    }
}
