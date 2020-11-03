package toutiao.cloud;

import java.util.ArrayList;
import java.util.List;

public abstract class ToutiaoOpenAPI {

    public abstract getAccessTokenResult getAccessToken(
            String tt_appid, String tt_secret,
            String tt_grant_type);

    public static class getAccessTokenResult {
        public String access_token;
        public long expires_in;
    }
    //////////////////////////////////////////////////


    public abstract code2SessionResult code2Session(String tt_appid, String tt_secret,
                                                    String tt_code, String tt_anonymous_code);

    public static class code2SessionResult {
        public String session_key;
        public String openid;
        public String anonymous_openid;
    }

    ///////////////////////////////////////////////////////


    public abstract setUserStorageResult setUserStorage(String tt_access_token, String tt_openid,
                                                        String tt_signature, String tt_sig_method,List<Kvltem> tt_kv_list);


    public static class setUserStorageResult {
        public long error;

    }
    //////////////////////////////////////////////////////


    public abstract removeUserStorageResult removeUserStorage(String tt_access_token, String tt_openid,
                                                              String tt_signature, String tt_sig_method, List<String> tt_kv_list);

    public static class removeUserStorageResult {
        public long error;

    }
    /////////////////////////////////////////////////////

    public abstract byte[] createQRCode(String tt_access_token, String tt_appname,
                                        String tt_path, int tt_width, Rgb tt_line_color,Rgb tt_background,boolean tt_set_icon);


    //////////////////////////////////////////////////


    public abstract checkContentResult checkContent(String tt_X_Token);



    public static class checkContentResult {

        public String log_id;
        public String data;
        public long code;
        public String msg;
        public String data_id;
        public String task_id;
        public List<Predict> predicts;


    }

    ////////////////////////////////////////////////////
    public abstract checkImageResult checkImage(ArrayList<String> tt_targets,String tt_image, String tt_image_data);



    public class checkImageResult {

        public String log_id;
        public String data;
        public long code;
        public String msg;
        public String data_id;
        public String task_id;
        public List<Predict> predicts;

    }
}





