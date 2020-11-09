package com.toutiao.developer.entity;


import java.util.Map;

public  class apps$game$template$send_body  {
    public static class SubData{
        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }

        private String value;
    }
    private String access_token;
    private String touser;
    private String template_id;

    public String getAccess_token() {
        return access_token;
    }

    public void setAccess_token(String access_token) {
        this.access_token = access_token;
    }

    public String getTouser() {
        return touser;
    }

    public void setTouser(String touser) {
        this.touser = touser;
    }

    public String getTemplate_id() {
        return template_id;
    }

    public void setTemplate_id(String template_id) {
        this.template_id = template_id;
    }

    public String getPage() {
        return page;
    }

    public void setPage(String page) {
        this.page = page;
    }

    public String getForm_id() {
        return form_id;
    }

    public void setForm_id(String form_id) {
        this.form_id = form_id;
    }

    public Map<String, SubData> getData() {
        return data;
    }

    public void setData(Map<String, SubData> data) {
        this.data = data;
    }

    private String page;
    private String form_id;
    private Map<String,SubData > data	;


}