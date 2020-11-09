package com.toutiao.developer.entity.v2;

import com.toutiao.developer.entity.Predict;

import java.util.ArrayList;

public  class tags__image_response {
    public static class Data {
        private int code;
        private String msg;
        private String data_id;
        private String task_id;
        private ArrayList<Predict> predicts=new ArrayList<>();

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

        public ArrayList<Predict> getPredicts() {
            return predicts;
        }

        public void setPredicts(ArrayList<Predict> predicts) {
            this.predicts = predicts;
        }

    }

    private String log_id;


    public String getLog_id() {
        return log_id;
    }

    public void setLog_id(String log_id) {
        this.log_id = log_id;
    }

    private ArrayList<tags__image_response.Data> data = new ArrayList<>();

    public ArrayList<tags__image_response.Data> getData() {
        return data;
    }

    public void setData(ArrayList<tags__image_response.Data> data) {
        this.data = data;
    }

}