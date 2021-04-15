package com.toutiao.developer.v1.request;

import lombok.Data;
@Data
public class ApiAppsQrcodeRequest {
    private String access_token;
    private String appname;
    private String path;
    private int width;
    private RGB line_color;
    private RGB background;
    private Boolean set_icon;

    @Data
    public class RGB {
        private int r, g, b;

        public RGB(int r, int g, int b) {
            this.r = r;
            this.g = g;
            this.b = b;
        }


    }
}
