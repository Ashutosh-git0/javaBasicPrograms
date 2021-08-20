/*4.Write a java application to accept four numbers, check and display the highest of the given four numbers. */

import java.util.Scanner;

public class HighestOf4No{
  public static void main(String[] args){
    Scanner obj = new Scanner(System.in);
    System.out.print("First No. : ");
    int firstNo = obj.nextInt();
    System.out.print("Second No. : ");
    int secondNo = obj.nextInt();
    System.out.print("Third No. : ");
    int thirdNo = obj.nextInt();
    System.out.print("Fourth No. : ");
    int fourthNo = obj.nextInt();

    if (firstNo > secondNo && firstNo > thirdNo && firstNo > fourthNo){
      System.out.println(firstNo + " is the highest number.");
    }
    else if (secondNo > firstNo && secondNo > thirdNo && secondNo > fourthNo){
      System.out.println(secondNo + " is the highest number.");
    }
    else if (thirdNo > firstNo && thirdNo > secondNo && thirdNo > fourthNo){
      System.out.println(thirdNo + " is the highest number.");
    }
    else {
      System.out.println(fourthNo + " is the highest number.");
    }
  }
}

//Output
First No. : Second No. : Third No. : Fourth No. : 65 is the highest number.
