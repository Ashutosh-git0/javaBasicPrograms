/*2.Write a java application to create application software for a Tv shop offering puja discount on purchase of tv as per the chart given below:-
	TV TYPE   ------------   Discount on M.R.P.
	    LCD                      30%
            [Size(in inches)]
            24"                 32"
      LED   15%                20%
Calculate and print the bill in the following fashion as 1% vat is to be paid by customer on getting bill:-
	=======Bill/Invoice Details====dated:.....
	Tv type			:...........
optional--	Size in inches		:...........
	M.R.P. in Rs.		:...........
	Discount rate in percentage	:........%
	Discount amount in Rs.	:...........
	--------------------------------------------------------
	Payable amount in Rs.	:...........
	1% VAT in Rs.		:...........
	--------------------------------------------------------
	Net bill amount in Rs.	: ...........
	========================================                   */


import java.util.Date;
import java.util.Scanner;

public class TvShopBill{
  public static void main(String[] args){

    String tvType = null;
    String tvLcd = "LCD";
    String tvLed = "LED";
    int tvSize = 0;
    int discountRate = 0;
    Scanner obj = new Scanner(System.in);

    System.out.print("M.R.P. in Rs. : ");
    int tvMrp = obj.nextInt();
    obj.nextLine();
    if (tvMrp > 0){
      System.out.print("Tv Type : ");
      tvType = obj.nextLine();

      if (tvLcd.equalsIgnoreCase(tvType)){
        discountRate = 30;
      }
      else if (tvLed.equalsIgnoreCase(tvType)){
        System.out.print("Size in inches : ");
        tvSize = obj.nextInt();
        if (tvSize == 24){
          discountRate = 15;
        }
        else if (tvSize == 32){
          discountRate = 20;
        }
        else {
          System.out.println("This Size is not available.");
        }
      }
      else {
        System.out.println("Only LCD and LED are available.");
      }

      double discount = (tvMrp * discountRate) / 100;
      double vat = (tvMrp - discount) * 0.01;

      System.out.println("\t =======Bill/Invoice Details====== " + java.time.LocalDate.now() + ":.........");
      System.out.println("\t Tv type : \t\t\t\t" + tvType);
      System.out.println("\t optional--	Size in inches : \t" + tvSize);
      System.out.println("\t M.R.P. in Rs. : \t\t\t" + tvMrp);
      System.out.println("\t Discount rate in percentage : \t\t" + discountRate + "%");
      System.out.println("\t Discount amount in Rs. : \t\t" + discount);
      System.out.println("\t ----------------------------------------------------------------------");
      System.out.println("\t Payble amount in Rs. : \t\t" + (tvMrp - discount));
      System.out.println("\t 1% VAT in Rs. : \t\t\t" + vat);
      System.out.println("\t ----------------------------------------------------------------------");
      System.out.println("\t Net bill amount in Rs. : \t\t" + (tvMrp - discount + vat) + "*/");
      System.out.println("\t =======================================================================");
    }
    else{
      System.out.println("Free TV's are not available.");
    }
  }
}

//Output
M.R.P. in Rs. : Free TV's are not available.
M.R.P. in Rs. : Tv Type : 	 =======Bill/Invoice Details====== 2020-08-10:.........
	 Tv type : 				Lcd
	 optional--	Size in inches : 	0
	 M.R.P. in Rs. : 			35000
	 Discount rate in percentage : 		30%
	 Discount amount in Rs. : 		10500.0
	 ----------------------------------------------------------------------
	 Payble amount in Rs. : 		24500.0
	 1% VAT in Rs. : 			245.0
	 ----------------------------------------------------------------------
	 Net bill amount in Rs. : 		24745.0*/
	 =======================================================================
M.R.P. in Rs. : Tv Type : Size in inches : 	 =======Bill/Invoice Details====== 2020-08-10:.........
	 Tv type : 				led
	 optional--	Size in inches : 	24
	 M.R.P. in Rs. : 			32000
	 Discount rate in percentage : 		15%
	 Discount amount in Rs. : 		4800.0
	 ----------------------------------------------------------------------
	 Payble amount in Rs. : 		27200.0
	 1% VAT in Rs. : 			272.0
	 ----------------------------------------------------------------------
	 Net bill amount in Rs. : 		27472.0*/
	 =======================================================================
