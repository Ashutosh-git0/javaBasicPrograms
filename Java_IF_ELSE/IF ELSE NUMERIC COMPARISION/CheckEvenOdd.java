/* Write a java application to accept an integer number, check and display message whether the given number is even or odd no. */

import java.util.Scanner;

public class CheckEvenOdd{
  public static void main(String[] args){
    Scanner obj = new Scanner(System.in);
    System.out.print("Number : ");
    int num = obj.nextInt();

    if (num % 2 == 0){
      System.out.println("Given number is Even number.");
    }
    else
      System.out.println("Given number is Odd number.");
  }
}

//Output
