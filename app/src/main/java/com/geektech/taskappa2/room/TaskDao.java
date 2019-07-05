package com.geektech.taskappa2.room;


import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import com.geektech.taskappa2.Task;

import java.util.List;

@Dao
public interface TaskDao {


    @Query("SELECT * FROM task")
    List<Task> getAll();


    @Insert
    void insert(Task task);
}
