/* WJA to accept radius of a cicle. Calculate and print the Circumference of circle using formula [Circumference=2*pi*r]     */

import java.util.Scanner;

public class CircleCircumference {
  public static void main(String[] args){
    Scanner obj = new Scanner(System.in);
    System.out.print("Radius of Circle: ");
    float radius = obj.nextFloat();
    double circumference = 2 * 3.14 * radius ; // pi = 3.14

    System.out.println("Circumference of Circle: " + circumference);
  }
}

//Output
Radius of Circle: 5  Circumference of Circle: 31.400000000000002
