/* Write a java application to accept item code, item name, company name, mrp and quantity taken. Calculate and print the Bill/Invoice in the given fashion as flat 30% discount is available on all product having product type "1" otherwise @ 20%. Further 1% VAT is to be paid by the consumer on getting bill.
          =======Bill/Invoice details====dated:..................
          Item Code			:.........
          Item Name			:.........
          Item Type			:.........
          Company Name		:.........
          M.R.P. in Rs.			:.........
          Quantity taken			:.........
          -----------------------------------------------------------------------
          Total amount in Rs.		:.........
          Discount amount in Rs.		:.........
          -----------------------------------------------------------------------
          Payable amount in Rs.		:.........
          1% VAT in Rs.			:.........
          -----------------------------------------------------------------------
          Net Bill/Invoicing amount in Rs.	:.........
       ============================================                     */


       import java.util.Scanner;
       import java.util.Date;

       public class Invoice{
         public static void main(String[] args){
           double discount;
           Scanner obj = new Scanner(System.in);

           System.out.print("Product/Item Code: ");
           int itemCode = obj.nextInt();
           obj.nextLine();
           System.out.print("Product/Item Name: ");
           String itemName = obj.nextLine();
           System.out.print("Company Name: ");
           String companyName = obj.nextLine();
           System.out.print("Product/Item Type: ");
           int itemType = obj.nextInt();
           System.out.print("M.R.P. in Rs. : ");
           float price = obj.nextInt();
           System.out.print("Quantity taken: ");
           int quantity = obj.nextInt();

           float totalBill = quantity * price;
           if (itemType == 1){
             discount = totalBill * 0.3;
           }
           else{
             discount = totalBill * 0.2;
           }


           System.out.println("\t\t = = = Bill/Invoice Details = = = " + java.time.LocalDate.now() + ":..................");
           System.out.println("\t\t Item Code \t : " + itemCode);
           System.out.println("\t\t Item Name \t : " + itemName);
           System.out.println("\t\t Item Type \t : " + itemType);
           System.out.println("\t\t Company Name \t : " + companyName);
           System.out.println("\t\t M.R.P. in Rs. \t : " + price);
           System.out.println("\t\t Quantity taken \t : " + quantity);
           System.out.println("\t\t ----------------------------------------------------------------------- ");
           System.out.println("\t\t Total amount in Rs. \t : " + totalBill);
           System.out.println("\t\t Discount amount in Rs. \t : " + discount);
           System.out.println("\t\t ----------------------------------------------------------------------- ");
           System.out.println("\t\t Payable amount in Rs. \t : " + (totalBill - discount));
           System.out.println("\t\t 1% VAT amount in Rs. \t : " + (totalBill * 0.01));
           System.out.println("\t\t ----------------------------------------------------------------------- ");
           System.out.println("\t\t Net Bill/Invoicing amount in Rs. \t : " + ((totalBill - discount) + (totalBill * 0.01)) + "\t\t*/");
           System.out.println("\t\t ===================================================");

         }
       }

//Output
Product/Item Code: Product/Item Name: Company Name: Product/Item Type: M.R.P. in Rs. : Quantity taken: 		 = = = Bill/Invoice Details = = = 2020-08-07:..................
		 Item Code 	 : 102
		 Item Name 	 : Core Java
		 Item Type 	 : 1
		 Company Name 	 : Code Academy
		 M.R.P. in Rs. 	 : 365.0
		 Quantity taken 	 : 1
		 ----------------------------------------------------------------------- 
		 Total amount in Rs. 	 : 365.0
		 Discount amount in Rs. 	 : 109.5
		 ----------------------------------------------------------------------- 
		 Payable amount in Rs. 	 : 255.5
		 1% VAT amount in Rs. 	 : 3.65
		 ----------------------------------------------------------------------- 
		 Net Bill/Invoicing amount in Rs. 	 : 259.15		*/
		 ===================================================
Product/Item Code: Product/Item Name: Company Name: Product/Item Type: M.R.P. in Rs. : Quantity taken: 		 = = = Bill/Invoice Details = = = 2020-08-07:..................
		 Item Code 	 : 105
		 Item Name 	 : Core Java
		 Item Type 	 : 2
		 Company Name 	 : Code Academy
		 M.R.P. in Rs. 	 : 365.0
		 Quantity taken 	 : 1
		 ----------------------------------------------------------------------- 
		 Total amount in Rs. 	 : 365.0
		 Discount amount in Rs. 	 : 73.0
		 ----------------------------------------------------------------------- 
		 Payable amount in Rs. 	 : 292.0
		 1% VAT amount in Rs. 	 : 3.65
		 ----------------------------------------------------------------------- 
		 Net Bill/Invoicing amount in Rs. 	 : 295.65		*/
		 ===================================================
