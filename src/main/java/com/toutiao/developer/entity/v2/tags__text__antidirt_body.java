package com.toutiao.developer.entity.v2;


import java.util.ArrayList;
@SuppressWarnings("unused")
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

    @SuppressWarnings("WeakerAccess")
    public ArrayList<Task> tasks;

    public ArrayList<Task> getTasks() {
        return tasks;
    }

    public void setTasks(ArrayList<Task> tasks) {
        this.tasks = tasks;
    }
}
