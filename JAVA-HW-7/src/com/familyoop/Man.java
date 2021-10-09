package com.familyoop;

import java.util.Arrays;

public final class Man extends Human {

  private Family family;
  public Man(String name, String surname, int year) {
    super(name, surname, year);
  }

  public Man(String name, String surname, int year, int iq, String[][] schedule) {
    super(name, surname, year, iq, schedule);
  }

  public Man() {
    super();
  }


  public void setFamily(Family family){
    this.family = family;
  }

 @Override
  public void greetPet() {
    System.out.println("Hi " + this.family.getPet().getNickname());
  }

  @Override
  public String toString() {
    return "Man{name=" + getName() + ", surname="
            + getSurname() + ", year=" + getYear()
            + ", iq=" + getIq() + ", schedule" + Arrays.deepToString(getSchedule()) + "}";
  }

  public void repairCar() {
    System.out.println("I need to repair my car on " + DayOfWeek.SATURDAY);
  }
}
