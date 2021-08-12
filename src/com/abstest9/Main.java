package com.abstest9;

import java.util.List;

public class Main {

  public static void main(String[] args) {

    TestDto1 one = new TestDto1();
    TestDto2 two = new TestDto2();

    one.setKey("teest123123");
    one.setValue("data12392");

    two.setAge(20);
    two.setName("kim");

    doRun(one);
    doRun(two);
  }

  private static void doRun(Cell cell){
    Runable runable = getRunable(cell);
    runable.run(cell);
  }

  private static <T extends Cell> Runable getRunable(T dto) {
    switch (dto.getClass().getSimpleName()) {
      case "TestDto1":
        return Run.valueOf("TEST_ONE");
      case "TestDto2":
        return Run.valueOf("TEST_TWO");
      default:
        return Run.None;
    }
  }
}
