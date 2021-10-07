package com.familyoop;

public enum Species {
  FISH("Fish"),
  DOMESTIC_CAT("DomesticCat"),
  DOG("Dog"),
  ROBO_CAT("RoboCat"),
  UNKNOWN("Unknown");

  private final String name;

  Species(String s) {
    name = s;
  }

  public String toString() {
    return this.name;
  }

}