package com.minus;

public class Minus {

  public static void main(String[] args) {
    int t = 3;
    int o = 1;
    if(--t == 3){
      System.out.println(t);
    }
    System.out.println("t is "+t);

    if(--o == 0){
      System.out.println(o);
    }
  }
}
