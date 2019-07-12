package com.geektech.taskappa2.room;


import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import com.geektech.taskappa2.Task;

import java.util.List;

@Dao
public interface TaskDao {


    @Query("SELECT * FROM task ORDER by id DESC")
    LiveData<List<Task>> getAll();


    @Insert
    void insert(Task task);

    @Delete
    void delete(Task task);

    @Update
    void update(Task task);
}
