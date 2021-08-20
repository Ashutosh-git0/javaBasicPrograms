/*6.Write a java application to print the sum of the series:-
     1-x^2/2!+x^4/4!-x^6/6!+..........upto n terms.  */

import java.util.Scanner;

public class SumSeries_6{

 public static void main(String[] args){
   Scanner obj = new Scanner(System.in);
   System.out.print("Input the term till the series will go : ");
   int term = obj.nextInt();
   int count = 2, sign = 1;
   float sum = 1;
   if (term % 2 == 0){
     System.out.print("Input the base : ");
     int x = obj.nextInt();
     if (term == 0){
       sum = 1;
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
     System.out.println("Term should be a even number");
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
Input the term till the series will go : Input the base : Sum of 3's series till 4 is : -0.125
Input the term till the series will go : Input the base : Sum of 2's series till 6 is : -0.4222222
