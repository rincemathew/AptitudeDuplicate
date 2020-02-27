package com.melisa.melisa.aptitudeit.fragmentitems;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.LinearLayout;

import com.melisa.melisa.aptitudeit.AllAptitude;
import com.melisa.melisa.aptitudeit.Quiz2Activity;
import com.melisa.melisa.aptitudeit.R;

public class MiniTest extends AppCompatActivity {

    LinearLayout age,average,boatAndStream,compoundIntrest,hcfLcm,mensuration,numberSeries,numerical,partnership,
    percentage,permutationCombination,pipesAndCistern,probability,profitAndLoss,quadraticEquation,ratioProportion,
            simpleIntrest,simplification,timeDistance,timeWork,train;
    LinearLayout analogies,bloodRelation,calendars,clock,codingDecoding,deduction,directions,nonVerbel,oddManOut,
    seatingArrangements,series,symbolsNotations;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mini_test);

        age=findViewById(R.id.age);
        average=findViewById(R.id.average);
        boatAndStream=findViewById(R.id.boat_and_stream);
        compoundIntrest=findViewById(R.id.compound_intrest);
        hcfLcm=findViewById(R.id.hcf_lcm);
        mensuration=findViewById(R.id.mensuration);
        numberSeries=findViewById(R.id.number_series);
        numerical=findViewById(R.id.numerical);
        partnership=findViewById(R.id.partnership);
        percentage=findViewById(R.id.percentage);
        permutationCombination=findViewById(R.id.permutation_combination);
        pipesAndCistern=findViewById(R.id.pipes_and_cistern);
        probability=findViewById(R.id.probability);
        profitAndLoss=findViewById(R.id.profit_and_loss);
        quadraticEquation=findViewById(R.id.quadratic_equation);
        ratioProportion=findViewById(R.id.ratio_and_proportion);
        simpleIntrest=findViewById(R.id.simple_intrest);
        simplification=findViewById(R.id.simplification);
        timeDistance=findViewById(R.id.time_and_distance_and_average_speed);
        timeWork=findViewById(R.id.time_and_work);
        train=findViewById(R.id.train);
        analogies=findViewById(R.id.analogies);
        bloodRelation=findViewById(R.id.blood_relation);
        calendars=findViewById(R.id.calender);
        clock=findViewById(R.id.clock);
        codingDecoding=findViewById(R.id.codinganddecoding);
        deduction=findViewById(R.id.deductions);
        directions=findViewById(R.id.directions);
        nonVerbel=findViewById(R.id.nonverbel);
        oddManOut=findViewById(R.id.oddmanout);
        seatingArrangements=findViewById(R.id.seatingarrangement);
        series=findViewById(R.id.series);
        symbolsNotations=findViewById(R.id.symbolsandnotations);



        Window window = this.getWindow();
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            window.setStatusBarColor(ContextCompat.getColor(this, R.color.color_work_out_Dark));
        }

        age.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1= new Intent(MiniTest.this, Quiz2Activity.class);
                int numbers = 110;
                intent1.putExtra("numbers", numbers);
                startActivity(intent1);
            }
        });
        average.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1= new Intent(MiniTest.this, Quiz2Activity.class);
                int numbers = 111;
                intent1.putExtra("numbers", numbers);
                startActivity(intent1);
            }
        });
        boatAndStream.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1= new Intent(MiniTest.this, Quiz2Activity.class);
                int numbers = 112;
                intent1.putExtra("numbers", numbers);
                startActivity(intent1);
            }
        });
        compoundIntrest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1= new Intent(MiniTest.this, Quiz2Activity.class);
                int numbers = 114;
                intent1.putExtra("numbers", numbers);
                startActivity(intent1);
            }
        });
        hcfLcm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1= new Intent(MiniTest.this, Quiz2Activity.class);
                int numbers = 115;
                intent1.putExtra("numbers", numbers);
                startActivity(intent1);
            }
        });
        mensuration.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1= new Intent(MiniTest.this, Quiz2Activity.class);
                int numbers = 116;
                intent1.putExtra("numbers", numbers);
                startActivity(intent1);
            }
        });
        numberSeries.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1= new Intent(MiniTest.this, Quiz2Activity.class);
                int numbers = 117;
                intent1.putExtra("numbers", numbers);
                startActivity(intent1);
            }
        });
        numerical.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1= new Intent(MiniTest.this, Quiz2Activity.class);
                int numbers = 118;
                intent1.putExtra("numbers", numbers);
                startActivity(intent1);
            }
        });
        partnership.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1= new Intent(MiniTest.this, Quiz2Activity.class);
                int numbers = 119;
                intent1.putExtra("numbers", numbers);
                startActivity(intent1);
            }
        });
        percentage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1= new Intent(MiniTest.this, Quiz2Activity.class);
                int numbers = 120;
                intent1.putExtra("numbers", numbers);
                startActivity(intent1);
            }
        });
        permutationCombination.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1= new Intent(MiniTest.this, Quiz2Activity.class);
                int numbers = 121;
                intent1.putExtra("numbers", numbers);
                startActivity(intent1);
            }
        });
        pipesAndCistern.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1= new Intent(MiniTest.this, Quiz2Activity.class);
                int numbers = 122;
                intent1.putExtra("numbers", numbers);
                startActivity(intent1);
            }
        });
        probability.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1= new Intent(MiniTest.this, Quiz2Activity.class);
                int numbers = 123;
                intent1.putExtra("numbers", numbers);
                startActivity(intent1);
            }
        });
        profitAndLoss.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1= new Intent(MiniTest.this, Quiz2Activity.class);
                int numbers = 124;
                intent1.putExtra("numbers", numbers);
                startActivity(intent1);
            }
        });
        quadraticEquation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1= new Intent(MiniTest.this, Quiz2Activity.class);
                int numbers = 125;
                intent1.putExtra("numbers", numbers);
                startActivity(intent1);
            }
        });
        ratioProportion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1= new Intent(MiniTest.this, Quiz2Activity.class);
                int numbers = 126;
                intent1.putExtra("numbers", numbers);
                startActivity(intent1);
            }
        });
        simpleIntrest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1= new Intent(MiniTest.this, Quiz2Activity.class);
                int numbers = 127;
                intent1.putExtra("numbers", numbers);
                startActivity(intent1);
            }
        });
        simplification.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1= new Intent(MiniTest.this, Quiz2Activity.class);
                int numbers = 128;
                intent1.putExtra("numbers", numbers);
                startActivity(intent1);
            }
        });
        timeDistance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1= new Intent(MiniTest.this, Quiz2Activity.class);
                int numbers = 130;
                intent1.putExtra("numbers", numbers);
                startActivity(intent1);
            }
        });
        timeWork.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1= new Intent(MiniTest.this, Quiz2Activity.class);
                int numbers = 129;
                intent1.putExtra("numbers", numbers);
                startActivity(intent1);
            }
        });
        train.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1= new Intent(MiniTest.this, Quiz2Activity.class);
                int numbers = 131;
                intent1.putExtra("numbers", numbers);
                startActivity(intent1);
            }
        });
        analogies.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1= new Intent(MiniTest.this, Quiz2Activity.class);
                int numbers = 210;
                intent1.putExtra("numbers", numbers);
                startActivity(intent1);
            }
        });
        bloodRelation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1= new Intent(MiniTest.this, Quiz2Activity.class);
                int numbers = 211;
                intent1.putExtra("numbers", numbers);
                startActivity(intent1);
            }
        });
        calendars.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1= new Intent(MiniTest.this, Quiz2Activity.class);
                int numbers = 212;
                intent1.putExtra("numbers", numbers);
                startActivity(intent1);
            }
        });
        clock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1= new Intent(MiniTest.this, Quiz2Activity.class);
                int numbers = 213;
                intent1.putExtra("numbers", numbers);
                startActivity(intent1);
            }
        });
        codingDecoding.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1= new Intent(MiniTest.this, Quiz2Activity.class);
                int numbers = 214;
                intent1.putExtra("numbers", numbers);
                startActivity(intent1);
            }
        });
        deduction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1= new Intent(MiniTest.this, Quiz2Activity.class);
                int numbers = 215;
                intent1.putExtra("numbers", numbers);
                startActivity(intent1);
            }
        });
        directions.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1= new Intent(MiniTest.this, Quiz2Activity.class);
                int numbers = 216;
                intent1.putExtra("numbers", numbers);
                startActivity(intent1);
            }
        });
        nonVerbel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1= new Intent(MiniTest.this, Quiz2Activity.class);
                int numbers = 217;
                intent1.putExtra("numbers", numbers);
                startActivity(intent1);
            }
        });
        oddManOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1= new Intent(MiniTest.this, Quiz2Activity.class);
                int numbers = 218;
                intent1.putExtra("numbers", numbers);
                startActivity(intent1);
            }
        });
        seatingArrangements.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1= new Intent(MiniTest.this, Quiz2Activity.class);
                int numbers = 219;
                intent1.putExtra("numbers", numbers);
                startActivity(intent1);
            }
        });
        series.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1= new Intent(MiniTest.this, Quiz2Activity.class);
                int numbers = 220;
                intent1.putExtra("numbers", numbers);
                startActivity(intent1);
            }
        });
        symbolsNotations.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1= new Intent(MiniTest.this, Quiz2Activity.class);
                int numbers = 221;
                intent1.putExtra("numbers", numbers);
                startActivity(intent1);
            }
        });


    }
}
