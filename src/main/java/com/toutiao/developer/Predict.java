package com.toutiao.developer;



public class Predict  {
        public Predict(
                int prob,
                boolean hit,
                String target,
                String model_name) {
                this.prob = prob;
                this.hit = hit;
                this.target = target;
                this.model_name = model_name;
        }

        private int prob;
        private boolean hit;
        private String target;
        private String model_name;

        public int getProb() {
                return prob;
        }

        public boolean isHit() {
                return hit;
        }

        public String getTarget() {
                return target;
        }

        public String getModel_name() {
                return model_name;
        }
}
