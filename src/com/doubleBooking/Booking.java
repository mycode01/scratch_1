package com.doubleBooking;

import java.util.Date;
import jdk.nashorn.internal.objects.annotations.Getter;
import jdk.nashorn.internal.objects.annotations.Setter;

public class Booking {
  Date start;
  Date end;
//  boolean isExisting;

  public Date getStart() {
    return start;
  }

  public Date getEnd() {
    return end;
  }

  public Booking(Date start, Date end){
    this.start = start;
    this.end = end;
  }
}
