package com.toutiao.developer.v1;

import cn.onekit.thekit.SIGN;
import com.toutiao.developer.v1.request.*;
import com.toutiao.developer.v1.response.*;


@SuppressWarnings("unused")
public interface ToutiaoV1API {
    default String sign(String sig_method, String session_key, String body) throws Exception {
        SIGN.Method method;
        if ("hmac_sha256".equals(sig_method)) {
            method = SIGN.Method.HMACSHA256;
        } else {
            throw new Exception(sig_method);
        }
        return new SIGN(method).sign(session_key, body);
    }


    ApiAppsTokenResponse apiAppsToken(ApiAppsTokenRequset apiAppsTokenRequset) throws ToutiaoError;

    ApiAppsJscode2sessionResponse apiAppsJscode2session(ApiAppsJscode2sessionRequset apiAppsJscode2sessionRequset) throws ToutiaoError;

    void apiAppsSetUserStorage(ApiAppsSetUserStorageRequest apiAppsSetUserStorageRequest) throws ToutiaoError;

    void apiAppsRemoveUserStorage(ApiAppsRemoveUserStorageRequest apiAppsRemoveUserStorageRequest) throws ToutiaoError;

    byte[] apiAppsQrcode(ApiAppsQrcodeRequest apiAppsQrcodeRequest) throws ToutiaoError;

    ApiAppsSubscribeNotificationDeveloperNotifyResponse  apiappsSubscribeNotificationDeveloperNotify( ApiAppsSubscribeNotificationDeveloperNotifyRequest  apiappsSubscribeNotificationDeveloperNotifyRequest) throws ToutiaoError;
}