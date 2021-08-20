/*6.Write a java application to accept n nos, check and display the total count of even and odd number. */

import java.util.Scanner;

public class EvenOdd{
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
    System.out.println("Even count till " + n + " : " + countEven + " and Odd count : " + countOdd);
  }
}

//Output
Even count till 17 : 8 and Odd count : 9
Even count till 5 : 2 and Odd count : 3
