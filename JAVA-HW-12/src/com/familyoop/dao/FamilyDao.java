package com.familyoop.dao;

import com.familyoop.human.Family;

import java.io.IOException;
import java.util.List;

public interface FamilyDao {
  List<Family> getAllFamilies();
  Family getFamilyByIndex(int index);
  Family deleteFamily(int index);
  boolean deleteFamily(Family family);
  Family saveFamily(Family family);
  List<Family> loadData() throws IOException;
}
