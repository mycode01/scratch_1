package com.sslcert;

import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;
import java.util.stream.Stream;

public class AppMain {

  public static void main(String[] args) throws Exception {
    URL url = new URL("https://thumb1.photo.mybox.naver.com/");
    URLConnection conn = url.openConnection();

    InputStream is = conn.getInputStream();
    Scanner scan = new Scanner(is);

    int line = 1;
    while (scan.hasNext()) {
      String str = scan.nextLine();
      System.out.println((line++) + ":" + str);
    }
    scan.close();

  }

}
