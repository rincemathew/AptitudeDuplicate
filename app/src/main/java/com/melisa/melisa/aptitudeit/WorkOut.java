package com.melisa.melisa.aptitudeit;

import android.content.Intent;
import androidx.fragment.app.Fragment;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.melisa.melisa.aptitudeit.fragmentitems.CalculatorExpert;
import com.melisa.melisa.aptitudeit.fragmentitems.MiniTest;

import static android.content.Context.MODE_PRIVATE;

public class WorkOut extends Fragment {

    LinearLayout miniTest;
    LinearLayout calculate;
    TextView highScoreTextview;
    int highScore;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View CallFragmentView=inflater.inflate(R.layout.fragment_workout, container, false);

        calculate=CallFragmentView.findViewById(R.id.calculate);
        miniTest=CallFragmentView.findViewById(R.id.mini_test);
        highScoreTextview =CallFragmentView.findViewById(R.id.highScore);


        SharedPreferences mypref = getContext().getSharedPreferences("MyPref", MODE_PRIVATE);
        highScore = mypref.getInt("highscore",0);
        highScoreTextview.setText("High score: " + highScore);


        setHasOptionsMenu(true);


        miniTest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(), MiniTest.class);
                startActivity(intent);
            }
        });

        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), CalculatorExpert.class);
                startActivity(intent);
            }
        });


        //return inflater.inflate(R.layout.fragment_workout, container, false);




        return CallFragmentView;
    }

    @Override
    public void onResume() {
        highScoreTextview.setText("High score: " + highScore);
        super.onResume();
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        inflater.inflate(R.menu.menu_calls, menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.action_call) {
            Intent intent = new Intent(getActivity(), Settings.class);
            startActivity(intent);
          //  Toast.makeText(getActivity(), "Clicked on " + item.getTitle(), Toast.LENGTH_SHORT).show();
        }
        return true;
    }
}