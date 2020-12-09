package com.toutiao.developer;

import cn.onekit.thekit.SIGN;
import com.toutiao.developer.entity.*;
@SuppressWarnings("unused")
public interface ToutiaoAPI {
    default String _signBody(String tt_sig_method, String tt_session_key, String tt_body) throws Exception {
        SIGN.Method method;
        if ("hmac_sha256".equals(tt_sig_method)) {
            method = SIGN.Method.HMACSHA256;
        } else {
            throw new Exception(tt_sig_method);
        }
        return new SIGN(method).sign(tt_session_key, tt_body);
    }

    default String _signRaw(String tt_rawData, String tt_session_key) throws Exception {
        return new SIGN(SIGN.Method.SHA1).sign(tt_rawData + tt_session_key);
    }

    apps__token_response apps__token(
            String tt_appid, String tt_secret,
            String tt_grant_type) throws ToutiaoError;

    apps__jscode2session_response apps__jscode2session(String tt_appid, String tt_secret,
                                                       String tt_code, String tt_anonymous_code) throws ToutiaoError;

//    apps__set_user_storage_response apps__set_user_storage(String tt_access_token, String tt_openid,
//                                                           String tt_signature, String tt_sig_method, apps__set_user_storage_body tt_body) throws ToutiaoError;
//
//
//    apps__remove_user_storage_response apps__remove_user_storage(String tt_access_token, String tt_openid,
//                                                                 String tt_signature, String tt_sig_method, apps__remove_user_storage_body tt_body) throws ToutiaoError;


    byte[] apps__qrcode(apps__qrcode_body tt_body) throws ToutiaoError;

    //apps__game__template__send_response apps__game__template__send(apps__game__template__send_body tt_body) throws ToutiaoError;

    apps__subscribe_notification__developer__notify_response apps__subscribe_notification__developer__notify(
            apps__subscribe_notification__developer__notify_body tt_body
    ) throws ToutiaoError;
}