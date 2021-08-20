/*6.Write a java application to accept a 5-digit number, calculate and print its sum of digits along with its reverse. */

import java.util.Scanner;

public class SumReverse5Digit{
  public static void main(String[] args){
    Scanner obj = new Scanner(System.in);
    System.out.print("Enter a number : ");
    int number = obj.nextInt();
    int num = 0, unit = 0, length = 0, temp = 0, sum = 0;

    num = number;
    while (num != 0){
      num = num / 10;
      length ++;
    }
    if (length == 5){
      num = number;
      length = length - 1;
      while (num != 0){
        unit = num % 10;
        sum += unit;
        temp += unit * Math.pow(10, length);
        length --;
        num = num / 10;
      }
      System.out.println("Sum of " + number + " : " + sum + ", reverse : " + temp);
    }
    else{
      System.out.println("Please enter a 5 digit number.");
    }
  }
}

//output
Enter a number : Please enter a 5 digit number.
Enter a number : Sum of 12345 : 15, reverse : 54321
