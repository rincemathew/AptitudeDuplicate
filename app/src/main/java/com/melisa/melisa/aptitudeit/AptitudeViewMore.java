package com.melisa.melisa.aptitudeit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

public class AptitudeViewMore extends AppCompatActivity {

    RelativeLayout age,average,boatAndStream,compoundIntrest,hcfLcm,mensuration,numberseries,numerical,
            partnership,percentage,permutation,pipesandcistern,probability,profitandloss, quadraticEquation,
            ratioandpropotion,simpleintrest,simplification,timeandwork,timedistanceavaragespeed,train;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aptitude_view_more);

        age=findViewById(R.id.age);
        average =findViewById(R.id.average);
        boatAndStream =findViewById(R.id.boat_and_stream);
        compoundIntrest =findViewById(R.id.compound_intrest);
        hcfLcm =findViewById(R.id.hcf_lcm);
        mensuration=findViewById(R.id.mensuration);
        numberseries=findViewById(R.id.number_series);
        numerical=findViewById(R.id.numerical);
        partnership=findViewById(R.id.partnership);
        percentage=findViewById(R.id.percentage);
        permutation=findViewById(R.id.permutation);
        pipesandcistern=findViewById(R.id.pipes_and_cistern);
        probability=findViewById(R.id.probability);
        profitandloss=findViewById(R.id.profit_and_loss);
        quadraticEquation =findViewById(R.id.quadratic_equation);
        ratioandpropotion=findViewById(R.id.ratio_and_proportion);
        simpleintrest=findViewById(R.id.simple_intrest);
        simplification=findViewById(R.id.simplification);
        timeandwork=findViewById(R.id.time_and_work);
        timedistanceavaragespeed=findViewById(R.id.time_and_distance_and_average_speed);
        train=findViewById(R.id.train);


        age.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(AptitudeViewMore.this,AllAptitude.class);
                int categoryLevel = 110;
                intent.putExtra("categoryLevel", categoryLevel);
                startActivity(intent);
            }
        });
        average.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(AptitudeViewMore.this,AllAptitude.class);
                int categoryLevel = 111;
                intent.putExtra("categoryLevel", categoryLevel);
                startActivity(intent);
            }
        });
        boatAndStream.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(AptitudeViewMore.this,AllAptitude.class);
                int categoryLevel = 112;
                intent.putExtra("categoryLevel", categoryLevel);
                startActivity(intent);
            }
        });
        compoundIntrest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(AptitudeViewMore.this,AllAptitude.class);
                int categoryLevel = 114;
                intent.putExtra("categoryLevel", categoryLevel);
                startActivity(intent);
            }
        });
        hcfLcm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(AptitudeViewMore.this,AllAptitude.class);
                int categoryLevel = 115;
                intent.putExtra("categoryLevel", categoryLevel);
                startActivity(intent);
            }
        });
        mensuration.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(AptitudeViewMore.this,AllAptitude.class);
                int categoryLevel = 116;
                intent.putExtra("categoryLevel", categoryLevel);
                startActivity(intent);
            }
        });
        numberseries.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(AptitudeViewMore.this,AllAptitude.class);
                int categoryLevel = 117;
                intent.putExtra("categoryLevel", categoryLevel);
                startActivity(intent);
            }
        });
        numerical.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(AptitudeViewMore.this,AllAptitude.class);
                int categoryLevel = 118;
                intent.putExtra("categoryLevel", categoryLevel);
                startActivity(intent);
            }
        });
        partnership.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(AptitudeViewMore.this,AllAptitude.class);
                int categoryLevel = 119;
                intent.putExtra("categoryLevel", categoryLevel);
                startActivity(intent);
            }
        });
        percentage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(AptitudeViewMore.this,AllAptitude.class);
                int categoryLevel = 120;
                intent.putExtra("categoryLevel", categoryLevel);
                startActivity(intent);
            }
        });
        permutation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(AptitudeViewMore.this,AllAptitude.class);
                int categoryLevel = 121;
                intent.putExtra("categoryLevel", categoryLevel);
                startActivity(intent);
            }
        });
        pipesandcistern.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(AptitudeViewMore.this,AllAptitude.class);
                int categoryLevel = 122;
                intent.putExtra("categoryLevel", categoryLevel);
                startActivity(intent);
            }
        });
        probability.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(AptitudeViewMore.this,AllAptitude.class);
                int categoryLevel = 123;
                intent.putExtra("categoryLevel", categoryLevel);
                startActivity(intent);
            }
        });
        profitandloss.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(AptitudeViewMore.this,AllAptitude.class);
                int categoryLevel = 124;
                intent.putExtra("categoryLevel", categoryLevel);
                startActivity(intent);
            }
        });
        quadraticEquation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(AptitudeViewMore.this,AllAptitude.class);
                int categoryLevel = 125;
                intent.putExtra("categoryLevel", categoryLevel);
                startActivity(intent);
            }
        });
        ratioandpropotion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(AptitudeViewMore.this,AllAptitude.class);
                int categoryLevel = 126;
                intent.putExtra("categoryLevel", categoryLevel);
                startActivity(intent);
            }
        });
        simpleintrest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(AptitudeViewMore.this,AllAptitude.class);
                int categoryLevel = 127;
                intent.putExtra("categoryLevel", categoryLevel);
                startActivity(intent);
            }
        });
        simplification.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(AptitudeViewMore.this,AllAptitude.class);
                int categoryLevel = 128;
                intent.putExtra("categoryLevel", categoryLevel);
                startActivity(intent);
            }
        });
        timeandwork.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(AptitudeViewMore.this,AllAptitude.class);
                int categoryLevel = 129;
                intent.putExtra("categoryLevel", categoryLevel);
                startActivity(intent);
            }
        });
        timedistanceavaragespeed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(AptitudeViewMore.this,AllAptitude.class);
                int categoryLevel = 130;
                intent.putExtra("categoryLevel", categoryLevel);
                startActivity(intent);
            }
        });
        train.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(AptitudeViewMore.this,AllAptitude.class);
                int categoryLevel = 131;
                intent.putExtra("categoryLevel", categoryLevel);
                startActivity(intent);
            }
        });
    }
}
