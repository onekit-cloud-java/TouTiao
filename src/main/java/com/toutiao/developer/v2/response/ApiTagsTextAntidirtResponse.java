package com.toutiao.developer.v2.response;

import lombok.Data;

import java.util.List;

@Data
public class ApiTagsTextAntidirtResponse {
    private String log_id;
    private Data data;

    @lombok.Data
    public static class Data {
        private Integer code;
        private String msg;
        private String data_id;
        private String task_id;
        private List<Predict> predicts;

        @lombok.Data
        public class Predict  {
            private int prob;
            private Boolean hit;
            private String target;
            private String model_name;

        }


    }


}
