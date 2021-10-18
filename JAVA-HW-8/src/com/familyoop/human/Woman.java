package com.familyoop.human;

import com.familyoop.pets.Pet;

import java.util.Map;

public class Woman extends Human {
  private Family family;

  public Woman(String name, String surname, int year) {
    super(name, surname, year);
  }

  public Woman(String name, String surname, int year, int iq, Map<DayOfWeek, String> schedule) {
    super(name, surname, year, iq, schedule);
  }

  public void setFamily(Family family) {
    this.family = family;
  }

  @Override
  public void greetPet(Pet pet) {
    System.out.println("Hello my lovely " + pet.getNickname());
  }

  @Override
  public void greetAllPet() {
    for (Pet p : this.family.getPet()) {
      System.out.println("Hi " + p.getNickname() + " ");
    }
  }

  @Override
  public String toString() {
    return "Woman{name=" + getName() + ", surname="
            + getSurname() + ", year=" + getYear()
            + ", iq=" + getIq() + ", schedule" + getSchedule() + "}";
  }

  public void manicure() {
    System.out.println("I have to make an appointment for a manicure on " + DayOfWeek.MONDAY);
  }

}
