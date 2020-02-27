package com.melisa.melisa.aptitudeit;

import android.os.Handler;

import java.util.ArrayList;
import java.util.List;

public class Utils {
    public interface DelayCallback{
        void afterDelay();
    }
    public static void delay(int secs, final DelayCallback delayCallback){
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                delayCallback.afterDelay();
            }
        }, secs * 1000);
    }


}
