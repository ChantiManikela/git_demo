package com.example.basic_application_activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class My_2nd_activity extends AppCompatActivity {
    TextView textView;
    Button logout_button;

    private static final String TAG=My_2nd_activity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG,"in method onCreate");
        setContentView(R.layout.activity_my2nd);
       // textView = findViewById(R.id.text);
        logout_button = findViewById(R.id.btn_logout);


        logout_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });


    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG,"in method onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG,"in method onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG,"in method onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG,"in method onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG,"in method onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG,"in method onDestroy");
    }
}