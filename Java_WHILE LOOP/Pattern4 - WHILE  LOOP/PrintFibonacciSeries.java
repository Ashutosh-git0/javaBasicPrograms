/*6.Write a java application to accept a number ,calculate and display fabonacci series upto that given number. */

import java.util.Scanner;

public class PrintFibonacciSeries{
  public static void main(String[] args){
    Scanner obj = new Scanner(System.in);
    System.out.print("Input a number : ");
    int num = obj.nextInt();
    int num1 = 0, num2 = 1, count = 2, sum = 0;
    if (num == 0){
      sum = 0;
      System.out.println("0");
    }
    else if (num == 1){
      sum = 1;
      System.out.println("0 + 1");
    }
    else{
      System.out.print(num1 + " + " + num2);
      while(count <= num){
        sum = num1 + num2;
        System.out.print(" + " + sum);
        num1 = num2;
        num2 = sum;
        count ++;
      }
    }
    System.out.println();
  }
}

//Output
Input a number : 0 + 1 + 1 + 2 + 3 + 5
