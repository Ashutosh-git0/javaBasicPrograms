/* WJA to accept base and height of a right-angled triangle. Calculate and print the area of  given right-angled triangle using formula [area=1/2*base*height]   */

import java.util.Scanner;

public class RightAngledTriangleArea{
  public static void main(String[] args){
    Scanner obj = new Scanner(System.in);

    System.out.print("Base Of a right-angled triangle : ");
    float base = obj.nextInt();
    System.out.print("Height Of a right-angled triangle : ");
    float height = obj.nextInt();

    System.out.println("Area Of a right-angled triangle : " + ((base * height) / 2));
  }
}

//Output
Base Of a right-angled triangle : Height Of a right-angled triangle : Area Of a right-angled triangle : 54.0
