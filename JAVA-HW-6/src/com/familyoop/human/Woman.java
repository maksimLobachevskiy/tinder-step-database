package com.familyoop.human;

import java.util.Arrays;

public class Woman extends Human {
private Family family;

  public Woman(String name, String surname, int year) {
    super(name, surname, year);
  }

  public Woman(String name, String surname, int year, int iq, String[][] schedule) {
    super(name, surname, year, iq, schedule);
  }

  public void setFamily(Family family){
    this.family = family;
  }

  @Override
  public void greetPet() {
    System.out.println("Hello my lovely " + this.family.getPet().getNickname());
  }

  @Override
  public String toString() {
    return "Woman{name=" + getName() + ", surname="
            + getSurname() + ", year=" + getYear()
            + ", iq=" + getIq() + ", schedule" + Arrays.deepToString(getSchedule()) + "}";
  }

  public void manicure() {
    System.out.println("I have to make an appointment for a manicure on " + DayOfWeek.MONDAY);
  }

}
