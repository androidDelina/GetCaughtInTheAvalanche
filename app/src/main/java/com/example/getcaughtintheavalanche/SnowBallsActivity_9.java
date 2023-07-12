package com.example.getcaughtintheavalanche;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.util.Log;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class SnowBallsActivity_9 extends AppCompatActivity {

    TextView timerTextView;

    private static final long startTime_9 = 15000;
    private long timeLeftInMillis_9 = startTime_9;

    int counter = 0;

    private void startTimer_9() {

        CountDownTimer timer_9 = new CountDownTimer(timeLeftInMillis_9, 1000) {
            @Override
            public void onTick(long millisUntilFinished_3) {
                timeLeftInMillis_9 = millisUntilFinished_3;
                updateCountDownText_3();
            }

            @Override
            public void onFinish() {
                SnowBallsActivity_9.this.finish();
            }
        }.start();
    }

    void updateCountDownText_3() {
        int min_3 = (int) timeLeftInMillis_9 / 1000 / 60;
        int sec_3 = (int) timeLeftInMillis_9 / 1000 % 60;

        String timeLeftFormatted_9 = String.format("%02d:%02d", min_3, sec_3);
        timerTextView.setText(timeLeftFormatted_9);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_snow_balls9);
        initSnow();

        timerTextView = findViewById(R.id.timerTxt);
        startTimer_9();
        fightSnowballs();
    }

    private void initSnow() {
        snowball1_9 = findViewById(R.id.snowball1);
        snowball2_9 = findViewById(R.id.snowball2);
        snowball3_9 = findViewById(R.id.snowball3);
        snowball4_9 = findViewById(R.id.snowball4);
        snowball5_9 = findViewById(R.id.snowball5);
        snowball6_9 = findViewById(R.id.snowball6);
        snowball7_9 = findViewById(R.id.snowball7);
        snowball8_9 = findViewById(R.id.snowball8);
        snowball9_9 = findViewById(R.id.snowball9);
    }

    RelativeLayout snowball1_9;
    RelativeLayout snowball2_9;
    RelativeLayout snowball3_9;
    RelativeLayout snowball4_9;
    RelativeLayout snowball5_9;
    RelativeLayout snowball6_9;
    RelativeLayout snowball7_9;
    RelativeLayout snowball8_9;
    RelativeLayout snowball9_9;

    private void fightSnowballs() {
        snowball1_9.setOnClickListener(v -> ghjkljh(v));
        snowball2_9.setOnClickListener(v -> ghjkljh(v));
        snowball3_9.setOnClickListener(v -> ghjkljh(v));
        snowball4_9.setOnClickListener(v -> ghjkljh(v));
        snowball5_9.setOnClickListener(v -> ghjkljh(v));
        snowball6_9.setOnClickListener(v -> ghjkljh(v));
        snowball7_9.setOnClickListener(v -> ghjkljh(v));
        snowball8_9.setOnClickListener(v -> ghjkljh(v));
        snowball9_9.setOnClickListener(v -> ghjkljh(v));
    }

    private void ghjkljh(View view) {
        counter++;
        view.setVisibility(View.INVISIBLE);
        isWin();
    }

    private void isWin() {
        if (counter == 9) {
            SnowBallsActivity_9.this.finish();
        }
    }
}