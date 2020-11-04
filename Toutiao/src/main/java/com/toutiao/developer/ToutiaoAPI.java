package com.toutiao.developer;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public abstract class ToutiaoAPI implements Serializable {

    public abstract apps$token apps$token(
            String tt_appid, String tt_secret,
            String tt_grant_type);

    public static class apps$token {
        private String access_token;
        private long expires_in;

        public String getAccess_token() {
            return access_token;
        }

        public void setAccess_token(String access_token) {
            this.access_token = access_token;
        }

        public long getExpires_in() {
            return expires_in;
        }

        public void setExpires_in(long expires_in) {
            this.expires_in = expires_in;
        }
    }
    //////////////////////////////////////////////////


    public abstract apps$jscode2session apps$jscode2session(String tt_appid, String tt_secret,
                                                    String tt_code, String tt_anonymous_code);

    public static class apps$jscode2session {
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

    ///////////////////////////////////////////////////////


    public abstract apps$set_user_storage apps$set_user_storage(String tt_access_token, String tt_openid,
                                                        String tt_signature, String tt_sig_method,List<Kvltem> tt_kv_list);


    public  class apps$set_user_storage {
        private long error;

    }
    //////////////////////////////////////////////////////


    public abstract apps$remove_user_storage apps$remove_user_storage(String tt_access_token, String tt_openid,
                                                              String tt_signature, String tt_sig_method, List<String> tt_kv_list);

    public static class apps$remove_user_storage {
        private long error;

        public long getError() {
            return error;
        }

        public void setError(long error) {
            this.error = error;
        }
    }
    /////////////////////////////////////////////////////

    public abstract byte[] apps$qrcode(String tt_access_token, String tt_appname,
                                        String tt_path, int tt_width, Rgb tt_line_color,Rgb tt_background,boolean tt_set_icon);


    //////////////////////////////////////////////////


    public abstract apps$game$template$send apps$game$template$send(String tt_X_Token);



    public static class apps$game$template$send {

        private String log_id;
        private String data;
        private long code;
        private String msg;
        private String data_id;
        private String task_id;
        private List<Predict> predicts;

        public String getLog_id() {
            return log_id;
        }

        public void setLog_id(String log_id) {
            this.log_id = log_id;
        }

        public String getData() {
            return data;
        }

        public void setData(String data) {
            this.data = data;
        }

        public long getCode() {
            return code;
        }

        public void setCode(long code) {
            this.code = code;
        }

        public String getMsg() {
            return msg;
        }

        public void setMsg(String msg) {
            this.msg = msg;
        }

        public String getData_id() {
            return data_id;
        }

        public void setData_id(String data_id) {
            this.data_id = data_id;
        }

        public String getTask_id() {
            return task_id;
        }

        public void setTask_id(String task_id) {
            this.task_id = task_id;
        }

        public List<Predict> getPredicts() {
            return predicts;
        }

        public void setPredicts(List<Predict> predicts) {
            this.predicts = predicts;
        }
    }
    public abstract String apps$subscribe_notification$developer$v1$notify(
             String access_token,
             String app_id,
             String tpl_id,
             String open_id,
             Map<String,String> data,
             String page
    );
}





