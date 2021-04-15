package com.toutiao.developer.v1;

import lombok.Data;

@SuppressWarnings("unused")
@Data
public class ToutiaoError extends Exception{
    private Integer error;
    private Integer errcode;
    private String errmsg;
    private String message;


}
