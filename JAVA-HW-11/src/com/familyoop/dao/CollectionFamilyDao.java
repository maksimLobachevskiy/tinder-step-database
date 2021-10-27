package com.familyoop.dao;

import com.familyoop.human.Family;

import java.util.ArrayList;
import java.util.List;

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
    return family;
  }


}
