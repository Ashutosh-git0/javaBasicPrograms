/*8.Write a java application to accept a number, check and display the total count of even positive no. and odd positive no.*/

import java.util.Scanner;

public class PositiveEvenOdd{
  public static void main(String[] args){
    Scanner obj = new Scanner(System.in);
    int n = obj.nextInt();
    int num = 1;
    int countEven = 0;
    int countOdd = 0;

    while (num <= n){
      if (num % 2 == 0){
        countEven = countEven + 1;
      }
      else{
        countOdd = countOdd + 1;
      }
      num ++;
    }
    System.out.println("Positive Even numbers till " + n + " : " + countEven + " and Positive Odd numbers : " + countOdd);
  }
}

//Output
Positive Even numbers till 20 : 10 and Positive Odd numbers : 10
