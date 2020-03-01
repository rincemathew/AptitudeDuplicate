package com.melisa.melisa.aptitudeit;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.CountDownTimer;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PlayTheGame extends AppCompatActivity {

    QstnArray qstnArray;
    AnswerArray answerArray;
    OptionArray optionArray;
    int score=0,rightAns=0,wrongAns=0,skiped=0;
    int secs = 1;

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

    int questionNum;
    int questionTime;

    private CountDownTimer countDownTimer;
    private boolean timerHasStarted = false;
 //   private final long startTime = 30 * 1000;
    long startTime = questionTime * 1000;
    private final long interval = 1 * 1000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_the_game);

        Intent intentStatus = getIntent();
        questionNum = intentStatus.getIntExtra("QUESTION_NUMBER",0);
        questionTime = intentStatus.getIntExtra("QUESTION_TIME",0);
        startTime = questionTime * 1000;
      //  Toast.makeText(PlayTheGame.this, questionTime+"This is my Toast message!", Toast.LENGTH_LONG).show();


        questionTextView = (TextView) findViewById(R.id.questionTextView);
        quizProgress = (TextView) findViewById(R.id.quizProgress);
        scoreTextView = (TextView) findViewById(R.id.scoreTextView);
        textView = findViewById(R.id.time);
        skip=findViewById(R.id.skip);
        countDownTimer = new MyCountDownTimer(startTime, interval);
        textView.setText(textView.getText() + String.valueOf(startTime / 1000));


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
                    i++;
                    score += 10;
                    rightAns+=1;
           //         button1.setBackgroundResource(getResources().getColor(R.color.green));
                    button1.setBackgroundResource(R.drawable.right);
                    ButtonDisable();
                    Utils.delay(secs, new Utils.DelayCallback() {
                        @Override
                        public void afterDelay() {
                            button1.setBackgroundResource(R.drawable.normal);
                            ButtonEnable();
                            setQuestion(i);

                        }
                    });
                } else {
                    greenlite();
                    i++;
                    score -= 5;
                    wrongAns+=1;
                    scoreTextView.setText("Score : " + score + "");
                    button1.setBackgroundResource(R.drawable.wrong);
                    ButtonDisable();
                    Utils.delay(secs, new Utils.DelayCallback() {
                        @Override
                        public void afterDelay() {
                            button1.setBackgroundResource(R.drawable.normal);
                            ButtonEnable();
                            setQuestion(i);

                        }
                    });
                }
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (button2.getText().toString().equals(answerArray.getAnswer(questionNumber.get(i)))) {
                    i++;
                    score += 10;
                    rightAns+=1;
                    button2.setBackgroundResource(R.drawable.right);
                    ButtonDisable();
                    Utils.delay(secs, new Utils.DelayCallback() {
                        @Override
                        public void afterDelay() {
                            button2.setBackgroundResource(R.drawable.normal);
                            ButtonEnable();
                            setQuestion(i);
                        }
                    });
                } else {
                    greenlite();
                    i++;
                    score -= 5;
                    wrongAns+=1;
                    scoreTextView.setText("Score : " + score + "");
                    button2.setBackgroundResource(R.drawable.wrong);
                    ButtonDisable();
                    Utils.delay(secs, new Utils.DelayCallback() {
                        @Override
                        public void afterDelay() {
                            button2.setBackgroundResource(R.drawable.normal);
                            ButtonEnable();
                            setQuestion(i);

                        }
                    });
                }
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (button3.getText().toString().equals(answerArray.getAnswer(questionNumber.get(i)))) {
                    i++;
                    score += 10;
                    rightAns+=1;
                    button3.setBackgroundResource(R.drawable.right);
                    ButtonDisable();
                    Utils.delay(secs, new Utils.DelayCallback() {
                        @Override
                        public void afterDelay() {
                            button3.setBackgroundResource(R.drawable.normal);
                            ButtonEnable();
                            setQuestion(i);
                        }
                    });
                } else {
                    greenlite();
                    i++;
                    score -= 5;
                    wrongAns+=1;
                    scoreTextView.setText("Score : " + score + "");
                    button3.setBackgroundResource(R.drawable.wrong);
                    ButtonDisable();
                    Utils.delay(secs, new Utils.DelayCallback() {
                        @Override
                        public void afterDelay() {
                            button3.setBackgroundResource(R.drawable.normal);
                            ButtonEnable();
                            setQuestion(i);

                        }
                    });
                }
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (button4.getText().toString().equals(answerArray.getAnswer(questionNumber.get(i)))) {
                    i++;
                    score += 10;
                    rightAns+=1;
                    button4.setBackgroundResource(R.drawable.right);
                    ButtonDisable();
                    Utils.delay(secs, new Utils.DelayCallback() {
                        @Override
                        public void afterDelay() {
                            button4.setBackgroundResource(R.drawable.normal);
                            ButtonEnable();
                            setQuestion(i);
                        }
                    });
                } else {
                    greenlite();
                    i++;
                    score -= 5;
                    wrongAns+=1;
                    scoreTextView.setText("Score : " + score + "");
                    button4.setBackgroundResource(R.drawable.wrong);
                    ButtonDisable();
                    Utils.delay(secs, new Utils.DelayCallback() {
                        @Override
                        public void afterDelay() {
                            button4.setBackgroundResource(R.drawable.normal);
                            ButtonEnable();
                            setQuestion(i);

                        }
                    });
                }
            }
        });
        skip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                skiped+=1;
                i++;
                setQuestion(i);
            }
        });
    }





    public void setQuestion(int i) {

        try {
            if (i < questionNum) {
                countDownTimer.start();
                questionTextView.setText(qstnArray.getQuestion(questionNumber.get(i)));
                optionArray = new OptionArray(questionNumber.get(i));
                optArray = new ArrayList<>(optionArray.getOptionArray());

                Collections.shuffle(optArray);
                button1.setText(optArray.get(0));
                button2.setText(optArray.get(1));
                button3.setText(optArray.get(2));
                button4.setText(optArray.get(3));

                scoreTextView.setText("Score : " + score + "");
                quizProgress.setText((i + 1) + " Of " + questionNum);
            } else {
                scoreTextView.setText("Score : " + score + "");
                button1.setEnabled(false);
                button2.setEnabled(false);
                button3.setEnabled(false);
                button4.setEnabled(false);
                gameover();

            }
        } catch (Exception e) {

        }


    }

    public void ButtonDisable(){
        button1.setEnabled(false);
        button2.setEnabled(false);
        button3.setEnabled(false);
        button4.setEnabled(false);
    }

    public void ButtonEnable(){
        button1.setEnabled(true);
        button2.setEnabled(true);
        button3.setEnabled(true);
        button4.setEnabled(true);
    }

    private void greenlite(){
        if (button1.getText().toString().equals(answerArray.getAnswer(questionNumber.get(i)))) {
            button1.setBackgroundResource(R.drawable.right);
            Utils.delay(secs, new Utils.DelayCallback() {
                @Override
                public void afterDelay() {
                    button1.setBackgroundResource(R.drawable.normal);
                }
            });

        }
        else if (button2.getText().toString().equals(answerArray.getAnswer(questionNumber.get(i)))){
            button2.setBackgroundResource(R.drawable.right);
            Utils.delay(secs, new Utils.DelayCallback() {
                @Override
                public void afterDelay() {
                    button2.setBackgroundResource(R.drawable.normal);
                }
            });
        }
        else if (button3.getText().toString().equals(answerArray.getAnswer(questionNumber.get(i)))){
            button3.setBackgroundResource(R.drawable.right);
            Utils.delay(secs, new Utils.DelayCallback() {
                @Override
                public void afterDelay() {
                    button3.setBackgroundResource(R.drawable.normal);
                }
            });
        }
        else if (button4.getText().toString().equals(answerArray.getAnswer(questionNumber.get(i)))){
            button4.setBackgroundResource(R.drawable.right);
            Utils.delay(secs, new Utils.DelayCallback() {
                @Override
                public void afterDelay() {
                    button4.setBackgroundResource(R.drawable.normal);;
                }
            });
        }

    }

    public void gameover() {

            Intent intent = new Intent(getApplicationContext(), ResultofEvery.class);
            intent.putExtra("RIGHTANS", rightAns);
            intent.putExtra("WRONGANS", wrongAns);
            intent.putExtra("SKIPED", skiped);
            startActivity(intent);
            countDownTimer.cancel();
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
                countDownTimer.cancel();
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

    public class MyCountDownTimer extends CountDownTimer {
        public MyCountDownTimer(long startTime, long interval) {
            super(startTime, interval);
        }
        @Override
        public void onFinish() {
            i++;
            score -= 5;
            scoreTextView.setText("Score : " + score + "");
            setQuestion(i);
        }
        @Override
        public void onTick(long millisUntilFinished) {
            textView.setText("" + millisUntilFinished / 1000);
            if (millisUntilFinished<=10200){
                textView.setTextColor(Color.RED);
            }else {
                textView.setTextColor(Color.BLUE);
            }

        }

    }
}
