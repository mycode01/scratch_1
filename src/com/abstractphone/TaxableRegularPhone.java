//package com.abstractphone;
//
//public class TaxableRegularPhone extends RegularPhone{
//  private double taxRate;
//
//  public TaxableRegularPhone(Money amount, Long seconds, double taxRate) {
//    super(amount, seconds);
//    this.taxRate = taxRate;
//  }
//  @Override
//  protected Money afterCalculated(Money fee){
//    return fee.plus(fee.times(taxRate));
//  }
//}
