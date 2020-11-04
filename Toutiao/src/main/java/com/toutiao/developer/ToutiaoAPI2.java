package com.toutiao.developer;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public abstract class ToutiaoAPI2  {
    public abstract tags$text$antidirt tags$text$antidirt(
             String tt_X_Token,
             ArrayList<String> tt_tasks,
             String content);



    public class tags$text$antidirt implements Serializable{
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
    public abstract checkImageResult checkImage(ArrayList<String> tt_targets,String tt_image, String tt_image_data);



    public class checkImageResult implements Serializable{

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
