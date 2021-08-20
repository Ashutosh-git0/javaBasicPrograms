/*6.Write a java application software to calculate and print electricity bill of the consumer as per the chart given below:-
             UNIT          =============        RATE PER UNIT
             0-100                                   6.0
            101-200                                  5.50
            201-above                                5.0
Apart from this a fixed meter rental charge Rs.200/- is to be paid by consumer per month.
	=======Electricity Bill====dated:..........
	Meter No.			:.........
	Unit Consumed		:.........
	Rate per Unit		:.........
	-------------------------------------------------------
	Bill amount in Rs.		:.........
	Meter rental charge in Rs.	:.........
	-------------------------------------------------------
	Net Bill amount in Rs.	:.........                                     */


import java.util.Scanner;
import java.util.Date;

public class ElectricityBill{
  public static void main(String[] args){
    double rate;
    Scanner obj = new Scanner(System.in);

    System.out.print("Meter No. : ");
    int meterNo = obj.nextInt();
    System.out.print("Unit Consumed : ");
    int unit = obj.nextInt();

    if(unit >= 0 && unit <= 100){
      rate = 6.0;
    }
    else if(unit > 100 && unit <= 200){
      rate = 5.50;
    }
    else{
      rate = 5.0;
    }

    System.out.println("\t\t =======Electricity Bill==== " + java.time.LocalDate.now() + ":.........");
    System.out.println("\t\t Meter No. : \t\t\t" + meterNo);
    System.out.println("\t\t Unit Consumed : \t\t" + unit);
    System.out.println("\t\t Rate per Unit : \t\t" + rate);
    System.out.println("\t\t ----------------------------------------------------------------------");
    System.out.println("\t\t Bill amount in Rs. : \t\t" + (unit * rate));
    System.out.println("\t\t Meter rental charge in Rs. : \t" + 200);
    System.out.println("\t\t -----------------------------------------------------------------------");
    System.out.println("\t\t Net Bill amount in Rs. : \t" + (unit * rate + 200) + " */");
  }
}

//Output
Meter No. : Unit Consumed : 		 =======Electricity Bill==== 2020-08-07:.........
		 Meter No. : 			115689
		 Unit Consumed : 		156
		 Rate per Unit : 		5.5
		 ----------------------------------------------------------------------
		 Bill amount in Rs. : 		858.0
		 Meter rental charge in Rs. : 	200
		 -----------------------------------------------------------------------
		 Net Bill amount in Rs. : 	1058.0 */
Meter No. : Unit Consumed : 		 =======Electricity Bill==== 2020-08-07:.........
		 Meter No. : 			14578
		 Unit Consumed : 		99
		 Rate per Unit : 		6.0
		 ----------------------------------------------------------------------
		 Bill amount in Rs. : 		594.0
		 Meter rental charge in Rs. : 	200
		 -----------------------------------------------------------------------
		 Net Bill amount in Rs. : 	794.0 */
