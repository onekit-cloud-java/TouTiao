package com.toutiao.developer.v1.response;

import lombok.Data;

@Data
public class ApiAppsTokenResponse {
    private String access_token;
    private Integer expires_in;
}
