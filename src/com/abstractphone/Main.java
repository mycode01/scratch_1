package com.abstractphone;

public class Main {

  public static void main(String[] args) {
//    Phone p1 = new Phone(new RegularPolicy(new Money(10d), 10l));
//    Phone p2 = new Phone(new NightlyDiscountPolicy(new Money(5d), new Money(10), 10l));
//    System.out.println(p1.calculateFee().getValue());
//    System.out.println(p2.calculateFee().getValue());
    Phone p3 = new Phone(
        new TexablePolicy(0.05,
            new RegularPolicy(new Money(10d), 10l)));

    Phone p4 = new Phone(
        new TexablePolicy(0.05,
            new NightlyDiscountPolicy(new Money(5d), new Money(10), 10l)));

    Phone p5 = new Phone(
        new RateDiscountAblePolicy(new Money(1000d),
            new TexablePolicy(0.05,
                new RegularPolicy(new Money(10d), 10l))));

    Phone p6 = new Phone(
        new RateDiscountAblePolicy(new Money(1000d),
            new TexablePolicy(0.05,
                new NightlyDiscountPolicy(new Money(5d), new Money(10), 10l))));

  }
}
