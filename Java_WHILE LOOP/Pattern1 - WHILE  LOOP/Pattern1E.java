/*5.Write a java application to print the given message format:-
     1  2  3  4  5...............upto n.          */

import java.util.Scanner;

public class Pattern1E{
  public static void main(String[] args){
    Scanner obj = new Scanner(System.in);
    int n = obj.nextInt();
    int num = 1;
    while (num <= n){
      System.out.print(num + " ");
      num ++;
    }
  }
}

//Output
1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 