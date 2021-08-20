/*5.Write a java application to accept  base and corresponding value of a number to calculate and print its exponential value. */

import java.util.Scanner;

public class GetExponentialValue{
  public static void main(String[] args){
    Scanner obj = new Scanner(System.in);
    System.out.print("Input a base : ");
    int base = obj.nextInt();
    System.out.print("Input a power : ");
    int power = obj.nextInt();
    int exponent = 1;

    while (power != 0){
      exponent *= base;
      power --;
    }
    System.out.println("The exponential value : " + exponent);
  }
}

//Output
Input a base : Input a power : The exponential value : 125
