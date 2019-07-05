package com.geektech.taskappa2.room;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

import com.geektech.taskappa2.Task;

@Database(entities = {Task.class}, version = 1)
public abstract class MyDatabase extends RoomDatabase {
    public abstract TaskDao taskDao();
}
