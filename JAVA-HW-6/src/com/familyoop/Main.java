package com.familyoop;

import com.familyoop.human.*;
import com.familyoop.pets.*;

public class Main {
  public static void main(String[] args) {
    Man father = new Man("Maksim", "Lobachevskiy", 1984, 100, new String[][]
            {{DayOfWeek.MONDAY.toString(), "Get children to school"}});
    Woman mother = new Woman("Olena", "Lobachevska", 35, 100, new String[][]
            {{DayOfWeek.MONDAY.toString(), "Get children back from school"}});
    Human daughter = new Woman("Mariia", "Lobachevska", 5, 80,
            new String[][]{{DayOfWeek.MONDAY.toString(), "Go to kindergarten"}});
    Pet fish = new Fish("Molly", 2, 20, new String[]{"swimming"});
    Family family = new Family(mother, father, new Human[]{daughter}, fish);

    DomesticCat cat = new DomesticCat("Jack", 4, 60, new String[]{"scratch"});
Dog dog = new Dog("billy", 5, 60, new String[]{"barking"});
    System.out.println(father);
    father.greetPet();
    father.repairCar();
    System.out.println(mother);
    mother.greetPet();
    mother.manicure();
    System.out.println(daughter);
    System.out.println(family);
    fish.eat();
    fish.respond();
    System.out.println(cat);
    cat.foul();
    cat.respond();
    System.out.println(dog);
    dog.respond();
  }
}
