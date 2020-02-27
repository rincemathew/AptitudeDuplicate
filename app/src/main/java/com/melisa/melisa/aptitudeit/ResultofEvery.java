package com.melisa.melisa.aptitudeit;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;

public class ResultofEvery extends AppCompatActivity {


    PieChart pieChart ;
    ArrayList<Entry> entries ;
    ArrayList<String> PieEntryLabels ;
    PieDataSet pieDataSet ;
    PieData pieData ;
    int rightAns,wrongAns,skipped;
    int hai=5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultof_every);

        TextView textView = findViewById(R.id.textview);

        Intent intent = getIntent();
        rightAns = intent.getIntExtra("RIGHTANS",0);
        wrongAns = intent.getIntExtra("WRONGANS",0);
        skipped = intent.getIntExtra("SKIPED",0);

        pieChart =findViewById(R.id.chart1);
        entries = new ArrayList<>();
        PieEntryLabels = new ArrayList<String>();
        AddValuesToPIEENTRY();
        AddValuesToPieEntryLabels();
        pieDataSet = new PieDataSet(entries, "");
        pieData = new PieData(PieEntryLabels, pieDataSet);
        pieDataSet.setColors(ColorTemplate.COLORFUL_COLORS);
        pieChart.setData(pieData);
        pieChart.animateY(3000);



    }

    public void AddValuesToPIEENTRY(){

        entries.add(new BarEntry(rightAns, 0));
        entries.add(new BarEntry(wrongAns, 1));
        entries.add(new BarEntry(skipped, 2));

    }

    public void AddValuesToPieEntryLabels(){

        PieEntryLabels.add("Right");
        PieEntryLabels.add("Wrong");
        PieEntryLabels.add("Skip");

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}
