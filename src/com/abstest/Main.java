package com.abstest;

public class Main {

  public static void main(String[] args) {
    PaymentService service = new PaymentService();

    System.out.println(service.getDiscount());
    service.payment();
  }
}
