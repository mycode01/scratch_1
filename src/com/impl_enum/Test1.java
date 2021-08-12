package com.impl_enum;

public class Test1 {

  public static void main(String[] args) {
    ExtendsEnum e = ExtendsEnum.valueOf(Original.VALUE1.name());

    System.out.println(e.getValue());
  }

}
