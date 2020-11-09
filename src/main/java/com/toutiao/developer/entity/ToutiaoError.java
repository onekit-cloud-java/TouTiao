package com.toutiao.developer.entity;

public class ToutiaoError extends Exception{
    private long error;
    private long errcode;
    private String errmsg;
    private String message;

    public long getError() {
        return error;
    }

    public void setError(long error) {
        this.error = error;
    }

    public long getErrcode() {
        return errcode;
    }

    public void setErrcode(long errcode) {
        this.errcode = errcode;
    }

    public String getErrmsg() {
        return errmsg;
    }

    public void setErrmsg(String errmsg) {
        this.errmsg = errmsg;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
