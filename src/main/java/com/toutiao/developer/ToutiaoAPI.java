package com.toutiao.developer;


import com.toutiao.developer.entity.*;

public interface ToutiaoAPI {

    String _crypto(String sig_method, String session_key, String data) throws Exception;

    apps$token_response apps$token(
            String appid, String secret,
            String grant_type) throws ToutiaoError;

    apps$jscode2session_response apps$jscode2session(String appid, String secret,
                                                     String code, String anonymous_code) throws ToutiaoError;

    apps$set_user_storage_response apps$set_user_storage(String access_token, String openid,
                                                         String signature, String sig_method, apps$set_user_storage_body body) throws ToutiaoError;


    apps$remove_user_storage_response apps$remove_user_storage(String access_token, String openid,
                                                               String signature, String sig_method, apps$remove_user_storage_body body) throws ToutiaoError;


    byte[] apps$qrcode(apps$qrcode_body body) throws ToutiaoError;

    apps$game$template$send_response apps$game$template$send(apps$game$template$send_body body) throws ToutiaoError;

    apps$subscribe_notification$developer$v1$notify_response apps$subscribe_notification$developer$v1$notify(
            apps$subscribe_notification$developer$v1$notify_body request
    ) throws ToutiaoError;
}







