package com.williambayliss.calendar;

import androidx.room.Dao;
import androidx.room.Query;

import java.util.List;

@Dao
public interface TemplateDao {
    @Query("INSERT INTO templates (Title, `Start Time`, `End Time`) VALUES (:title, :startTime, :endTime)")
    void create(String title, int startTime, int endTime);

    @Query("UPDATE templates SET Title = :title, `Start Time` = :startTime, `End Time` = :endTime WHERE id = :id")
    void update(int id, String title, int startTime, int endTime);

    @Query("DELETE FROM templates WHERE id = :id")
    void delete(int id);

    @Query("SELECT * FROM templates")
    List<Template> getAllTemplates();

}
