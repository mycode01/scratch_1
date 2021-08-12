package com.intersection;

import java.util.function.Consumer;
import java.util.function.Function;

public class IntersectionMain {
  interface hello{
    default void printHello(){
      System.out.println("hello");
    }
  }
  interface hi{
    default void printHi(){
      System.out.println("hi");
    }
  }

  public static void main(String[] args) {
    say((Function & hello & hi)s->s, c->{c.printHello(); c.printHi(); c.apply("say");});
  }
  public static <T extends Function & hello & hi> void say(T t, Consumer<T> c){
    c.accept(t);
  }
}
