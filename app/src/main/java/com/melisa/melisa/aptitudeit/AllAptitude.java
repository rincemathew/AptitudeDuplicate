package com.melisa.melisa.aptitudeit;

import android.content.Intent;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.TextView;

public class AllAptitude extends AppCompatActivity {

//    String[] namecategory = {
//            "q1",
//            "xf",
//            "f",
//            "f",
//            "df",
//            "sdfs",
//            "ss",
//
//    };
    String[] name_category = new String[500];

    String[] url = new String[500];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_aptitude);

        TextView name=findViewById(R.id.name);
        Button takeATest=findViewById(R.id.takeatest);
        WebView webView=findViewById(R.id.webview);


        final Intent intent = getIntent();
        final int value = intent.getIntExtra("categoryLevel",0);

      //  Toast.makeText(AllAptitude.this, value+"", Toast.LENGTH_LONG).show();

        takeATest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    Intent intent1= new Intent(AllAptitude.this, Quiz2Activity.class);
                    int numbers=value;
                    intent1.putExtra("numbers", numbers);
                    startActivity(intent1);
            }
        });

        name_category[110]="AGE";
        url[110]="file:///android_asset/apt_age.html";
        name_category[111]="AVERAGE";
        url[111]="file:///android_asset/apt_average.html";
        name_category[112]="BOAT & STREAM";
        url[112]="file:///android_asset/apt_boatandstream.html";
        name_category[114]="COMPOUNT INTREST";
        url[114]="file:///android_asset/apt_compountintrest.html";
        name_category[115]="HCF LCM";
        url[115]="file:///android_asset/apt_hcflcm.html";
        name_category[116]="MENSURATION";
        url[116]="file:///android_asset/apt_mensuration.html";
        name_category[117]="NUMBER SERIES";
        url[117]="file:///android_asset/apt_numbers.html";
        name_category[118]="NUMERICAL";
        url[118]="file:///android_asset/apt_numerical.html";
        name_category[119]="PARTNERSHIP";
        url[119]="file:///android_asset/apt_partnership.html";
        name_category[120]="PERCENTAGE";
        url[120]="file:///android_asset/apt_percentage.html";
        name_category[121]="PERMUTATION";
        url[121]="file:///android_asset/apt_permutation_combination.html";
        name_category[122]="PIPES & CISTERN";
        url[122]="file:///android_asset/apt_pipesandcistern.html";
        name_category[123]="PROBABILITY";
        url[123]="file:///android_asset/apt_probability.html";
        name_category[124]="PROFIT & LOSS";
        url[124]="file:///android_asset/apt_profitandloss.html";
        name_category[125]="QUADRATIC EQUATIONS";
        url[125]="file:///android_asset/apt_quadraticequations.html";
        name_category[126]="RATIO & PROPORTION";
        url[126]="file:///android_asset/apt_ratioandproportion.html";
        name_category[127]="SIMPLE INTEREST";
        url[127]="file:///android_asset/apt_simpleinterst.html";
        name_category[128]="SIMPLIFICATION";
        url[128]="file:///android_asset/apt_simplification.html";
        name_category[129]="TIME & WORK";
        url[129]="file:///android_asset/apt_timeandwork.html";
        name_category[130]="TIME,DISTANCE,AVG.SPEED";
        url[130]="file:///android_asset/apt_timedistanceavaragespeed.html";
        name_category[131]="TRAIN";
        url[131]="file:///android_asset/apt_train.html";
        name_category[210]="ANALOGIES";
        url[210]="file:///android_asset/log_analogies.html";
        name_category[211]="BLOOD RELATION";
        url[211]="file:///android_asset/log_bloodrelation.html";
        name_category[212]="CALENDARS";
        url[212]="file:///android_asset/log_calendars.html";
        name_category[213]="CLOCK";
        url[213]="file:///android_asset/log_clock.html";
        name_category[214]="CODING & DECODING";
        url[214]="file:///android_asset/log_codinganddecoding.html";
        name_category[215]="DEDUCTIONS";
        url[215]="file:///android_asset/log_deductions.html";
        name_category[216]="DIRECTIONS";
        url[216]="file:///android_asset/log_directions.html";
        name_category[217]="NON-VERBAL";
        url[217]="file:///android_asset/log_nonverbal.html";
        name_category[218]="ODD MAN OUT";
        url[218]="file:///android_asset/log_oddmanout.html";
        name_category[219]="SEATING ARRANGEMENT";
        url[219]="file:///android_asset/log_seatingarrangement.html";
        name_category[220]="SERIES";
        url[220]="file:///android_asset/log_number_series.html";
        name_category[221]="SYMBOLS & NOTATIONS";
        url[221]="file:///android_asset/log_symbolsandnotations.html";





//        int i; // create this
//        for ( i = 0; i < name_category.length; i++)  // and remove int from for loop
//        {
//            if (value == i)
//            {
//                name.setText(name_category[i]+"");
//                webView.loadUrl(url[i]+"");
//                break;
//            }
//        }

        name.setText(name_category[value]+"");
        webView.loadUrl(url[value]+"");



    }
}
