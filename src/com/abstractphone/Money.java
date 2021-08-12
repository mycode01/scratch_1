package com.abstractphone;

public class Money {
  public static Money ZERO = new Money(0);
  private final double value;

  public Money(double v){
    this.value = v;
  }
  public double getValue(){
    return this.value;
  }

  public Money plus(Money m){
    return new Money(this.value + m.getValue());
  }
  public Money minus(Money m){
    return new Money(this.value - m.getValue());
  }
  public Money times(Money m){
    return new Money(this.value * m.getValue());
  }
  public Money times(Double d){
    return new Money(this.value * d);
  }
  public Money times(Long l){
    return new Money(this.value * l);
  }
  private static final long serialVersionUID = -917277439224525746L;

}
