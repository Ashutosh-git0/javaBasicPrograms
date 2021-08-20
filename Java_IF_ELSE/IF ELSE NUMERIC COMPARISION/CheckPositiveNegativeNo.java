/* Write a java application to accept an integer number, check and display message whether the given number is positive or negative no.    */

import java.util.Scanner;

public class CheckPositiveNegativeNo{
  public static void main(String[] args){
    Scanner obj = new Scanner(System.in);
    System.out.print("Number : ");
    int num = obj.nextInt();

    if(num < 0){
      System.out.println("Given number is Negative number.");
    }
    else
      System.out.println("Given number is Positive number.");
  }
}

//Output
Number : Given number is Positive number.
Number : Given number is Negative number.
