package com.geektech.taskappa2;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

import java.io.Serializable;

@Entity

public class Task implements Serializable {

    @PrimaryKey (autoGenerate = true)
    private long id;

        String title;
        String description;
        String textSize;

        public Task(String title, String description, String textSize) {
            this.title = title;
            this.description = description;
            this.textSize = textSize;
        }

    public void setId(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTextSize() {
        return textSize;
    }
}

