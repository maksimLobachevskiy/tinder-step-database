package com.familyoop.human;

import com.familyoop.pets.Pet;

import java.text.SimpleDateFormat;
import java.util.Map;
import java.util.Objects;

public final class Man extends Human {

  private Family family;

  public Man(String name, String surname, String birthDate) {
    super(name, surname, birthDate);
  }

  public Man(String name, String surname, String birthDate, int iq) {
    super(name, surname, birthDate, iq);

  }

  public Man(String name, String surname, String birthDate, int iq, Map<DayOfWeek, String> schedule) {

    super(name, surname, birthDate, iq, schedule);
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
    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
    return "Man{name=" + getName() + ", surname="
            + getSurname() + ", birthday=" + formatter.format(getBirthDate())
            + ", iq=" + getIq() + ", schedule" + getSchedule() + "}";
  }


  public void repairCar() {
    System.out.println("I need to repair my car on " + DayOfWeek.SATURDAY);
  }
}
