package com.awsurlparser;

import com.amazonaws.services.s3.AmazonS3URI;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AppMain {

  static String bg = "https://ipc-stg.s3.ap-northeast-2.amazonaws.com/OMS/BLANK_PRODUCT/162123652700325/designWhite.png?response-content-type=image%2Fpng&X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Date=20210803T023617Z&X-Amz-SignedHeaders=host&X-Amz-Expires=86400&X-Amz-Credential=AKIAXYSXITACE5BUJ233%2F20210803%2Fap-northeast-2%2Fs3%2Faws4_request&X-Amz-Signature=cdfecba035da46474ac2812784893bdd36b22e266f02b38d0358ee29f5333434";
  static String guide = "https://ipc-stg.s3.ap-northeast-2.amazonaws.com/OMS/BLANK_PRODUCT/162123652700325/designTransparency.png?response-content-type=image%2Fpng&X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Date=20210803T023617Z&X-Amz-SignedHeaders=host&X-Amz-Expires=86400&X-Amz-Credential=AKIAXYSXITACE5BUJ233%2F20210803%2Fap-northeast-2%2Fs3%2Faws4_request&X-Amz-Signature=0e25cc897ad2997d0d7ea215d4918cf4e7ada0713039aaec1143d9e350d0854f";
  static String mock = "https://ipc-stg.s3.ap-northeast-2.amazonaws.com/OMS/BLANK_PRODUCT/162123652700325/designImage.png?response-content-type=image%2Fpng&X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Date=20210803T023617Z&X-Amz-SignedHeaders=host&X-Amz-Expires=86400&X-Amz-Credential=AKIAXYSXITACE5BUJ233%2F20210803%2Fap-northeast-2%2Fs3%2Faws4_request&X-Amz-Signature=2773e3711de03722c57640542ce14f96f15bb1873de9e518941ae8ada2b5758c";
  static String user_image_url = "https://ipc-stg.s3.ap-northeast-2.amazonaws.com/BUILDER/original/16f63ef68d70004/mycode01/I17ad1d098f10012.png";

//
  public static void main(String[] args) {
    System.out.println(parse(bg));
    System.out.println(parse(mock));
    System.out.println(parse(guide));
    System.out.println(parse(user_image_url));
    System.out.println(parse(""));
  }

  private static String parse(String url) {
    if(url == null || url.trim().length() == 0){
      return null;
    }
    Pattern pattern = Pattern.compile("http[|s]:\\/\\/[\\w\\d\\_\\-\\.]+\\/([\\w\\d\\/\\-\\_\\.]+[^?])");
    Matcher matcher = pattern.matcher(url);
    if(matcher.find()) {
      return matcher.group(1);
    }
    throw new RuntimeException("not found keys");
  }

//  public static void main(String[] args) {
//    final String regex = "http[|s]:\\/\\/[\\w\\d\\_\\-\\.]+\\/([\\w\\d\\/\\-\\_\\.]+[^?])";
//
//    final Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
//    final Matcher matcher = pattern.matcher(bg);
//
//    if(matcher.find()){
//      System.out.println(matcher.group(1));
//    }
////    while (matcher.find()) {
////      System.out.println("Full match: " + matcher.group(0));
////
////      for (int i = 1; i <= matcher.groupCount(); i++) {
////        System.out.println("Group " + i + ": " + matcher.group(i));
////      }
////    z
//  }

}