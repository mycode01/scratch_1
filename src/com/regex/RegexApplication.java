package com.regex;

import java.util.regex.Pattern;

public class RegexApplication {

  public static void main(String[] args) {
    final String EMAIL_EXPR = "^([a-zA-Z0-9_.-]+@[\\da-zA-Z.-]+\\.[a-zA-Z.]{2,6})$";
    final String NICKNAME="(?=.*\\d{1,16})(?=.*[a-zA-Z]{1,16}).{4,16}$";

//    boolean a =Pattern.compile(EMAIL_EXPR).matcher("mycode01@korea.com").find();
//    boolean a = Pattern.compile()
    UserNamePolicy p = new MarketUserNamePolicy();
    TextCheck a = p.checkRule("mycode01");
    System.out.println(a);

  }
}
