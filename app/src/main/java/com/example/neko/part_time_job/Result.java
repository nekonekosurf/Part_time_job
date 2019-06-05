package com.example.neko.part_time_job;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class Result extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        //以下付け足しでデータを格納できているかをチェックしている。ラテのみで作動
        SharedPreferences data = getSharedPreferences("DATA",MODE_PRIVATE);

        //ドリンクのデータ
        String ordered_drink = data.getString("DRINK","選択されていません");
        TextView orderedDrink = (TextView) findViewById(R.id.drink_data);
        orderedDrink.setText(ordered_drink);

        //氷のデータ
        String ordered_ice = data.getString("ICE","REGULAR");
        TextView orderedIce = (TextView)findViewById(R.id.ice_data);
        orderedIce.setText(ordered_ice);

        //タピオカ
        boolean checkedTapioca = data.getBoolean("TAPIOCA_CHECKED", Boolean.parseBoolean(""));
        TextView orderedTapioca = (TextView)findViewById(R.id.tapioka_data);
        if (checkedTapioca==true){
            orderedTapioca.setText("あり");
        }
        else{
            orderedTapioca.setText("なし");
        }
        //サイズ
        boolean checkedSize = data.getBoolean("SIZE_CHECKED", Boolean.parseBoolean(""));
        TextView orderedSize = (TextView)findViewById(R.id.size_data);
        if (checkedSize==true){
            orderedSize.setText("Large");
        }
        else{
            orderedSize.setText("Medium");
        }


        //  あずき
        boolean checkedAzuki = data.getBoolean("AZUKI", Boolean.parseBoolean(""));
        TextView orderedAzuki = (TextView)findViewById(R.id.azuki_data);
        if (checkedAzuki==true){
            orderedAzuki.setText("あり");
        }
        else{
            orderedAzuki.setText("なし");
        }

        //甘さ
        String ordered_sweetness = data.getString("SWEETNESS","選択されていません");

        TextView orderedSweetness = (TextView) findViewById(R.id.sweetness_data);
        orderedSweetness.setText(ordered_sweetness);

        SharedPreferences.Editor editor = data.edit();
        editor.putString("SWEETNESS", "選択なし");//一度初期化
        editor.commit();



    }
}
