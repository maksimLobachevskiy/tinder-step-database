package com.familyoop.human;

import com.familyoop.pets.Pet;

import java.io.Serializable;
import java.util.*;

public class Family implements Serializable {
  private Human mother;
  private Human father;
  private List<Human> children = new ArrayList<>();
  private Set<Pet> pet;

  public Family(Human mother, Human father) {
    this.mother = mother;
    this.mother.setFamily(this);
    this.father = father;
    this.father.setFamily(this);
    this.children = new ArrayList<>();
    this.pet = new HashSet<>();
  }

  public Family(Human mother, Human father, Human child) {
    this.mother = mother;
    this.mother.setFamily(this);
    this.father = father;
    this.father.setFamily(this);
    this.addChild(child);
    this.pet = new HashSet<>();
  }

  public Family(Human mother, Human father, List<Human> children, Set<Pet> pet) {
    this.mother = mother;
    this.mother.setFamily(this);
    this.father = father;
    this.father.setFamily(this);
    this.pet = pet;
    this.children = children;
  }

  public void setMother(Human mother) {
    this.mother = mother;
  }

  public Human getMother() {
    return mother;
  }

  public void setFather(Human father) {
    this.father = father;
  }

  public Human getFather() {
    return father;
  }

  public List<Human> getChildren() {
    return children;
  }

  public void setChildren(List<Human> children) {
    this.children = children;
  }

  public Set<Pet> getPet() {
    return pet;
  }

  public void setPet(Set<Pet> pet) {
    this.pet = pet;
  }

  public void addChild(Human child) {
    this.children.add(child);
  }

  public boolean deleteChild(int childIndex) {
    this.children.remove(childIndex);
    return true;
  }

  public Human deleteChild(Human child) {
    this.children.remove(child);
    return child;
  }


  public int countFamily(Family family) {
    return family.getChildren().size() + 2;
  }

  @Override
  public String toString() {
    return "This is the family of " + father.getSurname() + "\nMother: " + mother.toString() + " " +
            "\nFather: "
            + father.toString()
            + " \nChildren: "
            + (children.size() == 0 ? "No children in this Family" : children)
            + " \nPets: "
            + (pet == null ? "No pets in this Family" : pet);
  }

  public void describePet(Pet pet) {
    System.out.println("We have a(an) "
            + pet.getNickname()
            + ", he is " + pet.getAge()
            + " years old, he is " + (pet.getTrickLevel() <= 50 ? "almost not tricky" :
            "very tricky"));
  }

  public String describeAllPets() {
    //System.out.println("Our family has such marvelous pets: ");
    for (Pet p : getPet()) {
      p.prettyFormat();
    }
    return Arrays.toString(this.pet.toArray());
  }

  public String prettyFormat() {
    return String.format("Family of %s: \nmother: %s\nfather:%s\nchildren:%s\npets:%s\n", this.father.getSurname(),
            this.mother.prettyFormat(),
            this.father.prettyFormat(), this.children, this.describeAllPets());
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
    if (!(obj instanceof Family myFamily))
      return false;
    return (mother.hashCode() == myFamily.getMother().hashCode());
  }

  @Override
  protected void finalize() {
    System.out.println(this.toString() + "was deleted");
  }
}