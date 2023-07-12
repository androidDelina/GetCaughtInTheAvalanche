package com.example.getcaughtintheavalanche;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class GameActivity_9 extends AppCompatActivity {
    RelativeLayout btn1_9, btn2_9;
    TextView answ1_9, answ2_9, quest_9;

    int score_9 = 0;
    private String answer_9 = "";
    private int index_9;

    private void loadQuestion_9() {
        quest_9.setText(questions[index_9]);

        answ1_9.setText(answers[index_9][0]);
        answ2_9.setText(answers[index_9][1]);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game9);
        initialization();
        loadQuestion_9();
    }

    private void nextQuestion_9() {
        if(index_9 < questions.length-1) {
            index_9++;
            loadQuestion_9();
        } else {
            Intent intent = new Intent(GameActivity_9.this, FinalActivity_9.class);
            intent.putExtra("score", score_9);

            startActivity(intent);
        }
    }

    private void initialization() {
        quest_9 = findViewById(R.id.questionTxt);
        btn1_9 = findViewById(R.id.button1);
        btn2_9 = findViewById(R.id.button2);

        answ1_9 = findViewById(R.id.answer1);
        answ2_9 = findViewById(R.id.answer2);

        btn1_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                answer_9 = answ1_9.getText().toString();
                workWithScore_9(answer_9);
                nextQuestion_9();
            }
        });

        btn2_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                answer_9 = answ2_9.getText().toString();
                workWithScore_9(answer_9);
                nextQuestion_9();
            }
        });
    }

    private void workWithScore_9(String selectedAnswer) {
        if (selectedAnswer.equals(correctAnswers[index_9]))
            score_9++;
        else
            openWarningActivity();
    }

    private void openWarningActivity() {
        Intent intent = new Intent(GameActivity_9.this, WarningActivity_9.class);
        startActivity(intent);
    }

    String[] questions = Question_9.getQuestions_9();
    String[][] answers = Question_9.getAnswers_9();
    String[] correctAnswers = Question_9.getCorrectAnswers_9();
}