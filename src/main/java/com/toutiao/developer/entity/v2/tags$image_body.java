package com.toutiao.developer.entity.v2;

import java.util.ArrayList;

public  class tags$image_body {
    public enum Target {
        ad,
        porn,
        politics,
        disgusting
    }

    public static class Task {
        public String image;

        public String getImage() {
            return image;
        }

        public void setImage(String image) {
            this.image = image;
        }

        public String getImage_data() {
            return image_data;
        }

        public void setImage_data(String image_data) {
            this.image_data = image_data;
        }

        private String image_data;
    }

    private ArrayList<Target> targets = new ArrayList<>();
    private ArrayList<tags$image_body.Task> tasks = new ArrayList<>();
    private String image;

    public ArrayList<Target> getTargets() {
        return targets;
    }

    public void setTargets(ArrayList<Target> targets) {
        this.targets = targets;
    }

    public ArrayList<tags$image_body.Task> getTasks() {
        return tasks;
    }

    public void setTasks(ArrayList<tags$image_body.Task> tasks) {
        this.tasks = tasks;
    }

}