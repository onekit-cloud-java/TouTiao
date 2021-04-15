package com.toutiao.developer.v2.response;

import lombok.Data;

import java.util.List;


@Data
public class ApiAppsCensorImageResponse {
    private Integer error;
    private String message;

    @lombok.Data
    public static class Data {

        private List<Predict> predicts;

        @lombok.Data
        public class Predict  {
            private String model_name;
            private Boolean hit;

        }


    }
}
