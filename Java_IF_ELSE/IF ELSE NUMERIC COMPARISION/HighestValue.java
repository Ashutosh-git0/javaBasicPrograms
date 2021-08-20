/* Write a java application to accept two integer number, check and display the highest value.  */

import java.util.Scanner;

public class HighestValue{
  public static void main(String[] args){
    Scanner obj = new Scanner(System.in);
    System.out.print("First Number : ");
    int firstNum = obj.nextInt();
    System.out.print("Second Number : ");
    int secondNum = obj.nextInt();

    if (firstNum > secondNum){
      System.out.println("Highest number is : " + firstNum);
    }
    else
      System.out.println("Highest number is : " + secondNum);
  }
}

//Output
First Number : Second Number : Highest number is : 12
