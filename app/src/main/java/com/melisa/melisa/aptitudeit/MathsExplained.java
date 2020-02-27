package com.melisa.melisa.aptitudeit;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.widget.ImageView;
import android.widget.TextView;

public class MathsExplained extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maths_explained);


        TextView name=findViewById(R.id.name);
        TextView circleText1=findViewById(R.id.circletext1);
        ImageView imageOne=findViewById(R.id.imageone);
        TextView circleText2=findViewById(R.id.circletext2);
        TextView circleText3=findViewById(R.id.circletext3);

        Intent intent = getIntent();
        int value = intent.getIntExtra("categoryLevel",0);


        if (value==1){
            name.setText("CIRCLE");
            circleText1.setText(Html.fromHtml(getString(R.string.circletext1)));
            imageOne.setImageResource(R.drawable.circlepic);
            circleText2.setText(Html.fromHtml(getString(R.string.circletext2)));
            circleText3.setText(Html.fromHtml(getString(R.string.circletext3)));
        }
        else if (value==2){
            name.setText("HEXAGON");
            circleText1.setText(Html.fromHtml(getString(R.string.hexagon1)));
            imageOne.setImageResource(R.drawable.hexagonpicture);
            circleText2.setText(Html.fromHtml(getString(R.string.hexagon2)));
            circleText3.setText(Html.fromHtml(getString(R.string.hexagon3)));
        }
        else if (value==3){
            name.setText("RIGHT TRIANGLE");
            circleText1.setText(Html.fromHtml(getString(R.string.righttriangle1)));
            imageOne.setImageResource(R.drawable.righttrianglepic);
            circleText2.setText(Html.fromHtml(getString(R.string.righttriangle2)));
            circleText3.setText(Html.fromHtml(getString(R.string.righttriangle3)));
        }
        else if (value==4){
            name.setText("SQURE");
            circleText1.setText(Html.fromHtml(getString(R.string.square1)));
            imageOne.setImageResource(R.drawable.squarepic);
            circleText2.setText(Html.fromHtml(getString(R.string.square2)));
            circleText3.setText(Html.fromHtml(getString(R.string.square3)));
        }
        else if (value==5){
            name.setText("TRAPEZIUM");
            circleText1.setText(Html.fromHtml(getString(R.string.trapezium1)));
            imageOne.setImageResource(R.drawable.trapeziumpic);
            circleText2.setText(Html.fromHtml(getString(R.string.trapezium2)));
            circleText3.setText(Html.fromHtml(getString(R.string.trapezium3)));
        }

    }
}
