package com.toutiao.developer.entity.v2;


import java.util.ArrayList;

public  class tags__text__antidirt_body {
    public static class Task {
        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }

        private String content;
    }

    public ArrayList<Task> tasks;

    public ArrayList<Task> getTasks() {
        return tasks;
    }

    public void setTasks(ArrayList<Task> tasks) {
        this.tasks = tasks;
    }
}
