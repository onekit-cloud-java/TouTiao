package com.toutiao.developer;

import java.io.Serializable;
import java.util.List;

public abstract class ToutiaoAPI2 {
    public static class errCode extends Exception{
        private String error_id;
        private int code;
        private String message;
        private String exception;

        public String getError_id() {
            return error_id;
        }

        public void setError_id(String error_id) {
            this.error_id = error_id;
        }

        public int getCode() {
            return code;
        }

        public void setCode(int code) {
            this.code = code;
        }

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }

        public String getException() {
            return exception;
        }

        public void setException(String exception) {
            this.exception = exception;
        }
    }

    ////////////
    public static class tags$text$antidirt_body{

        public List<String> tasks;

        public List<String> getTasks() {
            return tasks;
        }

        public void setTasks(List<String> tasks) {
            this.tasks = tasks;
        }

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public  String content;
    }
    public abstract tags$text$antidirt_response tags$text$antidirt(
             String X_Token,tags$text$antidirt_body body)throws errCode;



    public static class tags$text$antidirt_response implements Serializable{
        private String log_id;
        private String data;
        private int code;
        private String msg;
        private String data_id;
        private String task_id;
        private List<Predict> predicts;
        private String target;
        private String model_name;
        private int prob;
        private boolean hit;

        public String getLog_id() {
            return log_id;
        }

        public void setLog_id(String log_id) {
            this.log_id = log_id;
        }

        public String getData() {
            return data;
        }

        public void setData(String data) {
            this.data = data;
        }

        public int getCode() {
            return code;
        }

        public void setCode(int code) {
            this.code = code;
        }

        public String getMsg() {
            return msg;
        }

        public void setMsg(String msg) {
            this.msg = msg;
        }

        public String getData_id() {
            return data_id;
        }

        public void setData_id(String data_id) {
            this.data_id = data_id;
        }

        public String getTask_id() {
            return task_id;
        }

        public void setTask_id(String task_id) {
            this.task_id = task_id;
        }

        public List<Predict> getPredicts() {
            return predicts;
        }

        public void setPredicts(List<Predict> predicts) {
            this.predicts = predicts;
        }

        public String getTarget() {
            return target;
        }

        public void setTarget(String target) {
            this.target = target;
        }

        public String getModel_name() {
            return model_name;
        }

        public void setModel_name(String model_name) {
            this.model_name = model_name;
        }

        public int getProb() {
            return prob;
        }

        public void setProb(int prob) {
            this.prob = prob;
        }

        public boolean isHit() {
            return hit;
        }

        public void setHit(boolean hit) {
            this.hit = hit;
        }
    }
    ////////////////////////
    public static class tags$image_body{
        public static class tags$image_body_task{
            public String image;

            public String getImage() {
                return image;
            }

            public void setImage(String image) {
                this.image = image;
            }
        }
        private    List<String> targets;
        private   List<tags$image_body_task> tasks;
        private  String image;

        public List<String> getTargets() {
            return targets;
        }

        public void setTargets(List<String> targets) {
            this.targets = targets;
        }

        public List<tags$image_body_task> getTasks() {
            return tasks;
        }

        public void setTasks(List<tags$image_body_task> tasks) {
            this.tasks = tasks;
        }

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
    public abstract tags$image_response tags$image(String X_Token,tags$image_body body)throws errCode;



    public static class tags$image_response implements Serializable{

        private String log_id;
        private String data;
        private long code;
        private String msg;
        private String data_id;
        private String task_id;
        private List<Predict> predicts;
        private String target;
        private String model_name;
        private int prob;
        private boolean hit;

        public String getLog_id() {
            return log_id;
        }

        public void setLog_id(String log_id) {
            this.log_id = log_id;
        }

        public String getData() {
            return data;
        }

        public void setData(String data) {
            this.data = data;
        }

        public long getCode() {
            return code;
        }

        public void setCode(long code) {
            this.code = code;
        }

        public String getMsg() {
            return msg;
        }

        public void setMsg(String msg) {
            this.msg = msg;
        }

        public String getData_id() {
            return data_id;
        }

        public void setData_id(String data_id) {
            this.data_id = data_id;
        }

        public String getTask_id() {
            return task_id;
        }

        public void setTask_id(String task_id) {
            this.task_id = task_id;
        }

        public List<Predict> getPredicts() {
            return predicts;
        }

        public void setPredicts(List<Predict> predicts) {
            this.predicts = predicts;
        }

        public String getTarget() {
            return target;
        }

        public void setTarget(String target) {
            this.target = target;
        }

        public String getModel_name() {
            return model_name;
        }

        public void setModel_name(String model_name) {
            this.model_name = model_name;
        }

        public int getProb() {
            return prob;
        }

        public void setProb(int prob) {
            this.prob = prob;
        }

        public boolean isHit() {
            return hit;
        }

        public void setHit(boolean hit) {
            this.hit = hit;
        }
    }
}
