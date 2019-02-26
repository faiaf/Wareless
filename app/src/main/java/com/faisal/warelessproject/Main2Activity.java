package com.faisal.warelessproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void Game(View view) {
        startActivity(new Intent(Main2Activity.this,MainActivity.class));
    }

    public void Converter(View view) {
        startActivity(new Intent(Main2Activity.this,Converter.class));
    }

    public void Calculator(View view) {
        startActivity(new Intent(Main2Activity.this,Calculator.class));
    }
}
