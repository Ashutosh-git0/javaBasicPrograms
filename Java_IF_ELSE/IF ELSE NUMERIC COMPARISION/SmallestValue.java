/* Write a java application to accept two integer number, check and display the smallest value.  */

import java.util.Scanner;

public class SmallestValue{
  public static void main(String[] args){
    Scanner obj = new Scanner(System.in);
    System.out.print("First Number : ");
    int firstNum = obj.nextInt();
    System.out.print("Second Number : ");
    int secondNum = obj.nextInt();

    if(firstNum < secondNum){
      System.out.println("Smallest value is : " + firstNum);
    }
    else
    System.out.println("Smallest value is : " + secondNum);
  }
}

//Output
First Number : Second Number : Smallest value is : 24
