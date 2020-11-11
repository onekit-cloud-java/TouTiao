package com.toutiao.developer;

import com.toutiao.developer.entity.*;

public interface ToutiaoAPI {

     String _signBody(String sig_method, String session_key, String data) throws Exception;
     String _signRaw( String rawData,String session_key) throws Exception;

    apps__token_response apps__token(
            String appid, String secret,
            String grant_type) throws ToutiaoError;

    apps__jscode2session_response apps__jscode2session(String appid, String secret,
                                                     String code, String anonymous_code) throws ToutiaoError;

    apps__set_user_storage_response apps__set_user_storage(String access_token, String openid,
                                                         String signature, String sig_method, apps__set_user_storage_body body) throws ToutiaoError;


    apps__remove_user_storage_response apps__remove_user_storage(String access_token, String openid,
                                                               String signature, String sig_method, apps__remove_user_storage_body body) throws ToutiaoError;


    byte[] apps__qrcode(apps__qrcode_body body) throws ToutiaoError;

    apps__game__template__send_response apps__game__template__send(apps__game__template__send_body body) throws ToutiaoError;

    apps__subscribe_notification__developer__notify_response apps__subscribe_notification__developer__notify(
            apps__subscribe_notification__developer__notify_body request
    ) throws ToutiaoError;
}







