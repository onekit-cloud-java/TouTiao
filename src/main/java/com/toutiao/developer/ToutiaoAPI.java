package com.toutiao.developer;

import cn.onekit.thekit.SIGN;
import com.toutiao.developer.entity.*;

public interface ToutiaoAPI {
     public default String _signBody(String sig_method, String session_key, String body) throws Exception
    {
        SIGN.Method method;
        switch (sig_method) {
            case "hmac_sha256":
                method = SIGN.Method.HMACSHA256;
                break;
            default:
                throw new Exception(sig_method);
        }
        return new SIGN(method).sign(session_key, body);
    }
    public default String _signRaw( String rawData,String session_key) throws Exception{
        return new SIGN(SIGN.Method.SHA1).sign(rawData+session_key);
    }

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







