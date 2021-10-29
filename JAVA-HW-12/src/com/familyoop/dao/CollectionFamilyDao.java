package com.familyoop.dao;

import com.familyoop.human.Family;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CollectionFamilyDao implements FamilyDao, Serializable {
  private final List<Family> familyList = new ArrayList<>();



  @Override
  public List<Family> getAllFamilies() throws IOException {
    return this.loadData();
  }

  @Override
  public Family getFamilyByIndex(int index) {
    if (index >= 0 && index < familyList.size()) {
      return this.familyList.get(index);
    } else {
      return null;
    }
  }

  @Override
  public Family deleteFamily(int index) {
    if (index >= 0 && index < familyList.size()) {
      return this.familyList.remove(index);
    } else {
      return null;
    }
  }

  @Override
  public boolean deleteFamily(Family family) {
    return this.familyList.remove(family);
  }

  @Override
  public Family saveFamily(Family family) {
    int index = this.familyList.indexOf(family);
    if (this.familyList.contains(family)) {
      this.familyList.set(index, family);
    } else {
      this.familyList.add(family);
    }
    return family;
  }

  @Override
  public void saveToFile(List<Family> family) {
    try(FileOutputStream fos = new FileOutputStream("family.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos)) {
oos.writeObject(family);
    } catch (IOException e) {
      e.printStackTrace(System.out);
    }
  }

  @Override
  public List<Family> loadData() throws IOException {
    List<Family> familyList = null;
    try(FileInputStream fis = new FileInputStream("family.txt");
        ObjectInputStream ois = new ObjectInputStream(fis)) {
     familyList = (List<Family>) ois.readObject();
      System.out.println("Data from DB:");
      System.out.println(familyList.stream().map(Family::prettyFormat).collect(Collectors.joining()));

    } catch (FileNotFoundException | ClassNotFoundException e) {
      e.printStackTrace(System.out);
    }
    return familyList;
  }
}
