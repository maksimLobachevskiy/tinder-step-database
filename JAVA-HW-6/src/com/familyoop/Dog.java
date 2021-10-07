package com.familyoop;

public class Dog extends Pet implements FoulHabits {

  private final String species = Species.DOG.toString();

  public Dog(String nickname, int age, int trickLevel, String[] habits) {
    super(nickname, age, trickLevel, habits);

  }

  @Override
  public void foul() {
    System.out.println("I need to cover up tracks properly, so none find my bone!");
  }

  @Override
  public void respond() {
    System.out.println("Woof-woof! I am - " + getNickname() + ". I can wag my tail when I see my " +
            "master !");
  }

  @Override
  public String getSpecies() {
    return this.species;
  }
}
