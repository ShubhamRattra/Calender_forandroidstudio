package com.example.calender;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    CustomCalenderView customCalenderView ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        customCalenderView = (CustomCalenderView)findViewById(R.id.custom_calender_view);
    }
}
