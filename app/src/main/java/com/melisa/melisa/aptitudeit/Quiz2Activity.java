package com.melisa.melisa.aptitudeit;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import com.melisa.melisa.aptitudeit.quizdirectry.AptAge;
import com.melisa.melisa.aptitudeit.quizdirectry.AptAverage;
import com.melisa.melisa.aptitudeit.quizdirectry.AptBoatAndStream;
import com.melisa.melisa.aptitudeit.quizdirectry.AptCompoundInterest;
import com.melisa.melisa.aptitudeit.quizdirectry.AptHcfLcm;
import com.melisa.melisa.aptitudeit.quizdirectry.AptMensuration;
import com.melisa.melisa.aptitudeit.quizdirectry.AptNumbers;
import com.melisa.melisa.aptitudeit.quizdirectry.AptNumerical;
import com.melisa.melisa.aptitudeit.quizdirectry.AptPartnership;
import com.melisa.melisa.aptitudeit.quizdirectry.AptPercentage;
import com.melisa.melisa.aptitudeit.quizdirectry.AptPermutationAndCombination;
import com.melisa.melisa.aptitudeit.quizdirectry.AptPipesAndCistern;
import com.melisa.melisa.aptitudeit.quizdirectry.AptProbability;
import com.melisa.melisa.aptitudeit.quizdirectry.AptProfitAndLoss;
import com.melisa.melisa.aptitudeit.quizdirectry.AptQuadraticEquation;
import com.melisa.melisa.aptitudeit.quizdirectry.AptRatioAndProportion;
import com.melisa.melisa.aptitudeit.quizdirectry.AptSimpleIntrest;
import com.melisa.melisa.aptitudeit.quizdirectry.AptSimplification;
import com.melisa.melisa.aptitudeit.quizdirectry.AptTimeAndWork;
import com.melisa.melisa.aptitudeit.quizdirectry.AptTimeDistanceAndAveragespeed;
import com.melisa.melisa.aptitudeit.quizdirectry.AptTrain;
import com.melisa.melisa.aptitudeit.quizdirectry.LogAnalogies;
import com.melisa.melisa.aptitudeit.quizdirectry.LogBloodRelation;
import com.melisa.melisa.aptitudeit.quizdirectry.LogCalendars;
import com.melisa.melisa.aptitudeit.quizdirectry.LogClock;
import com.melisa.melisa.aptitudeit.quizdirectry.LogCodingAndDecoding;
import com.melisa.melisa.aptitudeit.quizdirectry.LogDeductions;
import com.melisa.melisa.aptitudeit.quizdirectry.LogDirections;
import com.melisa.melisa.aptitudeit.quizdirectry.LogNonVerbal;
import com.melisa.melisa.aptitudeit.quizdirectry.LogOddManOut;
import com.melisa.melisa.aptitudeit.quizdirectry.LogSeatingArrangement;
import com.melisa.melisa.aptitudeit.quizdirectry.LogNumberSeries;
import com.melisa.melisa.aptitudeit.quizdirectry.LogSymbolsAndNotations;

public class Quiz2Activity extends AppCompatActivity {

    private AptAge AptitudeAge = new AptAge();
    private AptAverage aptitudeAverage = new AptAverage();
    private AptBoatAndStream boatAndStream = new AptBoatAndStream();
    private AptCompoundInterest compountInterest = new AptCompoundInterest();
    private AptHcfLcm hcflcm = new AptHcfLcm();
    private AptMensuration mensuration = new AptMensuration();
    private AptNumbers numberSeries = new AptNumbers();
    private AptNumerical numerical = new AptNumerical();
    private AptPartnership partnership = new AptPartnership();
    private AptPercentage percentage = new AptPercentage();
    private AptPermutationAndCombination permutation = new AptPermutationAndCombination();
    private AptPipesAndCistern pipesAndCistern = new AptPipesAndCistern();
    private AptProbability probability = new AptProbability();
    private AptProfitAndLoss profitAndLoss = new AptProfitAndLoss();
    private AptQuadraticEquation quadraticEquation = new AptQuadraticEquation();
    private AptRatioAndProportion ratioAndProportion = new AptRatioAndProportion();
    private AptSimpleIntrest simpleIntrest = new AptSimpleIntrest();
    private AptSimplification simplification = new AptSimplification();
    private AptTimeAndWork timeAndWork = new AptTimeAndWork();
    private AptTimeDistanceAndAveragespeed timeDistanceAndAveragespeed = new AptTimeDistanceAndAveragespeed();
    private AptTrain train = new AptTrain();
    private LogAnalogies analogies = new LogAnalogies();
    private LogBloodRelation bloodRelation = new LogBloodRelation();
    private LogCalendars calendars = new LogCalendars();
    private LogClock clock = new LogClock();
    private LogCodingAndDecoding codingAndDecoding = new LogCodingAndDecoding();
    private LogDeductions deductions = new LogDeductions();
    private LogDirections directions = new LogDirections();
    private LogNonVerbal nonVerbal = new LogNonVerbal();
    private LogOddManOut oddManOut = new LogOddManOut();
    private LogSeatingArrangement seatingArrangement = new LogSeatingArrangement();
    private LogNumberSeries series = new LogNumberSeries();
    private LogSymbolsAndNotations symbolsAndNotations = new LogSymbolsAndNotations();



    private TextView mQuestionView;
    TextView questionNumber;
    private Button mButtonChoice1;
    private Button mButtonChoice2;
    private Button mButtonChoice3;
    private Button mButtonChoice4;
    ImageButton mButtonHint;
    ImageButton back;
    ImageButton forward;
    int no;

    String mHint;
    private String mAnswer;
    private int mQuestionNumber = 0;

