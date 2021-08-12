package com.replace;

public class ReplaceApplication {

  public static void main(String[] args) {
    String str = "https://rest.thebill.co.kr:4435/thebill/retailers/{serviceId}/srchAcct";
    String str2 = str.replace("{serviceId}", "1238281");

    System.out.println(str);
    System.out.println(str2);
  }
}
