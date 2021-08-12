package com.ifelse.gendermodule;

import com.ifelse.highlevel.Gender;

public class Female implements Gender {

  @Override
  public String getGenderString() {
    return "female";
  }
}
