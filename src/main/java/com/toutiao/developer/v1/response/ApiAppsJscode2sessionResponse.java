package com.toutiao.developer.v1.response;

import lombok.Data;

@Data
public class ApiAppsJscode2sessionResponse {
    private String session_key;
    private String openid;
    private String anonymous_openid;
    private String unionid;
}
