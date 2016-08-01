package com.srikanth.quizapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
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


        final CheckBox checkBox = (CheckBox) findViewById(R.id.cBox1);
        final CheckBox checkBox1 = (CheckBox) findViewById(R.id.cBox2);
        final CheckBox checkBox2 = (CheckBox) findViewById(R.id.cBox3);

        final EditText editQues = (EditText) findViewById(R.id.edit_text);

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
                    if (checkBox2 != null && checkBox1 != null && checkBox != null && checkBox.isChecked() && checkBox1.isChecked() && !checkBox2.isChecked())
                        score++;
                    if (editQues.length() != 0)
                        if (editQues.getText().toString().equals("Alphabet")) {
                            editQues.setText("");
                            score++;
                        } else
                            score--;
                    Toast.makeText(MainActivity.this, "Your score is " + score + " out of 6", Toast.LENGTH_LONG).show();
                }
            });
        }
    }

}
