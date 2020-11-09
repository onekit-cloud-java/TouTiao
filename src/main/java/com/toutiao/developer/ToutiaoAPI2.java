package com.toutiao.developer;


import com.toutiao.developer.entity.v2.*;

public interface ToutiaoAPI2 {

    public abstract tags$text$antidirt_response tags$text$antidirt(
            String X_Token, tags$text$antidirt_body body) throws ToutiaoError;

    public abstract tags$image_response tags$image(String X_Token, tags$image_body body) throws ToutiaoError;
}
