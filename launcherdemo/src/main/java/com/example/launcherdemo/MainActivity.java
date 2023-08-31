package com.example.launcherdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view){
        Intent intent = new Intent();
//        intent.addCategory(Intent.CATEGORY_HOME);
        intent.setComponent(new ComponentName("android", "com.android.internal.app.ResolverActivity"));
        startActivity(intent);
    }
}