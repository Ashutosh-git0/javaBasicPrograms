/*4.Write a java application to accept n numbers, check and display the smallest value.*/

import java.util.Scanner;

public class Smallest{
  public static void main(String[] args){
    Scanner obj = new Scanner(System.in);
    System.out.print("How many numbers ? ");
    int n = obj.nextInt();
    int count = 1;
    int smallest = Integer.MAX_VALUE;

    while (count <= n){
      int num = obj.nextInt();

      while (num < smallest){
        smallest = num;
      }
      count ++;
    }
    System.out.println("The Smallest value is : " + smallest);
  }
}

//Output
How many numbers ? The Smallest value is : -65
