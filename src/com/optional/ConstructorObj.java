package com.optional;

public class ConstructorObj {

  String name;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    System.out.println(name + " on setter");
    this.name = name;
  }

  public ConstructorObj(String name){
    System.out.println(name +" on constructor");
    this.name = name;
  }

  public ConstructorObj(){
  }
}
