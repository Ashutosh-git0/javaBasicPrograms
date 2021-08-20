/* WJA to accept radius of a cicle. Calculate and print the area of circle using formula [area=pi*r*r]     */

import java.util.Scanner;

public class CircleArea {
  public static void main(String[] args){
    Scanner obj = new Scanner(System.in);
    System.out.print("Radius of a Circle: ");
    float radius = obj.nextFloat();
    double area = 3.14 * radius * radius;  // pi = 3.14
    System.out.println("Area of Circle: " + area);
  }
}

//Output
Radius of a Circle: Area of Circle: 78.5
