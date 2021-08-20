/* Write a java application to compute and print the bill/invoice of the MALL by applying the condition given below:-
#.Accept/Read/Scan:- item code, item name, item type, company name, m.r.p. and quantity taken.
#.25% discount is available on item/product type Footwear otherwise 10% discount available on all other types (like Food, Garments, Stationary, etc.)
#.If payable amount exceeds Rs. 1000/- an additional discount of 5% of the payable amount is given as discount.
#.1% VAT is to be paid by consumer on getting bill.
          =======Bill/Invoice details====dated:..................
          Item Code			              :.........
          Item Name			              :.........
          Item Type			              :.........
          Company Name	             	:.........
          M.R.P in Rs.		          	:.........
          Quantity taken		        	:.........
          -----------------------------------------------------------------------
          Total amount in Rs.	      	:.........
          Discount rate in percentage	:....%
          Discount amount in Rs.	   	:.........
          -----------------------------------------------------------------------
          Payable amount in Rs.	    	:.........
          1% VAT in Rs.			          :.........
          -----------------------------------------------------------------------
          Net Bill/Invoicing amount in Rs.	:.........
       ==============================================                     */

       import java.util.Scanner;
       import java.util.Date;

       public class Bill{
         public static void main(String[] args){
           float totalBill;
           double discount;
           double payble;
           double vat;
           int discountRate;
           String compare = "Footwear";
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

           totalBill = quantity * price;

           if(compare.equals(itemType)){
             discountRate = 25;
           }
           else{
             discountRate = 10;
           }
           discount = (totalBill * discountRate) / 100;
           payble = totalBill - discount;

           if(payble > 1000){
             discountRate = discountRate + 5;
           }
           else{
             discountRate = discountRate;
           }
           discount = (totalBill * discountRate) / 100;
           payble = totalBill - discount;
           vat = payble * 0.01;

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
		 Item Code 			 : 102
		 Item Name 			 : Slipper
		 Item Type 			 : Footwear
		 Company Name    		 : Bata
		 M.R.P. in Rs.   		 : 250.0
		 Quantity taken  		 : 5
		 -------------------------------------------------------------------------------
		 Total Bill Amount in Rs. 	 : 1250.0
		 Discount rate in percentage 	 : 25%
		 Discount Amount in Rs. 	 : 312.5
		 -------------------------------------------------------------------------------
		 Payable Amount in Rs. 		 : 937.5
		 1% VAT Amount in Rs. 		 : 9.375
		 -------------------------------------------------------------------------------
		 Net Bill/Invoice Amount in Rs.  : 946.875 */
Item Code: Item Name: Item Type: Company Name: M.R.P. in Rs. : Quantity taken: 		 = = = Bill/Invoice Details = = = 2020-08-07:..................
		 Item Code 			 : 125
		 Item Name 			 : Bhujia
		 Item Type 			 : Food
		 Company Name    		 : Haldiram
		 M.R.P. in Rs.   		 : 45.0
		 Quantity taken  		 : 5
		 -------------------------------------------------------------------------------
		 Total Bill Amount in Rs. 	 : 225.0
		 Discount rate in percentage 	 : 10%
		 Discount Amount in Rs. 	 : 22.5
		 -------------------------------------------------------------------------------
		 Payable Amount in Rs. 		 : 202.5
		 1% VAT Amount in Rs. 		 : 2.025
		 -------------------------------------------------------------------------------
		 Net Bill/Invoice Amount in Rs.  : 204.525 */
