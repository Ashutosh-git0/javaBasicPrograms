/*2.Write a java application to accept three numbers, check and display the highest of the given three numbers. */

import java.util.Scanner;

public class HighestOf3No{
  public static void main(String[] args){
    Scanner obj = new Scanner(System.in);
    System.out.print("First No. : ");
    int firstNo = obj.nextInt();
    System.out.print("Second No. : ");
    int secondNo = obj.nextInt();
    System.out.print("Third No. : ");
    int thirdNo = obj.nextInt();

    if (firstNo > secondNo && firstNo > thirdNo){
      System.out.println(firstNo + " is the highest number.");
    }
    else if (secondNo > firstNo && secondNo > thirdNo){
      System.out.println(secondNo + " is the highest number.");
    }
    else{
      System.out.println(thirdNo + " is the highest number.");
    }
  }
}

//Output
First No. : Second No. : Third No. : 28 is the highest number.
