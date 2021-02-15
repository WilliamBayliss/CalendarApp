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
    TimePicker fromTime;
    TimePicker untilTime;
    Button alertsButton;
    Button saveButton;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();
        setContentView(R.layout.template_activity);

        eventTitle = findViewById(R.id.eventTitleEditText);
        eventLocation = findViewById(R.id.eventLocationEditText);
        fromTime = findViewById(R.id.fromTimeSpinner);
        untilTime = findViewById(R.id.untilTimeSpinner);
        alertsButton = findViewById(R.id.alertsButton);
        saveButton = findViewById(R.id.saveButton);




    }
}
