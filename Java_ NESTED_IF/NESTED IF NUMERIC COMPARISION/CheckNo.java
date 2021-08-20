/*1.Write a java application to accept an integer number, check and display the message whether the given number is positive/negative or neutral number. */

import java.util.Scanner;

public class CheckNo{
  public static void main(String[] args){
    Scanner obj = new Scanner(System.in);
    System.out.print("Number : ");
    int num = obj.nextInt();
    if(num > 0){
      System.out.println("Number is positive.");
    }
    else if(num == 0){
      System.out.println("Number is neutral.");
    }
    else
      System.out.println("Number is negative");
  }
}

//Output
Number : Number is positive.
Number : Number is neutral.
Number : Number is negative
