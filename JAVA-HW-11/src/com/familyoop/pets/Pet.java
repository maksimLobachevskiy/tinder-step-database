package com.familyoop.pets;

import java.util.Set;

public abstract class Pet {
  private String nickname;
  private int age;
  private int trickLevel;
  private Set<String> habits;
  private Species species;


  public Pet(String nickname) {
    this.nickname = nickname;
  }

  public Pet() {
  }

  public Pet(String nickname, int age, int trickLevel, Set<String> habits) {
    this.nickname = nickname;
    this.age = age;
    this.trickLevel = trickLevel;
    this.habits = habits;
    this.species = Species.UNKNOWN;
  }

  public String getNickname() {
    return nickname;
  }

  public void setNickname(String nickname) {
    this.nickname = nickname;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public int getTrickLevel() {
    return trickLevel;
  }

  public void setTrickLevel(int trickLevel) {
    this.trickLevel = trickLevel;
  }

  public void setSpecies(Species species) {
    this.species = species;
  }

  public Species getSpecies() {
    return species;
  }

  ;

  public Set<String> getHabits() {
    return habits;
  }

  public void setHabits(Set<String> habits) {
    this.habits = habits;
  }

  @Override
  public String toString() {
    return this.getSpecies() + "{nickname="
            + this.getNickname() + ", age="
            + this.getAge() + ", trickLevel="
            + this.getTrickLevel() + ", habits="
            + this.getHabits() + "}";
  }

  public String prettyFormat() {
    return String.format("species=%s, nickname=%s, age=%d, trickLevel=%d, habits=%s", this.getSpecies(), this.getNickname(),
            this.getAge(), this.getTrickLevel(), this.getHabits());
  }


  public void eat() {
    System.out.println("I am eating!");
  }

  public abstract void respond();

  @Override
  protected void finalize() {
    System.out.println(this.toString() + "was deleted");
  }
}
