package com.toutiao.developer;

import java.io.Serializable;

public class Kvltem implements Serializable {
    public Kvltem(String key, String value){
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
