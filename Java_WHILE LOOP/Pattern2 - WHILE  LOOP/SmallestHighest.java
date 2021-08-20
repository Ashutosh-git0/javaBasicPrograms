/*5.Write a java application to accept n numbers, check and display the highest and the smallest number.*/

import java.util.Scanner;

public class SmallestHighest{
  public static void main(String[] args){
    Scanner obj = new Scanner(System.in);
    System.out.print("How many numbers ? ");
    int n = obj.nextInt();
    int count = 1;
    int highest = Integer.MIN_VALUE;
    int smallest = Integer.MAX_VALUE;

    while (count <= n){
      int num = obj.nextInt();
      while (num < smallest){
        smallest = num;
      }
      while (num > highest){
        highest = num;
      }
      count ++;
    }
    System.out.println("The smallest Value is : " + smallest + " and highest value is : " + highest);
  }
}

//Output
How many numbers ? The smallest Value is : -12 and highest value is : 1000
