/*1.Write a java application to print the sum of the series:-
     1+x+x^2+x^3+x^4+..........upto n terms.  */


import java.util.Scanner;

public class SumSeries_1{
  public static void main(String[] args){
    Scanner obj = new Scanner(System.in);
    System.out.print("Input the term till the series will go : ");
    int term = obj.nextInt();
    System.out.print("Input the base : ");
    int x = obj.nextInt();
    int sum = 1, count = 1, product = 1;
    if (term == 0){
      sum = 1;
    }
    else {
      while (count <= term){
        product = product * x;
        sum += product;
        count ++;
      }
    }
    System.out.println("Sum of " + x + "'s series till " + term + " is : " + sum);
  }
}

//Output
Input the term till the series will go : Input the base : Sum of 2's series till 10 is : 2047
