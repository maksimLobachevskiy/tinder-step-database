package com.family;

public enum Species {
  DOG,
  CAT,
  PARROT,
  MOUSE,
  FISH;

  @Override
  public String toString() {
    return name().toLowerCase();
  }
}
