package com.williambayliss.calendar;

import androidx.room.Dao;
import androidx.room.Query;

import java.util.List;

@Dao
public interface TemplateDao {
    @Query("INSERT INTO templates (Title, Location, `Start Time`, `End Time`, `Alert Type`) VALUES (:title, :location, :startTime, :endTime, :alertType)")
    void create(String title, String location, int startTime, int endTime, String alertType);

    @Query("UPDATE templates SET Title = :title, Location = :location, `Start Time` = :startTime, `End Time` = :endTime, `Alert Type` = :alertType WHERE id = :id")
    void update(int id, String title, String location, int startTime, int endTime, String alertType);

    @Query("DELETE FROM templates WHERE id = :id")
    void delete(int id);

    @Query("SELECT * FROM templates")
    List<Template> getAllTemplates();

}
