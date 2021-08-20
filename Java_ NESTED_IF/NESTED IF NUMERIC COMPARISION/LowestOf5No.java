/*5.Write a java application to accept five numbers, check and display the smallest of the given five numbers. */

import java.util.Scanner;

public class LowestOf5No{
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
    System.out.print("Fifth No. : ");
    int fifthNo = obj.nextInt();

    if (firstNo < secondNo && firstNo < thirdNo && firstNo < fourthNo && firstNo < fifthNo){
      System.out.println(firstNo + " is the smallest number.");
    }
    else if (secondNo < firstNo && secondNo < thirdNo && secondNo < fourthNo && secondNo < fifthNo){
      System.out.println(secondNo + " is the smallest number.");
    }
    else if (thirdNo < firstNo && thirdNo < secondNo && thirdNo < fourthNo && thirdNo < fifthNo){
      System.out.println(thirdNo + " is the smallest number.");
    }
    else if (fourthNo < firstNo && fourthNo < secondNo  && fourthNo < thirdNo && fourthNo < fifthNo){
      System.out.println(fourthNo + " is the smallest number.");
    }
    else {
      System.out.println(fifthNo + " is the smallest number.");
    }
  }
}

//Output
First No. : Second No. : Third No. : Fourth No. : Fifth No. : 3 is the smallest number.
