package com.typesafe;

import java.util.Arrays;

public class TypesafeEnumApplication {

  public static void main(String[] args) {
    Types newtype = Types.empty();
    newtype.run();
    newtype = newtype.moveTypeInit();
    newtype.run();
    newtype = newtype.moveTypeTerminate(); // err
    newtype.run();
  }

}
