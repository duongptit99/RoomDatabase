package com.example.database;

import android.content.Context;

import androidx.room.Room;
import androidx.room.RoomDatabase;

@androidx.room.Database(entities = {Student.class},version = 1)
public abstract class Database extends RoomDatabase {
    private static final String DATABASE_NAME = "student.db";
    private static Database instance;
    public abstract DAO dao();

    public static synchronized Database getInstance(Context context){
        if(instance == null){
            instance = Room.databaseBuilder(context.getApplicationContext(),Database.class,DATABASE_NAME)
                    .allowMainThreadQueries()
                    .build();
        }
        return instance;
    }

}
