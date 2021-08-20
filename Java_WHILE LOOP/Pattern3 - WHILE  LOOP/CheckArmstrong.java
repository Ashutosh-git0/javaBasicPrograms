/*8.Write a java application to accept an integer number to check and display message whether the given number is armstrong no. or not. */

import java.util.Scanner;

public class CheckArmstrong{
  public static void main(String[] args){
    Scanner obj = new Scanner(System.in);
    System.out.print("An integer number : ");
    int number = obj.nextInt();
    int length = 0, temp = 0, num = 0, unit;
    num = number;
    while (num != 0){
      num = num / 10;
      length ++;
    }
    num = number;
    while (num != 0){
      unit = num % 10;
      temp += Math.pow(unit, length);
      num = num / 10;
    }
    if (temp == number){
      System.out.println("Number is Armstrong. ");
    }
    else
      System.out.println("Number is not Armstrong. ");
  }
}
//Output
An integer number : Number is Armstrong. 
An integer number : Number is not Armstrong. 
