package com.taskplanner;

import java.util.Scanner;

public class TaskPlanner {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String[][] schedule = new String[7][2];
        schedule[0][0] = "Sunday";
        schedule[0][1] = "do home work";
        schedule[1][0] = "Monday";
        schedule[1][1] = "go to courses; watch a film";
        schedule[2][0] = "Tuesday";
        schedule[2][1] = "go in for sports";
        schedule[3][0] = "Wednesday";
        schedule[3][1] = "DAN-it courses";
        schedule[4][0] = "Thursday";
        schedule[4][1] = "Read a book";
        schedule[5][0] = "Friday";
        schedule[5][1] = "Meet with friends";
        schedule[6][0] = "Saturday";
        schedule[6][1] = "Go to swimming pool";

        while(true) {
          System.out.print("Please, input the day of the week: ");
          String day = input.next().toLowerCase();
          switch (day.toLowerCase()) {
            case "monday":
              System.out.println("Your tasks for " + schedule[1][0] + ": " + schedule[1][1]);
              break;
            case "tuesday":
              System.out.println("Your tasks for " + schedule[2][0] + ": " + schedule[2][1]);
              break;
            case "wednesday":
              System.out.println("Your tasks for " + schedule[3][0] + ": " + schedule[3][1]);
              break;
            case "thursday":
              System.out.println("Your tasks for " + schedule[4][0] + ": " + schedule[4][1]);
              break;
            case "friday":
              System.out.println("Your tasks for " + schedule[5][0] + ": " + schedule[5][1]);
              break;
            case "saturday":
              System.out.println("Your tasks for " + schedule[6][0] + ": " + schedule[6][1]);
              break;
            case "sunday":
              System.out.println("Your tasks for " + schedule[0][0] + ": " + schedule[0][1]);
              break;
            case "exit":
              break;
            default:
              System.out.println("Sorry, I don't understand you, please try again.");
          }
          if(day.equalsIgnoreCase("exit")){
            break;
          }
        }
      }
  }