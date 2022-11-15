package com.example.basic_application_activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btn_press;
    EditText email,password;
private static final String TAG=MainActivity.class.getSimpleName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_press=findViewById(R.id.press);
        email=findViewById(R.id.username);
        password=findViewById(R.id.password);
        Log.d(TAG,"in method onCreate");

        btn_press.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String emailid=email.getText().toString().trim();

                String passworid=password.getText().toString().trim();
                if (TextUtils.isEmpty(emailid) || TextUtils.isEmpty(passworid)) {

                    Toast.makeText(MainActivity.this, "Please Enter the email id and password", Toast.LENGTH_LONG).show();
                }
                else {

                    Intent i = new Intent(MainActivity.this, My_2nd_activity.class);
                    startActivity(i);
                }
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
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG,"in method onDestroy");
    }
}