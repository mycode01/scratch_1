package com.ifelse.highlevel;


public class SomeHighLevelLogic {

  private final GenderDeciderFactory factory;

  public SomeHighLevelLogic(GenderDeciderFactory factory) {
    this.factory = factory;
  }

  public void printGender(int selection){
    Gender gender = factory.make(selection);
    System.out.println(gender.getGenderString());
  }
}
