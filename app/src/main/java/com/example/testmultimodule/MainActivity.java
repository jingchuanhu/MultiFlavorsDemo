package com.example.testmultimodule;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        testDemo();
    }

    public void testDemo(){
//        DemoApi api = new FlavorApi();
//        if (BuildConfig.API_TERMINAL.equals("api23") && BuildConfig.TERMINAL.equals("mode")){
//            api.fire23Demo();
//        } else if (BuildConfig.API_TERMINAL.equals("api23") && BuildConfig.TERMINAL.equals("full")) {
//            api.fire23Full(33);
//        } else if (BuildConfig.API_TERMINAL.equals("api24") && BuildConfig.TERMINAL.equals("demo")){
//            api.fire24Demo(33, "test");
//        }
    }
}