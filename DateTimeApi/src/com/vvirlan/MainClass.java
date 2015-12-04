package com.vvirlan;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;

public class MainClass {
  public static void main(String[] args) {
    new MainClass().go();
  }

  private void go() {
    LocalDateTime localDateTime = LocalDateTime.now();
    System.out.println("LocalDateTime.now = " + localDateTime);

    LocalDate localDate = localDateTime.toLocalDate();
    System.out.println("ldt.toLocalDate() = " + localDate);
    Month mont = localDateTime.getMonth();
    System.out.println("Month is : "+mont);
    System.out.println("Day of monts: "+localDateTime.getDayOfMonth());
    

    System.out.println("LocalDate.of(2015, 12, 04) = " + LocalDate.of(2015, 12, 04));
    System.out.println("LocalTime.of(20,59) = " + LocalTime.of(20, 59));
    System.out.println("LocalTime.parse(12:10:55) = " + LocalTime.parse("12:10:55"));

    LocalDateTime thefuture = localDateTime.withDayOfMonth(22).withDayOfYear(200).plus(10, ChronoUnit.CENTURIES);
    System.out.println(thefuture);
   
  }

 
}
