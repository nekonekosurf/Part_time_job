package com.example.neko.part_time_job;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.widget.SeekBar;
import android.widget.TextView;

import static com.example.neko.part_time_job.Latte.ICE;

public class HoneyStyle extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_honey_style);

        final TextView amount_of_ice = (TextView)findViewById(R.id.IceHoney);
        SharedPreferences pref = PreferenceManager.getDefaultSharedPreferences(this);
        int ice =pref.getInt(ICE,2);

        SeekBar IceSeekBar = (SeekBar)findViewById(R.id.SeekBarIceHoney);
        IceSeekBar.setProgress(ice);
        IceSeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                String value = String.valueOf(progress);
                if (value.equals("0")) {
                    amount_of_ice.setText("NO");
                }

                if (value.equals("1")) {
                    amount_of_ice.setText("LESS");
                }

                if (value.equals("2")) {
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
