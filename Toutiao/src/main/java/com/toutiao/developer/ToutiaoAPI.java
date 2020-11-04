package com.toutiao.developer;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public abstract class ToutiaoAPI  {

    ///////////////
    public abstract apps$token_response apps$token (
            String appid, String secret,
            String grant_type);

    public static class apps$token_response  implements Serializable{
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
                                                    String code, String anonymous_code);

    public static class apps$jscode2session_response  implements Serializable{
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

    public  class apps$set_user_storage_request implements Serializable{
        public List<Kvltem> getTt_kv_list() {
            return kv_list;
        }

        public void setTt_kv_list(List<Kvltem> kv_list) {
            this.kv_list = kv_list;
        }

        private  List<Kvltem> kv_list;

    }
    public abstract apps$set_user_storage_response apps$set_user_storage(String access_token, String openid,
                                                        String signature, String sig_method,apps$set_user_storage_request body);


    public  class apps$set_user_storage_response  implements Serializable{
        private long error;

    }
    //////////////////////////////////////////////////////

    public static class apps$remove_user_storage_request implements Serializable {
        private  List<String> kv_list;

        public List<String> getTt_kv_list() {
            return kv_list;
        }

        public void setTt_kv_list(List<String> kv_list) {
            this.kv_list = kv_list;
        }
    }
    public abstract apps$remove_user_storage_response apps$remove_user_storage_response(String access_token, String openid,
                                                              String signature, String sig_method,apps$remove_user_storage_request body );

    public static class apps$remove_user_storage_response  implements Serializable {
        private long error;

        public long getError() {
            return error;
        }

        public void setError(long error) {
            this.error = error;
        }
    }
    /////////////////////////////////////////////////////

    public abstract byte[] apps$qrcode(String access_token, String appname,
                                        String path, int width, Rgb line_color,Rgb background,boolean set_icon);


    //////////////////////////////////////////////////




    public static class apps$game$template$send_request  implements Serializable{

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
    public abstract apps$game$template$send_response apps$game$template$send(String X_Token, apps$game$template$send_request request);
public static class apps$game$template$send_response {
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

    private   String errmsg;
}
    //////////////////////////////////////
    public abstract apps$subscribe_notification$developer$v1$notify_response apps$subscribe_notification$developer$v1$notify(
             String access_token,
             String app_id,
             String tpl_id,
             String open_id,
             Map<String,String> data,
             String page
    );
public class apps$subscribe_notification$developer$v1$notify_response{
    private int  err_no;

    public int getErr_no() {
        return err_no;
    }

    public void setErr_no(int err_no) {
        this.err_no = err_no;
    }

    private    String    err_tips;
    }
}







