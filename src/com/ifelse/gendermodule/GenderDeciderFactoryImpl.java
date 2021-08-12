package com.ifelse.gendermodule;

import com.ifelse.highlevel.Gender;
import com.ifelse.highlevel.GenderDeciderFactory;

public class GenderDeciderFactoryImpl implements GenderDeciderFactory {

  @Override
  public Gender make(int selection) {
    if(selection == 0){
      return new Male();
    } else if (selection == 1){
      return new Female();
    }
    throw new UnsupportedOperationException("unknown gender");
  }
}
