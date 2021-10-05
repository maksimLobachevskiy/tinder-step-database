package com.family;

public class Main {
  public static void main(String[] args) {
    Human father = new Human("Maksim", "Lobachevskiy", 37, 100, new String[][]
            {{"Monday", "Get children to school"}, {"Tuesday", "Go to GYM"}, {"Wednesday", "Go to" +
                    " DAN-IT courses"}, {"Thursday", "Do a homework"}, {"Friday", "JAVA Classes"}
                    , {"Saturday", "Day-Off"}});
    System.out.println("FATHER " + father + "\n");
    Human mother = new Human("Olena", "Lobachevska", 35, 100, new String[][]
            {{"Monday", "Get children back from school"}, {"Tuesday", "Go to YOGA"}, {"Wednesday",
                    "Meet with friends"}, {"Thursday", "Go to YOGA"}, {"Friday", "Play with " +
                    "children"}, {"Saturday", "Day-Off"}});
    System.out.println("MOTHER " + mother + "\n");
    Human daughter1 = new Human("Marharyta", "Lobachevska", 9, 80, new String[][]{{"Monday", "Go" +
            " to school"}, {"Tuesday", "School and Aerobics"}, {"Wednesday", "School and Piano"},
            {"Thursday", "School and playing with friends"}, {"Friday", "School and Aerobics"}, {
            "Satuday", "Day-off"}});
    System.out.println("DAUGHTER1 " + daughter1 + "\n");
    Human daughter2 = new Human("Mariia", "Lobachevska", 5, 80, new String[][]{{"Monday", "Go" +
            " to kindergarten"}, {"Tuesday", "Go to kindergarten"}, {"Wednesday", "Go to kindergarten"},
            {"Thursday", "Go to kindergarten"}, {"Friday", "Go to kindergarten"}, {
            "Satuday", "Day-off"}});
    System.out.println("DAUGHTER2 " + daughter2 + "\n");
    Pet parrot = new Pet("Parrot", "Gosha", 7, 40, new String[]{"Flying and sitting high on " +
            "furniture", "Eating from family's plates"});
    System.out.println("PET " + parrot + "\n");
    Family myFamily = new Family(mother, father, new Human[]{daughter1, daughter2}, parrot);
    System.out.println(myFamily);
    myFamily.countFamily(myFamily);
    Human Mira = new Human("Mira", "Lobachevska", 3, 80,
            new String[][]{{"Monday", "Go" +
                    " to kindergarten"}, {"Tuesday", "Go to kindergarten"}, {"Wednesday", "Go to kindergarten"},
                    {"Thursday", "Go to kindergarten"}, {"Friday", "Go to kindergarten"}, {
                    "Satuday", "Day-off"}});
    myFamily.addChild(Mira);
    System.out.println(myFamily);
    //Family count after adding a child
    myFamily.countFamily(myFamily);
    myFamily.describePet();
    ///Pet greeting method
    father.greetPet();
    /////After deleting child
    System.out.println(myFamily.deleteChild(2));
    //Family count after deleting a child
    myFamily.countFamily(myFamily);
    //Family composition after deletion
    System.out.println(myFamily);
  }
}
