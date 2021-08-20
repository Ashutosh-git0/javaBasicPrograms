/*1.Write a java application to check and display message whether the given number is perfect or not. */

import java.util.Scanner;

public class CheckPerfectNo{
  public static void main(String[] args){
    Scanner obj = new Scanner(System.in);
    System.out.print("Input a number : ");
    int number = obj.nextInt();
    int count = 1, temp = 0;
    while (count < number){
      if (number % count == 0){
        temp += count;
      }
      else{
      }
      count ++;
    }
    if(temp == number){
      System.out.println("The number is perfect no.");
    }
    else{
      System.out.println("The number is not a perfect no.");
    }
  }
}

//Output
Input a number : The number is perfect no.
Input a number : The number is not a perfect no.
