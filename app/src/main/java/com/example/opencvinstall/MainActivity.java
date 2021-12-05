package com.example.opencvinstall;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import org.opencv.android.OpenCVLoader;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if(OpenCVLoader.initDebug())
        {
            Log.d("TAG","OpenCV installed successfully.");
        }else{
            Log.d("TAG","OpenCV is not installed.");
        }
    }
}