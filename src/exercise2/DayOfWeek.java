package exercise2;

import java.util.Scanner;

public class DayOfWeek {
  public static void main(String[] args) { 
    Scanner input = new Scanner(System.in);
    int weekday = input.nextInt();
    

        if(weekday == 1) {

            System.out.println("Day of week: Monday");

        } else if(weekday == 2) {

            System.out.println("Day of week: Tuesday");

        } else if(weekday == 3) {

            System.out.println("Day of week: Wednesday");

        } else if(weekday == 4) {

            System.out.println("Day of week: Thursday");

        } else if(weekday == 5) {

            System.out.println("Day of week: Friday");

        } else if(weekday == 6) {

            System.out.println("Day of week: Saturday");

        } else if(weekday == 7) {

            System.out.println("Day of week: Sunday");

        } else {

            System.out.println("Invalid day");
        }

  }
  
}