package com.example.hello_cmake;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.example.hello_cmake.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    // Used to load the 'hello_cmake' library on application startup.
    static {
        System.loadLibrary("hello_cmake");
    }

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Example of a call to a native method
        TextView tv = binding.sampleText;
        //tv.setText(stringFromJNI());

       /* tv.setText(String.valueOf(sigfpeErrorJNI()));
        Log.d(TAG, "output: "+sigfpeErrorJNI());*/

        tv.setText(String.valueOf(sigbusErrorJNI()));
        Log.d(TAG, "output: "+sigbusErrorJNI());

    }

    /**
     * A native method that is implemented by the 'hello_cmake' native library,
     * which is packaged with this application.
     */
    //public native String stringFromJNI();
    //public native Integer integerFromJNI();

    //public native int sigfpeErrorJNI();
    public native int sigbusErrorJNI();

}