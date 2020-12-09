package com.toutiao.developer.entity;


@SuppressWarnings("unused")
public class Predict  {

        public int getProb() {
                return prob;
        }

        public void setProb(int prob) {
                this.prob = prob;
        }

        public Boolean isHit() {
                return hit;
        }

        public void setHit(Boolean hit) {
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

        private int prob;
        private Boolean hit;
        private String target;
        private String model_name;

}
