package com.listSlice;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Slice {

  public static void main(String[] args) {
    List<Long> list = new ArrayList<>();
    for (int i = 0 ; i< 103; i++){
      list.add(Long.valueOf(i));
    }
    List<List<Long>> sliced = monoToBiDiv(list, 20);
    System.out.println(sliced);
  }


  public static List<List<Long>> monoToBiDiv(List<Long> mono, int size) {
    List<List<Long>> bidi = new ArrayList<>(
        mono.stream()
            .collect(Collectors.groupingBy(el -> mono.indexOf(el) / size))
            .values()
    );
    return bidi;
  }

}
