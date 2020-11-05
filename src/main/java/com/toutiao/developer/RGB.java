package com.toutiao.developer;

import java.io.Serializable;

public class RGB implements Serializable {
     private int r, g, b;

     public RGB(int r, int g, int b) {
          this.r = r;
          this.g = g;
          this.b = b;
     }

     public int getR() {
          return r;
     }

     public int getG() {
          return g;
     }


     public int getB() {
          return b;
     }

}
