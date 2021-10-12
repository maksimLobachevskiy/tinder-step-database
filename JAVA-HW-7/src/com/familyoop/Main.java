package com.familyoop;

import com.familyoop.human.*;
import com.familyoop.pets.*;

import java.util.*;

public class Main {
  public static void main(String[] args) {
    Man father = new Man("Maksim", "Lobachevskiy", 1984, 100,
            new HashMap<>() {{
              put(DayOfWeek.MONDAY, "Go to work");
              put(DayOfWeek.TUESDAY, "DAN-IT classes");
            }});
    Woman mother = new Woman("Olena", "Lobachevska", 35, 100,
            new HashMap<>() {{
              put(DayOfWeek.MONDAY, "Go to work");
              put(DayOfWeek.TUESDAY, "Pick children from school");
            }});
    Human daughter = new Woman("Mariia", "Lobachevska", 5, 80,
            new HashMap<>() {{
              put(DayOfWeek.MONDAY, "Go to school");
              put(DayOfWeek.TUESDAY, "Do a homework");
            }});
    Fish fish = new Fish("Molly", 2, 20, new HashSet<>() {{
      add("swimming");
    }});
    //Alternative method of initializing HashSet
    Pet fish2 = new Fish("Molly2", 2, 20, new HashSet<>(List.of("swimming")));
    //Family
    Family family = new Family(mother, father, new ArrayList<>(List.of(daughter)), new HashSet<>(List.of(fish, fish2)));
    System.out.println(family);
    //Second child
    Human daughter2 = new Woman("Mira", "Lobachevska", 5, 80, new HashMap<>() {{
      put(DayOfWeek.MONDAY, "Go to kindergarten");
      put(DayOfWeek.TUESDAY, "Go to kindergarten");
    }});
    //Add second child
    family.addChild(daughter2);
    //Family after child add
    System.out.println(family);
    //Delete child by object
    System.out.println(family.deleteChild(daughter2));
    //Delete child by index
    //family.deleteChild(0)
    //Family count after deletion
    System.out.println(family.countFamily(family));
    //Greet one pet by object
    father.greetPet(fish);
    mother.greetPet(fish2);
    //Describe pet by object
    family.describePet(fish);
    family.describePet(fish2);
    //Greet all pets in the family
    father.greetAllPet();
    mother.greetAllPet();
    //Describe all pets in the Family
    family.describeAllPets();
  }
}
