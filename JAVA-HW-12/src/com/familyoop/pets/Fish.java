package com.familyoop.pets;

import java.util.Arrays;
import java.util.Set;

public class Fish extends Pet {

  private final Species species;

  public Fish(String nickname, int age, int trickLevel, Set<String> habits) {

    super(nickname, age, trickLevel, habits);
    this.species = Species.FISH;
  }

  @Override
  public void respond() {
    System.out.println("Glug-glug!. I am - " + getNickname() + ". I can't talk, I'm the fish!");
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
