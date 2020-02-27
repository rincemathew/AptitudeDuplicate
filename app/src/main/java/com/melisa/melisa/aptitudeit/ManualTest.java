package com.melisa.melisa.aptitudeit;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ManualTest extends AppCompatActivity {

    QstnArray qstnArray;
    AnswerArray answerArray;
    OptionArray optionArray;

    List<Integer> questionNumber;
    List<String> optArray;

    Button button1;
    Button button2;
    Button button3;
    Button button4;
    Button skip;
    int i=0;


    TextView questionTextView;
    TextView scoreTextView;
    TextView quizProgress;
    TextView textView;

    int questionNum = 305;
    int questionTime;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manualtest);
        questionTextView = (TextView) findViewById(R.id.questionTextView);
        quizProgress = (TextView) findViewById(R.id.quizProgress);
        scoreTextView = (TextView) findViewById(R.id.scoreTextView);
        skip=findViewById(R.id.next);



        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);



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
                } else {
                    button1.setBackgroundResource(R.drawable.wrong);
                }
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (button2.getText().toString().equals(answerArray.getAnswer(questionNumber.get(i)))) {
                    button2.setBackgroundResource(R.drawable.right);
                } else {
                    button2.setBackgroundResource(R.drawable.wrong);
                }
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (button3.getText().toString().equals(answerArray.getAnswer(questionNumber.get(i)))) {
                    button3.setBackgroundResource(R.drawable.right);
                } else {
                    button3.setBackgroundResource(R.drawable.wrong);
                }
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (button4.getText().toString().equals(answerArray.getAnswer(questionNumber.get(i)))) {
                    button4.setBackgroundResource(R.drawable.right);
                } else {
                    button4.setBackgroundResource(R.drawable.wrong);
                }
            }
        });
        skip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i++;
                setQuestion(i);
            }
        });
    }





    public void setQuestion(int i) {

        try {
            if (i < questionNumber.size()) {
                button1.setBackgroundResource(R.drawable.normal);
                button2.setBackgroundResource(R.drawable.normal);
                button3.setBackgroundResource(R.drawable.normal);
                button4.setBackgroundResource(R.drawable.normal);
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
                gameover();

            }
        } catch (Exception e) {

        }


    }


//    private void greenlite(){
//        if (button1.getText().toString().equals(answerArray.getAnswer(questionNumber.get(i)))) {
//            button1.setBackgroundResource(R.drawable.right);
//            Utils.delay(secs, new Utils.DelayCallback() {
//                @Override
//                public void afterDelay() {
//                    button1.setBackgroundResource(R.drawable.normal);
//                }
//            });
//
//        }
//        else if (button2.getText().toString().equals(answerArray.getAnswer(questionNumber.get(i)))){
//            button2.setBackgroundResource(R.drawable.right);
//            Utils.delay(secs, new Utils.DelayCallback() {
//                @Override
//                public void afterDelay() {
//                    button2.setBackgroundResource(R.drawable.normal);
//                }
//            });
//        }
//        else if (button3.getText().toString().equals(answerArray.getAnswer(questionNumber.get(i)))){
//            button3.setBackgroundResource(R.drawable.right);
//            Utils.delay(secs, new Utils.DelayCallback() {
//                @Override
//                public void afterDelay() {
//                    button3.setBackgroundResource(R.drawable.normal);
//                }
//            });
//        }
//        else if (button4.getText().toString().equals(answerArray.getAnswer(questionNumber.get(i)))){
//            button4.setBackgroundResource(R.drawable.right);
//            Utils.delay(secs, new Utils.DelayCallback() {
//                @Override
//                public void afterDelay() {
//                    button4.setBackgroundResource(R.drawable.normal);;
//                }
//            });
//        }
//
//    }

    public void gameover() {

        Intent intent = new Intent(getApplicationContext(), ResultofEvery.class);
        startActivity(intent);
        finish();



    }

    @Override
    public void onBackPressed() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setCancelable(false);
        builder.setMessage("Are you sure you want to exit?");
        builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
        builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });
        AlertDialog alert = builder.create();
        alert.show();
    }
}
