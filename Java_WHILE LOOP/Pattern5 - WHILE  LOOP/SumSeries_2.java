/*2.Write a java application to print the sum of the series:-
     1+x^2+x^4+x^6+..........upto n terms.  */

import java.util.Scanner;

public class SumSeries_2{

  public static void main(String[] args){
    Scanner obj = new Scanner(System.in);
    System.out.print("Input the term till the series will go : ");
    int term = obj.nextInt();
    int count = 2, sum = 1;
    if (term % 2 == 0){
      System.out.print("Input the base : ");
      int x = obj.nextInt();
      if (term == 0){
        sum = 1;
      }
      else {
        while (count <= term){
          sum = sum + exponent(x, count);
          count += 2;
        }
      }
      System.out.println("Sum of " + x + "'s series till " + term + " is : " + sum);
    }
    else{
      System.out.println("Term should be a even number");
    }
  }
  public static int exponent(int x, int term){
    int product = 1;
    while (term != 0){
      product = product * x;
      term --;
    }
    return product;
  }
}

//Output
Input the term till the series will go : Input the base : Sum of 3's series till 6 is : 820
Input the term till the series will go : Input the base : Sum of 2's series till 6 is : 85
