package com.toutiao.developer.entity;


import com.toutiao.developer.Kv;

import java.util.ArrayList;

public  class apps$set_user_storage_body  {
    public ArrayList<Kv> getTt_kv_list() {
        return kv_list;
    }

    public void setTt_kv_list(ArrayList<Kv> kv_list) {
        this.kv_list = kv_list;
    }

    private ArrayList<Kv> kv_list;

}