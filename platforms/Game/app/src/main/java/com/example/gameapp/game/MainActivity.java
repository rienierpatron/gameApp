package com.example.gameapp.game;

import android.os.Bundle;
import org.apache.cordova.*;
import org.apache.cordova.Config;
import org.apache.cordova.DroidGap;


public class MainActivity extends DroidGap {

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        super.init();
        appView.addJavascriptInterface(this, "MainActivity");
        super.loadUrl(Config.getStartUrl());
        super.loadUrl("file:///android_asset/www/index.html");
    }
}