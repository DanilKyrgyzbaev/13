package com.geektech.taskappa2;


import java.io.Serializable;

public class Task implements Serializable {

        String title;
        String description;
        String textSize;

        public Task(String title, String description, String textSize) {
            this.title = title;
            this.description = description;
            this.textSize = textSize;
        }
    }

