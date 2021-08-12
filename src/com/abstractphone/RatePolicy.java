package com.abstractphone;

public interface RatePolicy {
  Money calculateFee(Phone p);

}
