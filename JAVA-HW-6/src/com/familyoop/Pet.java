package com.familyoop;

import java.util.Arrays;

public abstract class Pet {
  private String nickname;
  private int age;
  private int trickLevel;
  private String[] habits;


  public Pet(String nickname) {
    this.nickname = nickname;
  }

  public Pet() {
  }

  public Pet(String nickname, int age, int trickLevel, String[] habits) {
    this.nickname = nickname;
    this.age = age;
    this.trickLevel = trickLevel;
    this.habits = habits;
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

  public String[] getHabits() {
    return habits;
  }

  public void setHabits(String[] habits) {
    this.habits = habits;
  }

  @Override
  public String toString() {
    return (getSpecies() == null ? Species.UNKNOWN : getSpecies()) + "{nickname="
            + this.getNickname() + ", age="
            + this.getAge() + ", trickLevel="
            + this.getTrickLevel() + ", habits="
            + Arrays.toString(this.getHabits()) + "}";
  }

  public void eat() {
    System.out.println("I am eating!");
  }

  public abstract void respond();

  public abstract String getSpecies();

  @Override
  protected void finalize() {
    System.out.println(this.toString() + "was deleted");
  }
}
