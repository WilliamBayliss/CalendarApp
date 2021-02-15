package com.williambayliss.calendar;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {Template.class}, version = 1)
public abstract class TemplateDatabase extends RoomDatabase {
    public abstract TemplateDao templateDao();
}
