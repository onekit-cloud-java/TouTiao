package com.toutiao.developer;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public abstract class API {

    public abstract apps$token apps$token(
            String tt_appid, String tt_secret,
            String tt_grant_type);

    public static class apps$token {
        public String access_token;
        public long expires_in;
    }
    //////////////////////////////////////////////////


    public abstract apps$jscode2session apps$jscode2session(String tt_appid, String tt_secret,
                                                    String tt_code, String tt_anonymous_code);

    public static class apps$jscode2session {
        public String session_key;
        public String openid;
        public String anonymous_openid;
    }

    ///////////////////////////////////////////////////////


    public abstract apps$set_user_storage apps$set_user_storage(String tt_access_token, String tt_openid,
                                                        String tt_signature, String tt_sig_method,List<Kvltem> tt_kv_list);


    public  class apps$set_user_storage {
        public long error;

    }
    //////////////////////////////////////////////////////


    public abstract apps$remove_user_storage apps$remove_user_storage(String tt_access_token, String tt_openid,
                                                              String tt_signature, String tt_sig_method, List<String> tt_kv_list);

    public static class apps$remove_user_storage {
        public long error;

    }
    /////////////////////////////////////////////////////

    public abstract byte[] apps$qrcode(String tt_access_token, String tt_appname,
                                        String tt_path, int tt_width, Rgb tt_line_color,Rgb tt_background,boolean tt_set_icon);


    //////////////////////////////////////////////////


    public abstract apps$game$template$send apps$game$template$send(String tt_X_Token);



    public static class apps$game$template$send {

        public String log_id;
        public String data;
        public long code;
        public String msg;
        public String data_id;
        public String task_id;
        public List<Predict> predicts;


    }
    public abstract String apps$subscribe_notification$developer$v1$notify(
             String access_token,
             String app_id,
             String tpl_id,
             String open_id,
             Map<String,String> data,
             String page
    ) ;
}





