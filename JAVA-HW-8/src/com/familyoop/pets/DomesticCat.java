package com.familyoop.pets;

import java.util.Arrays;
import java.util.Set;

public class DomesticCat extends Pet implements FoulHabits {
  private final Species species;

  public DomesticCat(String nickname, int age, int trickLevel, Set<String> habits) {

    super(nickname, age, trickLevel, habits);
    this.species = Species.DOMESTIC_CAT;
  }

  @Override
  public void foul() {
    System.out.println("I need to cover up tracks properly, so the master can't see I've broken his vase!");
  }

  @Override
  public void respond() {
    System.out.println("Miaow-miaow! I am - " + this.species + ". I like to scratch wallpapers!");
  }

  @Override
  public String toString() {
    return this.species + "{nickname="
            + this.getNickname() + ", age="
            + this.getAge() + ", trickLevel="
            + this.getTrickLevel() + ", habits="
            + this.getHabits() + "}";
  }
}
