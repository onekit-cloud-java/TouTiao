package com.toutiao.developer.entity;
@SuppressWarnings("unused")
public  class apps__jscode2session_response {
    private String session_key;
    private String openid;
    private String anonymous_openid;

    public String getSession_key() {
        return session_key;
    }

    public void setSession_key(String session_key) {
        this.session_key = session_key;
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    public String getAnonymous_openid() {
        return anonymous_openid;
    }

    public void setAnonymous_openid(String anonymous_openid) {
        this.anonymous_openid = anonymous_openid;
    }
}