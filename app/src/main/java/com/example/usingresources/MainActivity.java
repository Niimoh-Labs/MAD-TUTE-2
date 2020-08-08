package com.example.usingresources;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TextView Tv = findViewById(R.id.Tv);
        Tv.setText(R.string.msg2);

        Log.i("Lifecycle", "OnCreate called.....");
    }


    @Override
    protected void onStart() {
        super.onStart();

        Log.i("Lifecycle", "Onstart Called....");
    }

    @Override
    protected void onResume() {
        super.onResume();

        Log.i("Lifecycle", "Onresume Called....");
    }

    @Override
    protected void onPause() {
        super.onPause();

        Log.i("Lifecycle", "Onpause Called....");
    }

    @Override
    protected void onStop() {
        super.onStop();

        Log.i("Lifecycle", "Onstop Called....");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Log.i("Lifecycle", "OnDestroy Called....");
    }
}