package com.familyoop.controller;

import com.familyoop.human.Family;
import com.familyoop.human.Human;
import com.familyoop.pets.Pet;
import com.familyoop.service.FamilyService;

import java.util.List;
import java.util.Set;

public class FamilyController {
  public FamilyService familyService;

  public FamilyController() {
    familyService = new FamilyService();
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
    return familyService.bornChild(family, boy, girl);
  }

  public Family adoptChild(Family family, Human child) {
    return familyService.adoptChild(family, child);
  }

  public void deleteAllChildrenOlderThen(int age) {
    familyService.deleteAllChildrenOlderThen(age);
  }
}
