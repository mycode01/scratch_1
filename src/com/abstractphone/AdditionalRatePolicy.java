package com.abstractphone;

public abstract class AdditionalRatePolicy implements RatePolicy{
  private RatePolicy next;

  public AdditionalRatePolicy(RatePolicy next){
    this.next = next;
  }

  @Override
  public Money calculateFee(Phone p){
    Money fee = next.calculateFee(p);
    return afterCalculated(fee);
  }
  abstract protected Money afterCalculated(Money fee);
//데코레이터?
}
