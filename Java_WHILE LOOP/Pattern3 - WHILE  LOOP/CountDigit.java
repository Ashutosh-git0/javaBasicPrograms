/*4.Write a java application to accept a number and display the count the digits of number.*/

import java.util.Scanner;

public class CountDigit{
  public static void main(String[] args){
    Scanner obj = new Scanner(System.in);
    System.out.print("Input a number : ");
    int number = obj.nextInt();
    int num = 0, length = 0;
    num = number;
    while (num != 0){
      num = num / 10;
      length ++ ;
    }
    System.out.println("Count of digits : " + length);
  }
}

//Output
Input a number : Count of digits : 8
