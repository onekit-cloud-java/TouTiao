package com.toutiao.developer.entity;

public  class apps$qrcode_body {
    private String access_token;
    private String appname;

    public String getAccess_token() {
        return access_token;
    }

    public void setAccess_token(String access_token) {
        this.access_token = access_token;
    }

    public String getAppname() {
        return appname;
    }

    public void setAppname(String appname) {
        this.appname = appname;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public RGB getLine_color() {
        return line_color;
    }

    public void setLine_color(RGB line_color) {
        this.line_color = line_color;
    }

    public RGB getBackground() {
        return background;
    }

    public void setBackground(RGB background) {
        this.background = background;
    }

    public Boolean isSet_icon() {
        return set_icon;
    }

    public void setSet_icon(Boolean set_icon) {
        this.set_icon = set_icon;
    }

    private String path;
    private int width;
    private RGB line_color;
    private RGB background;
    private Boolean set_icon;
}