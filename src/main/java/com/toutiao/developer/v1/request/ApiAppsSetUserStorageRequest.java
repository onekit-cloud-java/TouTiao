package com.toutiao.developer.v1.request;

import lombok.Data;

import java.util.List;

@Data
public class ApiAppsSetUserStorageRequest {
    private String access_token;
    private String openid;
    private String signature;
    private String sig_method;
    private List<KvItem> kv_list;
    @Data
    public static class KvItem{
        private String key;
        private String value;

    }
}
