package com.example.neko.part_time_job;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.widget.SeekBar;
import android.widget.TextView;

public class Latte extends AppCompatActivity {
    public static  final String ICE = "SWEETNESS";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_latte);



        final TextView amount_of_ice = (TextView) findViewById(R.id.textViewICE);

        SharedPreferences pref = PreferenceManager.getDefaultSharedPreferences(this);
        int Ice = pref.getInt(ICE,2);
        //amount_of_ice.setText(String.valueOf(Ice));

        SeekBar IceSeekBar = (SeekBar)findViewById(R.id.seekBarIce);
        IceSeekBar.setProgress(Ice);
        IceSeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                String value =String.valueOf(progress);
                amount_of_ice.setText("REGULAR");
                if ( value.equals("0")){
                    amount_of_ice.setText("NO");
                }
                if (value.equals("1") ){
                    amount_of_ice.setText("LESS");
                }
                if (value.equals("2") ){
                    amount_of_ice.setText("REGULAR");
                }
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });


    }

}
