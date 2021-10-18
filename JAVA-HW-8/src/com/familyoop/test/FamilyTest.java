package com.familyoop.test;

import com.familyoop.human.Family;
import com.familyoop.pets.Fish;
import com.familyoop.human.Human;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class FamilyTest {

  //Children success String
  @Test
  public void testAddChildSuccessString() {
    Human mother = new Human("Olena", "Lobachevska", 1986);
    Human father = new Human("Maksym", "Lobachevskyi", 1984);
    Family family = new Family(mother, father);
    Human Marharyta = new Human("Marharyta", "Lobachevska", 2012);
    family.addChild(Marharyta);
    String expected = "[Human{name=Marharyta, surname=Lobachevska, year=2012, iq=0, schedulenull}]";
    assertEquals(expected, (family.getChildren()).toString());
  }

  //Children success Int
  @Test
  public void testAddChildSuccessInt() {
    Human mother = new Human("Olena", "Lobachevska", 1986);
    Human father = new Human("Maksym", "Lobachevskyi", 1984);
    Family family = new Family(mother, father);
    Human Marharyta = new Human("Marharyta", "Lobachevska", 2012);
    family.addChild(Marharyta);
    int expected = 1;
    assertEquals(expected, family.getChildren().size());
  }

  //Delete child test index
  @Test
  public void testDeleteChildSuccess() {
    Human mother = new Human("Olena", "Lobachevska", 1986);
    Human father = new Human("Maksym", "Lobachevskyi", 1984);
    Family family = new Family(mother, father);
    Human Marharyta = new Human("Marharyta", "Lobachevska", 2012);
    family.addChild(Marharyta);
    family.deleteChild(0);
    int expected = 0;
    assertEquals(expected, family.getChildren().size());
  }

  //Delete child test object
  @Test
  public void testDeleteChildObjectSuccess() {
    Human mother = new Human("Olena", "Lobachevska", 1986);
    Human father = new Human("Maksym", "Lobachevskyi", 1984);
    Family family = new Family(mother, father);
    Human Marharyta = new Human("Marharyta", "Lobachevska", 2012);
    family.addChild(Marharyta);
    family.deleteChild(Marharyta);
    int expected = 0;
    assertEquals(expected, family.getChildren().size());
  }

  //Count family
  @Test
  public void testFamilyMembersNumber() {
    Human mother = new Human("Olena", "Lobachevska", 1986);
    Human father = new Human("Maksym", "Lobachevskyi", 1984);
    Human Marharyta = new Human("Marharyta", "Lobachevska", 2012);
    Fish fish = new Fish("Gosha", 7, 40, new HashSet<>(List.of("Flying and sitting high on furniture", "Eating from " +
            "family's " +
            "plates")));
    Family myFamily = new Family(mother, father, new ArrayList<>(List.of(Marharyta)), new HashSet<>(List.of(fish)));
    int expected = 3;
    assertEquals(expected, myFamily.countFamily(myFamily));
  }
}
