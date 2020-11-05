package com.toutiao.developer;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public abstract class ToutiaoAPI {
    public static class errCode extends Exception {
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

    ///////////////////////////
    public abstract apps$token_response apps$token(
            String appid, String secret,
            String grant_type) throws errCode;

    public static class apps$token_response implements Serializable {
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


    public abstract apps$jscode2session_response apps$jscode2session(String appid, String secret,
                                                                     String code, String anonymous_code) throws errCode;

    public static class apps$jscode2session_response implements Serializable {
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

    public static class apps$set_user_storage_body  {
        public List<Kvltem> getTt_kv_list() {
            return kv_list;
        }

        public void setTt_kv_list(List<Kvltem> kv_list) {
            this.kv_list = kv_list;
        }

        private List<Kvltem> kv_list;

    }

    public abstract apps$set_user_storage_response apps$set_user_storage(String access_token, String openid,
                                                                         String signature, String sig_method, apps$set_user_storage_body body) throws errCode;


    public class apps$set_user_storage_response implements Serializable {
        private long error;

    }
    //////////////////////////////////////////////////////

    public static class apps$remove_user_storage_body  {
        private List<String> key;

        public List<String> getKey() {
            return key;
        }

        public void setKey(List<String> key) {
            this.key = key;
        }
    }

    public abstract apps$remove_user_storage_response apps$remove_user_storage(String access_token, String openid,
                                                                                        String signature, String sig_method, apps$remove_user_storage_body body) throws errCode;

    public static class apps$remove_user_storage_response implements Serializable {
        private long error;

        public long getError() {
            return error;
        }

        public void setError(long error) {
            this.error = error;
        }
    }

    /////////////////////////////////////////////////////
    public static class apps$qrcode_body {
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

        public boolean isSet_icon() {
            return set_icon;
        }

        public void setSet_icon(boolean set_icon) {
            this.set_icon = set_icon;
        }

        private String path;
        private int width;
        private RGB line_color;
        private RGB background;
        private boolean set_icon;
    }

    public abstract byte[] apps$qrcode(apps$qrcode_body body) throws errCode;

    //////////////////////////////////////////////////


    public static class apps$game$template$send_body  {

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

    public abstract apps$game$template$send_response apps$game$template$send(String X_Token, apps$game$template$send_body request) throws errCode;

    public static class apps$game$template$send_response  implements Serializable{
        private int errcode;

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

        private String errmsg;
    }

    //////////////////////////////////////
    public static class apps$subscribe_notification$developer$v1$notify_body{
        private String access_token;
        private   String app_id;

        public String getAccess_token() {
            return access_token;
        }

        public void setAccess_token(String access_token) {
            this.access_token = access_token;
        }

        public String getApp_id() {
            return app_id;
        }

        public void setApp_id(String app_id) {
            this.app_id = app_id;
        }

        public String getTpl_id() {
            return tpl_id;
        }

        public void setTpl_id(String tpl_id) {
            this.tpl_id = tpl_id;
        }

        public String getOpen_id() {
            return open_id;
        }

        public void setOpen_id(String open_id) {
            this.open_id = open_id;
        }

        public Map<String, String> getData() {
            return data;
        }

        public void setData(Map<String, String> data) {
            this.data = data;
        }

        public String getPage() {
            return page;
        }

        public void setPage(String page) {
            this.page = page;
        }

        private  String tpl_id;
        private  String open_id;
        private   Map<String, String> data;
        private   String page;
    }
    public abstract apps$subscribe_notification$developer$v1$notify_response apps$subscribe_notification$developer$v1$notify(
            apps$subscribe_notification$developer$v1$notify_body request
    ) throws errCode;

    public static class apps$subscribe_notification$developer$v1$notify_response implements Serializable{
        private int err_no;

        public int getErr_no() {
            return err_no;
        }

        public void setErr_no(int err_no) {
            this.err_no = err_no;
        }

        private String err_tips;
    }
}






