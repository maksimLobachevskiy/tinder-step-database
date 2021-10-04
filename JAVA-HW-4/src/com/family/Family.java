package com.family;

import java.util.Arrays;

public class Family {
  private Human mother;
  private Human father;
  private Human[] children;
  private Pet pet;

  public Family(Human mother, Human father) {
    this.mother = mother;
    this.father = father;
    this.pet = new Pet("", "");
    this.children = new Human[]{};
    this.mother.setFamily(this);
    this.father.setFamily(this);
  }

  public Family(Human mother, Human father, Human[] children, Pet pet) {
    this.mother = mother;
    this.father = father;
    this.children = children;
    this.pet = pet;
  }

  public Human getMother() {
    return mother;
  }

  public Human getFather() {
    return father;
  }

  public Human[] getChildren() {
    return children;
  }

  public Pet getPet() {
    return pet;
  }

  public void setMother(Human mother) {
    this.mother = mother;
  }

  public void setFather(Human father) {
    this.father = father;
  }

  public void setChildren(Human[] children) {
    this.children = children;
  }

  public void setPet(Pet pet) {
    this.pet = pet;
  }

  public void addChild(Human[] children, Human child) {
    child.setFamily(this);
    Human[] newBornChildren = Arrays.copyOf(children, getChildren().length + 1);
    newBornChildren[newBornChildren.length - 1] = child;
    setChildren(newBornChildren);
  }

  public boolean deleteChild(int childIndex, Human[] children) {
    for (int i = childIndex; i < children.length - 1; i++) {
      children[i] = children[i + 1];
    }
    Human[] newChildren = Arrays.copyOf(children, children.length - 1);
    setChildren(newChildren);
    return true;
  }


  public void countFamily(Family family) {
    int familyNumber = family.getChildren().length + 2;
    System.out.println("The family consists of " + familyNumber + " members");
  }

  @Override
  public String toString() {
    return "This is the family of " + father.getSurname() + "\nMother: " + mother.toString() + " " +
            "\nFather: "
            + father.toString()
            + " \nChildren: "
            + Arrays.toString(children)
            + " \nPets: "
            + pet.toString();
  }

  public void greetPet() {
    System.out.println("Hi, " + this.getPet().getNickname());
  }


  @Override
  public int hashCode() {
    int mother = this.mother.hashCode();
    int father = this.father.hashCode();
    return mother + father;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (!(obj instanceof Family))
      return false;
    Family myFamily = (Family) obj;
    return (mother.hashCode() == myFamily.getMother().hashCode());
  }

  public void describePet() {
    System.out.println("We have a(an) "
            + getPet().getSpecies()
            + ", he is " + getPet().getAge()
            + " years old, he is " + (getPet().getTrickLevel() <= 50 ? "almost not tricky" :
            "very tricky"));
  }
}
