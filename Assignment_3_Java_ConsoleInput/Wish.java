/* WJA to accept patient name and wish hi/her wishes Get Well Soon<name>! */

import java.util.Scanner;

public class Wish {
  public static void main(String[] args){
    Scanner obj = new Scanner(System.in);
    System.out.print("Patient Name: ");
    String patientName = obj.nextLine();

    System.out.println("Get Well Soon " + patientName + "!");
  }
}

//Output
Patient Name: Get Well Soon Ashok!
