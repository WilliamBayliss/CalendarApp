package com.williambayliss.calendar;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

public class TemplateActivity extends AppCompatActivity {
    TextView titleTextView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();
        setContentView(R.layout.template_activity);

        titleTextView = findViewById(R.id.newTemplateTextView);

    }
}
