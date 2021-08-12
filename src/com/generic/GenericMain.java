package com.generic;

import java.util.Arrays;
import java.util.List;

public class GenericMain<T extends Number> {

  static class A{
    @Override
    public String toString() {
      return "A";
    }
  }
  static class B extends A{
    @Override
    public String toString() {
      return "B";
    }
  }

  public void printList(List<Object> l){
    l.forEach(x-> System.out.println(x));
  }
  public void printList2(List<?> l ){
    l.forEach(x-> System.out.println(x));
  }
  public void printSome(T t){
    System.out.println(t);
  }
  public void printSome(Object o){
    System.out.println(o);
  }

//  public <? extends A> void printA(? a)

  public static void main(String[] args) {
    List<Integer> l = Arrays.asList(1,2,3,4);
//    new GenericMain().printList(l);
    new GenericMain().printList2(l);

    new GenericMain<>().printSome(1.2f);
    new GenericMain<>().printSome("dfd");
  }

}
