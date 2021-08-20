/*3.Write a java application to accept three numbers, check and display the lowest of the given three numbers. */

import java.util.Scanner;

public class LowestOf3No{
  public static void main(String[] args){
    Scanner obj = new Scanner(System.in);
    System.out.print("First No. : ");
    int firstNo = obj.nextInt();
    System.out.print("Second No. : ");
    int secondNo = obj.nextInt();
    System.out.print("Third No. : ");
    int thirdNo = obj.nextInt();

    if (firstNo < secondNo && firstNo < thirdNo){
      System.out.println(firstNo + " is the lowest number.");
    }
    else if (secondNo < firstNo && secondNo < thirdNo){
      System.out.println(secondNo + " is the lowest number.");
    }
    else{
      System.out.println(thirdNo + " is the lowest number.");
    }
  }
}

//Output
First No. : Second No. : Third No. : 0 is the lowest number.
