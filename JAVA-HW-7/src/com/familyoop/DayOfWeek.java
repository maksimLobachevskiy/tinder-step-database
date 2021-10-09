package com.familyoop;

public enum DayOfWeek {
  MONDAY("Monday"),
  TUESDAY("Tuesday"),
  WEDNESDAY("Wednesday"),
  THURSDAY("Thursday"),
  FRIDAY("Friday"),
  SATURDAY("Saturday"),
  SUNDAY("Sunday");

  private final String name;

  DayOfWeek(String s) {
    name = s;
  }

  public String toString() {
    return this.name;
  }

}
