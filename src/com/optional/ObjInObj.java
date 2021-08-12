package com.optional;

public class ObjInObj {
  TestObj a;

  public TestObj getObj(){
    return a;
  }
  public void setObj(TestObj a){
    this.a = a;
  }
}
class TestObj{

  String a = "aaaaa";
  public TestObj(String a){
    this.a = a;
  }
  public String getString(){
    return a;
  }
}