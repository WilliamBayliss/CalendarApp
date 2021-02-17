package com.williambayliss.calendar;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.PopupMenu;
import android.widget.TimePicker;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class TemplateActivity extends AppCompatActivity {
    EditText eventTitle;
    EditText eventLocation;
    TimePicker fromTimeSpinner;
    TimePicker untilTimeSpinner;
    String fromTime;
    String untilTime;
    Button alertsButton;
    String alertType;
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
        alertsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PopupMenu popup = new PopupMenu(getApplicationContext(), view);
                popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem menuItem) {
                        onMenuItemOptionClick(menuItem);
                        return false;
                    }
                });
                popup.inflate(R.menu.popup_menu);
                popup.show();
            }
        });

        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                saveTemplate();
            }
        });
    }

    private void saveTemplate(){
        String title = eventTitle.getText().toString();
        String location = eventLocation.getText().toString();
        MainActivity.templateDatabase.templateDao().create(title, location, fromTime, untilTime, alertType);
        finish();

    }

    public boolean onMenuItemOptionClick(MenuItem item) {
        Toast.makeText(this, "Selected item: " + item.getTitle(), Toast.LENGTH_SHORT).show();
        switch (item.getItemId()) {
            case R.id.timeOfEvent:
                alertType = "At time of event";
                return true;
            case R.id.fiveMinsBeforeEvent:
                alertType = "Five minutes before event";
                return true;
            case R.id.halfHourBeforeEvent:
                alertType = "Thirty minutes before event";
                return true;
            case R.id.hourBeforeEvent:
                alertType = "One hour before event";
                return true;
            case R.id.oneDayBeforeEvent:
                alertType = "One day before event";
                return true;
            case R.id.oneWeekBeforeEvent:
                alertType = "One week before event";
                return true;
            default:
                return false;
        }
    }
}
