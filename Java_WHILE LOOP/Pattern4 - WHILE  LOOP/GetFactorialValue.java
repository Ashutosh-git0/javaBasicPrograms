/*4.Write a java application to accept a number, calculate and display its factorial value. */

import java.util.Scanner;

public class GetFactorialValue{
  public static void main(String[] args){
    Scanner obj = new Scanner(System.in);
    System.out.print("Input a number : ");
    int number = obj.nextInt();
    int fact = 1, num = 0;
    num = number;
    while (number != 0){
      fact *= number;
      number --;
    }
    System.out.println("Factorial of " + num + " : " + fact);
  }
}


//Output
Input a number : Factorial of 5 : 120
