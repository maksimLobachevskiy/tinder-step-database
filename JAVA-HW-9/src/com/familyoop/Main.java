package com.familyoop;

import com.familyoop.controller.FamilyController;
import com.familyoop.dao.CollectionFamilyDao;
import com.familyoop.human.*;
import com.familyoop.pets.*;
import com.familyoop.service.FamilyService;

import java.util.*;

public class Main {
  public static void main(String[] args) {
    CollectionFamilyDao familyDao = new CollectionFamilyDao();
    FamilyService familyService = new FamilyService(familyDao);
    FamilyController familyController = new FamilyController(familyService);

    Man father = new Man("Maksim", "Lobachevskiy", "03/12/1984", 100,
            new HashMap<>() {{
              put(DayOfWeek.MONDAY, "Go to work");
              put(DayOfWeek.TUESDAY, "DAN-IT classes");
            }});
    Woman mother = new Woman("Olena", "Lobachevska", "26/09/1986", 100,

            new HashMap<>() {{
              put(DayOfWeek.MONDAY, "Go to work");
              put(DayOfWeek.TUESDAY, "Pick children from school");
            }});
    Human daughter = new Woman("Mariia", "Lobachevska", "10/05/2016", 80);
    Fish fish = new Fish("Molly", 2, 20, new HashSet<>() {{
      add("swimming");
    }});
    Pet fish2 = new Fish("Molly2", 2, 20, new HashSet<>(List.of("swimming")));
    Family family = familyController.createNewFamily(mother, father);
    Man father2 = new Man("Oleg", "Egorov", "12/12/1989", 100,
            new HashMap<>() {{
              put(DayOfWeek.MONDAY, "Go to work");
              put(DayOfWeek.TUESDAY, "DAN-IT classes");
            }});
    Woman mother2 = new Woman("Oksana", "Egorova", "15/05/1986", 100,
            new HashMap<>() {{
              put(DayOfWeek.MONDAY, "Go to work");
              put(DayOfWeek.TUESDAY, "Pick children from school");
            }});
    Family family2 = familyController.createNewFamily(father2, mother2);
    familyController.bornChild(family, "Misha", "Mariia");
    familyController.displayAllFamilies();
    familyController.getFamiliesLessThan(3);
    familyController.getFamiliesBiggerThan(2);
    System.out.println(familyController.countFamiliesWithMemberNumber(2));
    familyController.deleteFamilyByIndex(0);
    System.out.println(familyController.count());
    System.out.println(familyController.getFamilyById(0));
    familyController.addPet(0, fish2);
    familyController.adoptChild(family2, daughter);
    //Show families after adding pet and child adoption
    familyController.displayAllFamilies();
    familyController.deleteAllChildrenOlderThen(3);
    familyController.displayAllFamilies();
    System.out.println(familyController.getFamilyById(0));

    //Describe Age method example
    System.out.println(father.describeAge());
    System.out.println(mother.describeAge());
    System.out.println(daughter.describeAge());
    //Example of birthdate in long Unix Millis Timestamp
    System.out.println(father.getBirthDate());
  }
}
