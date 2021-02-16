package com.williambayliss.calendar;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.TimePicker;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

public class TemplateActivity extends AppCompatActivity {
    EditText eventTitle;
    EditText eventLocation;
    TimePicker fromTimeSpinner;
    TimePicker untilTimeSpinner;
    String fromTime;
    String untilTime;
    Button alertsButton;
    Button saveButton;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();
        setContentView(R.layout.template_activity);

        eventTitle = findViewById(R.id.eventTitleEditText);
        eventLocation = findViewById(R.id.eventLocationEditText);
        fromTimeSpinner = findViewById(R.id.fromTimeSpinner);
        untilTimeSpinner = findViewById(R.id.untilTimeSpinner);
        alertsButton = findViewById(R.id.alertsButton);
        saveButton = findViewById(R.id.saveButton);

        fromTimeSpinner.setIs24HourView(true);
        untilTimeSpinner.setIs24HourView(true);

        fromTimeSpinner.setOnTimeChangedListener(new TimePicker.OnTimeChangedListener() {
            @Override
            public void onTimeChanged(TimePicker timePicker, int hour, int minute) {
                String AMPM = "AM";
                if (hour > 11) {
                    hour = hour - 12;
                    AMPM = "PM";
                }
                fromTime = "" + hour + ":" + minute + AMPM;

            }
        });

        untilTimeSpinner.setOnTimeChangedListener(new TimePicker.OnTimeChangedListener() {
            @Override
            public void onTimeChanged(TimePicker timePicker, int hour, int minute) {
                String AMPM = "AM";
                if (hour > 11) {
                    hour = hour - 12;
                    AMPM = "PM";
                }
                untilTime = "" + hour + ":" + minute + AMPM;

            }
        });
    }

}
