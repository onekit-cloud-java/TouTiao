package com.toutiao.developer.v2.request;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

import java.util.List;
@Data
public class ApiTagsTextAntidirtRequest {
    @SerializedName("X-Token")
    private String access_token;
    private String content;
    private List<Task> tasks;
    @Data
    public static class Task{
        private String content;
    }
}
