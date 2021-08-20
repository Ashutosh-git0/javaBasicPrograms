/* WJA to accept two no.'s , calculate and display its sum and average value */

import java.util.Scanner;

public class SumAverage{
  public static void main(String[] args){
    Scanner obj = new Scanner(System.in);

    System.out.print("First Number : ");
    float firstNo = obj.nextInt();
    System.out.print("Second Number : ");
    float secondNo = obj.nextInt();
    System.out.println("Sum : " + (firstNo + secondNo));
    System.out.println("Average : " + ((firstNo + secondNo) / 2));
  }
}

//Output
First Number : Second Number : Sum : 141.0
Average : 70.5
