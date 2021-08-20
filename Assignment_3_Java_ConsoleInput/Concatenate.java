/* WJA to accept two string, concatenate them and display the same */

import java.util.Scanner;

public class Concatenate {
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
First Name: Last Name: Full Name: Ashutosh Kumar
