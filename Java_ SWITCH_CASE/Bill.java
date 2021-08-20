 /* Write a java application to create an application software for a publisher
 offering discount on purchase of books as per the chart given below:-
     Publisher   ------------    Discount in percentage on M.R.P.
     BPB        ------------     30%
                                Fundamental(1) --- Web Desiging(2) --- Language(3)
    TMH        ------------          15%                20%                30%
Calculate and print the Bill/Invoice  in the following format as 1% VAT is to be paid by the consumer on getting bill:-
                 = = = Bill/Invoice Details = = = Current Date&Time = = =
                 Publisher Name		:.......
optional-  Book type as 1/2/3		  :.......
                 M.R.P. in Rs.		:.......
                Discount rate in Percentage	:.......
                Discount Amount in Rs.	:.......
                ----------------------------------------------------------------------------------
                Payable Amount in Rs.	:.......
                1% VAT Amount in Rs.	:.......
                ----------------------------------------------------------------------------------
                Net Bill/Invoice Amount in Rs.	:.......                              */


import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Bill{
  public static void main(String[] args){
    int discountRate = 0;
    int bookType;
    String bookTypeName = null;
    Scanner obj = new Scanner(System.in);
    System.out.print("Publisher Name : ");
    String pubName = obj.nextLine();
    System.out.print("Book Mrp : ");
    int bookMrp = obj.nextInt();

    if (bookMrp > 0){
      switch (pubName) {
        case "BPB":
        discountRate = 30;
        break;
        case "TMH":
        System.out.print("Book Type 1. Fundamental 2. Web Designing 3. Language : ");
        bookType = obj.nextInt();

        switch (bookType) {
          case 1:
          bookTypeName = "Fundamental";
          discountRate = 15;
          break;
          case 2:
          bookTypeName = "Web Designig";
          discountRate = 20;
          break;
          case 3:
          bookTypeName = "Language";
          discountRate = 30;
          break;
          default:
          System.out.println("This is not a correct type.");
          return;
        }
        break;
        default:
        System.out.println("Incorrect Publisher Name.");
        return;

      }

        double discount = (bookMrp * discountRate) / 100;
        double vat = (bookMrp - discount) * 0.01;

        System.out.println("\t\t = = = Bill/Invoice Details = = = = = = " + java.time.LocalDateTime.now() + "= = = = =");
        System.out.println("\t\t Publisher Name : \t\t\t" + pubName);
        System.out.println("  optional-  Book type as 1/2/3 : \t\t\t" + bookTypeName);
        System.out.println("\t\t M.R.P. in Rs. : \t\t\t" + bookMrp);
        System.out.println("\t\t Discount rate in Percentage : \t\t" + discountRate + "%");
        System.out.println("\t\t Discount Amount in Rs. : \t\t" + discount);
        System.out.println("\t\t ------------------------------------------------------------------------------------");
        System.out.println("\t\t Payable Amount in Rs. : \t\t" + (bookMrp - discount));
        System.out.println("\t\t 1% VAT Amount in Rs. : \t\t" + vat);
        System.out.println("\t\t ------------------------------------------------------------------------------------");
        System.out.println("\t\t Net Bill/Invoice Amount in Rs. : \t" + (bookMrp - discount + vat) + "*/");
  }
  else {
    System.out.println("Only ebooks are Free.");
  }
  }
}


//Output
Publisher Name : Book Mrp : 		 = = = Bill/Invoice Details = = = = = = 2020-08-10T20:50:40.610330= = = = =
		 Publisher Name : 			BPB
  optional-  Book type as 1/2/3 : 			null
		 M.R.P. in Rs. : 			240
		 Discount rate in Percentage : 		30%
		 Discount Amount in Rs. : 		72.0
		 ------------------------------------------------------------------------------------
		 Payable Amount in Rs. : 		168.0
		 1% VAT Amount in Rs. : 		1.68
		 ------------------------------------------------------------------------------------
		 Net Bill/Invoice Amount in Rs. : 	169.68*/
