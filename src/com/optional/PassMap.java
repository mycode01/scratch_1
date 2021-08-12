package com.optional;

import java.util.Optional;

public class PassMap {

  public static void main(String[] args) {
    String str = null;

    System.out.println(
    Optional.ofNullable(str).map(s->s.join(",","is pass?")).get()
    );
  }

}
