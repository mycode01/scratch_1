package com.abstest9;

public class TestDto1 implements Cell {

  private String key;

  public void setKey(String key) {
    this.key = key;
  }

  public void setValue(String value) {
    this.value = value;
  }

  private String value;

  public String getKey() {
    return key;
  }
  public String getValue(){
    return value;
  }
}
