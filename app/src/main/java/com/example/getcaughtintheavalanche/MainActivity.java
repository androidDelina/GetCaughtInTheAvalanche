package com.example.getcaughtintheavalanche;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;

public class MainActivity extends AppCompatActivity {

    private void startTimer_9() {
        CountDownTimer timer_9 = new CountDownTimer(timeLeftInMillis_9, 1000) {
            @Override
            public void onTick(long millisUntilFinished_9) {
                timeLeftInMillis_9 = millisUntilFinished_9;
            }

            @Override
            public void onFinish() {
                Intent intent_9 = new Intent(MainActivity.this, GameActivity_9.class);
                startActivity(intent_9);
            }
        }.start();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        startTimer_9();
    }

    private static final long startTime_9 = 3000;
    private long timeLeftInMillis_9 = startTime_9;
}