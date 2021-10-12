package com.familyoop.human;

import com.familyoop.pets.Pet;

import java.util.Map;

public final class Man extends Human {

  private Family family;

  public Man(String name, String surname, int year) {
    super(name, surname, year);
  }

  public Man(String name, String surname, int year, int iq, Map<DayOfWeek, String> schedule) {

    super(name, surname, year, iq, schedule);
  }

  public Man() {
    super();
  }


  public void setFamily(Family family) {
    this.family = family;
  }

  @Override
  public void greetPet(Pet pet) {
    System.out.println("Hi " + pet.getNickname());
  }

  @Override
  public void greetAllPet() {
    System.out.println(this.getName() + " says: ");
    for (Pet p : this.family.getPet()) {
      System.out.println("- Hi " + p.getNickname() + " ");
    }
  }

  @Override
  public String toString() {
    return "Man{name=" + getName() + ", surname="
            + getSurname() + ", year=" + getYear()
            + ", iq=" + getIq() + ", schedule" + getSchedule() + "}";
  }

  public void repairCar() {
    System.out.println("I need to repair my car on " + DayOfWeek.SATURDAY);
  }
}
