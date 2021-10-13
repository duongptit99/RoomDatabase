package com.example.database;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface DAO {
    @Query("SELECT * FROM student")
    List<Student> getAll();

    @Insert
    void insertUser(Student student);
}
