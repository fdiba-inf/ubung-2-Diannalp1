package exercise2;

import java.util.Scanner;
import static java.lang.Math.sqrt;

public class QuadraticEquation{

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    float a = input.nextFloat();
    float b = input.nextFloat();
    float c = input.nextFloat();
    float x1;
    float x2;
    float x3;
    float D = b * b - (4 * a * c);

    if(a != 0) {
      if(D >= 0) {  
          x1 = (float) ((-b + sqrt(D)) / 2 * a);
          x2 = (float) ((-b - sqrt(D)) / 2 * a);
          System.out.println(x1 + ", " + x2);
      } else {
        System.out.println("Imaginary values");
        }
      } else {
        if(b != 0) {
          x3 = (- c / b );
          //x2 = (float) ((-b - Math.sqrt(D))/ 2 * a);
          System.out.println(x3);
          } else {
            if(c != 0) {
              System.out.println("No values");
            } else {
                System.out.println("Many values");
            }
          }
       }
     }
 }
