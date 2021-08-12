package com.abstractphone;

public class TexablePolicy extends AdditionalRatePolicy{
  private double taxRatio;

  public TexablePolicy(double taxRatio, RatePolicy next) {
    super(next);
    this.taxRatio = taxRatio;
  }


  @Override
  protected Money afterCalculated(Money fee) {
    return fee.plus(fee.times(taxRatio));
  }
}
