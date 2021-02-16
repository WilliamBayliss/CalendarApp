package com.williambayliss.calendar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;

import java.util.EventListener;

public class MainActivity extends AppCompatActivity {
    ConstraintLayout layout;
    CalendarView calendarView;
    Button newEventButton;
    Button newTemplateButton;
    Button settingsButton;
    public static TemplateDatabase templateDatabase;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        layout = findViewById(R.id.constraintLayout);
        calendarView = findViewById(R.id.calendarView);
        newEventButton = findViewById(R.id.newEventButton);
        newTemplateButton = findViewById(R.id.newTemplateButton);
        settingsButton = findViewById(R.id.settingsButton);

        templateDatabase = Room.databaseBuilder(getApplicationContext(), TemplateDatabase.class, "templates")
                .allowMainThreadQueries()
                .build();
        newTemplateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startNewTemplate();
            }
        });
    }

    public void startNewTemplate() {
        Intent intent = new Intent(this, TemplateActivity.class);
        startActivity(intent);
    }
}