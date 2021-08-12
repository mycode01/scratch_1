package com.doubleBooking;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class Check {

  public static void main(String[] args) throws Exception {
    SimpleDateFormat format = new SimpleDateFormat("yyyyMMddHHmmss");
    Booking a = new Booking(format.parse("20200101000000"),format.parse("20200201000000"));
    Booking b = new Booking(format.parse("20200201000000"),format.parse("20200301000000"));
    Booking c = new Booking(format.parse("20200301000000"),format.parse("20200401000000"));
    Booking d = new Booking(format.parse("20200501000000"),format.parse("20200601000000"));

    List<Booking> existings = Arrays.asList(a,b,c,d);
    Booking newBook = new Booking(format.parse("20200302000000"),format.parse("20200603000000"));

    System.out.println(overlapsWithExisting(existings, newBook));


  }

  public static boolean overlapsWithExisting(List<Booking> existingBookings, Booking booking) {
    final Date early = booking.getStart();
    final Date late = booking.getEnd();
    for (Booking existing : existingBookings) {
      if (!(early.after(existing.getEnd()) || late.before(existing.getStart()))) {
        return true;
      }
    }
    return false;
  }
}
