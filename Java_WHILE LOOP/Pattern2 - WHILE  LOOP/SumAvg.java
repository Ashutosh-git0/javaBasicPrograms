/*1.Write a java application to accept n numbers,claculate and print the sum and average of number keyed in.                                                                  */

import java.util.Scanner;

public class SumAvg{
  public static void main(String[] args){
    Scanner obj = new Scanner(System.in);
    System.out.print("How many numbers ? ");
    int n = obj.nextInt();
    int count = 1;
    int sum = 0;
    while(count <= n){
      int num = obj.nextInt();
      sum = sum + num;
      count ++;
    }
    System.out.println("Sum of numbers : " + sum +
                     "\nAverage of numbers : " + (sum / n));
  }
}
//Output
How many numbers ? Sum of numbers : 150
Average of numbers : 30
