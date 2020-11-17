package com.toutiao.developer.entity;

public class ToutiaoError extends Exception{
    private int error;
    private int errcode;
    private String errmsg;

    public int getError() {
        return error;
    }

    public void setError(int error) {
        this.error = error;
    }

    public int getErrcode() {
        return errcode;
    }

    public void setErrcode(int errcode) {
        this.errcode = errcode;
    }

    public String getErrmsg() {
        return errmsg;
    }

    public void setErrmsg(String errmsg) {
        this.errmsg = errmsg;
    }
}
