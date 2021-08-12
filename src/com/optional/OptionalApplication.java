package com.optional;

import java.util.Optional;

public class OptionalApplication {

  public static void main(String[] args) {
    String oldname = "old name";
    String newname = "new name";
    ConstructorObj obj= new ConstructorObj();

    System.out.println(obj.getName());
    Optional.ofNullable(obj.getName()).orElseThrow(RuntimeException::new);


  }
}
