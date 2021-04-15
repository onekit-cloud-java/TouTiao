package com.toutiao.developer.v2;


import com.toutiao.developer.v2.request.ApiAppsCensorImageRequset;
import com.toutiao.developer.v2.request.ApiTagsTextAntidirtRequest;
import com.toutiao.developer.v2.response.ApiAppsCensorImageResponse;
import com.toutiao.developer.v2.response.ApiTagsTextAntidirtResponse;

@SuppressWarnings("unused")
public interface ToutiaoV2API {

    ApiTagsTextAntidirtResponse apiTagsTextAntidirt(ApiTagsTextAntidirtRequest apiTagsTextAntidirtRequset) throws ToutiaoError2;

    ApiAppsCensorImageResponse apiAppsCensorImage(ApiAppsCensorImageRequset apiAppsCensorImageRequset) throws ToutiaoError2;

}
