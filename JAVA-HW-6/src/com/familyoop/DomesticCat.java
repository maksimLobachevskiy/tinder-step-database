package com.familyoop;

public class DomesticCat extends Pet implements FoulHabits {
  private final String species = Species.DOMESTIC_CAT.toString();

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
  public String getSpecies() {
    return this.species;
  }
}
