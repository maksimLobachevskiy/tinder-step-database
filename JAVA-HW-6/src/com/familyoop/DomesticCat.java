package com.familyoop;

import java.util.Arrays;

public class DomesticCat extends Pet implements FoulHabits {
  private final Species species = Species.DOMESTIC_CAT;

  public DomesticCat(String nickname, int age, int trickLevel, String[] habits) {
    super(nickname, age, trickLevel, habits);
  }

  @Override
  public void foul() {
    System.out.println("I need to cover up tracks properly, so the master can't see I've broken his vase!");
  }

  @Override
  public void respond() {
    System.out.println("Miaow-miaow! I am - " + getSpecies() + ". I like to scratch wallpapers!");
  }

  @Override
  public String toString() {
    return this.species + "{nickname="
            + this.getNickname() + ", age="
            + this.getAge() + ", trickLevel="
            + this.getTrickLevel() + ", habits="
            + Arrays.toString(this.getHabits()) + "}";
  }
}
