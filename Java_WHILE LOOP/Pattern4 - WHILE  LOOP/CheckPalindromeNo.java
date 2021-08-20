/*3.Write a java application to accept a number, check and display whether the given number is palindrome or not. */

import java.util.Scanner;

public class CheckPalindromeNo{
  public static void main(String[] args){
    Scanner obj = new Scanner(System.in);
    System.out.print("Input a number : ");
    int number = obj.nextInt();
    int num = 0, unit = 0, length = 0, temp = 0;

    num = number;
    while (num != 0){
      num = num / 10;
      length ++;
    }
    num = number;
    length = length - 1;
    while (num != 0){
      unit = num % 10;
      temp += unit * Math.pow(10, length);
      num = num / 10;
      length --;
    }
    if (temp == number){
      System.out.println("Number is a palindrome.");
    }
    else{
      System.out.println("Number is not a palindrome.");
    }
  }
}

//Output
Input a number : Number is a palindrome.
Input a number : Number is not a palindrome.
