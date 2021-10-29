package com.familyoop.controller;

import com.familyoop.exceptions.FamilyOverflowException;
import com.familyoop.human.Family;
import com.familyoop.human.Human;
import com.familyoop.pets.Pet;
import com.familyoop.service.FamilyService;

import java.io.IOException;
import java.util.List;
import java.util.Set;

public class FamilyController {
  public FamilyService familyService;

  public FamilyController(FamilyService familyService) {
    this.familyService = familyService;
  }


  public List<Family> getAllFamilies() {
    return familyService.getAllFamilies();
  }

  public void displayAllFamilies() {
    familyService.displayAllFamilies();
  }

  public Family createNewFamily(Human mother, Human father) {
    return familyService.createNewFamily(mother, father);
  }

  public void getFamiliesBiggerThan(int number) {
    familyService.getFamiliesBiggerThan(number);
  }

  public void getFamiliesLessThan(int number) {
    familyService.getFamiliesLessThan(number);
  }

  public int countFamiliesWithMemberNumber(int number) {
    return familyService.countFamiliesWithMemberNumber(number);
  }

  public void deleteFamilyByIndex(int index) {
    familyService.deleteFamilyByIndex(index);
  }

  public int count() {
    return familyService.count();
  }

  public Family getFamilyById(int index) {
    return familyService.getFamilyById(index);
  }

  public Set<Pet> getPets(int index) {
    return familyService.getPets(index);
  }

  public void addPet(int index, Pet pet) {
    familyService.addPet(index, pet);
  }

  public Family bornChild(Family family, String boy, String girl) {
    try {
      if (familyService.count() > 4) {
        throw new FamilyOverflowException("You cannot born a child");
      }
    } catch (FamilyOverflowException foe) {
      System.out.println("You cannot born a child");
    }

    return familyService.bornChild(family, boy, girl);
  }

  public Family adoptChild(Family family, Human child) {
    try {
      if (familyService.count() > 4) {
        throw new FamilyOverflowException("You cannot adopt child");
      }
    } catch (FamilyOverflowException foe) {
      System.out.println("You cannot adopt child");
    }

    return familyService.adoptChild(family, child);
  }

  public void deleteAllChildrenOlderThen(int age) {
    familyService.deleteAllChildrenOlderThen(age);
  }

  public List<Family> loadData() throws IOException {
    return familyService.loadData();
  }
}
