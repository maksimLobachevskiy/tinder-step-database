package com.shooting;

import java.util.Scanner;

public class Shooting {
  public static void main(String[] args) {
    System.out.println("All set. Get ready to rumble!");
    String[][] matrix;
    matrix = new String[6][6];
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[i].length; j++) {
        matrix[i][j] = "-";
        matrix[0][0] = "0";
        matrix[0][1] = "1";
        matrix[0][2] = "2";
        matrix[0][3] = "3";
        matrix[0][4] = "4";
        matrix[0][5] = "5";
        matrix[1][0] = "1";
        matrix[2][0] = "2";
        matrix[3][0] = "3";
        matrix[4][0] = "4";
        matrix[5][0] = "5";
        System.out.print(matrix[i][j] + "|");
      }
      System.out.println();
    }
    int randNum1 = (int) (Math.random() * 5) + 1;
    int randNum2 = (int) (Math.random() * 5) + 1;

    while (true) {
      System.out.print("Input line number from 1 to 5: ");
      int lineNum = verifyInputInteger();

      if (lineNum > matrix.length) {
        System.out.print("Input line number from 1 to 5: ");
        lineNum = verifyInputInteger();
      }

      System.out.print("Input line number from 1 to 5: ");
      int colNum = verifyInputInteger();

      if (randNum1 == lineNum && randNum2 == colNum) {
        matrix[lineNum][colNum] = "x";
      } else {
        System.out.println("You have missed! Try again!");
        matrix[lineNum][colNum] = "*";
      }
      for (int i = 0; i < 6; i++) {
        for (int j = 0; j < 6; j++) {

          System.out.print(matrix[i][j] + "|");
        }
        System.out.println();
      }
      if(matrix[lineNum][colNum].equals("x")){
        System.out.println("You have won!");
        break;
      }
    }
  }
  public static int verifyInputInteger() {
    Scanner inputNum = new Scanner(System.in);
    if (inputNum.hasNextInt()) {
      int input = inputNum.nextInt();
      if (input <= 5 && input > 0) {
        return input;
      } else {
        System.out.print("You have entered a wrong number! Please enter a number from 1 to 5: ");
        return verifyInputInteger();
      }
    } else {
      System.out.print("It's not a number, please enter a number from 1 to 5: ");
      return verifyInputInteger();
    }
  };
}
