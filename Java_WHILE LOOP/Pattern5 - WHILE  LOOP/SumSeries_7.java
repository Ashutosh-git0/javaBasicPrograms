/*7.Write a java application to print the sum of the series:-
     x-x^3/3!+x^5/5!-x^7/7!+..........upto n terms.  */

import java.util.Scanner;

public class SumSeries_7{

public static void main(String[] args){
  Scanner obj = new Scanner(System.in);
  System.out.print("Input the term till the series will go : ");
  int term = obj.nextInt();
  int count = 3, sign = 1;
  float sum;
  if (term % 2 != 0){
    System.out.print("Input the base : ");
    int x = obj.nextInt();
    sum = x;
    if (term == 1){
      sum = x;
    }
    else {
      while (count <= term){
        float result;
        sign = sign * (-1);
        result = (float) exponent(x, count) / fact(count);
        sum = sum + sign * result;
        count += 2;
      }
    }
    System.out.println("Sum of " + x + "'s series till " + term + " is : " + sum);
  }
  else{
    System.out.println("Term should be a odd number");
  }
}
public static float exponent(int x, int count){
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
Input the term till the series will go : Input the base : Sum of 3's series till 5 is : 0.5250001
Input the term till the series will go : Input the base : Sum of 2's series till 5 is : 0.9333333
