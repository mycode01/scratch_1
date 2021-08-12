package com.optional;

import java.util.Optional;

public class ObjApplication {

  public static void main(String[] args) {
//    TestObj a = new TestObj("test");
//    ObjInObj oa = new ObjInObj();
//    oa.setObj(a);
//    System.out.println(oa.getObj().getString());

    ObjInObj oa = new ObjInObj();

    String s =Optional.ofNullable(oa.getObj()).
        map(c->c.getString()).
        orElseGet(()->{return null;});

    System.out.println(
        s
    );
  }

}
