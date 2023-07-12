package com.example.getcaughtintheavalanche;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class FinalActivity_9 extends AppCompatActivity {
    int result;
    TextView scoreTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final9);
        result = getIntent().getIntExtra("score", 1111);

        scoreTxt = findViewById(R.id.scoreTxt);
        scoreTxt.setText(""+result);
    }
}