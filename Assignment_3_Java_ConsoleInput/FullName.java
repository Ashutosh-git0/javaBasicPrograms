/* WJA to accept first name, middle name and last name of user, concatenate them and display the full name */

import java.util.Scanner;

public class FullName {
  public static void main(String[] args){
    Scanner obj = new Scanner(System.in);

    System.out.print("First Name: ");
    String firstName = obj.nextLine();

    System.out.print("Middle Name: ");
    String middleName = obj.nextLine();

    System.out.print("Last Name: ");
    String lastName = obj.nextLine();

    System.out.println("Full Name: " + firstName + " " + middleName + " " + lastName);
  }
}

//Output
First Name: Middle Name: Last Name: Full Name: Ashutosh Kumar Verma
