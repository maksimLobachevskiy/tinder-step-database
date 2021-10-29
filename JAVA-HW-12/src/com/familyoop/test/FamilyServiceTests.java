//package com.familyoop.test;
//
//import com.familyoop.dao.CollectionFamilyDao;
//import com.familyoop.human.Family;
//import com.familyoop.human.Human;
//import com.familyoop.pets.Fish;
//import com.familyoop.service.FamilyService;
//import org.junit.Assert;
//import org.junit.Test;
//
//import java.io.IOException;
//import java.util.ArrayList;
//import java.util.HashSet;
//import java.util.List;
//
//public class FamilyServiceTests {
//  static FamilyService familyService;
//
//  //Test families difference
//  @Test
//  public void getAllFamiliesTestFail() throws IOException {
//    CollectionFamilyDao familyDao = new CollectionFamilyDao();
//    FamilyService familyService = new FamilyService(familyDao);
//    List<Family> families = new ArrayList<>();
//    Human mother = new Human("Olena", "Lobachevska", "10/10/1986");
//    Human father = new Human("Maksym", "Lobachevskyi", "10/10/1986");
//    Family family = familyService.createNewFamily(mother, father);
//    Human mother2 = new Human("Oksana", "Egorova", "10/10/1986");
//    Human father2 = new Human("Oleg", "Egorov", "10/10/1986");
//    Family family2 = familyService.createNewFamily(mother2, father2);
//    families.add(family);
//    familyService.getAllFamilies();
//    Assert.assertNotSame(familyService.getAllFamilies(), families);
//  }
//
//  @Test
//  public void getAllFamiliesTestTrue() throws IOException {
//    CollectionFamilyDao familyDao = new CollectionFamilyDao();
//    FamilyService familyService = new FamilyService(familyDao);
//    List<Family> families = new ArrayList<>();
//    Human mother = new Human("Olena", "Lobachevska", "10/10/1986");
//    Human father = new Human("Maksym", "Lobachevskyi", "10/10/1986");
//    Family family = familyService.createNewFamily(mother, father);
//    Human mother2 = new Human("Oksana", "Egorova", "10/10/1986");
//    Human father2 = new Human("Oleg", "Egorov", "10/10/1986");
//    Family family2 = familyService.createNewFamily(mother2, father2);
//    families.add(family);
//    families.add(family2);
//    familyService.getAllFamilies();
//    Assert.assertEquals(familyService.getAllFamilies(), families);
//  }
//
//  @Test
//  public void createNewFamilyTest() {
//    CollectionFamilyDao familyDao = new CollectionFamilyDao();
//    FamilyService familyService = new FamilyService(familyDao);
//    Human mother = new Human("Olena", "Lobachevska", "10/10/1986");
//    Human father = new Human("Maksym", "Lobachevskyi", "10/10/1986");
//    Family family = familyService.createNewFamily(mother, father);
//    String expected = "This is the family of Lobachevskyi\n" +
//            "Mother: Human{name=Olena, surname=Lobachevska, birthday=10/10/1986, iq=0, schedulenull} \n" +
//            "Father: Human{name=Maksym, surname=Lobachevskyi, birthday=10/10/1986, iq=0, schedulenull} \n" +
//            "Children: No children in this Family \n" +
//            "Pets: []";
//    Assert.assertEquals(family.toString(), expected);
//  }
//
//  //Number of families test
//  @Test
//  public void countTest() {
//    CollectionFamilyDao familyDao = new CollectionFamilyDao();
//    FamilyService familyService = new FamilyService(familyDao);
//    Human mother = new Human("Olena", "Lobachevska", "10/10/1986");
//    Human father = new Human("Maksym", "Lobachevskyi", "10/10/1986");
//    Family family = familyService.createNewFamily(mother, father);
//    Human mother2 = new Human("Oksana", "Egorova", "10/10/1986");
//    Human father2 = new Human("Oleg", "Egorov", "10/10/1986");
//    Family family2 = familyService.createNewFamily(mother2, father2);
//    int expected = 2;
//    Assert.assertEquals(expected, familyService.count());
//  }
//
//  //Test deleteFamilyByIndex
//  @Test
//  public void deleteFamilyByIndexTest() {
//    CollectionFamilyDao familyDao = new CollectionFamilyDao();
//    FamilyService familyService = new FamilyService(familyDao);
//    Human mother = new Human("Olena", "Lobachevska", "10/10/1986");
//    Human father = new Human("Maksym", "Lobachevskyi", "10/10/1986");
//    Family family = familyService.createNewFamily(mother, father);
//    Human mother2 = new Human("Oksana", "Egorova", "10/10/1986");
//    Human father2 = new Human("Oleg", "Egorov", "10/10/1986");
//    Family family2 = familyService.createNewFamily(mother2, father2);
//    familyService.deleteFamilyByIndex(0);
//    int expected = 1;
//    Assert.assertEquals(expected, familyService.count());
//  }
//
//  @Test
//  public void getFamilyByIdTest() {
//    CollectionFamilyDao familyDao = new CollectionFamilyDao();
//    FamilyService familyService = new FamilyService(familyDao);
//    Human mother = new Human("Olena", "Lobachevska", "10/10/1986");
//    Human father = new Human("Maksym", "Lobachevskyi", "10/10/1986");
//    Family family = familyService.createNewFamily(mother, father);
//    Human mother2 = new Human("Oksana", "Egorova", "10/10/1986");
//    Human father2 = new Human("Oleg", "Egorov", "10/10/1986");
//    Family family2 = familyService.createNewFamily(mother2, father2);
//    Assert.assertEquals(family, familyService.getFamilyById(0));
//  }
//
//  @Test
//  public void addPetTest() {
//    CollectionFamilyDao familyDao = new CollectionFamilyDao();
//    FamilyService familyService = new FamilyService(familyDao);
//    Human mother = new Human("Olena", "Lobachevska", "10/10/1986");
//    Human father = new Human("Maksym", "Lobachevskyi", "10/10/1986");
//    Family family = familyService.createNewFamily(mother, father);
//    Fish fish = new Fish("Gosha", 7, 40, new HashSet<>(List.of("Flying and sitting high on furniture", "Eating from " +
//            "family's " +
//            "plates")));
//    familyService.addPet(0, fish);
//    int expected = 1;
//    Assert.assertEquals(expected, family.getPet().size());
//  }
//
//  @Test
//  public void getPetTest() {
//    CollectionFamilyDao familyDao = new CollectionFamilyDao();
//    FamilyService familyService = new FamilyService(familyDao);
//    Human mother = new Human("Olena", "Lobachevska", "10/10/1986");
//    Human father = new Human("Maksym", "Lobachevskyi", "10/10/1986");
//    Family family = familyService.createNewFamily(mother, father);
//    Fish fish = new Fish("Gosha", 7, 40, new HashSet<>(List.of("Flying and sitting high on furniture", "Eating from " +
//            "family's " +
//            "plates")));
//    familyService.addPet(0, fish);
//    Assert.assertArrayEquals(family.getPet().toArray(), familyService.getPets(0).toArray());
//  }
//
//  @Test
//  public void bornChildTest() {
//    CollectionFamilyDao familyDao = new CollectionFamilyDao();
//    FamilyService familyService = new FamilyService(familyDao);
//    Human mother = new Human("Olena", "Lobachevska", "10/10/1986");
//    Human father = new Human("Maksym", "Lobachevskyi", "10/10/1986");
//    Family family = familyService.createNewFamily(mother, father);
//    familyService.bornChild(family, "Borya", "Sveta");
//    Assert.assertEquals(1, family.getChildren().size());
//  }
//
//  @Test
//  public void adoptChildTest() {
//    CollectionFamilyDao familyDao = new CollectionFamilyDao();
//    FamilyService familyService = new FamilyService(familyDao);
//    Human mother = new Human("Olena", "Lobachevska", "10/10/1986");
//    Human father = new Human("Maksym", "Lobachevskyi", "10/10/1986");
//    Family family = familyService.createNewFamily(mother, father);
//    Human Marharyta = new Human("Marharyta", "Lobachevska", "10/10/1986");
//    familyService.adoptChild(family, Marharyta);
//    Assert.assertEquals(3, familyService.getFamilyById(0).countFamily(family));
//  }
//
//}
