package com.example.neko.part_time_job;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioGroup;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import static com.example.neko.part_time_job.Latte.ICE;

public class LatteStyle extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_latte_style);


        //氷のシークバーの変化を表示する処理
        final TextView amount_of_ice = (TextView)findViewById(R.id.IceLatte);
        SharedPreferences pref = PreferenceManager.getDefaultSharedPreferences(this);
        int ice = pref.getInt(ICE,2);

        SeekBar IceSeekBar = (SeekBar)findViewById(R.id.SeekBarIceLatte);
        IceSeekBar.setProgress(ice);
        IceSeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                String value = String.valueOf(progress);

                SharedPreferences data = getSharedPreferences("DATA",MODE_PRIVATE);
                SharedPreferences.Editor editor = data.edit();
                editor.putString("ICE", "REGULAR");
                editor.commit();

                if (value.equals("0")) {
                    amount_of_ice.setText("NO");
                    editor.putString("ICE", "NO");
                    Toast.makeText(LatteStyle.this, "NO", Toast.LENGTH_SHORT).show();
                    editor.commit();
                }

                if (value.equals("1")) {
                    amount_of_ice.setText("LESS");
                    editor.putString("ICE", "LESS");
                    editor.commit();
                    Toast.makeText(LatteStyle.this, "LESS", Toast.LENGTH_SHORT).show();

                }

                if (value.equals("2")) {
                    amount_of_ice.setText("REGULAR");
                    editor.putString("ICE", "REGULAR");
                    editor.commit();
                    Toast.makeText(LatteStyle.this, "REGULAR", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }
            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
            }
        });
        //ここまで





        //タピオカのチェックボックスのデータ処理
        CheckBox checkBoxTapiocaLatte = (CheckBox) findViewById(R.id.TapiocaLatte);
        checkBoxTapiocaLatte.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        SharedPreferences data = getSharedPreferences("DATA", Context.MODE_PRIVATE);
                        SharedPreferences.Editor editor = data.edit();

                        if (((CheckBox) v).isChecked()) {
                            editor.putBoolean("TAPIOCA_CHECKED", true);
                            editor.apply();
                            Toast.makeText(LatteStyle.this, "あり", Toast.LENGTH_SHORT).show();
                        }

                        else {
                            editor.putBoolean("TAPIOCA_CHECKED", false);
                            editor.apply();
                            Toast.makeText(LatteStyle.this, "なし", Toast.LENGTH_SHORT).show();
                        }

                    }
                }
        );
        //ここまで

        //サイズスイッチボタンのデータ処理
        CompoundButton switchSizeLatte = (CompoundButton) findViewById(R.id.SizeSwitchLatte);
        switchSizeLatte.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
            @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
               SharedPreferences data = getSharedPreferences("DATA", Context.MODE_PRIVATE);
               SharedPreferences.Editor editor = data.edit();

                if(isChecked){
                    editor.putBoolean("SIZE_CHECKED", true);
                    editor.apply();
                    Toast.makeText(LatteStyle.this, "LARGE", Toast.LENGTH_SHORT).show();

                }
                else{
                    editor.putBoolean("SIZE_CHECKED", false);
                    editor.apply();
                    Toast.makeText(LatteStyle.this, "MEDIUM", Toast.LENGTH_SHORT).show();

                }
            }

        });
        //ここまで

        //次のページに行く処理
        Button sendResult = (Button)this.findViewById(R.id.ConfirmButtonLatte);
        sendResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplication(),Result.class);
                startActivity(intent);
            }
        });
        //ここまで


        //ラジオボタンの選択処理
        RadioGroup radioGroup = (RadioGroup)findViewById(R.id.SugerRadioLatte);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                SharedPreferences data = getSharedPreferences("DATA", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = data.edit();
                editor.putString("SWEETNESS", "選択なし");//一度初期化
                editor.commit();
                //RadioButton radioButton = (RadioButton)group.findViewById(checkedId);
                switch (checkedId){

                    case R.id.radioButton0:
                        Toast.makeText(LatteStyle.this, "0%", Toast.LENGTH_SHORT).show();
                        editor.putString("SWEETNESS", "0%");
                        editor.commit();
                        break;
                    case R.id.radioButton30:
                        Toast.makeText(LatteStyle.this, "30%", Toast.LENGTH_SHORT).show();
                        editor.putString("SWEETNESS", "30%");
                        editor.commit();
                        break;
                    case R.id.radioButton50:
                        Toast.makeText(LatteStyle.this, "50%", Toast.LENGTH_SHORT).show();
                        editor.putString("SWEETNESS", "50%");
                        editor.commit();
                        break;
                    case R.id.radioButton70:
                        Toast.makeText(LatteStyle.this, "70%", Toast.LENGTH_SHORT).show();
                        editor.putString("SWEETNESS", "70%");
                        editor.commit();
                        break;
                    case R.id.radioButton100:
                        Toast.makeText(LatteStyle.this, "100%", Toast.LENGTH_SHORT).show();
                        editor.putString("SWEETNESS", "100%");
                        editor.commit();
                        break;

                }
            }
        });
        //  ここまで



    }
}
