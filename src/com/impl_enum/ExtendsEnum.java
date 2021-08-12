package com.impl_enum;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public enum ExtendsEnum implements Operations{
  VALUE1{
    @Override
    public String getValue() {
      return "value1";
    }
  },

  VALUE2{
    @Override
    public String getValue() {
      return "value2";
    }
  };

  @Override
  public String getValue() {
    throw new NotImplementedException();
  }
}
