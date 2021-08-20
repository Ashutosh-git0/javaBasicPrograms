/* Write a java application to accept surname of two clients, compare and display whether the surnames are same or not. */

import java.util.Scanner;

public class CompareSurName{
  public static void main(String[] args){
    Scanner obj = new Scanner(System.in);
    System.out.print("Surname of first client : ");
    String surname1 = obj.nextLine();
    System.out.print("Surname of second client : ");
    String surname2 = obj.nextLine();
    if(surname1.equals(surname2)){
      System.out.println("Both clients have same surname.");
    }
    else
      System.out.println("Clients doesn't have same surname.");
  }
}

//Output
Surname of first client : Surname of second client : Clients doesn't have same surname.
Surname of first client : Surname of second client : Both clients have same surname.
