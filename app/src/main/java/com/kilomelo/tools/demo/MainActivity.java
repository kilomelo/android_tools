package com.kilomelo.tools.demo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.kilomelo.tools.LogTool;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LogTool.logMethod();
        setContentView(R.layout.activity_main);
    }
}