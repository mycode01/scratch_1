package com.abstractphone;

public abstract class BasicRatePolicy implements RatePolicy {

  @Override
  public Money calculateFee(Phone p){
    Money result = Money.ZERO;
    for (Call call : p.getCalls()) {
      result = result.plus(calculateCallFee(call));
    }
    return result;
  }
  abstract protected Money calculateCallFee(Call call);
}
