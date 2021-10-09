package com.familyoop;

import java.util.Arrays;

public class RoboCat extends Pet implements FoulHabits {
  private final Species species = Species.ROBO_CAT;

  public RoboCat(String nickname, int age, int trickLevel, String[] habits) {
    super(nickname, age, trickLevel, habits);
  }

  @Override
  public void foul() {
    System.out.println("I am a RoboCat and I don't harm in the house");
  }

  @Override
  public void respond() {
    System.out.println("H-e-l-l-o M-a-s-t-e-r, I a-m a " + getSpecies());
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
