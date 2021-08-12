package com.typesafe;

import com.typesafe.typeimple.Nothing;
import java.util.function.Function;
import java.util.function.Supplier;

public abstract class Types {
  public enum Type {NOTHING, INIT, RUNNING, TERMINATED}
  private final Type type;

  @Override
  public String toString() {
    return "Types{" +
        "type='" + type + '\'' +
        '}';
  }

  abstract public Types moveTypeInit();
  abstract public Types moveTypeRun();
  abstract public Types moveTypeTerminate();
  public void run(){
    System.out.println("status now : "+getType());
  }

  public Type getType() {
    return type;
  }

  protected Types(Type type) {
    this.type = type;
  }
  public static Types empty(){
    return new Nothing();
  }
}
