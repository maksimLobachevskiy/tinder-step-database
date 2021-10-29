package com.familyoop.service;

import com.familyoop.dao.CollectionFamilyDao;
import com.familyoop.dao.FamilyDao;
import com.familyoop.human.Family;
import com.familyoop.human.Human;
import com.familyoop.human.Man;
import com.familyoop.human.Woman;
import com.familyoop.pets.Pet;

import java.io.IOException;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.List;
import java.util.Set;

public class FamilyService {
  private final FamilyDao familyDao;

  public FamilyService(CollectionFamilyDao familyDao) {
    this.familyDao = familyDao;
  }


  public List<Family> getAllFamilies() throws IOException {
    return familyDao.loadData();
  }

  public void displayAllFamilies() throws IOException {
    for (int i = 0; i < this.getAllFamilies().size(); i++) {
      System.out.println(i + 1 + "." + " " + getAllFamilies().get(i).prettyFormat());
    }
    //this.getAllFamilies().stream().peek(System.out::println).forEach(p -> System.out.println(p.p));
  }

  public Family createNewFamily(Human mother, Human father) {

    return familyDao.saveFamily(new Family(mother, father));
  }

  public void getFamiliesBiggerThan(int number) throws IOException {
    this.getAllFamilies().stream().filter(p -> p.countFamily(p) > number).forEach(System.out::println);
  }

  public void getFamiliesLessThan(int number) throws IOException {
    this.getAllFamilies().stream().filter(p -> p.countFamily(p) < number).forEach(System.out::println);
  }

  public int countFamiliesWithMemberNumber(int number) throws IOException {
    return (int) this.getAllFamilies().stream().filter(p -> p.countFamily(p) == number).count();
  }

  public void deleteFamilyByIndex(int index) {
    familyDao.deleteFamily(index);
  }

  public int count() throws IOException {
    return this.getAllFamilies().size();
  }

  public Family getFamilyById(int index) {
    return familyDao.getFamilyByIndex(index);
  }

  public Set<Pet> getPets(int index) {
    Family family = familyDao.getFamilyByIndex(index);
    return family.getPet();
  }

  public void addPet(int index, Pet pet) throws IOException {
    Family family = familyDao.getFamilyByIndex(index);
    family.getPet().add(pet);
    familyDao.saveFamily(family);
    familyDao.saveToFile(this.getAllFamilies());
  }

  public Family bornChild(Family family, String boy, String girl) {
    int selectChild = (int) (Math.random() * 2);
    List<Human> children = family.getChildren();
    if (selectChild == 0) {
      family.getChildren().add(new Man(boy, family.getFather().getSurname(), "10/10/2021"));
    } else {
      family.getChildren().add(new Woman(girl, family.getFather().getSurname(), "10/10/2021"));
    }
    family.setChildren(children);
    familyDao.saveFamily(family);
    return family;

  }

  public Family adoptChild(Family family, Human child) throws IOException {
    family.addChild(child);
    familyDao.saveFamily(family);
    familyDao.saveToFile(this.getAllFamilies());
    return family;
  }

  public void deleteAllChildrenOlderThen(int age) throws IOException {
    this.getAllFamilies().stream().peek(family -> {
      family.getChildren()
              .removeIf(child -> (LocalDate.now().getYear() - Instant.ofEpochMilli(child.getBirthDate())
                      .atZone(ZoneId.systemDefault()).toLocalDate().getYear()) > age);
    }).forEach(familyDao::saveFamily);
    familyDao.saveToFile(this.getAllFamilies());
  }

  public List<Family> loadData() throws IOException {
    return familyDao.loadData();
  }


}
