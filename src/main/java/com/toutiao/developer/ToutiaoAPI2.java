package com.toutiao.developer;


import java.util.List;

public abstract class ToutiaoAPI2 {
    public static class errCode extends Exception {
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
    public static class tags$text$antidirt_body {
        public static class Task {
            public String getContent() {
                return content;
            }

            public void setContent(String content) {
                this.content = content;
            }

            private String content;
        }

        public List<Task> tasks;

        public List<Task> getTasks() {
            return tasks;
        }

        public void setTasks(List<Task> tasks) {
            this.tasks = tasks;
        }
    }

    public abstract tags$text$antidirt_response tags$text$antidirt(
            String X_Token, tags$text$antidirt_body body) throws errCode;


    public static class tags$text$antidirt_response {
        public static class Data {

            private Integer code;
            private String msg;
            private String data_id;
            private String task_id;
            private List<Predict> predicts;

            public Integer getCode() {
                return code;
            }

            public void setCode(Integer code) {
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

        }

        private String log_id;
        private String data;

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
    }

    ////////////////////////
    public static class tags$image_body {
        public enum  Target {
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

        private List<Target> targets;
        private List<tags$image_body.Task> tasks;
        private String image;

        public List<Target> getTargets() {
            return targets;
        }

        public void setTargets(List<Target> targets) {
            this.targets = targets;
        }

        public List<tags$image_body.Task> getTasks() {
            return tasks;
        }

        public void setTasks(List<tags$image_body.Task> tasks) {
            this.tasks = tasks;
        }

    }

    public abstract tags$image_response tags$image(String X_Token, tags$image_body body) throws errCode;


    public static class tags$image_response {
        public static class Data {
            private Integer code;
            private String msg;
            private String data_id;
            private String task_id;
            private List<Predict> predicts;

            public Integer getCode() {
                return code;
            }

            public void setCode(Integer code) {
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

        }

        private String log_id;
        private String data;


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

    }
}
