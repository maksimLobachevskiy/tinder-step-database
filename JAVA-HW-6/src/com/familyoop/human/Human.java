package com.familyoop.human;

import java.util.Arrays;

public class Human {
  private String name;
  private String surname;
  private int year;
  private int iq;
  private Family family;
  private String[][] schedule;

  public Human(String name, String surname, int year) {
    this.name = name;
    this.surname = surname;
    this.year = year;
  }

  public Human(String name, String surname, int year, int iq, String[][] schedule) {
    this.name = name;
    this.surname = surname;
    this.year = year;
    this.iq = iq;
    this.schedule = schedule;
  }

  public Human() {
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setSurname(String surname) {
    this.surname = surname;
  }

  public String getSurname() {
    return surname;
  }

  public void setYear(int year) {
    this.year = year;
  }

  public int getYear() {
    return year;
  }

  public void setIq(int iq) {
    this.iq = iq;
  }

  public int getIq() {
    return iq;
  }

  public void setFamily(Family family) {
    this.family = family;
  }

  public Family getFamily() {
    return family;
  }

  public String[][] getSchedule() {
    return schedule;
  }

  public void setSchedule(String[][] schedule) {
    this.schedule = schedule;
  }

  public void greetPet() {
    System.out.println("Hi, " + family.getPet().getNickname());
  }

  @Override
  public String toString() {
    return "Human{name=" + name + ", surname="
            + surname + ", year=" + year
            + ", iq=" + iq + ", schedule" + Arrays.deepToString(schedule) + "}";
  }

  @Override
  public int hashCode() {
    int schedule = Arrays.deepHashCode(this.schedule);
    int name = this.name.hashCode();
    return schedule + name;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (!(obj instanceof Human newHuman))
      return false;
    return (name.hashCode() == newHuman.getName().hashCode());
  }

  @Override
  protected void finalize() {
    System.out.println(this.toString() + "was deleted");
  }

}

