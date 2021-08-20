/* WJA to accept user first name and last name, concatenate them and display the full name */

import java.util.Scanner;

public class Name {
  public static void main(String[] args){
    Scanner obj = new Scanner(System.in);
    System.out.print("First Name: ");
    String firstName = obj.nextLine();

    System.out.print("Last Name: ");
    String lastName = obj.nextLine();
    System.out.println("Full Name: " + firstName + " " + lastName);

  }
}

//Output
First Name: Last Name: Full Name: Ashutosh Kumar
