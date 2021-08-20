/* Write a java application to accept company name, type and m.r.p of pen, check and display message to buy pen of company "Cello" whose price is more than Rs. 50/- and less than Rs. 100/- otherwise look for any other company whose type is ball pen. */

import java.util.Scanner;

public class BuyPen{
  public static void main(String[] args){
    String cello = "Cello";
    String ballPen = "Ball Pen";
    Scanner obj = new Scanner(System.in);

    System.out.print("Company Name : ");
    String company = obj.nextLine();
    System.out.print("M.R.P. of pen : ");
    int mrp = obj.nextInt();
    obj.nextLine();
    if (mrp > 0){
      if (cello.equalsIgnoreCase(company)){
        if (mrp > 50 && mrp < 100){
          System.out.println("Congratulations Cello! You got the order.");
        }
        else{
          System.out.println("Sorry Cello, Your price quote is not as per requirement.");
        }
      }
      else{
        System.out.print("Pen Type : ");
        String type = obj.nextLine();
        if (ballPen.equalsIgnoreCase(type)){
          System.out.println("Congratulations " + company + "! You got the deal.");
        }
        else{
          System.out.println("I want Ball Pen.");
        }
      }
    }
    else {
      System.out.println("Please provide price details.");
    }
  }
}


//Output
Company Name : M.R.P. of pen : Congratulations Cello! You got the order.
Company Name : M.R.P. of pen : Pen Type : Congratulations Luxor! You got the deal.
