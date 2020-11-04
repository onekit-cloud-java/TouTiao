package com.toutiao.developer;

import java.io.Serializable;

public class Predict implements Serializable {

        private int prob;
        private boolean hit;
        private String target;
        private String model_name;


        public int getProb() {
                return prob;
        }

        public void setProb(int prob) {
                this.prob = prob;
        }

        public boolean isHit() {
                return hit;
        }

        public void setHit(boolean hit) {
                this.hit = hit;
        }

        public String getTarget() {
                return target;
        }

        public void setTarget(String target) {
                this.target = target;
        }

        public String getModel_name() {
                return model_name;
        }

        public void setModel_name(String model_name) {
                this.model_name = model_name;
        }




}
