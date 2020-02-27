package com.melisa.melisa.aptitudeit;

import android.content.Intent;
import androidx.fragment.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Formulae extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View ChatFragmentView=inflater.inflate(R.layout.fragment_formulae, container, false);
        //Declare findViewbyId
        //mainEquations and Viewmore
        TextView equations = ChatFragmentView.findViewById(R.id.equations);
        TextView tipsViewmore = ChatFragmentView.findViewById(R.id.tipsviewmore);
        TextView aptiitudeViewmore = ChatFragmentView.findViewById(R.id.aptitudeViewmore);
        TextView reasoningViewmore = ChatFragmentView.findViewById(R.id.reasoningViewmore);

        //Mathamatical tips
        LinearLayout circle=ChatFragmentView.findViewById(R.id.circle);
        LinearLayout hexagon=ChatFragmentView.findViewById(R.id.hexagon);
        LinearLayout righttriangle=ChatFragmentView.findViewById(R.id.righttriangle);
        LinearLayout squre=ChatFragmentView.findViewById(R.id.squre);
        LinearLayout trapezium=ChatFragmentView.findViewById(R.id.trapezium);




        //Quantitative aptitude
        LinearLayout age=ChatFragmentView.findViewById(R.id.age);
        LinearLayout avarage=ChatFragmentView.findViewById(R.id.average);
        LinearLayout boatandstream=ChatFragmentView.findViewById(R.id.boatandstream);
        LinearLayout compoundintrest=ChatFragmentView.findViewById(R.id.compoundintrest);
        LinearLayout hcflcm=ChatFragmentView.findViewById(R.id.hcflcm);
        LinearLayout mensuration=ChatFragmentView.findViewById(R.id.mensuration);
        LinearLayout numberseries=ChatFragmentView.findViewById(R.id.numberseries);
        LinearLayout numerical=ChatFragmentView.findViewById(R.id.numerical);
        LinearLayout partnership=ChatFragmentView.findViewById(R.id.partnership);
        LinearLayout percentage=ChatFragmentView.findViewById(R.id.percentage);
        LinearLayout permutation=ChatFragmentView.findViewById(R.id.permutation);
        LinearLayout pipesandcistern=ChatFragmentView.findViewById(R.id.pipesandcistern);
        LinearLayout probability=ChatFragmentView.findViewById(R.id.probability);
        LinearLayout profitandloss=ChatFragmentView.findViewById(R.id.profitandloss);
        LinearLayout quadraticequation=ChatFragmentView.findViewById(R.id.quadraticequations);
        LinearLayout ratioandpropotion=ChatFragmentView.findViewById(R.id.ratioandproportion);
        LinearLayout simpleintrest=ChatFragmentView.findViewById(R.id.simpleintrest);
        LinearLayout simplification=ChatFragmentView.findViewById(R.id.simplification);
        LinearLayout timedistanceavaragespeed=ChatFragmentView.findViewById(R.id.timedistanceandavaragespeed);
        LinearLayout timeandwork=ChatFragmentView.findViewById(R.id.timeandwork);
        LinearLayout train=ChatFragmentView.findViewById(R.id.train);

        //Logical Reasoning
        LinearLayout analogies=ChatFragmentView.findViewById(R.id.analogies);
        LinearLayout bloodrelation=ChatFragmentView.findViewById(R.id.bloodrelation);
        LinearLayout calendar=ChatFragmentView.findViewById(R.id.calender);
        LinearLayout clock=ChatFragmentView.findViewById(R.id.clock);
        LinearLayout codinganddecoding=ChatFragmentView.findViewById(R.id.codinganddecoding);
        LinearLayout deduction=ChatFragmentView.findViewById(R.id.deductions);
        LinearLayout directions=ChatFragmentView.findViewById(R.id.directions);
        LinearLayout nonverbel=ChatFragmentView.findViewById(R.id.nonverbel);
        LinearLayout oddmanout=ChatFragmentView.findViewById(R.id.oddmanout);
        LinearLayout seatingarrangment=ChatFragmentView.findViewById(R.id.seatingarrangement);
        LinearLayout series=ChatFragmentView.findViewById(R.id.series);
        LinearLayout symbolsandnotations=ChatFragmentView.findViewById(R.id.symbolsandnotations);
        setHasOptionsMenu(true);


        //SetOnClickListener
        //Main contains
        equations.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(getActivity(),Equations.class);
                startActivity(intent);
            }
        });
        tipsViewmore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(getActivity(),TipsViewMore.class);
                startActivity(intent);
            }
        });
        aptiitudeViewmore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(getActivity(),AptitudeViewMore.class);
                startActivity(intent);
            }
        });
        reasoningViewmore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(getActivity(),ReasoningViewMore.class);
                startActivity(intent);
            }
        });


        //Mathamatics
        circle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(getActivity(),MathsExplained.class);
                int categoryLevel = 1;
                intent.putExtra("categoryLevel", categoryLevel);
                startActivity(intent);
            }
        });
        hexagon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(getActivity(),MathsExplained.class);
                int categoryLevel = 2;
                intent.putExtra("categoryLevel", categoryLevel);
                startActivity(intent);
            }
        });
        righttriangle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(getActivity(),MathsExplained.class);
                int categoryLevel = 3;
                intent.putExtra("categoryLevel", categoryLevel);
                startActivity(intent);
            }
        });
        squre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(getActivity(),MathsExplained.class);
                int categoryLevel = 4;
                intent.putExtra("categoryLevel", categoryLevel);
                startActivity(intent);
            }
        });
        trapezium.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(getActivity(),MathsExplained.class);
                int categoryLevel = 5;
                intent.putExtra("categoryLevel", categoryLevel);
                startActivity(intent);
            }
        });

        //Aptitude
        age.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(getActivity(),AllAptitude.class);
                int categoryLevel = 110;
                intent.putExtra("categoryLevel", categoryLevel);
                startActivity(intent);
            }
        });
        avarage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(getActivity(),AllAptitude.class);
                int categoryLevel = 111;
                intent.putExtra("categoryLevel", categoryLevel);
                startActivity(intent);
            }
        });
        boatandstream.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(getActivity(),AllAptitude.class);
                int categoryLevel = 112;
                intent.putExtra("categoryLevel", categoryLevel);
                startActivity(intent);
            }
        });
        compoundintrest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(getActivity(),AllAptitude.class);
                int categoryLevel = 114;
                intent.putExtra("categoryLevel", categoryLevel);
                startActivity(intent);
            }
        });
        hcflcm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(getActivity(),AllAptitude.class);
                int categoryLevel = 115;
                intent.putExtra("categoryLevel", categoryLevel);
                startActivity(intent);
            }
        });
        mensuration.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(getActivity(),AllAptitude.class);
                int categoryLevel = 116;
                intent.putExtra("categoryLevel", categoryLevel);
                startActivity(intent);
            }
        });
        numberseries.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(getActivity(),AllAptitude.class);
                int categoryLevel = 117;
                intent.putExtra("categoryLevel", categoryLevel);
                startActivity(intent);
            }
        });
        numerical.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(getActivity(),AllAptitude.class);
                int categoryLevel = 118;
                intent.putExtra("categoryLevel", categoryLevel);
                startActivity(intent);
            }
        });
        partnership.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(getActivity(),AllAptitude.class);
                int categoryLevel = 119;
                intent.putExtra("categoryLevel", categoryLevel);
                startActivity(intent);
            }
        });
        percentage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(getActivity(),AllAptitude.class);
                int categoryLevel = 120;
                intent.putExtra("categoryLevel", categoryLevel);
                startActivity(intent);
            }
        });
        permutation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(getActivity(),AllAptitude.class);
                int categoryLevel = 121;
                intent.putExtra("categoryLevel", categoryLevel);
                startActivity(intent);
            }
        });
        pipesandcistern.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(getActivity(),AllAptitude.class);
                int categoryLevel = 122;
                intent.putExtra("categoryLevel", categoryLevel);
                startActivity(intent);
            }
        });
        probability.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(getActivity(),AllAptitude.class);
                int categoryLevel = 123;
                intent.putExtra("categoryLevel", categoryLevel);
                startActivity(intent);
            }
        });
        profitandloss.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(getActivity(),AllAptitude.class);
                int categoryLevel = 124;
                intent.putExtra("categoryLevel", categoryLevel);
                startActivity(intent);
            }
        });
        quadraticequation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(getActivity(),AllAptitude.class);
                int categoryLevel = 125;
                intent.putExtra("categoryLevel", categoryLevel);
                startActivity(intent);
            }
        });
        ratioandpropotion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(getActivity(),AllAptitude.class);
                int categoryLevel = 126;
                intent.putExtra("categoryLevel", categoryLevel);
                startActivity(intent);
            }
        });
        simpleintrest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(getActivity(),AllAptitude.class);
                int categoryLevel = 127;
                intent.putExtra("categoryLevel", categoryLevel);
                startActivity(intent);
            }
        });
        simplification.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(getActivity(),AllAptitude.class);
                int categoryLevel = 128;
                intent.putExtra("categoryLevel", categoryLevel);
                startActivity(intent);
            }
        });
        timeandwork.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(getActivity(),AllAptitude.class);
                int categoryLevel = 129;
                intent.putExtra("categoryLevel", categoryLevel);
                startActivity(intent);
            }
        });
        timedistanceavaragespeed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(getActivity(),AllAptitude.class);
                int categoryLevel = 130;
                intent.putExtra("categoryLevel", categoryLevel);
                startActivity(intent);
            }
        });
        train.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(getActivity(),AllAptitude.class);
                int categoryLevel = 131;
                intent.putExtra("categoryLevel", categoryLevel);
                startActivity(intent);
            }
        });

        //Logical Reasoning onclick
        analogies.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(getActivity(),AllAptitude.class);
                int categoryLevel = 210;
                intent.putExtra("categoryLevel", categoryLevel);
                startActivity(intent);
            }
        });
        bloodrelation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(getActivity(),AllAptitude.class);
                int categoryLevel = 211;
                intent.putExtra("categoryLevel", categoryLevel);
                startActivity(intent);
            }
        });
        calendar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(getActivity(),AllAptitude.class);
                int categoryLevel = 212;
                intent.putExtra("categoryLevel", categoryLevel);
                startActivity(intent);
            }
        });
        clock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(getActivity(),AllAptitude.class);
                int categoryLevel = 213;
                intent.putExtra("categoryLevel", categoryLevel);
                startActivity(intent);
            }
        });
        codinganddecoding.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(getActivity(),AllAptitude.class);
                int categoryLevel = 214;
                intent.putExtra("categoryLevel", categoryLevel);
                startActivity(intent);
            }
        });
        deduction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(getActivity(),AllAptitude.class);
                int categoryLevel = 215;
                intent.putExtra("categoryLevel", categoryLevel);
                startActivity(intent);
            }
        });
        directions.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(getActivity(),AllAptitude.class);
                int categoryLevel = 216;
                intent.putExtra("categoryLevel", categoryLevel);
                startActivity(intent);
            }
        });
        nonverbel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(getActivity(),AllAptitude.class);
                int categoryLevel = 217;
                intent.putExtra("categoryLevel", categoryLevel);
                startActivity(intent);
            }
        });
        oddmanout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(getActivity(),AllAptitude.class);
                int categoryLevel = 218;
                intent.putExtra("categoryLevel", categoryLevel);
                startActivity(intent);
            }
        });
        seatingarrangment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(getActivity(),AllAptitude.class);
                int categoryLevel = 219;
                intent.putExtra("categoryLevel", categoryLevel);
                startActivity(intent);
            }
        });
        series.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(getActivity(),AllAptitude.class);
                int categoryLevel = 220;
                intent.putExtra("categoryLevel", categoryLevel);
                startActivity(intent);
            }
        });
        symbolsandnotations.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(getActivity(),AllAptitude.class);
                int categoryLevel = 221;
                intent.putExtra("categoryLevel", categoryLevel);
                startActivity(intent);
            }
        });



        return ChatFragmentView;

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
         //   Toast.makeText(getActivity(), "Clicked on " + item.getTitle(), Toast.LENGTH_SHORT).show();
        }
        return true;
    }


}