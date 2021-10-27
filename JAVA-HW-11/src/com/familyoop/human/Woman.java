package com.familyoop.human;

import com.familyoop.pets.Pet;

import java.text.SimpleDateFormat;
import java.util.Map;
import java.util.Objects;

public class Woman extends Human {
  private Family family;

  public Woman(String name, String surname, String birthDate) {
    super(name, surname, birthDate);
  }

  public Woman(String name, String surname, String birthDate, int iq, Map<DayOfWeek, String> schedule) {
    super(name, surname, birthDate, iq, schedule);
  }

  public Woman(String name, String surname, String birthDate, int iq) {
    super(name, surname, birthDate, iq);

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
    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");

    return "Woman{name=" + getName() + ", surname="
            + getSurname() + ", birthday=" + formatter.format(getBirthDate())
            + ", iq=" + getIq() + ", schedule" + getSchedule() + "}";
  }
  

  public void manicure() {
    System.out.println("I have to make an appointment for a manicure on " + DayOfWeek.MONDAY);
  }

}
