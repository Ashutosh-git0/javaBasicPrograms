/*7.Write a java application for a MALL offering discount on purchase of goods as per the chart given below:-
         Total Purchase Amount  ===========  Discount in Percentage
	1000-2000                                           10%
	2001-5000                                           15%
	5001-above                                          20%
Read/Scan item/product code,item name ,item company name,m.r.p, quantity taken.
#further 1% vat is to be paid by the consumer an getting bil:-
	========Bill/Invoicing details====dated:..............
	Item Code:			:........
	Item Name:			:........
	Item Type:			:........
	Company Name:			:........
	M.R.P in Rs.:			:........
	Quantity taken:			:........
	---------------------------------------------------------------------
	Total amount in Rs.:			:........
	Discount in percentage:		:....%
	Discount amount in Rs.:		:........
	---------------------------------------------------------------------
	Payable amount in Rs.:		:........
	1% VAT in Rs.:			:........
	===========================================
	Net Bill/Invoice amount in Rs.:		:........ 		*/


  import java.util.Scanner;
  import java.util.Date;

  public class Invoice{
    public static void main(String[] args){
      int discountRate;
      Scanner obj = new Scanner(System.in);

      System.out.print("Item Code: ");
      int itemCode = obj.nextInt();
      obj.nextLine();
      System.out.print("Item Name: ");
      String itemName = obj.nextLine();
      System.out.print("Item Type: ");
      String itemType = obj.nextLine();
      System.out.print("Company Name: ");
      String companyName = obj.nextLine();
      System.out.print("M.R.P. in Rs. : ");
      float price = obj.nextInt();
      System.out.print("Quantity taken: ");
      int quantity = obj.nextInt();

      float totalBill = quantity * price;

      if(totalBill < 1000 && totalBill > 0){
        discountRate = 0;
      }
      else if (totalBill >= 1000 && totalBill <= 2000){
        discountRate = 10;
      }
      else if (totalBill >= 2001 && totalBill <= 5000){
        discountRate = 15;
      }
      else {
        discountRate = 20;
      }
      double discount = (totalBill * discountRate) / 100;
      double payble = totalBill - discount;
      double vat = payble * 0.01;

      System.out.println("\t\t = = = Bill/Invoice Details = = = " + java.time.LocalDate.now() + ":..................");
      System.out.println("\t\t Item Code \t\t\t : " + itemCode);
      System.out.println("\t\t Item Name \t\t\t : " + itemName);
      System.out.println("\t\t Item Type \t\t\t : " + itemType);
      System.out.println("\t\t Company Name    \t\t : " + companyName);
      System.out.println("\t\t M.R.P. in Rs.   \t\t : " + price);
      System.out.println("\t\t Quantity taken  \t\t : " + quantity);
      System.out.println("\t\t -------------------------------------------------------------------------------");
      System.out.println("\t\t Total Bill Amount in Rs. \t : " + totalBill);
      System.out.println("\t\t Discount rate in percentage \t : " + discountRate + "%");
      System.out.println("\t\t Discount Amount in Rs. \t : " + discount);
      System.out.println("\t\t -------------------------------------------------------------------------------");
      System.out.println("\t\t Payable Amount in Rs. \t\t : " + payble);
      System.out.println("\t\t 1% VAT Amount in Rs. \t\t : " + vat);
      System.out.println("\t\t -------------------------------------------------------------------------------");
      System.out.println("\t\t Net Bill/Invoice Amount in Rs.  : " + (payble + vat) + " */");

    }
  }

//Output
Item Code: Item Name: Item Type: Company Name: M.R.P. in Rs. : Quantity taken: 		 = = = Bill/Invoice Details = = = 2020-08-07:..................
		 Item Code 			 : 1058
		 Item Name 			 : Jeans
		 Item Type 			 : Clothing
		 Company Name    		 : Levis
		 M.R.P. in Rs.   		 : 2500.0
		 Quantity taken  		 : 2
		 -------------------------------------------------------------------------------
		 Total Bill Amount in Rs. 	 : 5000.0
		 Discount rate in percentage 	 : 15%
		 Discount Amount in Rs. 	 : 750.0
		 -------------------------------------------------------------------------------
		 Payable Amount in Rs. 		 : 4250.0
		 1% VAT Amount in Rs. 		 : 42.5
		 -------------------------------------------------------------------------------
		 Net Bill/Invoice Amount in Rs.  : 4292.5 */
