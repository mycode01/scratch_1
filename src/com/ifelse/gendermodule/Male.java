package com.ifelse.gendermodule;

import com.ifelse.highlevel.Gender;

public class Male implements Gender {

  @Override
  public String getGenderString() {
    return "male";
  }
}
