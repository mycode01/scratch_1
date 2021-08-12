package com.abstractphone;

public class RegularPolicy extends BasicRatePolicy {

  private Money amount;
  private Long seconds;

  public RegularPolicy(Money amount, Long seconds){
    this.amount = amount;
    this.seconds = seconds;
  }

  @Override
  protected Money calculateCallFee(Call call) {
    return amount.times(call.getDuration()/ seconds);
  }
}
