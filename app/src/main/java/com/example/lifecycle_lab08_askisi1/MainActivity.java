package com.example.lifecycle_lab08_askisi1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity - thomas";

    /*
    einai public gia na mporei na to xrisimopoihsei kai to deutero activity ..
    tha mporousame na exoume ena "sketo" string, alla auti i lisi einai mallon kaliteri ..
    tha poume perissotera sto ergastirio..
     */
    public static final String COUNT_STATE = "the count key";

    int count = 0;

    Button btnNumClicks;
    Button btnChangeActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initializeViews();

        btnNumClicks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                increaseCount();
            }
        });

        btnChangeActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                changeActivity();
            }
        });

        Log.i(TAG, "onCreate: count = "+count);
    }


    /**
     * change activity and pass information through explicit intent ..
     */
    private void changeActivity() {
        Intent i = new Intent(this, SecondActivity.class);
        i.putExtra(COUNT_STATE, count);
        startActivity(i);
    }

    private void increaseCount() {
        count++;
        btnNumClicks.setText(String.valueOf(count));
    }

    private void initializeViews() {
        btnChangeActivity = findViewById(R.id.btn_change_activity);
        btnNumClicks = findViewById(R.id.btn_num_clicks);
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