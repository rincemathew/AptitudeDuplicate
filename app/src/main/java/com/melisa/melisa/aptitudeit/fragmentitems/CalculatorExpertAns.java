package com.melisa.melisa.aptitudeit.fragmentitems;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

import com.melisa.melisa.aptitudeit.R;

public class CalculatorExpertAns extends AppCompatActivity {

    TextView scoreTextview,highScoreTextview;
    int score,highScore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator_expert_ans);

        scoreTextview=findViewById(R.id.score);
        highScoreTextview=findViewById(R.id.highScore);

        Window window = this.getWindow();

        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.setStatusBarColor(ContextCompat.getColor(this, R.color.color_work_out_Dark));
        }

        Intent intent = getIntent();
        score = intent.getIntExtra("score",0);
        scoreTextview.setText("Your Score : "+score);

        //SharedPreferences mypref = getPreferences(MODE_PRIVATE);
        SharedPreferences mypref = getApplicationContext().getSharedPreferences("MyPref", MODE_PRIVATE);
        highScore = mypref.getInt("highscore",0);
        if(highScore>= score) {
            highScoreTextview.setText("High score: " + highScore);
        }
        else
        {
            highScoreTextview.setText("New highscore: "+score);
            SharedPreferences.Editor editor = mypref.edit();
            editor.putInt("highscore", score);
            editor.commit();
        }

    }
}
