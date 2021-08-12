package com.abstest;

import com.abstest.Discountable.DanawaDiscountPolicy;
import com.abstest.Discountable.FancafeDiscountPolicy;
import com.abstest.Discountable.NaverDiscountPolicy;

public class PaymentService {

  // 실시간 할인내역 확인
  public Discount getDiscount() {
    // 상품금액
    long productAmt = 30000;
    // 할인코드 (NAVER:네이버검색-10%, DANAWA:다나와검색-15% FANCAFE:팬카페-1000원)
    String discountCode = "NAVER";

    // 할인금액
    long discountAmt = 0;
    //region version 1
//    if ("NAVER".equals(discountCode)) {   // 네이버검색 할인
//      discountAmt = Math.round(productAmt * 0.1);
//    } else if ("DANAWA".equals(discountCode)) { // 다나와검색 할인
//      discountAmt = Math.round(productAmt * 0.15);
//    } else if ("FANCAFE".equals(discountCode)) {  // 팬카페인입 할인
//      if (productAmt < 1000)  // 할인쿠폰 금액보다 적은경우
//        discountAmt = productAmt;
//      else
//        discountAmt = 1000;
//    }
    //endregion
    //region version 2
//    discountAmt = getDiscountAmt(discountCode, productAmt);
    //endregion
    //region version 3
    Discountable discountPolicy = getDiscounter(discountCode);
    System.out.println(discountPolicy.getClass().getSimpleName());
    discountAmt = discountPolicy.getDiscountAmt(productAmt);
    //endregion
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
    //region version 1
//    if ("NAVER".equals(discountCode)) {   // 네이버검색 할인
//      paymentAmt = Math.round(productAmt * 0.9);
//    } else if ("DANAWA".equals(discountCode)) { // 다나와검색 할인
//      paymentAmt = Math.round(productAmt * 0.85);
//    } else if ("FANCAFE".equals(discountCode)) {  // 팬카페인입 할인
//      if (productAmt < 1000)  // 할인쿠폰 금액보다 적은경우
//        paymentAmt = 0;
//      else
//        paymentAmt = productAmt - 1000;
//    } else {
//      paymentAmt = productAmt;
//    }
    //endregion
    //region version 2
//    paymentAmt = productAmt - getDiscountAmt(discountCode, productAmt);
    //endregion
    //region version
    Discountable discountPolicy = getDiscounter(discountCode);
    paymentAmt = productAmt - discountPolicy.getDiscountAmt(productAmt);
    //endregion
    System.out.println(paymentAmt);
  }

  private Discountable getDiscounter(String discountCode) {
    if ("NAVER".equals(discountCode)) {   // 네이버검색 할인
      return new NaverDiscountPolicy();
    } else if ("DANAWA".equals(discountCode)) { // 다나와검색 할인
      return new DanawaDiscountPolicy();
    } else if ("FANCAFE".equals(discountCode)) {  // 팬카페 할인
      return new FancafeDiscountPolicy();
    } else {
      return Discountable.NONE;
    }
  }

  //region version 2
  private long getDiscountAmt(String discountCode, long productAmt) {
    long discountAmt = 0;
    if ("NAVER".equals(discountCode)) {   // 네이버검색 할인
      discountAmt = Math.round(productAmt * 0.1);
    } else if ("DANAWA".equals(discountCode)) { // 다나와검색 할인
      discountAmt = Math.round(productAmt * 0.15);
    } else if ("FANCAFE".equals(discountCode)) {  // 팬카페인입 할인
      if (productAmt < 1000)  // 할인쿠폰 금액보다 적은경우
        discountAmt = productAmt;
      else
        discountAmt = 1000;
    }
    return discountAmt;
  }
  //endregion

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
