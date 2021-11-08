package exercise2;

import java.util.Scanner;

public class SumOfDigits {
   public static void main(String[] args) {
     Scanner input = new Scanner(System.in);

     int j = input.nextInt();
     int x;
     int y;
     int z;
     int temp;
     x = j / 100;
     temp = j / 10;
     y = temp % 10;
     z = j % 10;
     int sum = x + y + z;
     System.out.println("Sum of digits: " + sum);
   }

} 
