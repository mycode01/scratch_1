package com.file;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class FileReadApplication {

  public static void main(String[] args) throws IOException {
    File file = new File("src/com/file/215f.wav");
    File file2 = new File("src/com/file/OGQ_민트데이_2020-11-25.jpg");
    InputStream is = new FileInputStream(file);
    InputStream is2 = new FileInputStream(file2);
    ByteArrayOutputStream os = new ByteArrayOutputStream();

    long start = System.currentTimeMillis();

    int b;
    while ((b = is.read()) != -1)
      os.write(b);


    long finish = System.currentTimeMillis();
    long timeElapsed = finish - start;
    System.out.println("timeelapsed "+ timeElapsed);
    long size2 = 0;
    while(is2.read() != -1){
      ++size2;
    }

    System.out.println(os.size());
    System.out.println(file.length());
    System.out.println(size2);
  }

}
