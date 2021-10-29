package com.familyoop.dao;

import com.familyoop.human.Family;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CollectionFamilyDao implements FamilyDao {
  private final List<Family> familyList = new ArrayList<>();


  @Override
  public List<Family> getAllFamilies() {
    return this.familyList;
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
    try(FileOutputStream fos = new FileOutputStream("family.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos)) {
      oos.writeObject(this.familyList);
    } catch (IOException e) {
      e.printStackTrace(System.out);
    }
    return family;
  }

@Override
  public List<Family> loadData() throws IOException {
  List<Family> families = new ArrayList<>();
  try(FileInputStream fis = new FileInputStream("family.txt");
      ObjectInputStream ois = new ObjectInputStream(fis)) {
   families = (List<Family>) ois.readObject();
    System.out.println("Data from FILE:");
    for (int i = 0; i < families.size(); i++) {
      System.out.println(i + 1 + "." + " " + families.get(i).prettyFormat());
    }

  } catch (FileNotFoundException | ClassNotFoundException e) {
    e.printStackTrace(System.out);
  }
  return families;
}
}
