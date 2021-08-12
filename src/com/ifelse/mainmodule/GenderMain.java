package com.ifelse.mainmodule;


import com.ifelse.gendermodule.GenderDeciderFactoryImpl;
import com.ifelse.highlevel.GenderDeciderFactory;
import com.ifelse.highlevel.SomeHighLevelLogic;

public class GenderMain {

  public static void main(String[] args) {
    GenderDeciderFactory factory = new GenderDeciderFactoryImpl();
    SomeHighLevelLogic logic = new SomeHighLevelLogic(factory);

    int selection = 3;
    logic.printGender(selection);
  }

}
