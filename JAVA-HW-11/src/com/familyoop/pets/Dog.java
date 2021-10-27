package com.familyoop.pets;

import java.util.Arrays;
import java.util.Set;

public class Dog extends Pet implements FoulHabits {
private final Species species;

public Dog(String nickname, int age, int trickLevel, Set<String> habits) {
    super(nickname, age, trickLevel, habits);
    this.species = Species.DOG;
  }

  @Override
  public void foul() {
    System.out.println("I need to cover up tracks properly, so none find my bone!");
  }

  @Override
  public void respond() {
    System.out.println("Woof-woof! I am - " + this.species + ". I can wag my tail when I see my " +
            "master !");
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
