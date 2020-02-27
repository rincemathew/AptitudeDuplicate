package com.melisa.melisa.aptitudeit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

public class ReasoningViewMore extends AppCompatActivity {

    RelativeLayout analogies,bloodrelation,calendar,clock,codinganddecoding,deduction,directions,
    nonverbel,oddmanout,seatingArrangement,series,symbolsandnotations;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reasoning_view_more);

        analogies=findViewById(R.id.analogies);
        bloodrelation=findViewById(R.id.blood_relation);
        calendar=findViewById(R.id.calender);
        clock=findViewById(R.id.clock);
        codinganddecoding=findViewById(R.id.codinganddecoding);
        deduction=findViewById(R.id.deductions);
        directions=findViewById(R.id.directions);
        nonverbel=findViewById(R.id.nonverbel);
        oddmanout=findViewById(R.id.oddmanout);
        seatingArrangement=findViewById(R.id.seatingarrangement);
        series=findViewById(R.id.series);
        symbolsandnotations=findViewById(R.id.symbolsandnotations);


        analogies.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(ReasoningViewMore.this,AllAptitude.class);
                int categoryLevel = 210;
                intent.putExtra("categoryLevel", categoryLevel);
                startActivity(intent);
            }
        });
        bloodrelation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(ReasoningViewMore.this,AllAptitude.class);
                int categoryLevel = 211;
                intent.putExtra("categoryLevel", categoryLevel);
                startActivity(intent);
            }
        });
        calendar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(ReasoningViewMore.this,AllAptitude.class);
                int categoryLevel = 212;
                intent.putExtra("categoryLevel", categoryLevel);
                startActivity(intent);
            }
        });
        clock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(ReasoningViewMore.this,AllAptitude.class);
                int categoryLevel = 213;
                intent.putExtra("categoryLevel", categoryLevel);
                startActivity(intent);
            }
        });
        codinganddecoding.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(ReasoningViewMore.this,AllAptitude.class);
                int categoryLevel = 214;
                intent.putExtra("categoryLevel", categoryLevel);
                startActivity(intent);
            }
        });
        deduction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(ReasoningViewMore.this,AllAptitude.class);
                int categoryLevel = 215;
                intent.putExtra("categoryLevel", categoryLevel);
                startActivity(intent);
            }
        });
        directions.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(ReasoningViewMore.this,AllAptitude.class);
                int categoryLevel = 216;
                intent.putExtra("categoryLevel", categoryLevel);
                startActivity(intent);
            }
        });
        nonverbel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(ReasoningViewMore.this,AllAptitude.class);
                int categoryLevel = 217;
                intent.putExtra("categoryLevel", categoryLevel);
                startActivity(intent);
            }
        });
        oddmanout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(ReasoningViewMore.this,AllAptitude.class);
                int categoryLevel = 218;
                intent.putExtra("categoryLevel", categoryLevel);
                startActivity(intent);
            }
        });
        seatingArrangement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(ReasoningViewMore.this,AllAptitude.class);
                int categoryLevel = 219;
                intent.putExtra("categoryLevel", categoryLevel);
                startActivity(intent);
            }
        });
        series.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(ReasoningViewMore.this,AllAptitude.class);
                int categoryLevel = 220;
                intent.putExtra("categoryLevel", categoryLevel);
                startActivity(intent);
            }
        });
        symbolsandnotations.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(ReasoningViewMore.this,AllAptitude.class);
                int categoryLevel = 221;
                intent.putExtra("categoryLevel", categoryLevel);
                startActivity(intent);
            }
        });
    }
}
