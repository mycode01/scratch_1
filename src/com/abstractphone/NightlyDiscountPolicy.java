package com.abstractphone;

public class NightlyDiscountPolicy extends BasicRatePolicy{
  private static final int LATE_NIGHT_HOUR = 22;

  private Money nightlyAmount;
  private Money regularAmount;
  private Long seconds;

  public NightlyDiscountPolicy(Money nightlyAmount, Money regularAmount, Long seconds) {
    this.nightlyAmount = nightlyAmount;
    this.regularAmount = regularAmount;
    this.seconds = seconds;
  }

  @Override
  protected Money calculateCallFee(Call call) {
    if (call.getHour() >= LATE_NIGHT_HOUR) {
      return nightlyAmount.times(call.getDuration() / seconds);
    } else {
      return regularAmount.times(call.getDuration() / seconds);
    }
  }
}
