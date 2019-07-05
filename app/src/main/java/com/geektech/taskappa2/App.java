package com.geektech.taskappa2;

import android.app.Application;
import android.arch.persistence.room.Room;

import com.geektech.taskappa2.room.MyDatabase;

public class App extends Application {

    private static MyDatabase myDatabase;

    @Override
    public void onCreate() {
        super.onCreate();
        myDatabase = Room.databaseBuilder(this, MyDatabase.class, "mydatabase").allowMainThreadQueries().build();
    }

    public static MyDatabase getDatabase() {
        return myDatabase;
    }
}
