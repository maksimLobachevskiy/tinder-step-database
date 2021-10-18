package com.familyoop.service;

import com.familyoop.dao.CollectionFamilyDao;
import com.familyoop.dao.FamilyDao;
import com.familyoop.human.Family;
import com.familyoop.human.Human;
import com.familyoop.human.Man;
import com.familyoop.human.Woman;
import com.familyoop.pets.Pet;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class FamilyService {
  private final FamilyDao familyDao;

  public FamilyService() {
    familyDao = new CollectionFamilyDao();
  }


  public List<Family> getAllFamilies() {
    return familyDao.getAllFamilies();
  }

  public void displayAllFamilies() {
    List<Family> allFamilies = this.getAllFamilies();
    System.out.println("All current families: " + allFamilies);
  }

  public Family createNewFamily(Human mother, Human father) {

    return familyDao.saveFamily(new Family(mother, father));
  }

  public void getFamiliesBiggerThan(int number) {
    for (Family p : this.getAllFamilies()) {
      if (p.countFamily(p) > number) {
        System.out.println("Families with members bigger than: " + number + " - \n" + p);
      }
    }
  }

  public void getFamiliesLessThan(int number) {
    for (Family p : this.getAllFamilies()) {
      if (p.countFamily(p) < number) {
        System.out.println("Families with members less than: " + number + " - \n" + p);
      }
    }
  }

  public int countFamiliesWithMemberNumber(int number) {
    List<Family> families = new ArrayList<>();
    for (Family p : this.getAllFamilies()) {
      if (p.countFamily(p) == number) {
        families.add(p);
      }
    }
    return families.size();
  }

  public void deleteFamilyByIndex(int index) {
    familyDao.deleteFamily(index);
  }

  public int count() {
    return this.getAllFamilies().size();
  }

  public Family getFamilyById(int index) {
    return familyDao.getFamilyByIndex(index);
  }

  public Set<Pet> getPets(int index) {
    Family family = familyDao.getFamilyByIndex(index);
    return family.getPet();
  }

  public void addPet(int index, Pet pet) {
    Family family = familyDao.getFamilyByIndex(index);
    family.getPet().add(pet);
  }

  public Family bornChild(Family family, String boy, String girl) {
    int selectChild = (int) (Math.random() * 2);
    List<Human> children = family.getChildren();
    if (selectChild == 0) {
      family.getChildren().add(new Man(boy, family.getFather().getSurname(), 2021));
    } else {
      family.getChildren().add(new Woman(girl, family.getFather().getSurname(), 2021));
    }
    family.setChildren(children);

    return family;
  }

  public Family adoptChild(Family family, Human child) {
    family.addChild(child);
    return family;
  }

  public void deleteAllChildrenOlderThen(int age) {
    for (Family family : this.getAllFamilies()) {
      List<Human> children = family.getChildren();
      children.removeIf(child -> (LocalDate.now().getYear() - child.getYear()) > age);
    }
  }
}
