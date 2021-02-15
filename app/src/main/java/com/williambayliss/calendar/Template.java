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
    @ColumnInfo(name = "Start Time")
    public int startTime;
    @ColumnInfo(name = "End Time")
    public int endTime;
}
