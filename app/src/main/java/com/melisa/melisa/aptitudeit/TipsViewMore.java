package com.melisa.melisa.aptitudeit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

public class TipsViewMore extends AppCompatActivity {

    RelativeLayout circle,hexagon,righttriangle,squre,trapezium;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tips_view_more);

        circle=findViewById(R.id.circle);
        hexagon=findViewById(R.id.hexagon);
        righttriangle=findViewById(R.id.righttriangle);
        squre=findViewById(R.id.squre);
        trapezium=findViewById(R.id.trapezium);

        circle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(TipsViewMore.this,MathsExplained.class);
                int categoryLevel = 1;
                intent.putExtra("categoryLevel", categoryLevel);
                startActivity(intent);
            }
        });
        hexagon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(TipsViewMore.this,MathsExplained.class);
                int categoryLevel = 2;
                intent.putExtra("categoryLevel", categoryLevel);
                startActivity(intent);
            }
        });
        righttriangle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(TipsViewMore.this,MathsExplained.class);
                int categoryLevel = 3;
                intent.putExtra("categoryLevel", categoryLevel);
                startActivity(intent);
            }
        });
        squre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(TipsViewMore.this,MathsExplained.class);
                int categoryLevel = 4;
                intent.putExtra("categoryLevel", categoryLevel);
                startActivity(intent);
            }
        });
        trapezium.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(TipsViewMore.this,MathsExplained.class);
                int categoryLevel = 5;
                intent.putExtra("categoryLevel", categoryLevel);
                startActivity(intent);
            }
        });
    }
}
