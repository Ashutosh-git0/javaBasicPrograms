/*9.Write a java application to accept an integer number, calculate and print its corresponding table.*/

import java.util.Scanner;

public class Table{
  public static void main(String[] args){
    Scanner obj = new Scanner(System.in);
    System.out.print("Input an integer : ");
    int num = obj.nextInt();
    int count = 1;
    int product;
    while(count <= 10){
      product = num * count;
      System.out.println(num + " * " + count + " = " + product);
      count ++;
    }
  }
}

//Output
Input an integer : 7 * 1 = 7
7 * 2 = 14
7 * 3 = 21
7 * 4 = 28
7 * 5 = 35
7 * 6 = 42
7 * 7 = 49
7 * 8 = 56
7 * 9 = 63
7 * 10 = 70
