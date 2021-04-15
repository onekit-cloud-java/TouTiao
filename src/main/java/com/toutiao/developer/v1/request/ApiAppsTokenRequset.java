package com.toutiao.developer.v1.request;

import lombok.Data;

@Data
public class ApiAppsTokenRequset {
    private String appid;
    private String secret;
    private final String grant_type = "client_credential";
}
