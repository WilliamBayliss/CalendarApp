package com.williambayliss.calendar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CalendarView;

public class MainActivity extends AppCompatActivity {
    CalendarView calendarView;
    Button newEventButton;
    Button newTemplateButton;
    Button settingsButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        calendarView = findViewById(R.id.calendarView);
        newEventButton = findViewById(R.id.newEventButton);
        newTemplateButton = findViewById(R.id.newTemplateButton);
        settingsButton = findViewById(R.id.settingsButton);
    }
}