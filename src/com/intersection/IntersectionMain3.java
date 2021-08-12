package com.intersection;

import java.util.function.Consumer;
import java.util.function.Function;

public class IntersectionMain3 {

  interface Pair<T>{ // 기본타입을 정의
    T getFirst();
    T getSecond();
    void setFirst(T f);
    void setSecond(T s);
  }

  static class Name implements Pair<String>{
    String first;
    String last;

    public Name(String first, String last) {
      this.first = first;
      this.last = last;
    }

    @Override
    public String getFirst() {
      return first;
    }

    @Override
    public String getSecond() {
      return last;
    }

    @Override
    public void setFirst(String first) {
      this.first = first;
    }

    @Override
    public void setSecond(String second) {
      this.last = second;
    }
  } //기본 타입을 베이스로 한 Name 클래스 생성, Pair의 String타입

  interface DelegateTo<T>{ // 델리게이트 타입
    T delegate();
  }

  interface Forward<T> extends DelegateTo<Pair<T>>, Pair<T>{ // 델리게이트와 Pair가 Function이 허용하는 조건인 메서드 1개를 넘어버리므로 이를 포워딩하기 위한 Wrapper
    default T getFirst(){
      return delegate().getFirst();
    }
    default T getSecond(){
      return delegate().getSecond();
    }
    default void setFirst(T f){
      delegate().setFirst(f);
    }
    default void setSecond(T s){
      delegate().setSecond(s);
    }
  }
  interface Print<T> extends DelegateTo<Pair<T>> { // Pair를 이용하는 유틸클래스
    default void print(){
      System.out.println(delegate().getFirst() +" " + delegate().getSecond());
    }
  }
  interface Convert<T> extends DelegateTo<Pair<T>>{ // Pair를 이용하는 유틸클래스
    default void convert(Function<T, T> f){
      Pair<T> p1 = delegate();
      p1.setFirst(f.apply(p1.getFirst()));
      p1.setSecond(f.apply(p1.getSecond()));
    }
  }

  public static <T extends DelegateTo<S>,S> void run(T t, Consumer<T> c){ // lambda를 넘겨받아 실행하는 메서드 사실상 T는 아래 메인에서 Consumer의 타입추론을 가능하게 하는 역할
    c.accept(t);
  }

  public static void main(String[] args) {
    Name name = new Name("kim", "youngil");
    run((Forward<String> & Print<String> & Convert<String>)()->name, o->{
      System.out.println(o.getFirst());
      System.out.println(o.getSecond());
      o.print();
      o.convert(s->s.substring(0,3));
      o.print();
    });
  }
}
