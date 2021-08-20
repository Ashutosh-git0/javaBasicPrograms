/*5.Write a java application to print the sum of the series:-
     x/1!+x^2/2!+x^3/3!+x^4/4!+..........upto n terms.  */

import java.util.Scanner;

public class SumSeries_5{
  public static void main(String[] args){
    Scanner obj = new Scanner(System.in);
    System.out.print("Input the term till the series will go : ");
    int term = obj.nextInt();
    System.out.print("Input the base : ");
    int x = obj.nextInt();
    int count = 2;
    float sum;
    sum = x;
    if (term == 1){
      sum = x;
    }
    else{
      while (count <= term){
        sum = sum + (float) exponent(x, count) / fact(count);
        count ++;
      }
    }
    System.out.println("Sum of " + x + "'s series till " + term + " is : " + sum);
  }
  public static int exponent(int x, int count){
    int product = 1;
    while (count != 0){
      product = product * x;
      count --;
    }
    return product;
  }

  public static int fact(int count){
    int fact = 1;
    while (count != 0){
      fact = fact * count;
      count --;
    }
    return fact;
  }
}

//Output
Input the term till the series will go : Input the base : Sum of 2's series till 4 is : 6.0
Input the term till the series will go : Input the base : Sum of 3's series till 8 is : 19.009153
