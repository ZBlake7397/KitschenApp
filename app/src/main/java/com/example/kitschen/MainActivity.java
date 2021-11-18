package com.example.kitschen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void startTimer(View view)
    {
        Intent intent = new Intent(this, Multimer.class);
        startActivity(intent);
    }
    public void startList(View view)
    {
        Intent intent = new Intent(this, list.class);
        startActivity(intent);
    }
}