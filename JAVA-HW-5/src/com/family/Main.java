package com.family;

import java.util.Arrays;
import java.util.Locale;

public class Main {
  public static void main(String[] args) {
    Human father = new Human("Maksim", "Lobachevskiy", 37, 100, new String[][]
            {{DayOfWeek.MONDAY.toString(), "Get children to school"},
                    {DayOfWeek.TUESDAY.toString(), "Go to GYM"}, {
              DayOfWeek.WEDNESDAY.toString(), "Go to DAN-IT courses"}, {DayOfWeek.THURSDAY.toString(),
                    "Do a homework"}, {DayOfWeek.FRIDAY.toString(), "JAVA Classes"},
                    {DayOfWeek.SATURDAY.toString(), "Day-Off"}});
    System.out.println("FATHER " + father + "\n");
    Human mother = new Human("Olena", "Lobachevska", 35, 100, new String[][]
            {{DayOfWeek.MONDAY.toString(), "Get children back from school"}, {DayOfWeek.TUESDAY.toString(),
                    "Go to YOGA"}, {DayOfWeek.WEDNESDAY.toString(), "Meet with friends"},
                    {DayOfWeek.THURSDAY.toString(), "Go to YOGA"},
                    {DayOfWeek.FRIDAY.toString(), "Play with children"}, {DayOfWeek.SATURDAY.toString(),
                    "Day-Off"}});
    System.out.println("MOTHER " + mother + "\n");
    Human daughter1 = new Human("Marharyta", "Lobachevska", 9, 80,
            new String[][]{{DayOfWeek.MONDAY.toString(), "Go to school"},
                    {DayOfWeek.TUESDAY.toString(), "School and Aerobics"},
            {DayOfWeek.WEDNESDAY.toString(), "School and Piano"},
            {DayOfWeek.THURSDAY.toString(), "School and playing with friends"}, {DayOfWeek.FRIDAY.toString(),
            "School and Aerobics"}, {DayOfWeek.SATURDAY.toString(), "Day-off"}});
    System.out.println("DAUGHTER1 " + daughter1 + "\n");
    Human daughter2 = new Human("Mariia", "Lobachevska", 5, 80,
            new String[][]{{DayOfWeek.MONDAY.toString(), "Go to kindergarten"},
                    {DayOfWeek.TUESDAY.toString(), "Go to kindergarten"},
            {DayOfWeek.WEDNESDAY.toString(), "Go to kindergarten"}, {DayOfWeek.THURSDAY.toString(), "Go to kindergarten"}, {DayOfWeek.FRIDAY.toString(), "Go to kindergarten"}, {
            DayOfWeek.SATURDAY.toString(), "Day-off"}});
    System.out.println("DAUGHTER2 " + daughter2 + "\n");
    Pet parrot = new Pet(Species.PARROT, "Gosha", 7, 40, new String[]{"Flying and sitting high on furniture", "Eating from family's plates"});
    System.out.println("PET " + parrot + "\n");
    Family myFamily = new Family(mother, father, new Human[]{daughter1, daughter2}, parrot);
    System.out.println(myFamily);
    myFamily.countFamily(myFamily);
    Human Mira = new Human("Mira", "Lobachevska", 3, 80,
            new String[][]{{DayOfWeek.MONDAY.toString(), "Go to kindergarten"}, {DayOfWeek.TUESDAY.toString(), "Go to kindergarten"},
                    {DayOfWeek.WEDNESDAY.toString(), "Go to kindergarten"},
                    {DayOfWeek.THURSDAY.toString(), "Go to kindergarten"}, {DayOfWeek.FRIDAY.toString(), "Go to kindergarten"}, {
                    DayOfWeek.SATURDAY.toString(), "Day-off"}});
    myFamily.addChild(Mira);
    System.out.println(myFamily);
    //Family count after adding a child
    System.out.println("The family consists of " + myFamily.countFamily(myFamily) + " members");
    myFamily.describePet();
    ///Pet greeting method
    father.greetPet();
    /////After deleting child
    System.out.println(myFamily.deleteChild(2));
    //Family count after deleting a child
    System.out.println("The family consists of " + myFamily.countFamily(myFamily) + " members");
    //Family composition after deletion
    System.out.println(myFamily);
    ///Finalize method in action
//    for (int i = 0; i < 10000000; i++) {
//            Human Men = new Human("Men", "Man", 2021);
//            Human Woman = new Human("Woman", "Woman", 2021);
//        }

    }
}