package com.abstest2;

import com.abstest2.Discountable;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class PaymentService {

  DiscounterFactory discounterFactory = new SimpleDiscounterFactory();
  // 실시간 할인내역 확인
  public Discount getDiscount() {
    // 상품금액
    long productAmt = 30000;
    // 할인코드 (NAVER:네이버검색-10%, DANAWA:다나와검색-15% FANCAFE:팬카페-1000원)
    String discountCode = "NAVER";

    // 할인금액
    long discountAmt = 0;

    Discountable discountPolicy = getDiscounter(discountCode);
    discountAmt = discountPolicy.getDiscountAmt(productAmt);

    return Discount.of(discountAmt);
  }

  // 결제처리
  public void payment() {
    // 상품금액
    long productAmt = 30000;
    // 할인코드 (NAVER:네이버검색-10%, DANAWA:다나와검색-15% FANCAFE:팬카페-1000원)
    String discountCode = "NAVER";

    // 결제금액
    long paymentAmt = 0;

    Discountable discountPolicy = getDiscounter(discountCode);
    paymentAmt = productAmt - discountPolicy.getDiscountAmt(productAmt);

    System.out.println(paymentAmt);
  }

  private Discountable getDiscounter(String discountCode) {
    if (discountCode == null)
      return Discountable.NONE;
    try {
      return DiscountPolicy.valueOf(discountCode);
    } catch (IllegalArgumentException iae) {
      throw new NotImplementedException();
    }
  }


//  private Discountable getDiscounter(String discountCode) {
//    return discounterFactory.getDiscounter(discountCode);
//  }

  public static class Discount{
    long discountAmt ;
    public long getDiscountAmt(){return discountAmt;}
    public Discount(long discountAmt){this.discountAmt = discountAmt;}
    public static Discount of(long discountAmt){
      return new Discount(discountAmt);
    }

    @Override
    public String toString() {
      return String.valueOf(getDiscountAmt());
    }
  }
}
