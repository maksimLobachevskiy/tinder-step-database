package com.familyoop.human;

import com.familyoop.pets.Pet;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Map;
import java.util.Objects;

public class Human {
  private String name;
  private String surname;
  private long birthDate = new Date().getTime();
  private int iq;
  private Family family;
  private Map<DayOfWeek, String> schedule;


  public Human(String name, String surname, String birthDate) {
    this.name = name;
    this.surname = surname;
    this.birthDate = convertBirthDate(birthDate);
  }

  public Human(String name, String surname, String birthDate, int iq, Map<DayOfWeek, String> schedule) {
    this.name = name;
    this.surname = surname;
    this.birthDate = convertBirthDate(birthDate);
    this.iq = iq;
    this.schedule = schedule;
  }

  public Human() {
  }

  public Human(String name, String surname, String birthDate, int iq) {
    this.name = name;
    this.surname = surname;
    this.birthDate = convertBirthDate(birthDate);
    this.iq = iq;
  }

  public long getBirthDate() {
    return birthDate;
  }

  public void setBirthDate(long birthDate) {
    this.birthDate = birthDate;
  }

  public long convertBirthDate(String birthDay) {
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    LocalDate date = LocalDate.parse(birthDay, formatter);
    Date date2 = Date.from(date.atStartOfDay(ZoneId.systemDefault()).toInstant());
    return this.birthDate = date2.getTime();
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

  public Map<DayOfWeek, String> getSchedule() {
    return schedule;
  }

  public void setSchedule(Map<DayOfWeek, String> schedule) {
    this.schedule = schedule;
  }

  public String describeAge() {
    LocalDate today = LocalDate.now();
    LocalDate date = Instant.ofEpochMilli(this.birthDate)
            .atZone(ZoneId.systemDefault()).toLocalDate();
    LocalDate sdate = LocalDate.parse(today.toString());
    LocalDate pdate = LocalDate.parse(date.toString());
    LocalDate ssdate = LocalDate.of(sdate.getYear(), sdate.getMonth(), sdate.getDayOfMonth());
    LocalDate ppdate = LocalDate.of(pdate.getYear(), pdate.getMonth(), pdate.getDayOfMonth());
    Period period = Period.between(ppdate, ssdate);

    return getName() + "'s age is: " + period.getYears() + " years "
            + period.getMonths() + " months "
            + period.getDays() + " days ";
  }

  public String prettyFormat() {
    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
    return String.format("{name=%s, surname=%s, birthDate=%s, iq=%d, schedule=%s}", this.getName(), this.getSurname(),
            formatter.format(this.birthDate),
            this.getIq(), this.getSchedule());
  }

  @Override
  public String toString() {
    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
    return "Human{name=" + name + ", surname="
            + surname + ", birthday=" + formatter.format(this.birthDate)
            + ", iq=" + iq + ", schedule" + schedule + "}";
  }

  @Override
  public int hashCode() {
    int name = this.name.hashCode();
    return name;
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

  public void greetPet(Pet pet) {
    System.out.println("Hi, " + pet.getNickname());
  }

  public void greetAllPet() {
    for (Pet greet : family.getPet()) {
      System.out.println(greet);
    }
  }
}

