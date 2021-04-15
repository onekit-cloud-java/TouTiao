package com.toutiao.developer.v1.request;

import lombok.Data;

import java.util.List;
@Data
public class ApiAppsRemoveUserStorageRequest {
    private String access_token;
    private String openid;
    private String signature;
    private final String sig_method = "hmac_sha256";
    private List<String> key;
    private String session_key;
}
