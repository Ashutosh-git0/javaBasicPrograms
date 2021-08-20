/*7.Write a java application to accept  n numbers, check and display the total count of positive and negative numbers.*/

import java.util.Scanner;

public class PositiveNegative{
  public static void main(String[] args){
    Scanner obj = new Scanner(System.in);
    System.out.print("How many numbers ? ");
    int n = obj.nextInt();
    int count = 1;
    int positiveCount = 0;
    int negativeCount = 0;

    while (count <= n){
      int number = obj.nextInt();

      if (number < 0){
        negativeCount ++;
      }
      else{
        positiveCount ++;
      }
      count ++;
    }
    System.out.println("Negative Count : " + negativeCount + "\nPositive Count : " + positiveCount);
  }
}

//Output
How many numbers ? Negative Count : 4
Positive Count : 2
