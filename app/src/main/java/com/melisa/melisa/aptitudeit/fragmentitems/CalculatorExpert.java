package com.melisa.melisa.aptitudeit.fragmentitems;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.melisa.melisa.aptitudeit.R;

import java.util.Random;

public class CalculatorExpert extends AppCompatActivity {

    TextView question, question2, timer;
    EditText answer;
    Button one, two, three, four, five, six, seven, eight, nine, zero, clear, back;
    int max = 99, min = 1, ques1, ques2, answerValue;
    int score = 0;
    String firstString;
    ProgressBar progressBar;

    MyCountDownTimer firstTimer = new MyCountDownTimer(15000, 1000);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator_expert);

        Window window = this.getWindow();
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            window.setStatusBarColor(ContextCompat.getColor(this, R.color.color_work_out_Dark));
        }


        timer = findViewById(R.id.timer);
        question = findViewById(R.id.question);
        question2 = findViewById(R.id.question2);
        answer = findViewById(R.id.answerField);
        one = findViewById(R.id.one);
        two = findViewById(R.id.two);
        three = findViewById(R.id.three);
        four = findViewById(R.id.four);
        five = findViewById(R.id.five);
        six = findViewById(R.id.six);
        seven = findViewById(R.id.seven);
        eight = findViewById(R.id.eight);
        nine = findViewById(R.id.nine);
        zero = findViewById(R.id.zero);
        clear = findViewById(R.id.clear);
        back = findViewById(R.id.back);
        progressBar = findViewById(R.id.progress);

        calculate();


        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                answer.setText(answer.getText() + "1");
                checkconditions();
            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                answer.setText(answer.getText() + "2");
                checkconditions();
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                answer.setText(answer.getText() + "3");
                checkconditions();
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                answer.setText(answer.getText() + "4");
                checkconditions();
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                answer.setText(answer.getText() + "5");
                checkconditions();
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                answer.setText(answer.getText() + "6");
                checkconditions();
            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                answer.setText(answer.getText() + "7");
                checkconditions();
            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                answer.setText(answer.getText() + "8");
                checkconditions();
            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                answer.setText(answer.getText() + "9");
                checkconditions();
            }
        });
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                answer.setText(answer.getText() + "0");
                checkconditions();
            }
        });
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                answer.setText("");
            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });


    }

    public void checkconditions() {
        if (firstString.length() == answer.getText().toString().length()) {
            // Toast.makeText(getApplicationContext(),"length",Toast.LENGTH_LONG).show();
            if (answer.getText().toString().equals(answerValue + "")) {
                score++;
                //Toast.makeText(getApplicationContext(),"Right"+score,Toast.LENGTH_LONG).show();
                firstTimer.cancel();
                calculate();
            } else {
                //Toast.makeText(getApplicationContext(),"wrong",Toast.LENGTH_LONG).show();
                firstTimer.cancel();
                Intent intent = new Intent(CalculatorExpert.this, CalculatorExpertAns.class);
                intent.putExtra("score", score);
                startActivity(intent);
                finish();
            }
        } else {
            //Toast.makeText(getApplicationContext(),"else",Toast.LENGTH_LONG).show();
        }
    }

    private void calculate() {
        firstTimer.start();
//        countDownTimer.start();
        answer.setText("");
        Random r = new Random();
        ques1 = r.nextInt(max - min + 1) + min;
        ques2 = r.nextInt(max - min + 1) + min;
        question.setText(ques1 + "");
        question2.setText(ques2 + "");
        answerValue = ques1 + ques2;
        firstString = String.valueOf(answerValue);
        // firstNum = (firstString.trim().equals(""))? 0: firstString.length();
    }

    public class MyCountDownTimer extends CountDownTimer {
        public MyCountDownTimer(long startTime, long interval) {
            super(startTime, interval);
        }

        @Override
        public void onFinish() {
            firstTimer.cancel();
            Intent intent = new Intent(CalculatorExpert.this, CalculatorExpertAns.class);
            intent.putExtra("score", score);
            startActivity(intent);
            finish();
        }

        @Override
        public void onTick(long millisUntilFinished) {
            timer.setText("" + millisUntilFinished / 1000);
            progressBar.setProgress((int) millisUntilFinished / 1000);
        }

    }


    @Override
    protected void onStop() {
        super.onStop();
        firstTimer.cancel();
    }
}
