/* Write a java application to accept two strings. Compare and display message whether the strings are same or not. */

import java.util.Scanner;

public class CompareString{
  public static void main(String[] args){
    Scanner obj = new Scanner(System.in);
    System.out.print("First String : ");
    String s1 = obj.nextLine();
    System.out.print("Second String : ");
    String s2 = obj.nextLine();
    if(s1.equals(s2)){
      System.out.println("Both string are same.");
    }
    else
      System.out.println("String are not same.");
  }
}

//Output
First String : Second String : Both string are same.
First String : Second String : String are not same.
