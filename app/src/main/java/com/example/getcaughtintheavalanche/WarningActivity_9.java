package com.example.getcaughtintheavalanche;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;

public class WarningActivity_9 extends AppCompatActivity {

    private static final long startTime_9 = 4000;
    private long timeLeftInMillis_9 = startTime_9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_warning9);
        startTimer_9();
    }

    private void startTimer_9() {
        CountDownTimer timer_9 = new CountDownTimer(timeLeftInMillis_9, 1000) {
            @Override
            public void onTick(long millisUntilFinished_9) {
                timeLeftInMillis_9 = millisUntilFinished_9;
            }

            @Override
            public void onFinish() {
                Intent intent_9 = new Intent(WarningActivity_9.this, SnowBallsActivity_9.class);
                startActivity(intent_9);
                finish();
            }
        }.start();
    }
}