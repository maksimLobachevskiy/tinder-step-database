package com.family;

import java.util.Arrays;

public class Pet {
  private Species species;
  private String nickname;
  private int age;
  private int trickLevel;
  private String[] habits;

  public Pet(Species species, String nickname) {
    this.species = species;
    this.nickname = nickname;
  }

  public Pet(Species species, String nickname, int age, int trickLevel, String[] habits) {
    this.species = species;
    this.nickname = nickname;
    this.age = age;
    this.trickLevel = trickLevel;
    this.habits = habits;
  }

  public Pet() {

  }

  public void setSpecies(Species species) {
    this.species = species;
  }

  public void setNickname(String nickname) {
    this.nickname = nickname;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public void setTrickLevel(int trickLevel) {
    this.trickLevel = trickLevel;
  }

  public void setHabits(String[] habits) {
    this.habits = habits;
  }

  public Species getSpecies() {
    return species;
  }

  public String getNickname() {
    return nickname;
  }

  public int getAge() {
    return age;
  }

  public int getTrickLevel() {
    return trickLevel;
  }

  public String[] getHabits() {
    return habits;
  }

  @Override
  public String toString() {
    return this.getSpecies() + "{nickname="
            + this.getNickname() + ", age="
            + this.getAge() + ", trickLevel="
            + this.getTrickLevel() + ", habits="
            + Arrays.toString(this.getHabits()) + "}";
  }

  public void eat() {
    System.out.println("I am eating!");
  }

  public void respond() {
    System.out.println("Hi, master. I - " + nickname + ". I missed you!");
  }

  public void foul() {
    System.out.println("I need to cover up tracks properly...");
  }

  @Override
  public int hashCode() {
    return Arrays.deepHashCode(this.getHabits());
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (!(obj instanceof Pet))
      return false;
    Pet newPet = (Pet) obj;
    return (Arrays.deepHashCode(habits) == Arrays.deepHashCode(this.getHabits()));
  }

  @Override
  protected void finalize() {
    System.out.println(this.toString() + "was deleted");
  }

}