/* WJA to accept Product Code, Product Name, Company Name, Product Type, Product M.R.P. and Quantity taken. Calculate and print the Bill/Invoice on purchase of Products/Goods in the following format as 30% discount availables on all products. Finally Customer/Consumer has to pay 1% VAT on bill payment.
                               = = = Bill/Invoice Details = = = Current Date&Time = = =
                              Product/Item Code                         :.......
                              Product/Item Name                         :.......
                              Company Name                              :.......
                              Product/Item Type                         :.......
                              M.R.P. in Rs.                             :.......
                              Quantity taken                            :.......
                              = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
                              Total Bill Amount in Rs.                  :.......
                              Discount Amount in Rs.                    :.......
                              = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
                              Payable Amount in Rs.                     :.......
                              1% VAT Amount in Rs.                      :.......
                              = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
                              Net Bill/Invoice Amount in Rs.            :.......                                                          */


import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Invoice{
  public static void main(String[] args){
    Scanner obj = new Scanner(System.in);

    System.out.print("Product/Item Code: ");
    int itemCode = obj.nextInt();
    obj.nextLine();
    System.out.print("Product/Item Name: ");
    String itemName = obj.nextLine();
    System.out.print("Company Name: ");
    String companyName = obj.nextLine();
    System.out.print("Product/Item Type: ");
    String itemType = obj.nextLine();
    System.out.print("M.R.P. in Rs. : ");
    float price = obj.nextInt();
    System.out.print("Quantity taken: ");
    int quantity = obj.nextInt();

    float totalBill = quantity * price;
    double discount = totalBill * 0.3;
    double payble = totalBill - discount;
    double vat = payble * 0.01;

    System.out.println("\t\t\t\t = = = Bill/Invoice Details = = = " + java.time.LocalDateTime.now() + " = = = = = =");
    System.out.println("\t\t\t\t Product/Item Code \t\t\t\t\t\t : " + itemCode);
    System.out.println("\t\t\t\t Product/Item Name \t\t\t\t\t\t : " + itemName);
    System.out.println("\t\t\t\t Company Name      \t\t\t\t\t\t : " + companyName);
    System.out.println("\t\t\t\t Product/Item Type \t\t\t\t\t\t : " + itemType);
    System.out.println("\t\t\t\t M.R.P. in Rs.     \t\t\t\t\t\t : " + price);
    System.out.println("\t\t\t\t Quantity taken    \t\t\t\t\t\t : " + quantity);
    System.out.println("\t\t\t\t = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = ");
    System.out.println("\t\t\t\t Total Bill Amount in Rs. \t\t\t\t\t : " + totalBill);
    System.out.println("\t\t\t\t Discount Amount in Rs. \t\t\t\t\t : " + discount);
    System.out.println("\t\t\t\t = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = ");
    System.out.println("\t\t\t\t Payable Amount in Rs. \t\t\t\t\t\t : " + payble);
    System.out.println("\t\t\t\t 1% VAT Amount in Rs. \t\t\t\t\t\t : " + vat);
    System.out.println("\t\t\t\t = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = ");
    System.out.println("\t\t\t\t Net Bill/Invoice Amount in Rs. \t\t\t\t : " + (payble + vat));

  }
}

//Output
Product/Item Code: Product/Item Name: Company Name: Product/Item Type: M.R.P. in Rs. : Quantity taken: 				 = = = Bill/Invoice Details = = = 2020-08-07T01:55:05.648273 = = = = = =
				 Product/Item Code 						 : 12
				 Product/Item Name 						 : Dettol Soap
				 Company Name      						 : Dettol
				 Product/Item Type 						 : Bathing Soap
				 M.R.P. in Rs.     						 : 42.0
				 Quantity taken    						 : 8
				 = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = 
				 Total Bill Amount in Rs. 					 : 336.0
				 Discount Amount in Rs. 					 : 100.8
				 = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = 
				 Payable Amount in Rs. 						 : 235.2
				 1% VAT Amount in Rs. 						 : 2.352
				 = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = 
				 Net Bill/Invoice Amount in Rs. 				 : 237.552
