package com.abstractphone;

public class RateDiscountAblePolicy extends AdditionalRatePolicy{
  private Money discountAmount;

  public RateDiscountAblePolicy(Money discountAmount, RatePolicy next) {
    super(next);
    this.discountAmount = discountAmount;
  }

  @Override
  protected Money afterCalculated(Money fee) {
    return fee.minus(discountAmount);
  }
}
