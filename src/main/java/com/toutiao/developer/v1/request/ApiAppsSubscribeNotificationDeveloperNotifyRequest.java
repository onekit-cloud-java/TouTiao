package com.toutiao.developer.v1.request;

import lombok.Data;

import java.util.Map;
@Data
public class ApiAppsSubscribeNotificationDeveloperNotifyRequest {
    private String access_token;
    private String app_id;
    private String tpl_id;
    private String open_id;
    private Map<String, String> data;
    private String page;
}
