package com.ifelse2;

import java.util.function.BiFunction;

public enum Operator {
  PLUS("+", (x, z) -> x + z),
  MINUS("-", (x, z) -> x - z),
  DIVIDE("/", (x, z) -> (Integer) x / z),
  MULTIPLY("*", (x, z) -> x * z);

  private String operator;
  private BiFunction<Integer, Integer, Integer> function;

  Operator(String o, BiFunction<Integer, Integer, Integer> f) {
    operator = o;
    function = f;
  }

  public String getKey(){
    return this.operator;
  }
  public BiFunction<Integer, Integer, Integer> getFunction() {
    return this.function;
  }
}
