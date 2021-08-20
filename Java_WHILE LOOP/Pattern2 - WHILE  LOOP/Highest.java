/*3.Write a java application to accept n numbers, check and display the highest value.*/

import java.util.Scanner;

public class Highest{
  public static void main(String[] args){
    Scanner obj = new Scanner(System.in);
    System.out.print("How many numbers ? ");
    int n = obj.nextInt();
    int count = 1;
    int highest = 0;
    while (count <= n){
      int num = obj.nextInt();

      while (num > highest){
        highest = num;
      }
      count ++;
    }
    System.out.println("The Highest Value is : " + highest);
  }
}

//Output
How many numbers ? The Highest Value is : 10
How many numbers ? The Highest Value is : 2