    Dialog myDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz2);

        mQuestionView =  findViewById(R.id.question);
        questionNumber = findViewById(R.id.questionnumber);
        mButtonChoice1 = findViewById(R.id.choice1);
        mButtonChoice2 = findViewById(R.id.choice2);
        mButtonChoice3 = findViewById(R.id.choice3);
        mButtonChoice4 = findViewById(R.id.choice4);
        mButtonHint = findViewById(R.id.hint);
        back =findViewById(R.id.back);
        forward =findViewById(R.id.forward);

        myDialog = new Dialog(this);

        Intent intent1 = getIntent();
        no = intent1.getIntExtra("numbers",0);

     //   Toast.makeText(Quiz2Activity.this, no+"", Toast.LENGTH_LONG).show();

        updateQuestion();

        //Start of Button Listener for Button1
        mButtonChoice1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                if (mButtonChoice1.getText() == mAnswer){
                    mButtonChoice1.setBackgroundColor(getResources().getColor(R.color.green));
                }else {
                  //  Toast.makeText(Quiz2Activity.this, "wrong", Toast.LENGTH_SHORT).show();
                    mButtonChoice1.setBackgroundColor(getResources().getColor(R.color.red));
                }
            }
        });

        //End of Button Listener for Button1

        //Start of Button Listener for Button2
        mButtonChoice2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                //My logic for Button goes in here

                if (mButtonChoice2.getText() == mAnswer){
                    mButtonChoice2.setBackgroundColor(getResources().getColor(R.color.green));
                    //This line of code is optiona
                 //   Toast.makeText(Quiz2Activity.this, "correct", Toast.LENGTH_SHORT).show();

                }else {
                 //   Toast.makeText(Quiz2Activity.this, "wrong", Toast.LENGTH_SHORT).show();
                    mButtonChoice2.setBackgroundColor(getResources().getColor(R.color.red));
                }
            }
        });

        //End of Button Listener for Button2


        //Start of Button Listener for Button3
        mButtonChoice3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                //My logic for Button goes in here

                if (mButtonChoice3.getText() == mAnswer){
                    mButtonChoice3.setBackgroundColor(getResources().getColor(R.color.green));
                    //This line of code is optiona
                //    Toast.makeText(Quiz2Activity.this, "correct", Toast.LENGTH_SHORT).show();

                }else {
                  //  Toast.makeText(Quiz2Activity.this, "wrong", Toast.LENGTH_SHORT).show();
                    mButtonChoice3.setBackgroundColor(getResources().getColor(R.color.red));
                }
            }
        });

        mButtonChoice4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                //My logic for Button goes in here

                if (mButtonChoice4.getText() == mAnswer){
                    mButtonChoice4.setBackgroundColor(getResources().getColor(R.color.green));
                    //This line of code is optiona
                 //   Toast.makeText(Quiz2Activity.this, "correct", Toast.LENGTH_SHORT).show();

                }else {
                 //   Toast.makeText(Quiz2Activity.this, "wrong", Toast.LENGTH_SHORT).show();
                    mButtonChoice4.setBackgroundColor(getResources().getColor(R.color.red));
                }
            }
        });




        mButtonHint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                TextView txtclose;
                TextView txtHint;


                myDialog.setContentView(R.layout.questionhint);
                txtclose = myDialog.findViewById(R.id.txtclose);
                txtHint = myDialog.findViewById(R.id.txtHint);

                txtclose.setText("X");
                //    btnFollow = (Button) myDialog.findViewById(R.id.btnfollow);
                txtclose.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        myDialog.dismiss();
                    }
                });
                if (no==110){
                    txtHint.setText(AptitudeAge.getHint(mQuestionNumber));
                }
                else if (no==111){
                    txtHint.setText(aptitudeAverage.getHint(mQuestionNumber));
                }
                else if (no==112){
                    txtHint.setText(boatAndStream.getHint(mQuestionNumber));
                }
                else if (no==114){
                    txtHint.setText(compountInterest.getHint(mQuestionNumber));
                }
                else if (no==115){
                    txtHint.setText(hcflcm.getHint(mQuestionNumber));
                }
                else if (no==116){
                    txtHint.setText(mensuration.getHint(mQuestionNumber));
                }
                else if (no==117){
                    txtHint.setText(numberSeries.getHint(mQuestionNumber));
                }
                else if (no==118){
                    txtHint.setText(numerical.getHint(mQuestionNumber));
                }
                else if (no==119){
                    txtHint.setText(partnership.getHint(mQuestionNumber));
                }
                else if (no==120){
                    txtHint.setText(percentage.getHint(mQuestionNumber));
                }
                else if (no==121){
                    txtHint.setText(permutation.getHint(mQuestionNumber));
                }
                else if (no==122){
                    txtHint.setText(pipesAndCistern.getHint(mQuestionNumber));
                }
                else if (no==123){
                    txtHint.setText(probability.getHint(mQuestionNumber));
                }
                else if (no==124){
                    txtHint.setText(profitAndLoss.getHint(mQuestionNumber));
                }
                else if (no==125){
                    txtHint.setText(quadraticEquation.getHint(mQuestionNumber));
                }
                else if (no==126){
                    txtHint.setText(ratioAndProportion.getHint(mQuestionNumber));
                }
                else if (no==127){
                    txtHint.setText(simpleIntrest.getHint(mQuestionNumber));
                }
                else if (no==128){
                    txtHint.setText(simplification.getHint(mQuestionNumber));
                }
                else if (no==129){
                    txtHint.setText(timeAndWork.getHint(mQuestionNumber));
                }
                else if (no==130){
                    txtHint.setText(timeDistanceAndAveragespeed.getHint(mQuestionNumber));
                }
                else if (no==131){
                    txtHint.setText(train.getHint(mQuestionNumber));
                }
                else if (no==210){
                    txtHint.setText(analogies.getHint(mQuestionNumber));
                }
                else if (no==211){
                    txtHint.setText(bloodRelation.getHint(mQuestionNumber));
                }
                else if (no==212){
                    txtHint.setText(calendars.getHint(mQuestionNumber));
                }
                else if (no==213){
                    txtHint.setText(clock.getHint(mQuestionNumber));
                }
                else if (no==214){
                    txtHint.setText(codingAndDecoding.getHint(mQuestionNumber));
                }
                else if (no==215){
                    txtHint.setText(deductions.getHint(mQuestionNumber));
                }
                else if (no==216){
                    txtHint.setText(directions.getHint(mQuestionNumber));
                }
                else if (no==217){
                    txtHint.setText(nonVerbal.getHint(mQuestionNumber));
                }
                else if (no==218){
                    txtHint.setText(oddManOut.getHint(mQuestionNumber));
                }
                else if (no==219){
                    txtHint.setText(seatingArrangement.getHint(mQuestionNumber));
                }
                else if (no==220){
                    txtHint.setText(series.getHint(mQuestionNumber));
                }
                else if (no==221){
                    txtHint.setText(symbolsAndNotations.getHint(mQuestionNumber));
                }


                myDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                myDialog.show();

            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ReverseUpdate();
            }
        });

        forward.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateQuestion();
            }
        });
    }

    private void updateQuestion(){
        if (no == 110) {

            if (mQuestionNumber < AptitudeAge.getLength()-1) {
                mQuestionNumber++;
                ScreenColor();
                questionNumber.setText(mQuestionNumber+" out of "+(AptitudeAge.getLength()-1));
                mQuestionView.setText(AptitudeAge.getQuestion(mQuestionNumber));
                mButtonChoice1.setText(AptitudeAge.getChoice1(mQuestionNumber));
                mButtonChoice2.setText(AptitudeAge.getChoice2(mQuestionNumber));
                mButtonChoice3.setText(AptitudeAge.getChoice3(mQuestionNumber));
                mButtonChoice4.setText(AptitudeAge.getChoice4(mQuestionNumber));
               // mButtonHint.setText(mQuestionLibrary.getHint(mQuestionNumber));
                mHint = AptitudeAge.getHint(mQuestionNumber);
                mAnswer = AptitudeAge.getCorrectAnswer(mQuestionNumber);
                if (mQuestionNumber==1){
                    back.setEnabled(false);
                }else {
                    back.setEnabled(true);
                }

            } else{
//                Intent intent = new Intent(Quiz2Activity.this, ResultofEvery.class);
//                intent.putExtra("score", mScore);
//                startActivity(intent);
                finish();
//                this.dispatchKeyEvent(new KeyEvent(KeyEvent.ACTION_DOWN, KeyEvent.KEYCODE_BACK));
//                this.dispatchKeyEvent(new KeyEvent(KeyEvent.ACTION_UP, KeyEvent.KEYCODE_BACK));
            }

        }
        else if (no == 111){

            if (mQuestionNumber < aptitudeAverage.getLength()-1) {
                mQuestionNumber++;
                ScreenColor();
                questionNumber.setText(mQuestionNumber+" out of "+(aptitudeAverage.getLength()-1));
                mQuestionView.setText(aptitudeAverage.getQuestion(mQuestionNumber));
                mButtonChoice1.setText(aptitudeAverage.getChoice1(mQuestionNumber));
                mButtonChoice2.setText(aptitudeAverage.getChoice2(mQuestionNumber));
                mButtonChoice3.setText(aptitudeAverage.getChoice3(mQuestionNumber));
                mButtonChoice4.setText(aptitudeAverage.getChoice4(mQuestionNumber));
                mHint = aptitudeAverage.getHint(mQuestionNumber);
                mAnswer = aptitudeAverage.getCorrectAnswer(mQuestionNumber);
                if (mQuestionNumber==1){
                    back.setEnabled(false);
                }else {
                    back.setEnabled(true);
                }
            } else{
                finish();
            }
        }
        else if (no == 112){

            if (mQuestionNumber < boatAndStream.getLength()-1) {
                mQuestionNumber++;
                ScreenColor();
                questionNumber.setText(mQuestionNumber+" out of "+(boatAndStream.getLength()-1));
                mQuestionView.setText(boatAndStream.getQuestion(mQuestionNumber));
                mButtonChoice1.setText(boatAndStream.getChoice1(mQuestionNumber));
                mButtonChoice2.setText(boatAndStream.getChoice2(mQuestionNumber));
                mButtonChoice3.setText(boatAndStream.getChoice3(mQuestionNumber));
                mButtonChoice4.setText(boatAndStream.getChoice4(mQuestionNumber));
                mHint = boatAndStream.getHint(mQuestionNumber);
                mAnswer = boatAndStream.getCorrectAnswer(mQuestionNumber);
                if (mQuestionNumber==1){
                    back.setEnabled(false);
                }else {
                    back.setEnabled(true);
                }
            } else{
                finish();
            }
        }
        else if (no==114){
            if (mQuestionNumber < compountInterest.getLength()-1) {
                mQuestionNumber++;
                ScreenColor();
                questionNumber.setText(mQuestionNumber+" out of "+(compountInterest.getLength()-1));
                mQuestionView.setText(compountInterest.getQuestion(mQuestionNumber));
                mButtonChoice1.setText(compountInterest.getChoice1(mQuestionNumber));
                mButtonChoice2.setText(compountInterest.getChoice2(mQuestionNumber));
                mButtonChoice3.setText(compountInterest.getChoice3(mQuestionNumber));
                mButtonChoice4.setText(compountInterest.getChoice4(mQuestionNumber));
                mHint = compountInterest.getHint(mQuestionNumber);
                mAnswer = compountInterest.getCorrectAnswer(mQuestionNumber);
                if (mQuestionNumber==1){
                    back.setEnabled(false);
                }else {
                    back.setEnabled(true);
                }
            } else{
                finish();
            }
        }
        else if (no==115){
            if (mQuestionNumber < hcflcm.getLength()-1) {
                mQuestionNumber++;
                ScreenColor();
                questionNumber.setText(mQuestionNumber+" out of "+(hcflcm.getLength()-1));
                mQuestionView.setText(hcflcm.getQuestion(mQuestionNumber));
                mButtonChoice1.setText(hcflcm.getChoice1(mQuestionNumber));
                mButtonChoice2.setText(hcflcm.getChoice2(mQuestionNumber));
                mButtonChoice3.setText(hcflcm.getChoice3(mQuestionNumber));
                mButtonChoice4.setText(hcflcm.getChoice4(mQuestionNumber));
                mHint = hcflcm.getHint(mQuestionNumber);
                mAnswer = hcflcm.getCorrectAnswer(mQuestionNumber);
                if (mQuestionNumber==1){
                    back.setEnabled(false);
                }else {
                    back.setEnabled(true);
                }
            } else{
                finish();
            }
        }
        else if (no==116){
            if (mQuestionNumber < mensuration.getLength()-1) {
                mQuestionNumber++;
                ScreenColor();
                questionNumber.setText(mQuestionNumber+" out of "+(mensuration.getLength()-1));
                mQuestionView.setText(mensuration.getQuestion(mQuestionNumber));
                mButtonChoice1.setText(mensuration.getChoice1(mQuestionNumber));
                mButtonChoice2.setText(mensuration.getChoice2(mQuestionNumber));
                mButtonChoice3.setText(mensuration.getChoice3(mQuestionNumber));
                mButtonChoice4.setText(mensuration.getChoice4(mQuestionNumber));
                mHint = mensuration.getHint(mQuestionNumber);
                mAnswer = mensuration.getCorrectAnswer(mQuestionNumber);
                if (mQuestionNumber==1){
                    back.setEnabled(false);
                }else {
                    back.setEnabled(true);
                }
            } else{
                finish();
            }
        }
        else if (no==117){
            if (mQuestionNumber < numberSeries.getLength()-1) {
                mQuestionNumber++;
                ScreenColor();
                questionNumber.setText(mQuestionNumber+" out of "+(numberSeries.getLength()-1));
                mQuestionView.setText(numberSeries.getQuestion(mQuestionNumber));
                mButtonChoice1.setText(numberSeries.getChoice1(mQuestionNumber));
                mButtonChoice2.setText(numberSeries.getChoice2(mQuestionNumber));
                mButtonChoice3.setText(numberSeries.getChoice3(mQuestionNumber));
                mButtonChoice4.setText(numberSeries.getChoice4(mQuestionNumber));
                mHint = numberSeries.getHint(mQuestionNumber);
                mAnswer = numberSeries.getCorrectAnswer(mQuestionNumber);
                if (mQuestionNumber==1){
                    back.setEnabled(false);
                }else {
                    back.setEnabled(true);
                }
            } else{
                finish();
            }
        }
        else if (no==118){
            if (mQuestionNumber < numerical.getLength()-1) {
                mQuestionNumber++;
                ScreenColor();
                questionNumber.setText(mQuestionNumber+" out of "+(numerical.getLength()-1));
                mQuestionView.setText(numerical.getQuestion(mQuestionNumber));
                mButtonChoice1.setText(numerical.getChoice1(mQuestionNumber));
                mButtonChoice2.setText(numerical.getChoice2(mQuestionNumber));
                mButtonChoice3.setText(numerical.getChoice3(mQuestionNumber));
                mButtonChoice4.setText(numerical.getChoice4(mQuestionNumber));
                mHint = numerical.getHint(mQuestionNumber);
                mAnswer = numerical.getCorrectAnswer(mQuestionNumber);
                if (mQuestionNumber==1){
                    back.setEnabled(false);
                }else {
                    back.setEnabled(true);
                }
            } else{
                finish();
            }
        }
        else if (no==119){
            if (mQuestionNumber < partnership.getLength()-1) {
                mQuestionNumber++;
                ScreenColor();
                questionNumber.setText(mQuestionNumber+" out of "+(partnership.getLength()-1));
                mQuestionView.setText(partnership.getQuestion(mQuestionNumber));
                mButtonChoice1.setText(partnership.getChoice1(mQuestionNumber));
                mButtonChoice2.setText(partnership.getChoice2(mQuestionNumber));
                mButtonChoice3.setText(partnership.getChoice3(mQuestionNumber));
                mButtonChoice4.setText(partnership.getChoice4(mQuestionNumber));
                mHint = partnership.getHint(mQuestionNumber);
                mAnswer = partnership.getCorrectAnswer(mQuestionNumber);
                if (mQuestionNumber==1){
                    back.setEnabled(false);
                }else {
                    back.setEnabled(true);
                }
            } else{
                finish();
            }
        }
        else if (no==120){
            if (mQuestionNumber < percentage.getLength()-1) {
                mQuestionNumber++;
                ScreenColor();
                questionNumber.setText(mQuestionNumber+" out of "+(percentage.getLength()-1));
                mQuestionView.setText(percentage.getQuestion(mQuestionNumber));
                mButtonChoice1.setText(percentage.getChoice1(mQuestionNumber));
                mButtonChoice2.setText(percentage.getChoice2(mQuestionNumber));
                mButtonChoice3.setText(percentage.getChoice3(mQuestionNumber));
                mButtonChoice4.setText(percentage.getChoice4(mQuestionNumber));
                mHint = percentage.getHint(mQuestionNumber);
                mAnswer = percentage.getCorrectAnswer(mQuestionNumber);
                if (mQuestionNumber==1){
                    back.setEnabled(false);
                }else {
                    back.setEnabled(true);
                }
            } else{
                finish();
            }
        }
        else if (no==121){
            if (mQuestionNumber < permutation.getLength()-1) {
                mQuestionNumber++;
                ScreenColor();
                questionNumber.setText(mQuestionNumber+" out of "+(permutation.getLength()-1));
                mQuestionView.setText(permutation.getQuestion(mQuestionNumber));
                mButtonChoice1.setText(permutation.getChoice1(mQuestionNumber));
                mButtonChoice2.setText(permutation.getChoice2(mQuestionNumber));
                mButtonChoice3.setText(permutation.getChoice3(mQuestionNumber));
                mButtonChoice4.setText(permutation.getChoice4(mQuestionNumber));
                mHint = permutation.getHint(mQuestionNumber);
                mAnswer = permutation.getCorrectAnswer(mQuestionNumber);
                if (mQuestionNumber==1){
                    back.setEnabled(false);
                }else {
                    back.setEnabled(true);
                }
            } else{
                finish();
            }
        }
        else if (no==122){
            if (mQuestionNumber < pipesAndCistern.getLength()-1) {
                mQuestionNumber++;
                ScreenColor();
                questionNumber.setText(mQuestionNumber+" out of "+(pipesAndCistern.getLength()-1));
                mQuestionView.setText(pipesAndCistern.getQuestion(mQuestionNumber));
                mButtonChoice1.setText(pipesAndCistern.getChoice1(mQuestionNumber));
                mButtonChoice2.setText(pipesAndCistern.getChoice2(mQuestionNumber));
                mButtonChoice3.setText(pipesAndCistern.getChoice3(mQuestionNumber));
                mButtonChoice4.setText(pipesAndCistern.getChoice4(mQuestionNumber));
                mHint = pipesAndCistern.getHint(mQuestionNumber);
                mAnswer = pipesAndCistern.getCorrectAnswer(mQuestionNumber);
                if (mQuestionNumber==1){
                    back.setEnabled(false);
                }else {
                    back.setEnabled(true);
                }
            } else{
                finish();
            }
        }
        else if (no==123){
            if (mQuestionNumber < probability.getLength()-1) {
                mQuestionNumber++;
                ScreenColor();
                questionNumber.setText(mQuestionNumber+" out of "+(probability.getLength()-1));
                mQuestionView.setText(probability.getQuestion(mQuestionNumber));
                mButtonChoice1.setText(probability.getChoice1(mQuestionNumber));
                mButtonChoice2.setText(probability.getChoice2(mQuestionNumber));
                mButtonChoice3.setText(probability.getChoice3(mQuestionNumber));
                mButtonChoice4.setText(probability.getChoice4(mQuestionNumber));
                mHint = probability.getHint(mQuestionNumber);
                mAnswer = probability.getCorrectAnswer(mQuestionNumber);
                if (mQuestionNumber==1){
                    back.setEnabled(false);
                }else {
                    back.setEnabled(true);
                }
            } else{
                finish();
            }
        }
        else if (no==124){
            if (mQuestionNumber < profitAndLoss.getLength()-1) {
                mQuestionNumber++;
                ScreenColor();
                questionNumber.setText(mQuestionNumber+" out of "+(profitAndLoss.getLength()-1));
                mQuestionView.setText(profitAndLoss.getQuestion(mQuestionNumber));
                mButtonChoice1.setText(profitAndLoss.getChoice1(mQuestionNumber));
                mButtonChoice2.setText(profitAndLoss.getChoice2(mQuestionNumber));
                mButtonChoice3.setText(profitAndLoss.getChoice3(mQuestionNumber));
                mButtonChoice4.setText(profitAndLoss.getChoice4(mQuestionNumber));
                mHint = profitAndLoss.getHint(mQuestionNumber);
                mAnswer = profitAndLoss.getCorrectAnswer(mQuestionNumber);
                if (mQuestionNumber==1){
                    back.setEnabled(false);
                }else {
                    back.setEnabled(true);
                }
            } else{
                finish();
            }
        }
        else if (no==125){
            if (mQuestionNumber < quadraticEquation.getLength()-1) {
                mQuestionNumber++;
                ScreenColor();
                questionNumber.setText(mQuestionNumber+" out of "+(quadraticEquation.getLength()-1));
                mQuestionView.setText(quadraticEquation.getQuestion(mQuestionNumber));
                mButtonChoice1.setText(quadraticEquation.getChoice1(mQuestionNumber));
                mButtonChoice2.setText(quadraticEquation.getChoice2(mQuestionNumber));
                mButtonChoice3.setText(quadraticEquation.getChoice3(mQuestionNumber));
                mButtonChoice4.setText(quadraticEquation.getChoice4(mQuestionNumber));
                mHint = quadraticEquation.getHint(mQuestionNumber);
                mAnswer = quadraticEquation.getCorrectAnswer(mQuestionNumber);
                if (mQuestionNumber==1){
                    back.setEnabled(false);
                }else {
                    back.setEnabled(true);
                }
            } else{
                finish();
            }
        }
        else if (no==126){
            if (mQuestionNumber < ratioAndProportion.getLength()-1) {
                mQuestionNumber++;
                ScreenColor();
                questionNumber.setText(mQuestionNumber+" out of "+(ratioAndProportion.getLength()-1));
                mQuestionView.setText(ratioAndProportion.getQuestion(mQuestionNumber));
                mButtonChoice1.setText(ratioAndProportion.getChoice1(mQuestionNumber));
                mButtonChoice2.setText(ratioAndProportion.getChoice2(mQuestionNumber));
                mButtonChoice3.setText(ratioAndProportion.getChoice3(mQuestionNumber));
                mButtonChoice4.setText(ratioAndProportion.getChoice4(mQuestionNumber));
                mHint = ratioAndProportion.getHint(mQuestionNumber);
                mAnswer = ratioAndProportion.getCorrectAnswer(mQuestionNumber);
                if (mQuestionNumber==1){
                    back.setEnabled(false);
                }else {
                    back.setEnabled(true);
                }
            } else{
                finish();
            }
        }
        else if (no==127){
            if (mQuestionNumber < simpleIntrest.getLength()-1) {
                mQuestionNumber++;
                ScreenColor();
                questionNumber.setText(mQuestionNumber+" out of "+(simpleIntrest.getLength()-1));
                mQuestionView.setText(simpleIntrest.getQuestion(mQuestionNumber));
                mButtonChoice1.setText(simpleIntrest.getChoice1(mQuestionNumber));
                mButtonChoice2.setText(simpleIntrest.getChoice2(mQuestionNumber));
                mButtonChoice3.setText(simpleIntrest.getChoice3(mQuestionNumber));
                mButtonChoice4.setText(simpleIntrest.getChoice4(mQuestionNumber));
                mHint = simpleIntrest.getHint(mQuestionNumber);
                mAnswer = simpleIntrest.getCorrectAnswer(mQuestionNumber);
                if (mQuestionNumber==1){
                    back.setEnabled(false);
                }else {
                    back.setEnabled(true);
                }
            } else{
                finish();
            }
        }
        else if (no==128){
            if (mQuestionNumber < simplification.getLength()-1) {
                mQuestionNumber++;
                ScreenColor();
                questionNumber.setText(mQuestionNumber+" out of "+(simplification.getLength()-1));
                mQuestionView.setText(simplification.getQuestion(mQuestionNumber));
                mButtonChoice1.setText(simplification.getChoice1(mQuestionNumber));
                mButtonChoice2.setText(simplification.getChoice2(mQuestionNumber));
                mButtonChoice3.setText(simplification.getChoice3(mQuestionNumber));
                mButtonChoice4.setText(simplification.getChoice4(mQuestionNumber));
                mHint = simplification.getHint(mQuestionNumber);
                mAnswer = simplification.getCorrectAnswer(mQuestionNumber);
                if (mQuestionNumber==1){
                    back.setEnabled(false);
                }else {
                    back.setEnabled(true);
                }
            } else{
                finish();
            }
        }
        else if (no==129){
            if (mQuestionNumber < timeAndWork.getLength()-1) {
                mQuestionNumber++;
                ScreenColor();
                questionNumber.setText(mQuestionNumber+" out of "+(timeAndWork.getLength()-1));
                mQuestionView.setText(timeAndWork.getQuestion(mQuestionNumber));
                mButtonChoice1.setText(timeAndWork.getChoice1(mQuestionNumber));
                mButtonChoice2.setText(timeAndWork.getChoice2(mQuestionNumber));
                mButtonChoice3.setText(timeAndWork.getChoice3(mQuestionNumber));
                mButtonChoice4.setText(timeAndWork.getChoice4(mQuestionNumber));
                mHint = timeAndWork.getHint(mQuestionNumber);
                mAnswer = timeAndWork.getCorrectAnswer(mQuestionNumber);
                if (mQuestionNumber==1){
                    back.setEnabled(false);
                }else {
                    back.setEnabled(true);
                }
            } else{
                finish();
            }
        }
        else if (no==130){
            if (mQuestionNumber < timeDistanceAndAveragespeed.getLength()-1) {
                mQuestionNumber++;
                ScreenColor();
                questionNumber.setText(mQuestionNumber+" out of "+(timeDistanceAndAveragespeed.getLength()-1));
                mQuestionView.setText(timeDistanceAndAveragespeed.getQuestion(mQuestionNumber));
                mButtonChoice1.setText(timeDistanceAndAveragespeed.getChoice1(mQuestionNumber));
                mButtonChoice2.setText(timeDistanceAndAveragespeed.getChoice2(mQuestionNumber));
                mButtonChoice3.setText(timeDistanceAndAveragespeed.getChoice3(mQuestionNumber));
                mButtonChoice4.setText(timeDistanceAndAveragespeed.getChoice4(mQuestionNumber));
                mHint = timeDistanceAndAveragespeed.getHint(mQuestionNumber);
                mAnswer = timeDistanceAndAveragespeed.getCorrectAnswer(mQuestionNumber);
                if (mQuestionNumber==1){
                    back.setEnabled(false);
                }else {
                    back.setEnabled(true);
                }
            } else{
                finish();
            }
        }
        else if (no==131){
            if (mQuestionNumber < train.getLength()-1) {
                mQuestionNumber++;
                ScreenColor();
                questionNumber.setText(mQuestionNumber+" out of "+(train.getLength()-1));
                mQuestionView.setText(train.getQuestion(mQuestionNumber));
                mButtonChoice1.setText(train.getChoice1(mQuestionNumber));
                mButtonChoice2.setText(train.getChoice2(mQuestionNumber));
                mButtonChoice3.setText(train.getChoice3(mQuestionNumber));
                mButtonChoice4.setText(train.getChoice4(mQuestionNumber));
                mHint = train.getHint(mQuestionNumber);
                mAnswer = train.getCorrectAnswer(mQuestionNumber);
                if (mQuestionNumber==1){
                    back.setEnabled(false);
                }else {
                    back.setEnabled(true);
                }
            } else{
                finish();
            }
        }
        else if (no==210){
            if (mQuestionNumber < analogies.getLength()-1) {
                mQuestionNumber++;
                ScreenColor();
                questionNumber.setText(mQuestionNumber+" out of "+(analogies.getLength()-1));
                mQuestionView.setText(analogies.getQuestion(mQuestionNumber));
                mButtonChoice1.setText(analogies.getChoice1(mQuestionNumber));
                mButtonChoice2.setText(analogies.getChoice2(mQuestionNumber));
                mButtonChoice3.setText(analogies.getChoice3(mQuestionNumber));
                mButtonChoice4.setText(analogies.getChoice4(mQuestionNumber));
                mHint = analogies.getHint(mQuestionNumber);
                mAnswer = analogies.getCorrectAnswer(mQuestionNumber);
                if (mQuestionNumber==1){
                    back.setEnabled(false);
                }else {
                    back.setEnabled(true);
                }
            } else{
                finish();
            }
        }
        else if (no==211){
            if (mQuestionNumber < bloodRelation.getLength()-1) {
                mQuestionNumber++;
                ScreenColor();
                questionNumber.setText(mQuestionNumber+" out of "+(bloodRelation.getLength()-1));
                mQuestionView.setText(bloodRelation.getQuestion(mQuestionNumber));
                mButtonChoice1.setText(bloodRelation.getChoice1(mQuestionNumber));
                mButtonChoice2.setText(bloodRelation.getChoice2(mQuestionNumber));
                mButtonChoice3.setText(bloodRelation.getChoice3(mQuestionNumber));
                mButtonChoice4.setText(bloodRelation.getChoice4(mQuestionNumber));
                mHint = bloodRelation.getHint(mQuestionNumber);
                mAnswer = bloodRelation.getCorrectAnswer(mQuestionNumber);
                if (mQuestionNumber==1){
                    back.setEnabled(false);
                }else {
                    back.setEnabled(true);
                }
            } else{
                finish();
            }
        }
        else if (no==212){
            if (mQuestionNumber < calendars.getLength()-1) {
                mQuestionNumber++;
                ScreenColor();
                questionNumber.setText(mQuestionNumber+" out of "+(calendars.getLength()-1));
                mQuestionView.setText(calendars.getQuestion(mQuestionNumber));
                mButtonChoice1.setText(calendars.getChoice1(mQuestionNumber));
                mButtonChoice2.setText(calendars.getChoice2(mQuestionNumber));
                mButtonChoice3.setText(calendars.getChoice3(mQuestionNumber));
                mButtonChoice4.setText(calendars.getChoice4(mQuestionNumber));
                mHint = calendars.getHint(mQuestionNumber);
                mAnswer = calendars.getCorrectAnswer(mQuestionNumber);
                if (mQuestionNumber==1){
                    back.setEnabled(false);
                }else {
                    back.setEnabled(true);
                }
            } else{
                finish();
            }
        }
        else if (no==213){
            if (mQuestionNumber < clock.getLength()-1) {
                mQuestionNumber++;
                ScreenColor();
                questionNumber.setText(mQuestionNumber+" out of "+(clock.getLength()-1));
                mQuestionView.setText(clock.getQuestion(mQuestionNumber));
                mButtonChoice1.setText(clock.getChoice1(mQuestionNumber));
                mButtonChoice2.setText(clock.getChoice2(mQuestionNumber));
                mButtonChoice3.setText(clock.getChoice3(mQuestionNumber));
                mButtonChoice4.setText(clock.getChoice4(mQuestionNumber));
                mHint = clock.getHint(mQuestionNumber);
                mAnswer = clock.getCorrectAnswer(mQuestionNumber);
                if (mQuestionNumber==1){
                    back.setEnabled(false);
                }else {
                    back.setEnabled(true);
                }
            } else{
                finish();
            }
        }
        else if (no==214){
            if (mQuestionNumber < codingAndDecoding.getLength()-1) {
                mQuestionNumber++;
                ScreenColor();
                questionNumber.setText(mQuestionNumber+" out of "+(codingAndDecoding.getLength()-1));
                mQuestionView.setText(codingAndDecoding.getQuestion(mQuestionNumber));
                mButtonChoice1.setText(codingAndDecoding.getChoice1(mQuestionNumber));
                mButtonChoice2.setText(codingAndDecoding.getChoice2(mQuestionNumber));
                mButtonChoice3.setText(codingAndDecoding.getChoice3(mQuestionNumber));
                mButtonChoice4.setText(codingAndDecoding.getChoice4(mQuestionNumber));
                mHint = codingAndDecoding.getHint(mQuestionNumber);
                mAnswer = codingAndDecoding.getCorrectAnswer(mQuestionNumber);
                if (mQuestionNumber==1){
                    back.setEnabled(false);
                }else {
                    back.setEnabled(true);
                }
            } else{
                finish();
            }
        }
        else if (no==215){
            if (mQuestionNumber < deductions.getLength()-1) {
                mQuestionNumber++;
                ScreenColor();
                questionNumber.setText(mQuestionNumber+" out of "+(deductions.getLength()-1));
                mQuestionView.setText(deductions.getQuestion(mQuestionNumber));
                mButtonChoice1.setText(deductions.getChoice1(mQuestionNumber));
                mButtonChoice2.setText(deductions.getChoice2(mQuestionNumber));
                mButtonChoice3.setText(deductions.getChoice3(mQuestionNumber));
                mButtonChoice4.setText(deductions.getChoice4(mQuestionNumber));
                mHint = deductions.getHint(mQuestionNumber);
                mAnswer = deductions.getCorrectAnswer(mQuestionNumber);
                if (mQuestionNumber==1){
                    back.setEnabled(false);
                }else {
                    back.setEnabled(true);
                }
            } else{
                finish();
            }
        }
        else if (no==216){
            if (mQuestionNumber < directions.getLength()-1) {
                mQuestionNumber++;
                ScreenColor();
                questionNumber.setText(mQuestionNumber+" out of "+(directions.getLength()-1));
                mQuestionView.setText(directions.getQuestion(mQuestionNumber));
                mButtonChoice1.setText(directions.getChoice1(mQuestionNumber));
                mButtonChoice2.setText(directions.getChoice2(mQuestionNumber));
                mButtonChoice3.setText(directions.getChoice3(mQuestionNumber));
                mButtonChoice4.setText(directions.getChoice4(mQuestionNumber));
                mHint = directions.getHint(mQuestionNumber);
                mAnswer = directions.getCorrectAnswer(mQuestionNumber);
                if (mQuestionNumber==1){
                    back.setEnabled(false);
                }else {
                    back.setEnabled(true);
                }
            } else{
                finish();
            }
        }
        else if (no==217){
            if (mQuestionNumber < nonVerbal.getLength()-1) {
                mQuestionNumber++;
                ScreenColor();
                questionNumber.setText(mQuestionNumber+" out of "+(nonVerbal.getLength()-1));
                mQuestionView.setText(nonVerbal.getQuestion(mQuestionNumber));
                mButtonChoice1.setText(nonVerbal.getChoice1(mQuestionNumber));
                mButtonChoice2.setText(nonVerbal.getChoice2(mQuestionNumber));
                mButtonChoice3.setText(nonVerbal.getChoice3(mQuestionNumber));
                mButtonChoice4.setText(nonVerbal.getChoice4(mQuestionNumber));
                mHint = nonVerbal.getHint(mQuestionNumber);
                mAnswer = nonVerbal.getCorrectAnswer(mQuestionNumber);
                if (mQuestionNumber==1){
                    back.setEnabled(false);
                }else {
                    back.setEnabled(true);
                }
            } else{
                finish();
            }
        }
        else if (no==218){
            if (mQuestionNumber < oddManOut.getLength()-1) {
                mQuestionNumber++;
                ScreenColor();
                questionNumber.setText(mQuestionNumber+" out of "+(oddManOut.getLength()-1));
                mQuestionView.setText(oddManOut.getQuestion(mQuestionNumber));
                mButtonChoice1.setText(oddManOut.getChoice1(mQuestionNumber));
                mButtonChoice2.setText(oddManOut.getChoice2(mQuestionNumber));
                mButtonChoice3.setText(oddManOut.getChoice3(mQuestionNumber));
                mButtonChoice4.setText(oddManOut.getChoice4(mQuestionNumber));
                mHint = oddManOut.getHint(mQuestionNumber);
                mAnswer = oddManOut.getCorrectAnswer(mQuestionNumber);
                if (mQuestionNumber==1){
                    back.setEnabled(false);
                }else {
                    back.setEnabled(true);
                }
            } else{
                finish();
            }
        }
        else if (no==219){
            if (mQuestionNumber < seatingArrangement.getLength()-1) {
                mQuestionNumber++;
                ScreenColor();
                questionNumber.setText(mQuestionNumber+" out of "+(seatingArrangement.getLength()-1));
                mQuestionView.setText(seatingArrangement.getQuestion(mQuestionNumber));
                mButtonChoice1.setText(seatingArrangement.getChoice1(mQuestionNumber));
                mButtonChoice2.setText(seatingArrangement.getChoice2(mQuestionNumber));
                mButtonChoice3.setText(seatingArrangement.getChoice3(mQuestionNumber));
                mButtonChoice4.setText(seatingArrangement.getChoice4(mQuestionNumber));
                mHint = seatingArrangement.getHint(mQuestionNumber);
                mAnswer = seatingArrangement.getCorrectAnswer(mQuestionNumber);
                if (mQuestionNumber==1){
                    back.setEnabled(false);
                }else {
                    back.setEnabled(true);
                }
            } else{
                finish();
            }
        }
        else if (no==220){
            if (mQuestionNumber < series.getLength()-1) {
                mQuestionNumber++;
                ScreenColor();
                questionNumber.setText(mQuestionNumber+" out of "+(series.getLength()-1));
                mQuestionView.setText(series.getQuestion(mQuestionNumber));
                mButtonChoice1.setText(series.getChoice1(mQuestionNumber));
                mButtonChoice2.setText(series.getChoice2(mQuestionNumber));
                mButtonChoice3.setText(series.getChoice3(mQuestionNumber));
                mButtonChoice4.setText(series.getChoice4(mQuestionNumber));
                mHint = series.getHint(mQuestionNumber);
                mAnswer = series.getCorrectAnswer(mQuestionNumber);
                if (mQuestionNumber==1){
                    back.setEnabled(false);
                }else {
                    back.setEnabled(true);
                }
            } else{
                finish();
            }
        }
        else if (no==221){
            if (mQuestionNumber < symbolsAndNotations.getLength()-1) {
                mQuestionNumber++;
                ScreenColor();
                questionNumber.setText(mQuestionNumber+" out of "+(symbolsAndNotations.getLength()-1));
                mQuestionView.setText(symbolsAndNotations.getQuestion(mQuestionNumber));
                mButtonChoice1.setText(symbolsAndNotations.getChoice1(mQuestionNumber));
                mButtonChoice2.setText(symbolsAndNotations.getChoice2(mQuestionNumber));
                mButtonChoice3.setText(symbolsAndNotations.getChoice3(mQuestionNumber));
                mButtonChoice4.setText(symbolsAndNotations.getChoice4(mQuestionNumber));
                mHint = symbolsAndNotations.getHint(mQuestionNumber);
                mAnswer = symbolsAndNotations.getCorrectAnswer(mQuestionNumber);
                if (mQuestionNumber==1){
                    back.setEnabled(false);
                }else {
                    back.setEnabled(true);
                }
            } else{
                finish();
            }
        }

    }

    public void ReverseUpdate(){

        if (no == 110) {

            if (mQuestionNumber < AptitudeAge.getLength()) {
                mQuestionNumber--;
                questionNumber.setText(mQuestionNumber+" out of "+(AptitudeAge.getLength()-1));
                ScreenColor();
                mQuestionView.setText(AptitudeAge.getQuestion(mQuestionNumber));
                mButtonChoice1.setText(AptitudeAge.getChoice1(mQuestionNumber));
                mButtonChoice2.setText(AptitudeAge.getChoice2(mQuestionNumber));
                mButtonChoice3.setText(AptitudeAge.getChoice3(mQuestionNumber));
                mButtonChoice4.setText(AptitudeAge.getChoice4(mQuestionNumber));
                mHint = AptitudeAge.getHint(mQuestionNumber);
                mAnswer = AptitudeAge.getCorrectAnswer(mQuestionNumber);
                if (mQuestionNumber==1){
                    back.setEnabled(false);
                }else {
                    back.setEnabled(true);
                }
            } else {
            }

        }
        else if (no == 111){
            if (mQuestionNumber < aptitudeAverage.getLength()) {
                mQuestionNumber--;
                questionNumber.setText(mQuestionNumber+" out of "+(aptitudeAverage.getLength()-1));
                ScreenColor();
                mQuestionView.setText(aptitudeAverage.getQuestion(mQuestionNumber));
                mButtonChoice1.setText(aptitudeAverage.getChoice1(mQuestionNumber));
                mButtonChoice2.setText(aptitudeAverage.getChoice2(mQuestionNumber));
                mButtonChoice3.setText(aptitudeAverage.getChoice3(mQuestionNumber));
                mButtonChoice4.setText(aptitudeAverage.getChoice4(mQuestionNumber));
                mHint = aptitudeAverage.getHint(mQuestionNumber);
                mAnswer = aptitudeAverage.getCorrectAnswer(mQuestionNumber);
                if (mQuestionNumber==1){
                    back.setEnabled(false);
                }else {
                    back.setEnabled(true);
                }
            } else {
            }
        }
        else if (no == 112){
            if (mQuestionNumber < boatAndStream.getLength()) {
                mQuestionNumber--;
                questionNumber.setText(mQuestionNumber+" out of "+(boatAndStream.getLength()-1));
                ScreenColor();
                mQuestionView.setText(boatAndStream.getQuestion(mQuestionNumber));
                mButtonChoice1.setText(boatAndStream.getChoice1(mQuestionNumber));
                mButtonChoice2.setText(boatAndStream.getChoice2(mQuestionNumber));
                mButtonChoice3.setText(boatAndStream.getChoice3(mQuestionNumber));
                mButtonChoice4.setText(boatAndStream.getChoice4(mQuestionNumber));
                mHint = boatAndStream.getHint(mQuestionNumber);
                mAnswer = boatAndStream.getCorrectAnswer(mQuestionNumber);
                if (mQuestionNumber==1){
                    back.setEnabled(false);
                }else {
                    back.setEnabled(true);
                }
            } else {
            }
        }
        else if (no==114){
            if (mQuestionNumber < compountInterest.getLength()) {
                mQuestionNumber--;
                questionNumber.setText(mQuestionNumber+" out of "+(compountInterest.getLength()-1));
                ScreenColor();
                mQuestionView.setText(compountInterest.getQuestion(mQuestionNumber));
                mButtonChoice1.setText(compountInterest.getChoice1(mQuestionNumber));
                mButtonChoice2.setText(compountInterest.getChoice2(mQuestionNumber));
                mButtonChoice3.setText(compountInterest.getChoice3(mQuestionNumber));
                mButtonChoice4.setText(compountInterest.getChoice4(mQuestionNumber));
                mHint = compountInterest.getHint(mQuestionNumber);
                mAnswer = compountInterest.getCorrectAnswer(mQuestionNumber);
                if (mQuestionNumber==1){
                    back.setEnabled(false);
                }else {
                    back.setEnabled(true);
                }
            } else {
            }
        }
        else if (no==115){
            if (mQuestionNumber < hcflcm.getLength()) {
                mQuestionNumber--;
                questionNumber.setText(mQuestionNumber+" out of "+(hcflcm.getLength()-1));
                ScreenColor();
                mQuestionView.setText(hcflcm.getQuestion(mQuestionNumber));
                mButtonChoice1.setText(hcflcm.getChoice1(mQuestionNumber));
                mButtonChoice2.setText(hcflcm.getChoice2(mQuestionNumber));
                mButtonChoice3.setText(hcflcm.getChoice3(mQuestionNumber));
                mButtonChoice4.setText(hcflcm.getChoice4(mQuestionNumber));
                mHint = hcflcm.getHint(mQuestionNumber);
                mAnswer = hcflcm.getCorrectAnswer(mQuestionNumber);
                if (mQuestionNumber==1){
                    back.setEnabled(false);
                }else {
                    back.setEnabled(true);
                }
            } else {
            }
        }
        else if (no==116){
            if (mQuestionNumber < mensuration.getLength()) {
                mQuestionNumber--;
                questionNumber.setText(mQuestionNumber+" out of "+(mensuration.getLength()-1));
                ScreenColor();
                mQuestionView.setText(mensuration.getQuestion(mQuestionNumber));
                mButtonChoice1.setText(mensuration.getChoice1(mQuestionNumber));
                mButtonChoice2.setText(mensuration.getChoice2(mQuestionNumber));
                mButtonChoice3.setText(mensuration.getChoice3(mQuestionNumber));
                mButtonChoice4.setText(mensuration.getChoice4(mQuestionNumber));
                mHint = mensuration.getHint(mQuestionNumber);
                mAnswer = mensuration.getCorrectAnswer(mQuestionNumber);
                if (mQuestionNumber==1){
                    back.setEnabled(false);
                }else {
                    back.setEnabled(true);
                }
            } else {
            }
        }
        else if (no==117){
            if (mQuestionNumber < numberSeries.getLength()) {
                mQuestionNumber--;
                questionNumber.setText(mQuestionNumber+" out of "+(numberSeries.getLength()-1));
                ScreenColor();
                mQuestionView.setText(numberSeries.getQuestion(mQuestionNumber));
                mButtonChoice1.setText(numberSeries.getChoice1(mQuestionNumber));
                mButtonChoice2.setText(numberSeries.getChoice2(mQuestionNumber));
                mButtonChoice3.setText(numberSeries.getChoice3(mQuestionNumber));
                mButtonChoice4.setText(numberSeries.getChoice4(mQuestionNumber));
                mHint = numberSeries.getHint(mQuestionNumber);
                mAnswer = numberSeries.getCorrectAnswer(mQuestionNumber);
                if (mQuestionNumber==1){
                    back.setEnabled(false);
                }else {
                    back.setEnabled(true);
                }
            } else {
            }
        }
        else if (no==118){
            if (mQuestionNumber < numerical.getLength()) {
                mQuestionNumber--;
                questionNumber.setText(mQuestionNumber+" out of "+(numerical.getLength()-1));
                ScreenColor();
                mQuestionView.setText(numerical.getQuestion(mQuestionNumber));
                mButtonChoice1.setText(numerical.getChoice1(mQuestionNumber));
                mButtonChoice2.setText(numerical.getChoice2(mQuestionNumber));
                mButtonChoice3.setText(numerical.getChoice3(mQuestionNumber));
                mButtonChoice4.setText(numerical.getChoice4(mQuestionNumber));
                mHint = numerical.getHint(mQuestionNumber);
                mAnswer = numerical.getCorrectAnswer(mQuestionNumber);
                if (mQuestionNumber==1){
                    back.setEnabled(false);
                }else {
                    back.setEnabled(true);
                }
            } else {
            }
        }
        else if (no==119){
            if (mQuestionNumber < partnership.getLength()) {
                mQuestionNumber--;
                questionNumber.setText(mQuestionNumber+" out of "+(partnership.getLength()-1));
                ScreenColor();
                mQuestionView.setText(partnership.getQuestion(mQuestionNumber));
                mButtonChoice1.setText(partnership.getChoice1(mQuestionNumber));
                mButtonChoice2.setText(partnership.getChoice2(mQuestionNumber));
                mButtonChoice3.setText(partnership.getChoice3(mQuestionNumber));
                mButtonChoice4.setText(partnership.getChoice4(mQuestionNumber));
                mHint = partnership.getHint(mQuestionNumber);
                mAnswer = partnership.getCorrectAnswer(mQuestionNumber);
                if (mQuestionNumber==1){
                    back.setEnabled(false);
                }else {
                    back.setEnabled(true);
                }
            } else {
            }
        }
        else if (no==120){
            if (mQuestionNumber < percentage.getLength()) {
                mQuestionNumber--;
                questionNumber.setText(mQuestionNumber+" out of "+(percentage.getLength()-1));
                ScreenColor();
                mQuestionView.setText(percentage.getQuestion(mQuestionNumber));
                mButtonChoice1.setText(percentage.getChoice1(mQuestionNumber));
                mButtonChoice2.setText(percentage.getChoice2(mQuestionNumber));
                mButtonChoice3.setText(percentage.getChoice3(mQuestionNumber));
                mButtonChoice4.setText(percentage.getChoice4(mQuestionNumber));
                mHint = percentage.getHint(mQuestionNumber);
                mAnswer = percentage.getCorrectAnswer(mQuestionNumber);
                if (mQuestionNumber==1){
                    back.setEnabled(false);
                }else {
                    back.setEnabled(true);
                }
            } else {
            }
        }
        else if (no==121){
            if (mQuestionNumber < permutation.getLength()) {
                mQuestionNumber--;
                questionNumber.setText(mQuestionNumber+" out of "+(permutation.getLength()-1));
                ScreenColor();
                mQuestionView.setText(permutation.getQuestion(mQuestionNumber));
                mButtonChoice1.setText(permutation.getChoice1(mQuestionNumber));
                mButtonChoice2.setText(permutation.getChoice2(mQuestionNumber));
                mButtonChoice3.setText(permutation.getChoice3(mQuestionNumber));
                mButtonChoice4.setText(permutation.getChoice4(mQuestionNumber));
                mHint = permutation.getHint(mQuestionNumber);
                mAnswer = permutation.getCorrectAnswer(mQuestionNumber);
                if (mQuestionNumber==1){
                    back.setEnabled(false);
                }else {
                    back.setEnabled(true);
                }
            } else {
            }
        }
        else if (no==122){
            if (mQuestionNumber < pipesAndCistern.getLength()) {
                mQuestionNumber--;
                questionNumber.setText(mQuestionNumber+" out of "+(pipesAndCistern.getLength()-1));
                ScreenColor();
                mQuestionView.setText(pipesAndCistern.getQuestion(mQuestionNumber));
                mButtonChoice1.setText(pipesAndCistern.getChoice1(mQuestionNumber));
                mButtonChoice2.setText(pipesAndCistern.getChoice2(mQuestionNumber));
                mButtonChoice3.setText(pipesAndCistern.getChoice3(mQuestionNumber));
                mButtonChoice4.setText(pipesAndCistern.getChoice4(mQuestionNumber));
                mHint = pipesAndCistern.getHint(mQuestionNumber);
                mAnswer = pipesAndCistern.getCorrectAnswer(mQuestionNumber);
                if (mQuestionNumber==1){
                    back.setEnabled(false);
                }else {
                    back.setEnabled(true);
                }
            } else {
            }
        }
        else if (no==123){
            if (mQuestionNumber < probability.getLength()) {
                mQuestionNumber--;
                questionNumber.setText(mQuestionNumber+" out of "+(probability.getLength()-1));
                ScreenColor();
                mQuestionView.setText(probability.getQuestion(mQuestionNumber));
                mButtonChoice1.setText(probability.getChoice1(mQuestionNumber));
                mButtonChoice2.setText(probability.getChoice2(mQuestionNumber));
                mButtonChoice3.setText(probability.getChoice3(mQuestionNumber));
                mButtonChoice4.setText(probability.getChoice4(mQuestionNumber));
                mHint = probability.getHint(mQuestionNumber);
                mAnswer = probability.getCorrectAnswer(mQuestionNumber);
                if (mQuestionNumber==1){
                    back.setEnabled(false);
                }else {
                    back.setEnabled(true);
                }
            } else {
            }
        }
        else if (no==124){
            if (mQuestionNumber < profitAndLoss.getLength()) {
                mQuestionNumber--;
                questionNumber.setText(mQuestionNumber+" out of "+(profitAndLoss.getLength()-1));
                ScreenColor();
                mQuestionView.setText(profitAndLoss.getQuestion(mQuestionNumber));
                mButtonChoice1.setText(profitAndLoss.getChoice1(mQuestionNumber));
                mButtonChoice2.setText(profitAndLoss.getChoice2(mQuestionNumber));
                mButtonChoice3.setText(profitAndLoss.getChoice3(mQuestionNumber));
                mButtonChoice4.setText(profitAndLoss.getChoice4(mQuestionNumber));
                mHint = profitAndLoss.getHint(mQuestionNumber);
                mAnswer = profitAndLoss.getCorrectAnswer(mQuestionNumber);
                if (mQuestionNumber==1){
                    back.setEnabled(false);
                }else {
                    back.setEnabled(true);
                }
            } else {
            }
        }
        else if (no==125){
            if (mQuestionNumber < quadraticEquation.getLength()) {
                mQuestionNumber--;
                questionNumber.setText(mQuestionNumber+" out of "+(quadraticEquation.getLength()-1));
                ScreenColor();
                mQuestionView.setText(quadraticEquation.getQuestion(mQuestionNumber));
                mButtonChoice1.setText(quadraticEquation.getChoice1(mQuestionNumber));
                mButtonChoice2.setText(quadraticEquation.getChoice2(mQuestionNumber));
                mButtonChoice3.setText(quadraticEquation.getChoice3(mQuestionNumber));
                mButtonChoice4.setText(quadraticEquation.getChoice4(mQuestionNumber));
                mHint = quadraticEquation.getHint(mQuestionNumber);
                mAnswer = quadraticEquation.getCorrectAnswer(mQuestionNumber);
                if (mQuestionNumber==1){
                    back.setEnabled(false);
                }else {
                    back.setEnabled(true);
                }
            } else {
            }
        }
        else if (no==126){
            if (mQuestionNumber < ratioAndProportion.getLength()) {
                mQuestionNumber--;
                questionNumber.setText(mQuestionNumber+" out of "+(ratioAndProportion.getLength()-1));
                ScreenColor();
                mQuestionView.setText(ratioAndProportion.getQuestion(mQuestionNumber));
                mButtonChoice1.setText(ratioAndProportion.getChoice1(mQuestionNumber));
                mButtonChoice2.setText(ratioAndProportion.getChoice2(mQuestionNumber));
                mButtonChoice3.setText(ratioAndProportion.getChoice3(mQuestionNumber));
                mButtonChoice4.setText(ratioAndProportion.getChoice4(mQuestionNumber));
                mHint = ratioAndProportion.getHint(mQuestionNumber);
                mAnswer = ratioAndProportion.getCorrectAnswer(mQuestionNumber);
                if (mQuestionNumber==1){
                    back.setEnabled(false);
                }else {
                    back.setEnabled(true);
                }
            } else {
            }
        }
        else if (no==127){
            if (mQuestionNumber < simpleIntrest.getLength()) {
                mQuestionNumber--;
                questionNumber.setText(mQuestionNumber+" out of "+(simpleIntrest.getLength()-1));
                ScreenColor();
                mQuestionView.setText(simpleIntrest.getQuestion(mQuestionNumber));
                mButtonChoice1.setText(simpleIntrest.getChoice1(mQuestionNumber));
                mButtonChoice2.setText(simpleIntrest.getChoice2(mQuestionNumber));
                mButtonChoice3.setText(simpleIntrest.getChoice3(mQuestionNumber));
                mButtonChoice4.setText(simpleIntrest.getChoice4(mQuestionNumber));
                mHint = simpleIntrest.getHint(mQuestionNumber);
                mAnswer = simpleIntrest.getCorrectAnswer(mQuestionNumber);
                if (mQuestionNumber==1){
                    back.setEnabled(false);
                }else {
                    back.setEnabled(true);
                }
            } else {
            }
        }
        else if (no==128){
            if (mQuestionNumber < simplification.getLength()) {
                mQuestionNumber--;
                questionNumber.setText(mQuestionNumber+" out of "+(simplification.getLength()-1));
                ScreenColor();
                mQuestionView.setText(simplification.getQuestion(mQuestionNumber));
                mButtonChoice1.setText(simplification.getChoice1(mQuestionNumber));
                mButtonChoice2.setText(simplification.getChoice2(mQuestionNumber));
                mButtonChoice3.setText(simplification.getChoice3(mQuestionNumber));
                mButtonChoice4.setText(simplification.getChoice4(mQuestionNumber));
                mHint = simplification.getHint(mQuestionNumber);
                mAnswer = simplification.getCorrectAnswer(mQuestionNumber);
                if (mQuestionNumber==1){
                    back.setEnabled(false);
                }else {
                    back.setEnabled(true);
                }
            } else {
            }
        }
        else if (no==129){
            if (mQuestionNumber < timeAndWork.getLength()) {
                mQuestionNumber--;
                questionNumber.setText(mQuestionNumber+" out of "+(timeAndWork.getLength()-1));
                ScreenColor();
                mQuestionView.setText(timeAndWork.getQuestion(mQuestionNumber));
                mButtonChoice1.setText(timeAndWork.getChoice1(mQuestionNumber));
                mButtonChoice2.setText(timeAndWork.getChoice2(mQuestionNumber));
                mButtonChoice3.setText(timeAndWork.getChoice3(mQuestionNumber));
                mButtonChoice4.setText(timeAndWork.getChoice4(mQuestionNumber));
                mHint = timeAndWork.getHint(mQuestionNumber);
                mAnswer = timeAndWork.getCorrectAnswer(mQuestionNumber);
                if (mQuestionNumber==1){
                    back.setEnabled(false);
                }else {
                    back.setEnabled(true);
                }
            } else {
            }
        }
        else if (no==130){
            if (mQuestionNumber < timeDistanceAndAveragespeed.getLength()) {
                mQuestionNumber--;
                questionNumber.setText(mQuestionNumber+" out of "+(timeDistanceAndAveragespeed.getLength()-1));
                ScreenColor();
                mQuestionView.setText(timeDistanceAndAveragespeed.getQuestion(mQuestionNumber));
                mButtonChoice1.setText(timeDistanceAndAveragespeed.getChoice1(mQuestionNumber));
                mButtonChoice2.setText(timeDistanceAndAveragespeed.getChoice2(mQuestionNumber));
                mButtonChoice3.setText(timeDistanceAndAveragespeed.getChoice3(mQuestionNumber));
                mButtonChoice4.setText(timeDistanceAndAveragespeed.getChoice4(mQuestionNumber));
                mHint = timeDistanceAndAveragespeed.getHint(mQuestionNumber);
                mAnswer = timeDistanceAndAveragespeed.getCorrectAnswer(mQuestionNumber);
                if (mQuestionNumber==1){
                    back.setEnabled(false);
                }else {
                    back.setEnabled(true);
                }
            } else {
            }
        }
        else if (no==131){
            if (mQuestionNumber < train.getLength()) {
                mQuestionNumber--;
                questionNumber.setText(mQuestionNumber+" out of "+(train.getLength()-1));
                ScreenColor();
                mQuestionView.setText(train.getQuestion(mQuestionNumber));
                mButtonChoice1.setText(train.getChoice1(mQuestionNumber));
                mButtonChoice2.setText(train.getChoice2(mQuestionNumber));
                mButtonChoice3.setText(train.getChoice3(mQuestionNumber));
                mButtonChoice4.setText(train.getChoice4(mQuestionNumber));
                mHint = train.getHint(mQuestionNumber);
                mAnswer = train.getCorrectAnswer(mQuestionNumber);
                if (mQuestionNumber==1){
                    back.setEnabled(false);
                }else {
                    back.setEnabled(true);
                }
            } else {
            }
        }
        else if (no==210){
            if (mQuestionNumber < analogies.getLength()) {
                mQuestionNumber--;
                questionNumber.setText(mQuestionNumber+" out of "+(analogies.getLength()-1));
                ScreenColor();
                mQuestionView.setText(analogies.getQuestion(mQuestionNumber));
                mButtonChoice1.setText(analogies.getChoice1(mQuestionNumber));
                mButtonChoice2.setText(analogies.getChoice2(mQuestionNumber));
                mButtonChoice3.setText(analogies.getChoice3(mQuestionNumber));
                mButtonChoice4.setText(analogies.getChoice4(mQuestionNumber));
                mHint = analogies.getHint(mQuestionNumber);
                mAnswer = analogies.getCorrectAnswer(mQuestionNumber);
                if (mQuestionNumber==1){
                    back.setEnabled(false);
                }else {
                    back.setEnabled(true);
                }
            } else {
            }
        }
        else if (no==211){
            if (mQuestionNumber < bloodRelation.getLength()) {
                mQuestionNumber--;
                questionNumber.setText(mQuestionNumber+" out of "+(bloodRelation.getLength()-1));
                ScreenColor();
                mQuestionView.setText(bloodRelation.getQuestion(mQuestionNumber));
                mButtonChoice1.setText(bloodRelation.getChoice1(mQuestionNumber));
                mButtonChoice2.setText(bloodRelation.getChoice2(mQuestionNumber));
                mButtonChoice3.setText(bloodRelation.getChoice3(mQuestionNumber));
                mButtonChoice4.setText(bloodRelation.getChoice4(mQuestionNumber));
                mHint = bloodRelation.getHint(mQuestionNumber);
                mAnswer = bloodRelation.getCorrectAnswer(mQuestionNumber);
                if (mQuestionNumber==1){
                    back.setEnabled(false);
                }else {
                    back.setEnabled(true);
                }
            } else {
            }
        }
        else if (no==212){
            if (mQuestionNumber < calendars.getLength()) {
                mQuestionNumber--;
                questionNumber.setText(mQuestionNumber+" out of "+(calendars.getLength()-1));
                ScreenColor();
                mQuestionView.setText(calendars.getQuestion(mQuestionNumber));
                mButtonChoice1.setText(calendars.getChoice1(mQuestionNumber));
                mButtonChoice2.setText(calendars.getChoice2(mQuestionNumber));
                mButtonChoice3.setText(calendars.getChoice3(mQuestionNumber));
                mButtonChoice4.setText(calendars.getChoice4(mQuestionNumber));
                mHint = calendars.getHint(mQuestionNumber);
                mAnswer = calendars.getCorrectAnswer(mQuestionNumber);
                if (mQuestionNumber==1){
                    back.setEnabled(false);
                }else {
                    back.setEnabled(true);
                }
            } else {
            }
        }
        else if (no==213){
            if (mQuestionNumber < clock.getLength()) {
                mQuestionNumber--;
                questionNumber.setText(mQuestionNumber+" out of "+(clock.getLength()-1));
                ScreenColor();
                mQuestionView.setText(clock.getQuestion(mQuestionNumber));
                mButtonChoice1.setText(clock.getChoice1(mQuestionNumber));
                mButtonChoice2.setText(clock.getChoice2(mQuestionNumber));
                mButtonChoice3.setText(clock.getChoice3(mQuestionNumber));
                mButtonChoice4.setText(clock.getChoice4(mQuestionNumber));
                mHint = clock.getHint(mQuestionNumber);
                mAnswer = clock.getCorrectAnswer(mQuestionNumber);
                if (mQuestionNumber==1){
                    back.setEnabled(false);
                }else {
                    back.setEnabled(true);
                }
            } else {
            }
        }
        else if (no==214){
            if (mQuestionNumber < codingAndDecoding.getLength()) {
                mQuestionNumber--;
                questionNumber.setText(mQuestionNumber+" out of "+(codingAndDecoding.getLength()-1));
                ScreenColor();
                mQuestionView.setText(codingAndDecoding.getQuestion(mQuestionNumber));
                mButtonChoice1.setText(codingAndDecoding.getChoice1(mQuestionNumber));
                mButtonChoice2.setText(codingAndDecoding.getChoice2(mQuestionNumber));
                mButtonChoice3.setText(codingAndDecoding.getChoice3(mQuestionNumber));
                mButtonChoice4.setText(codingAndDecoding.getChoice4(mQuestionNumber));
                mHint = codingAndDecoding.getHint(mQuestionNumber);
                mAnswer = codingAndDecoding.getCorrectAnswer(mQuestionNumber);
                if (mQuestionNumber==1){
                    back.setEnabled(false);
                }else {
                    back.setEnabled(true);
                }
            } else {
            }
        }
        else if (no==215){
            if (mQuestionNumber < deductions.getLength()) {
                mQuestionNumber--;
                questionNumber.setText(mQuestionNumber+" out of "+(deductions.getLength()-1));
                ScreenColor();
                mQuestionView.setText(deductions.getQuestion(mQuestionNumber));
                mButtonChoice1.setText(deductions.getChoice1(mQuestionNumber));
                mButtonChoice2.setText(deductions.getChoice2(mQuestionNumber));
                mButtonChoice3.setText(deductions.getChoice3(mQuestionNumber));
                mButtonChoice4.setText(deductions.getChoice4(mQuestionNumber));
                mHint = deductions.getHint(mQuestionNumber);
                mAnswer = deductions.getCorrectAnswer(mQuestionNumber);
                if (mQuestionNumber==1){
                    back.setEnabled(false);
                }else {
                    back.setEnabled(true);
                }
            } else {
            }
        }
        else if (no==216){
            if (mQuestionNumber < directions.getLength()) {
                mQuestionNumber--;
                questionNumber.setText(mQuestionNumber+" out of "+(directions.getLength()-1));
                ScreenColor();
                mQuestionView.setText(directions.getQuestion(mQuestionNumber));
                mButtonChoice1.setText(directions.getChoice1(mQuestionNumber));
                mButtonChoice2.setText(directions.getChoice2(mQuestionNumber));
                mButtonChoice3.setText(directions.getChoice3(mQuestionNumber));
                mButtonChoice4.setText(directions.getChoice4(mQuestionNumber));
                mHint = directions.getHint(mQuestionNumber);
                mAnswer = directions.getCorrectAnswer(mQuestionNumber);
                if (mQuestionNumber==1){
                    back.setEnabled(false);
                }else {
                    back.setEnabled(true);
                }
            } else {
            }
        }
        else if (no==217){
            if (mQuestionNumber < nonVerbal.getLength()) {
                mQuestionNumber--;
                questionNumber.setText(mQuestionNumber+" out of "+(nonVerbal.getLength()-1));
                ScreenColor();
                mQuestionView.setText(nonVerbal.getQuestion(mQuestionNumber));
                mButtonChoice1.setText(nonVerbal.getChoice1(mQuestionNumber));
                mButtonChoice2.setText(nonVerbal.getChoice2(mQuestionNumber));
                mButtonChoice3.setText(nonVerbal.getChoice3(mQuestionNumber));
                mButtonChoice4.setText(nonVerbal.getChoice4(mQuestionNumber));
                mHint = nonVerbal.getHint(mQuestionNumber);
                mAnswer = nonVerbal.getCorrectAnswer(mQuestionNumber);
                if (mQuestionNumber==1){
                    back.setEnabled(false);
                }else {
                    back.setEnabled(true);
                }
            } else {
            }
        }
        else if (no==218){
            if (mQuestionNumber < oddManOut.getLength()) {
                mQuestionNumber--;
                questionNumber.setText(mQuestionNumber+" out of "+(oddManOut.getLength()-1));
                ScreenColor();
                mQuestionView.setText(oddManOut.getQuestion(mQuestionNumber));
                mButtonChoice1.setText(oddManOut.getChoice1(mQuestionNumber));
                mButtonChoice2.setText(oddManOut.getChoice2(mQuestionNumber));
                mButtonChoice3.setText(oddManOut.getChoice3(mQuestionNumber));
                mButtonChoice4.setText(oddManOut.getChoice4(mQuestionNumber));
                mHint = oddManOut.getHint(mQuestionNumber);
                mAnswer = oddManOut.getCorrectAnswer(mQuestionNumber);
                if (mQuestionNumber==1){
                    back.setEnabled(false);
                }else {
                    back.setEnabled(true);
                }
            } else {
            }
        }
        else if (no==219){
            if (mQuestionNumber < seatingArrangement.getLength()) {
                mQuestionNumber--;
                questionNumber.setText(mQuestionNumber+" out of "+(seatingArrangement.getLength()-1));
                ScreenColor();
                mQuestionView.setText(seatingArrangement.getQuestion(mQuestionNumber));
                mButtonChoice1.setText(seatingArrangement.getChoice1(mQuestionNumber));
                mButtonChoice2.setText(seatingArrangement.getChoice2(mQuestionNumber));
                mButtonChoice3.setText(seatingArrangement.getChoice3(mQuestionNumber));
                mButtonChoice4.setText(seatingArrangement.getChoice4(mQuestionNumber));
                mHint = seatingArrangement.getHint(mQuestionNumber);
                mAnswer = seatingArrangement.getCorrectAnswer(mQuestionNumber);
                if (mQuestionNumber==1){
                    back.setEnabled(false);
                }else {
                    back.setEnabled(true);
                }
            } else {
            }
        }
        else if (no==220){
            if (mQuestionNumber < series.getLength()) {
                mQuestionNumber--;
                questionNumber.setText(mQuestionNumber+" out of "+(series.getLength()-1));
                ScreenColor();
                mQuestionView.setText(series.getQuestion(mQuestionNumber));
                mButtonChoice1.setText(series.getChoice1(mQuestionNumber));
                mButtonChoice2.setText(series.getChoice2(mQuestionNumber));
                mButtonChoice3.setText(series.getChoice3(mQuestionNumber));
                mButtonChoice4.setText(series.getChoice4(mQuestionNumber));
                mHint = series.getHint(mQuestionNumber);
                mAnswer = series.getCorrectAnswer(mQuestionNumber);
                if (mQuestionNumber==1){
                    back.setEnabled(false);
                }else {
                    back.setEnabled(true);
                }
            } else {
            }
        }
        else if (no==221){
            if (mQuestionNumber < symbolsAndNotations.getLength()) {
                mQuestionNumber--;
                questionNumber.setText(mQuestionNumber+" out of "+(symbolsAndNotations.getLength()-1));
                ScreenColor();
                mQuestionView.setText(symbolsAndNotations.getQuestion(mQuestionNumber));
                mButtonChoice1.setText(symbolsAndNotations.getChoice1(mQuestionNumber));
                mButtonChoice2.setText(symbolsAndNotations.getChoice2(mQuestionNumber));
                mButtonChoice3.setText(symbolsAndNotations.getChoice3(mQuestionNumber));
                mButtonChoice4.setText(symbolsAndNotations.getChoice4(mQuestionNumber));
                mHint = symbolsAndNotations.getHint(mQuestionNumber);
                mAnswer = symbolsAndNotations.getCorrectAnswer(mQuestionNumber);
                if (mQuestionNumber==1){
                    back.setEnabled(false);
                }else {
                    back.setEnabled(true);
                }
            } else {
            }
        }
    }

    public void ScreenColor(){
        mButtonChoice1.setBackgroundColor(getResources().getColor(R.color.liteblue));
        mButtonChoice2.setBackgroundColor(getResources().getColor(R.color.liteblue));
        mButtonChoice3.setBackgroundColor(getResources().getColor(R.color.liteblue));
        mButtonChoice4.setBackgroundColor(getResources().getColor(R.color.liteblue));
    }


//    private void updateScore(int point) {
//        mScoreView.setText("" + mScore);
//    }
}