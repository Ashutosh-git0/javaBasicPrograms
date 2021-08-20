/*3.Write a java application to accept a number, calculate and print the sum and reverse of  it's digits.*/

import java.util.Scanner;

public class SumReverseOfDigit{
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
}

// output
Enter a number : Sum of 12369874 : 40, reverse : 47896321
