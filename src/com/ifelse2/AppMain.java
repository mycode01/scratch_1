package com.ifelse2;

import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.function.BiFunction;

public class AppMain {

  private static Map<String, BiFunction<Integer, Integer, Integer>> operatorMap;

  static {
    operatorMap = new HashMap() {{
      for (Operator o : Operator.values()) {
        put(o.getKey(), o.getFunction());
      }
    }};
  }

  public static void main(String[] args) {
    String e = "2 + 3 + 5 - 1 * 2 / 9";

    int assumed = 0;

    StringTokenizer tokenizer = new StringTokenizer(e, " ");

    int cnt = 0;
    while(tokenizer.hasMoreTokens()){
      if(cnt++ == 0){
        assumed = Integer.parseInt(tokenizer.nextToken());
      }
      assumed = operatorMap.get(tokenizer.nextToken()).apply(assumed, Integer.parseInt(tokenizer.nextToken()));
    }

    System.out.println(assumed);
  }
}
