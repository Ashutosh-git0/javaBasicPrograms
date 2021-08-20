/*1.Write a java application to accept a number, calculate and display the sum of digits. */

import java.util.Scanner;

public class SumDigit{
  public static void main(String[] args){
    Scanner obj = new Scanner(System.in);
    System.out.print("Input a number : ");
    int number = obj.nextInt();
    int num = 0, unit = 0, temp = 0;

    num = number;
    while (num != 0){
      unit = num % 10;
      temp += unit;
      num = num / 10;
    }
    System.out.println("Sum of digits, " + number + " : " + temp);
  }
}

//Output
Input a number : Sum of digits, 123456 : 21
