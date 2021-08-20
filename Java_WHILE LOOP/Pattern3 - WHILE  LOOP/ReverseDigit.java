/*2.Write a java application to accept a number, calculate and print the reverse of number.*/

import java.util.Scanner;

public class ReverseDigit{
  public static void main(String[] args){
    Scanner obj = new Scanner(System.in);
    int number = obj.nextInt();
    int num = 0, temp = 0, length = 0, unit = 0;
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
      length --;
      num = num / 10;
    }
    System.out.println("Reverse of " + number + " : " + temp);
  }
}

//output
Reverse of 12365478 : 87456321
