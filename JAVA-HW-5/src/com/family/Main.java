package com.family;

public class Main {
  public static void main(String[] args) {

    ///Finalize method in action
//    for (int i = 0; i < 10000000; i++) {
//            Human Men = new Human("Men", "Man", 2021);
//            Human Woman = new Human("Woman", "Woman", 2021);
//        }

    Human father = new Human("Maksim", "Lobachevskiy", 37, 100, new String[][]
            {{DayOfWeek.MONDAY.toString(), "Get children to school"},
                    {DayOfWeek.TUESDAY.toString(), "Go to GYM"}, {
              DayOfWeek.WEDNESDAY.toString(), "Go to DAN-IT courses"}, {DayOfWeek.THURSDAY.toString(),
                    "Do a homework"}, {DayOfWeek.FRIDAY.toString(), "JAVA Classes"},
                    {DayOfWeek.SATURDAY.toString(), "Day-Off"}});
    Human mother = new Human("Olena", "Lobachevska", 35, 100, new String[][]
            {{DayOfWeek.MONDAY.toString(), "Get children back from school"}, {DayOfWeek.TUESDAY.toString(),
                    "Go to YOGA"}, {DayOfWeek.WEDNESDAY.toString(), "Meet with friends"},
                    {DayOfWeek.THURSDAY.toString(), "Go to YOGA"},
                    {DayOfWeek.FRIDAY.toString(), "Play with children"}, {DayOfWeek.SATURDAY.toString(),
                    "Day-Off"}});
    Human daughter2 = new Human("Mariia", "Lobachevska", 5, 80,
            new String[][]{{DayOfWeek.MONDAY.toString(), "Go to kindergarten"},
                    {DayOfWeek.TUESDAY.toString(), "Go to kindergarten"},
            {DayOfWeek.WEDNESDAY.toString(), "Go to kindergarten"}, {DayOfWeek.THURSDAY.toString(), "Go to kindergarten"}, {DayOfWeek.FRIDAY.toString(), "Go to kindergarten"}, {
            DayOfWeek.SATURDAY.toString(), "Day-off"}});
    Pet parrot = new Pet(Species.PARROT, "Gosha", 7, 40, new String[]{"Flying and sitting high on furniture", "Eating from family's plates"});
    Family myFamily = new Family(mother, father, new Human[]{daughter2}, parrot);
    Human Mira = new Human("Mira", "Lobachevska", 3, 80,
            new String[][]{{DayOfWeek.MONDAY.toString(), "Go to kindergarten"}, {DayOfWeek.TUESDAY.toString(), "Go to kindergarten"},
                    {DayOfWeek.WEDNESDAY.toString(), "Go to kindergarten"},
                    {DayOfWeek.THURSDAY.toString(), "Go to kindergarten"}, {DayOfWeek.FRIDAY.toString(), "Go to kindergarten"}, {
                    DayOfWeek.SATURDAY.toString(), "Day-off"}});
    myFamily.addChild(Mira);
    System.out.println(myFamily);
    }
}