/*5.Write a java application to accept a 3-digit number, calculate and print the sum of it's digits.*/

import java.util.Scanner;

public class Sum3Digit{
  public static void main(String[] args){
    Scanner obj = new Scanner(System.in);
    System.out.print("Input a 3 digit number : ");
    int number = obj.nextInt();
    int num = 0, unit = 0, temp = 0, length = 0;

    num = number;
    while (num != 0){
      num = num / 10;
      length ++;
    }
    if (length <= 3){
      num = number;
      while (num != 0){
        unit = num % 10;
        temp += unit;
        num = num / 10;
      }
      System.out.println("Sum of digits, " + number + " : " + temp);
    }
    else{
      System.out.println("Please input 3 digit number.");
    }
  }
}

//Output
Input a 3 digit number : Sum of digits, 325 : 10
Input a 3 digit number : Please input 3 digit number.
