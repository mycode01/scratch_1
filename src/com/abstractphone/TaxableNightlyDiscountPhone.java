//package com.abstractphone;
//
//public class TaxableNightlyDiscountPhone extends NightlyDiscountPhone {
//
//  private double taxRate;
//
//
//  public TaxableNightlyDiscountPhone(Money nightlyAmount, Money regularAmount, Long seconds,
//      double taxRate) {
//    super(nightlyAmount, regularAmount, seconds);
//    this.taxRate = taxRate;
//  }
//
//  @Override
//  protected Money afterCalculated(Money fee) {
//    return fee.plus(fee.times(taxRate));
//  }
//// 중복되는 코드를 제거하기 위해서 메소드가 아니라 후킹 인터페이스를 추가하는건 어떨까
//
//}
