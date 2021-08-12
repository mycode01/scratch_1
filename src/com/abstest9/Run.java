package com.abstest9;

public enum Run implements Runable {
  TEST_ONE(){
    @Override
    public void run(Cell cell) {
      TestDto1 one = (TestDto1) cell;

      System.out.println(one.getKey());
      System.out.println(one.getValue());
    }
  },
  TEST_TWO(){
    @Override
    public void run(Cell cell) {
      TestDto2 two = (TestDto2) cell;

      System.out.println(two.getAge());
      System.out.println(two.getName());
    }
  }
}
