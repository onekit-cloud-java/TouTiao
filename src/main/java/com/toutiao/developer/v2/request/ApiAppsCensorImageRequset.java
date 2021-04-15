package com.toutiao.developer.v2.request;

import lombok.Data;

@Data
public class ApiAppsCensorImageRequset {

    private String image;
    private String app_id;
    private String access_token;
    private String image_data;




}
