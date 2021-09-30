package com.numbers;

import java.util.Scanner;

public class Numbers {
  public static void main(String[] args) {
    System.out.println("Let the game begin!");
    Scanner myName = new Scanner(System.in);
    System.out.print("Input your name: ");
    String name = myName.next();
    int a = (int) (Math.random()*101);
    while (true) {
      Scanner myNumber = new Scanner(System.in);
      System.out.print(name + " input your number: ");
      int num = myNumber.nextInt();
      System.out.printf("Your number: %d \n", num);
      if (num < a) {
        System.out.println("Your number is too small. Please, try again.");
      } else if (num > a) {
        System.out.println("Your number is too big. Please, try again.");
      } else {
        System.out.println("Congratulations, " + name + "!");
        break;
      }
    }
  }
}