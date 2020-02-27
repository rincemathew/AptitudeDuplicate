package com.melisa.melisa.aptitudeit;

import android.content.Intent;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;

public class Splash extends AppCompatActivity {

    TextView tips;

    private static int SPLASH_TIME_OUT = 3000;
    ArrayList<String>  mTips = new ArrayList<String>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        tips=findViewById(R.id.tips);


        mTips.add("DID YOU KNOW:\n“Forty” is the only number that is spelt with letters arranged in alphabetical order.");
        mTips.add("DID YOU KNOW:\nThe word “hundred” comes from the old Norse term, “hundrath”, which actually means 120 and not 100.");
        mTips.add("DID YOU KNOW:\nZero is not there in Roman numerals");
        mTips.add("DID YOU KNOW:\nFrom 0 to 1000, the only number that has the letter “a” in it is “one thousand”.");
        mTips.add("DID YOU KNOW:\n‘Four’ is the only number in the English language that is spelt with the same number of letters as the number itself.");
        mTips.add("DID YOU KNOW:\nEvery odd number has an “e” in it.");
        mTips.add("DID YOU KNOW:\n-40 °C is equal to -40 °F.");
        mTips.add("DID YOU KNOW:\nThe symbol for division (i.e.÷) is called an obelus.");
        mTips.add("DID YOU KNOW:\n2 and 5 are the only prime numbers that end in 2 or 5.");
        mTips.add("DID YOU KNOW:\nA ‘jiffy’ is an actual unit of time. It means 1/100th of a second.");
        mTips.add("DID YOU KNOW:\n If you shuffle a deck of cards properly, it’s more than likely that the exact order of the cards you get has never been seen before in the whole history of the universe.");
        mTips.add("DID YOU KNOW:\nPlus (+) and Minus (-) sign symbols were used as early as 1489 A.D");
        mTips.add("DID YOU KNOW:\nAn icosagon is a shape with 20 sides");
        mTips.add("DID YOU KNOW:\nAmong all shapes with the same perimeter a circle has the largest area.");
        mTips.add("DID YOU KNOW:\nAmong all shapes with the same area circle has the shortest perimeter ");
        mTips.add("DID YOU KNOW:\nAbacus is considered the origin of the calculator");
        mTips.add("DID YOU KNOW:\nHave you ever noticed that the opposite sides a die always add up to seven (7)");
        mTips.add("DID YOU KNOW:\nIf you add up the numbers 1-100 consecutively (1+2+3+4+5...) the total is 5050");
        mTips.add("DID YOU KNOW:\nHave you heard about a Palindrome Number? It is a number that reads the same backwards and forward, e.g. 12421");


        Random r = new Random();
        tips.setText(mTips.get(r.nextInt(mTips.size())));

//        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O){
//            NotificationChannel channel=
//                    new NotificationChannel("MyNotifications","MyNotifications", NotificationManager.IMPORTANCE_DEFAULT);
//            NotificationManager manager=getSystemService(NotificationManager.class);
//            manager.createNotificationChannel(channel);
//        }
//
//        FirebaseMessaging.getInstance().subscribeToTopic("general")
//                .addOnCompleteListener(new OnCompleteListener<Void>() {
//                    @Override
//                    public void onComplete(@NonNull Task<Void> task) {
//                        String msg = "successfull";
//                        if (!task.isSuccessful()) {
//                            msg = "failed";
//                        };
//                        Toast.makeText(Splash.this, msg, Toast.LENGTH_SHORT).show();
//                    }
//                });



        new Handler().postDelayed(new Runnable() {

            /*
             * Showing splash screen with a timer. This will be useful when you
             * want to show case your app logo / company
             */

            @Override
            public void run() {
                // This method will be executed once the timer is over
                // Start your app main activity
                Intent i = new Intent(Splash.this, MainActivity.class);
                startActivity(i);

                // close this activity
                finish();
            }
        }, SPLASH_TIME_OUT);
    }
}

