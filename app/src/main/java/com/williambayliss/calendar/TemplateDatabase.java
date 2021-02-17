package com.williambayliss.calendar;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {Template.class}, version = 2)
public abstract class TemplateDatabase extends RoomDatabase {
    public abstract TemplateDao templateDao();
}
