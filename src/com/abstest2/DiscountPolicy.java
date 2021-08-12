package com.abstest2;

public enum DiscountPolicy implements Discountable {
  /** 네이버 할인 */
  NAVER(10, 0L) {
    @Override
    public long getDiscountAmt(long originAmt) {
      return originAmt * getDiscountRate() / 100;
    }
  },
  /** 다나와 할인 */
  DANAWA(15, 0L) {
    @Override
    public long getDiscountAmt(long originAmt) {
      return originAmt * this.getDiscountRate() / 100;
    }
  },
  /** 팬카페 할인 */
  FANCAFE(0, 1000L) {
    @Override
    public long getDiscountAmt(long originAmt) {
      if (originAmt < getDiscountAmt())
        return originAmt;
      return getDiscountAmt();
    }
  }
  ;
  private final int discountRate;
  private final long discountAmt;

  public int getDiscountRate(){return discountRate;}
  public long getDiscountAmt(){return discountAmt;}

  DiscountPolicy(int discountRate, long discountAmt) {
    this.discountRate = discountRate;
    this.discountAmt = discountAmt;
  }
}
