/*2.Write a java application to accept a number and display whether the given number is prime or not. */

import java.util.Scanner;

public class CheckPrimeNo{
  public static void main(String[] args){
    Scanner obj = new Scanner(System.in);
    System.out.print("Input a number : ");
    int number = obj.nextInt();
    int count = 1, temp = 0;
    while (count <= number){
      if (number % count == 0){
        temp += count;
      }
      else{
      }
      count ++;
    }
    if (temp == (number + 1)){
      System.out.println("The number is Prime No.");
    }
    else{
      System.out.println("The number is not a Prime No.");
    }
  }
}

//Output
Input a number : The number is Prime No.
Input a number : The number is not a Prime No.
