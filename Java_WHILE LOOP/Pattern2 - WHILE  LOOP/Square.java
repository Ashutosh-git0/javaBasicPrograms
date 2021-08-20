/*10.Write a java application to accept a natural number,calculate and print the square upto the inputed natural number. */

import java.util.Scanner;

public class Square{
  public static void main(String[] args){
    Scanner obj = new Scanner(System.in);
    System.out.print("Enter a natural number : ");
    int num = obj.nextInt();
    int count = 1;
    int squNum = 0;
    while (count <= num){
      squNum = count * count;
      System.out.println("Square of " + count + " : " + squNum);
      count ++;
    }
  }
}


//Output
Enter a natural number : Square of 1 : 1
Square of 2 : 4
Square of 3 : 9
Square of 4 : 16
Square of 5 : 25
Square of 6 : 36
