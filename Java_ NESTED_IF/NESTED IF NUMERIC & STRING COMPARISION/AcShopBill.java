/* Write a java application to create application software for an A/C shop offering OffSeason discount on purchase of A/C as per the chart given below:-
	AC type     -----------------     Discount on M.R.P.
	Window                            15%
                [Capacity(in ton)]
                1                  2
                20%               25%
Calculate and print the bill in the following fashion as 1% vat is to be paid by customer on getting bill.
	========Bill/Invoice Details====dated:.................
	AC type			::............
optional--	Capacity in tones		::............
	M.R.P. in Rs.		::............
	Discount rate in percentage	::.........%
	Discount amount in Rs.	::............
	------------------------------------------------------------
	Payable amount in Rs.	::............
	1%vat in Rs.		::............
	------------------------------------------------------------
	Net bill amount in Rs.	::............                                 */

import java.util.Date;
import java.util.Scanner;

public class AcShopBill{
  public static void main(String[] args){
    String acType = null;
    String acWindow = "WINDOW";
    int capacity = 0;
    int discountRate = 0;
    Scanner obj = new Scanner(System.in);

    System.out.print("Ac MRP : ");
    int acMrp = obj.nextInt();
    obj.nextLine();

    if (acMrp > 0){
      System.out.print("AC Type : ");
      acType = obj.nextLine();

      if (acWindow.equalsIgnoreCase(acType)){
        System.out.print("AC Capacity (in ton): ");
        capacity = obj.nextInt();

        if (capacity == 1){
          discountRate = 20;
        }
        else if ( capacity == 2){
          discountRate = 25;
        }
        else{
          discountRate = 0;
        }

        double discount = (acMrp * discountRate) / 100;
        double vat = (acMrp - discount) * 0.01;

        System.out.println("\t ========Bill/Invoice Details====" + java.time.LocalDate.now() + ":.................");
        System.out.println("\t AC type : \t\t\t" + acType);
        System.out.println("\t optional--	Capacity in tones : \t\t" + capacity);
        System.out.println("\t M.R.P. in Rs. : \t\t\t" + acMrp);
        System.out.println("\t Discount rate in percentage : \t\t" + discountRate + "%");
        System.out.println("\t Discount amount in Rs. : \t\t" + discount);
        System.out.println("\t ------------------------------------------------------------");
        System.out.println("\t Payable amount in Rs. : \t\t" + (acMrp - discount));
        System.out.println("\t 1%vat in Rs. : \t\t\t" + vat);
        System.out.println("\t ------------------------------------------------------------");
        System.out.println("\t Net bill amount in Rs. : \t\t" + (acMrp - discount + vat) + "*/");
      }
      else{
        System.out.println("Only Window AC's are available.");
      }
    }
    else {
      System.out.println("Free Ac's are not avilable.");
    }
  }
}

//Output
Ac MRP : Free Ac's are not avilable.
Ac MRP : AC Type : Only Window AC's are available.
Ac MRP : AC Type : AC Capacity (in ton): 	 ========Bill/Invoice Details====2020-08-10:.................
	 AC type : 			window
	 optional--	Capacity in tones : 		2
	 M.R.P. in Rs. : 			24000
	 Discount rate in percentage : 		25%
	 Discount amount in Rs. : 		6000.0
	 ------------------------------------------------------------
	 Payable amount in Rs. : 		18000.0
	 1%vat in Rs. : 			180.0
	 ------------------------------------------------------------
	 Net bill amount in Rs. : 		18180.0*/
