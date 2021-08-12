package com.finalmap;

import java.util.HashMap;
import java.util.Map;

public class FinalMap {

  public static void main(String[] args) {

    Map<String,Integer> map = new HashMap<String, Integer>();

    change(map);

    System.out.println(map);

    final Temp dd = new Temp(1, "kim");

    System.out.println(dd.i);

  }

  public static Map<String, Integer> change(final Map<String, Integer> map){
    map.put("string", 123);
    return map;
  }

  private static class Temp{
    private final int i;
    private final String str;

    public Temp(int i, String str) {
      this.i = i;
      this.str = str;
    }

    public int getI() {
      return i;
    }

    public String getStr() {
      return str;
    }
  }

}
