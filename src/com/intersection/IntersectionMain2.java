package com.intersection;

import java.util.function.Consumer;

public class IntersectionMain2 {

  interface DelegateTo<T> {
    T delegate();
  }

  interface Hello extends DelegateTo<String> {
    default void hello() {
      System.out.println("hello " + delegate());
    }
  }

  interface Upper extends DelegateTo<String> {
    default void upper() {
      System.out.println(delegate().toUpperCase());
    }
  }

  public static void main(String[] args) {
    say((DelegateTo<String> & Hello & Upper) () -> "world!", // intersection을 이용하여 해당 interface default 메소드를 사용하기 위해 lambda선언 및 delgate의 값 세팅
        c -> {
          c.hello(); // 위에서 interface를 선언해주었기 때문에 해당 디폴트 메소드 사용가능
          c.upper();
        });
  }

  public static <T extends DelegateTo> void say(T t, Consumer<T> c) {
    c.accept(t);
  }

}
