package com.jch.flavor.api;

import android.util.Log;

import com.example.lib24full.TestDemo;
import com.example.testmultimodule.DemoApi;

public class FlavorApi implements DemoApi {
    private static final String TAG = "FlavorApi";
    @Override
    public void fire23Demo() {

    }

    @Override
    public void fire23Full(int prams) {
        Log.d(TAG, "fire23Full: [prams]");
        TestDemo testDemo = new TestDemo();
        Log.d(TAG, testDemo.toString());
    }

    @Override
    public void fire24Demo(int prams, String str) {

    }
}
