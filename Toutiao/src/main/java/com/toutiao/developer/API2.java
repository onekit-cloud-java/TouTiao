package com.toutiao.developer;

import java.util.ArrayList;
import java.util.List;

public abstract class API2 {
    public abstract tags$text$antidirt tags$text$antidirt(
             String tt_X_Token,
             ArrayList<String> tt_tasks,
             String content);



    public class tags$text$antidirt {
        public String log_id;
        public String data;
        public int code;
        public String msg;
        public String data_id;
        public String task_id;
        public List<Predict> predicts;
        public String target;
        public String model_name;
        public int prob;
        public boolean hit;
    }
    public abstract checkImageResult checkImage(ArrayList<String> tt_targets,String tt_image, String tt_image_data);



    public class checkImageResult {

        public String log_id;
        public String data;
        public long code;
        public String msg;
        public String data_id;
        public String task_id;
        public List<Predict> predicts;
        public String target;
        public String model_name;
        public int prob;
        public boolean hit;

    }
}
