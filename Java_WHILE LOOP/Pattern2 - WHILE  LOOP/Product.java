/*2.Write a java application to accept n numbers, calculate and print the product of n numbers.*/

import java.util.Scanner;

public class Product{
  public static void main(String[] args){
    Scanner obj = new Scanner(System.in);
    System.out.print("How many numbers ? ");
    int n = obj.nextInt();
    int count = 1;
    int product = 1;
    while (count <= n){
      int number = obj.nextInt();
      product = product * number;

      count ++;
    }
    System.out.println("Product of " + n + " number : " + product);
  }
}

//Output
How many numbers ? Product of 3 number : 72
