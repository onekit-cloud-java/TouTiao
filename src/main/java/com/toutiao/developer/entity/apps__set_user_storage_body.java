package com.toutiao.developer.entity;


import java.util.ArrayList;
@SuppressWarnings("unused")
public  class apps__set_user_storage_body  {
    public ArrayList<KV> getTt_kv_list() {
        return kv_list;
    }

    public void setTt_kv_list(ArrayList<KV> kv_list) {
        this.kv_list = kv_list;
    }

    private ArrayList<KV> kv_list;

}