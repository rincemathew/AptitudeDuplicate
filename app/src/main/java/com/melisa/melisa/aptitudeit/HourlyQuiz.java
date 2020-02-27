package com.melisa.melisa.aptitudeit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

public class HourlyQuiz extends AppCompatActivity {


    QstnArray qstnArray;
    AnswerArray answerArray;
    OptionArray optionArray;

    List<Integer> questionNumber;
    List<String> optArray;

    int i=0;
    int questionNum =1;

    TextView questionTextView;

    Button button1,button2,button3,button4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hourly_quiz);


        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        questionTextView = findViewById(R.id.questionTextView);



        qstnArray = new QstnArray();
        answerArray = new AnswerArray();


        questionNumber = new ArrayList<>();

        for (int j = 0; j < qstnArray.getquestionListLength(); j++) {
            questionNumber.add(j);
        }

        Collections.shuffle(questionNumber);


        setQuestion(i);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (button1.getText().toString().equals(answerArray.getAnswer(questionNumber.get(i)))) {
                    button1.setBackgroundResource(R.drawable.right);
                    disableButton();
                } else {
                    button1.setBackgroundResource(R.drawable.wrong);
                    disableButton();
                }
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (button2.getText().toString().equals(answerArray.getAnswer(questionNumber.get(i)))) {
                    button2.setBackgroundResource(R.drawable.right);
                    disableButton();
                } else {
                    button2.setBackgroundResource(R.drawable.wrong);
                    disableButton();
                }
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (button3.getText().toString().equals(answerArray.getAnswer(questionNumber.get(i)))) {
                    button3.setBackgroundResource(R.drawable.right);
                    disableButton();
                } else {
                    button3.setBackgroundResource(R.drawable.wrong);
                    disableButton();
                }
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (button4.getText().toString().equals(answerArray.getAnswer(questionNumber.get(i)))) {
                    button4.setBackgroundResource(R.drawable.right);
                    disableButton();
                } else {
                    button4.setBackgroundResource(R.drawable.wrong);
                    disableButton();
                }
            }
        });
    }

    private void disableButton() {
        button1.setEnabled(false);
        button2.setEnabled(false);
        button3.setEnabled(false);
        button4.setEnabled(false);
    }


    public void setQuestion(int i) {

        try {
            if (i < questionNum) {
                questionTextView.setText(qstnArray.getQuestion(questionNumber.get(i)));
                optionArray = new OptionArray(questionNumber.get(i));
                optArray = new ArrayList<>(optionArray.getOptionArray());

                Collections.shuffle(optArray);
                button1.setText(optArray.get(0));
                button2.setText(optArray.get(1));
                button3.setText(optArray.get(2));
                button4.setText(optArray.get(3));


            } else {

                button1.setEnabled(false);
                button2.setEnabled(false);
                button3.setEnabled(false);
                button4.setEnabled(false);

            }
        } catch (Exception e) {

        }


    }

    }

