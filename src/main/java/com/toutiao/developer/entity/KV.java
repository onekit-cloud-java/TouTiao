package com.toutiao.developer.entity;



public class KV {
    public KV(String key, String value){
        this.key=key;
        this.value=value;
    }
    private String key, value;

    public String getKey() {
        return key;
    }
    public String getValue() {
        return value;
    }
}
