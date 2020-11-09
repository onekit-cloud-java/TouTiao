package com.toutiao.developer;


import com.toutiao.developer.entity.v2.*;

public interface ToutiaoAPI2 {

    tags__text__antidirt_response tags__text__antidirt(
            String X_Token, tags__text__antidirt_body body) throws ToutiaoError;

    tags__image_response tags__image(String X_Token, tags__image_body body) throws ToutiaoError;
}
