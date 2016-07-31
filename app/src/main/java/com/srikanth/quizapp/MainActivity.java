package com.srikanth.quizapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private int score;
    private int answerOne, answerTwo, answerThree, answerFour;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RadioGroup radioGroup = (RadioGroup) findViewById(R.id.rGroup);
        RadioGroup radioGroupOne = (RadioGroup) findViewById(R.id.rGroup1);
        RadioGroup radioGroupTwo = (RadioGroup) findViewById(R.id.rGroup3);
        RadioGroup radioGroupThree = (RadioGroup) findViewById(R.id.rGroup4);

        Button submit = (Button) findViewById(R.id.btnSubmit);
        if (radioGroup != null) {
            radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup group, int checkedId) {
                    switch (checkedId) {
                        case R.id.ans1a:
                            answerOne = 1;
                            break;
                        case R.id.ans1b:
                            answerOne = 2;
                            break;
                        case R.id.ans1c:
                            answerOne = 3;
                            break;
                    }
                }
            });
        }

        if (radioGroupOne != null) {
            radioGroupOne.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup group, int checkedId) {
                    switch (checkedId) {
                        case R.id.ans2a:
                            answerTwo = 1;
                            break;
                        case R.id.ans2b:
                            answerTwo = 2;
                            break;
                        case R.id.ans2c:
                            answerTwo = 3;
                            break;
                    }
                }
            });
        }

        if (radioGroupTwo != null) {
            radioGroupTwo.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup group, int checkedId) {
                    switch (checkedId) {
                        case R.id.ans3a:
                            answerThree = 1;
                            break;
                        case R.id.ans3b:
                            answerThree = 2;
                            break;
                        case R.id.ans3c:
                            answerThree = 3;
                            break;
                    }
                }
            });
        }

        if (radioGroupThree != null) {
            radioGroupThree.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup group, int checkedId) {
                    switch (checkedId) {
                        case R.id.ans4a:
                            answerFour = 1;
                            break;
                        case R.id.ans4b:
                            answerFour = 2;
                            break;
                        case R.id.ans4c:
                            answerFour = 3;
                            break;
                    }
                }
            });
        }
        if (submit != null) {
            submit.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    score = 0;
                    if (answerOne == 3)
                        score++;
                    if (answerTwo == 1)
                        score++;
                    if (answerThree == 1)
                        score++;
                    if (answerFour == 1)
                        score++;
                    Toast.makeText(MainActivity.this, "Your score is " + score + " out of 4", Toast.LENGTH_LONG).show();
                }
            });
        }
    }

}
