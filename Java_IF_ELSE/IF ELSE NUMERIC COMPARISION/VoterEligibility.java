/* Write a java application to accept voter age,check and display message whether he/she is eligible for voting or not on given criteria:-                                                                  [eligibility>=18].                 */

import java.util.Scanner;

public class VoterEligibility{
  public static void main(String[] args){
    Scanner obj = new Scanner(System.in);
    System.out.print("Please enter your age : ");
    int age = obj.nextInt();
    if (age < 18){
      age = 18 - age;
      System.out.println("He/She is not eligible for voting.\nPlease try after " + age + " year.\nThank You.");
    }
    else
    System.out.println("He/She is eligible for vote.\nPlease do your vote wisely.\nThank You.");
  }
}

// Output
Please enter your age : He/She is not eligible for voting.
Please try after 2 year.
Thank You.
Please enter your age : He/She is eligible for vote.
Please do your vote wisely.
Thank You.
