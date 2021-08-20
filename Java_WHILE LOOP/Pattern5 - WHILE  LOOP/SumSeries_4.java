/*4.Write a java application to print the sum of the series:-
     1+1/x^2+1/x^4+1/x^6+1/x^8+..........upto n terms.  */

 import java.util.Scanner;

 public class SumSeries_4{

   public static void main(String[] args){
     Scanner obj = new Scanner(System.in);
     System.out.print("Input the term till the series will go : ");
     int term = obj.nextInt();
     int count = 2;
     float sum = 1;
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
   public static float exponent(int x, int term){
     int product = 1;
     float result;
     while (term != 0){
       product = product * x;
       term --;
     }
     result = (float) 1 / product;
     return result;
   }
 }

 // Output
Input the term till the series will go : Input the base : Sum of 2's series till 4 is : 1.3125
Input the term till the series will go : Input the base : Sum of 3's series till 6 is : 1.1248286
