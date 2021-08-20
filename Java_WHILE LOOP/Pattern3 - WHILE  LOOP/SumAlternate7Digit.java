/*7.Write a java application to accept a 7-digit number, calculate and print the sum of digits of alternate number. */

import java.util.Scanner;

public class SumAlternate7Digit{
  public static void main(String[] args){
    Scanner obj = new Scanner(System.in);
    System.out.print("Input a 7 digit number : ");
    int number = obj.nextInt();
    int num = 0, unit = 0, temp = 0, count = 1, length = 0;

    num = number;
    while (num != 0){
      num = num / 10;
      length ++;
    }
    if (length <= 7){
      num = number;
      while (num != 0){
        unit = num % 10;
        if (count % 2 != 0){
          temp += unit;
        }
        else{
        }
        count ++;
        num = num / 10;
      }
      System.out.println("Sum of Alternate digits, " + number + " : " + temp);
    }
    else{
      System.out.println("Please Enter 7 digit number.");
    }
  }
}

//Output
Input a 7 digit number : Please Enter 7 digit number.
Input a 7 digit number : Sum of Alternate digits, 1234567 : 16
