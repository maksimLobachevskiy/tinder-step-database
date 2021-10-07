package com.familyoop;

public class Fish extends Pet {

  private final String species = Species.FISH.toString();

  public Fish(String nickname, int age, int trickLevel, String[] habits) {
    super(nickname, age, trickLevel, habits);
  }

  @Override
  public void respond() {
    System.out.println("Glug-glug!. I am - " + getNickname() + ". I can't talk, I'm the fish!");
  }

  @Override
  public String getSpecies() {
    return this.species;
  }
}
