package com.williambayliss.calendar;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "templates")
public class Template {
    @PrimaryKey
    public int id;
    @ColumnInfo(name = "Title")
    public String title;
    @ColumnInfo(name = "Location")
    public String location;
    @ColumnInfo(name = "Start Time")
    public String startTime;
    @ColumnInfo(name = "End Time")
    public String endTime;
    @ColumnInfo(name = "Alert Type")
    public String alertType;
}
