package com.melisa.melisa.aptitudeit;

import android.app.Dialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.CountDownTimer;

import androidx.fragment.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Locale;

import static android.content.Context.MODE_PRIVATE;

public class Challenge extends Fragment {

    Button start;
    Button button2;
    Button button3;

    TextView timer;

    Dialog myDialog;

    private static final long START_TIME_IN_MILLIS = 3600000;
   // private TextView mTextViewCountDown;
   // private Button mButtonStartPause;
    private CountDownTimer mCountDownTimer;
    private boolean mTimerRunning;
    private long mTimeLeftInMillis;
    private long mEndTime;






    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View StatusFragmentView=inflater.inflate(R.layout.fragment_challenge, container, false);


        start=StatusFragmentView.findViewById(R.id.start);
        button2= StatusFragmentView.findViewById(R.id.quiz2);
        button3= StatusFragmentView.findViewById(R.id.quiz3);
        timer=StatusFragmentView.findViewById(R.id.timer);


        //countDownTimer = new CountOnService.MyCountDownTimer(startTime, interval);


        myDialog = new Dialog(getActivity());

       setHasOptionsMenu(true);




        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent intent=new Intent(getActivity(),PlayTheGame.class);
//                startActivity(intent);

                final EditText edtNoQuestions;
                SeekBar seekBar;

                final EditText time;
                SeekBar seekBarTime;

                ImageButton imageCancel;
                ImageButton imageForward;

                myDialog.setContentView(R.layout.set_question_numbers);


                edtNoQuestions=myDialog.findViewById(R.id.edtNOquestions);
                seekBar=myDialog.findViewById(R.id.QuestionseekBarID);
                time=myDialog.findViewById(R.id.edtTIME);
                seekBarTime=myDialog.findViewById(R.id.seekbarTime);
                imageCancel=myDialog.findViewById(R.id.cancel);
                imageForward=myDialog.findViewById(R.id.forward);



                seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
                    @Override
                    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                      //  Toast.makeText(getActivity(),"seekbar progress: "+progress, Toast.LENGTH_SHORT).show();
                        if (progress==0){
                            edtNoQuestions.setText("5");
                        }
                        else if (progress==1){
                            edtNoQuestions.setText("10");
                        }
                        else if (progress==2){
                            edtNoQuestions.setText("15");
                        }
                        else if (progress==3){
                            edtNoQuestions.setText("20");
                        }
                    }

                    @Override
                    public void onStartTrackingTouch(SeekBar seekBar) {

                    }

                    @Override
                    public void onStopTrackingTouch(SeekBar seekBar) {

                    }
                });

                seekBarTime.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
                    @Override
                    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                        if (progress==0){
                            time.setText("60");
                        }
                        else if (progress==1){
                            time.setText("90");
                        }
                        else if (progress==2){
                            time.setText("120");
                        }
                        else if (progress==3){
                            time.setText("150");
                        }
                        else if (progress==4){
                            time.setText("180");
                        }

                    }

                    @Override
                    public void onStartTrackingTouch(SeekBar seekBar) {

                    }

                    @Override
                    public void onStopTrackingTouch(SeekBar seekBar) {

                    }
                });

                imageCancel.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        myDialog.dismiss();
                    }
                });
                imageForward.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        int questionNumber = Integer.parseInt(edtNoQuestions.getText() + "");
                        int questionTime = Integer.parseInt(time.getText() + "");
                        Intent intentStatus=new Intent(getActivity(),PlayTheGame.class);
                        intentStatus.putExtra("QUESTION_NUMBER", questionNumber);
                        intentStatus.putExtra("QUESTION_TIME", questionTime);
                        startActivity(intentStatus);

                    }
                });


                myDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                myDialog.show();
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "we are working on it!", Toast.LENGTH_LONG).show();
//                int mScore=1;
                Intent intent=new Intent(getActivity(), ManualTest.class);
//                intent.putExtra("numbers",mScore);
                startActivity(intent);

            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startTimer();
               // button3.setEnabled(false);
                Intent intent = new Intent(getActivity(), HourlyQuiz.class);
                startActivity(intent);


            }
        });
        return StatusFragmentView;
        }


       private void startTimer() {
        mEndTime = System.currentTimeMillis() + mTimeLeftInMillis;
        mCountDownTimer = new CountDownTimer(mTimeLeftInMillis, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                mTimeLeftInMillis = millisUntilFinished;
                updateCountDownText();
            }

            @Override
            public void onFinish() {
                button2.setEnabled(true);
                mTimerRunning = false;
                mTimeLeftInMillis = START_TIME_IN_MILLIS;
                updateCountDownText();

            }
        }.start();

        mTimerRunning = true;
    }



    private void updateCountDownText() {
        int minutes = (int) (mTimeLeftInMillis / 1000) / 60;
        int seconds = (int) (mTimeLeftInMillis / 1000) % 60;

        String timeLeftFormatted = String.format(Locale.getDefault(), "%02d:%02d", minutes, seconds);

        timer.setText("" + timeLeftFormatted);
    }


    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        inflater.inflate(R.menu.menu_calls, menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.action_call) {
            Intent intent = new Intent(getActivity(),Settings.class);
            startActivity(intent);
          //  Toast.makeText(getActivity(), "Clicked on " + item.getTitle(), Toast.LENGTH_SHORT).show();
        }
        return true;
    }
    @Override
    public void onStop() {
        super.onStop();

        SharedPreferences prefs = this.getContext().getSharedPreferences("prefs", MODE_PRIVATE);
        SharedPreferences.Editor editor = prefs.edit();

        editor.putLong("millisLeft", mTimeLeftInMillis);
        editor.putBoolean("timerRunning", mTimerRunning);
        editor.putLong("endTime", mEndTime);

        editor.apply();

        if (mCountDownTimer != null) {
            mCountDownTimer.cancel();
        }
    }
    @Override
    public void onStart() {
        super.onStart();

        SharedPreferences prefs = this.getContext().getSharedPreferences("prefs", MODE_PRIVATE);

        mTimeLeftInMillis = prefs.getLong("millisLeft", START_TIME_IN_MILLIS);
        mTimerRunning = prefs.getBoolean("timerRunning", false);

        updateCountDownText();

        if (mTimerRunning) {
            mEndTime = prefs.getLong("endTime", 0);
            mTimeLeftInMillis = mEndTime - System.currentTimeMillis();

            if (mTimeLeftInMillis < 0) {
                mTimeLeftInMillis = 0;
                mTimerRunning = false;
                mTimeLeftInMillis = START_TIME_IN_MILLIS;
                updateCountDownText();
            } else {
                button2.setEnabled(false);
                startTimer();
            }
        }

    }


}