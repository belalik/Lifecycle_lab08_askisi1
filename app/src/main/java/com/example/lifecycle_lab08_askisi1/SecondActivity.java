package com.example.lifecycle_lab08_askisi1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    private static final String TAG = "SecondActivity - thomas";

    int count = 0;
    TextView txtSecondText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        // receive information through intent .. could be in separate method, but is left here for simplicity..
        Intent i = getIntent();
        count = i.getIntExtra(MainActivity.COUNT_STATE, 0);

        txtSecondText = findViewById(R.id.txt_second);
        txtSecondText.setText("Number = "+count);

        Log.i(TAG, "onCreate: count = "+count);
    }


    @Override
    protected void onStart() {
        super.onStart();

        Log.i(TAG, "onStart: count = "+count);
    }

    @Override
    protected void onResume() {
        super.onResume();

        Log.i(TAG, "onResume: count = "+count);
    }

    @Override
    protected void onPause() {
        super.onPause();

        Log.i(TAG, "onPause: count = "+count);
    }

    @Override
    protected void onStop() {
        super.onStop();

        Log.i(TAG, "onStop: count = "+count);
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();

        Log.i(TAG, "onDestroy: count = "+count);
    }
}