package com.toutiao.developer.v1.request;

import lombok.Data;

@Data
public class ApiAppsJscode2sessionRequset {
    private String appid;
    private String secret;
    private  String code ;
    private  String anonymous_code ;
}
