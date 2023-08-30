package com.jch.flavor.api;

import android.util.Log;

import com.example.lib23demo.TestDemo;
import com.example.testmultimodule.DemoApi;

public class FlavorApi implements DemoApi {
    
    private static final String TAG = "FlavorApi";
    @Override
    public void fire23Demo() {

    }

    @Override
    public void fire23Full(int prams) {

    }

    @Override
    public void fire24Demo(int prams, String str) {
        Log.d(TAG, "fire24Demo: [prams, str]");
        TestDemo testDemo;
    }
}
