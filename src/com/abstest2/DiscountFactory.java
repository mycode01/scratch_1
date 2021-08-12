package com.abstest2;

interface DiscounterFactory {
  Discountable getDiscounter(String discountCode);
}

class SimpleDiscounterFactory implements DiscounterFactory {
  @Override
  public Discountable getDiscounter(String discountCode) {
//    if ("NAVER".equals(discountCode)) {   // 네이버검색 할인
//      return new NaverDiscountPolicy();
//    } else if ("DANAWA".equals(discountCode)) { // 다나와검색 할인
//      return new DanawaDiscountPolicy();
//    } else if ("FANCAFE".equals(discountCode)) {  // 팬카페 할인
//      return new FancafeDiscountPolicy();
//    } else {
      return Discountable.NONE;
//    }
  }
}