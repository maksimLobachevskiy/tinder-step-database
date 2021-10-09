package com.familyoop;

import java.util.Arrays;

public class Fish extends Pet {

  private final Species species = Species.FISH;

  public Fish(String nickname, int age, int trickLevel, String[] habits) {
    super(nickname, age, trickLevel, habits);
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
            + Arrays.toString(this.getHabits()) + "}";
  }


}
