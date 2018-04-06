package com.ryan.luckywheel;

import android.app.Application;
import com.google.android.gms.ads.MobileAds;
 
/**
 * Created by ravi on 25/12/17.
 */
 
public class MyApplication extends Application {
 
    @Override
    public void onCreate() {
        super.onCreate();
 
        // initialize the AdMob app
        MobileAds.initialize(this, getString(R.string.admob_app_id));
    }
}