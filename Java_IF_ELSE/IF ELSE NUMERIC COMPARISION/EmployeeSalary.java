/* Write a java application to accept Employee code , Employee name, post and basic pay of the Employee. Calculate dearness allowance(i:e; da) @ 30% of the basic pay if basic pay is more than Rs. 10000/- otherwise @ 25%.
Similarly calculate house rent allowance(i:e; hra) @ 15% of the basic if basic pay is less than Rs. 8000/- otherwise @ 20%. Medical allowance is fixed Rs. 2500/- paid to each employee per month. Calculate and display Employee Salary details in the following fashion as income tax is to be deducted @ 12% of the gross/total salary:-
           =====Employee Salary Details===dated:..................
           Employee Code	               	:...........
           Employee Name		              :...........
           Post/Designation 	           	:...........
           Basic Pay in Rs. 	           	:...........
           Dearness allowance in Rs.    	:...........
           House Rent allowance in Rs.	  :...........
           Medical allowance in Rs.	      :...........
           ---------------------------------------------------------------------------
           Gross/Total Salary in Rs.    	:...........
           Income tax deduction in Rs.   	:...........
           ---------------------------------------------------------------------------
           Net Salary  in Rs.		          :...........                                */


 import java.util.Scanner;
 //import java.text.SimpleDateFormat;
 import java.util.Date;

 public class EmployeeSalary{
   public static void main(String[] args){
     Scanner obj = new Scanner(System.in);
     System.out.print("Employee Code: ");
     int empCode = obj.nextInt();
     obj.nextLine();
     System.out.print("Employee Name: ");
     String empName = obj.nextLine();
     System.out.print("Employee Post/Designation: ");
     String empPost = obj.nextLine();
     System.out.print("Basic pay in Rs. : ");
     int empBasicPay = obj.nextInt();

     double da;
     double hra;
     if (empBasicPay > 10000){
       da = empBasicPay * 0.3;
     }
     else{
       da = empBasicPay * 0.25;
     }
     if (empBasicPay < 8000){
       hra = empBasicPay * 0.15;
     }
     else{
       hra = empBasicPay * 0.2;
     }

     int mA = 2500;
     double incomeTax = (empBasicPay + da + hra + mA) * 0.12;

     System.out.println("\t\t = = = Employee Salary Details = = = " + java.time.LocalDate.now() + ":..................");
     System.out.println("\t\t Employee Code \t\t\t\t: " + empCode);
     System.out.println("\t\t Employee Name \t\t\t\t: " + empName);
     System.out.println("\t\t Post/Designation \t\t\t: " + empPost);
     System.out.println("\t\t Basic pay in Rs. \t\t\t: " + empBasicPay);
     System.out.println("\t\t Dearness Allowance in Rs. \t\t: " + da);
     System.out.println("\t\t House Rent Allowance in Rs. \t\t: " + hra);
     System.out.println("\t\t Medical allowance in Rs. \t\t: " + mA);
     System.out.println("\t\t -----------------------------------------------------------------------");
     System.out.println("\t\t Gross/Total Salary in Rs. \t\t: " + (empBasicPay + da + hra + mA));
     System.out.println("\t\t Income Tax Deduction in Rs. \t\t: " + incomeTax);
     System.out.println("\t\t ------------------------------------------------------------------------");
     System.out.println("\t\t Net Salary in Rs. \t\t\t: " + (empBasicPay + da + hra + mA - incomeTax) + "\t\t\t*/");

   }
 }

//Output
Employee Code: Employee Name: Employee Post/Designation: Basic pay in Rs. : 		 = = = Employee Salary Details = = = 2020-08-07:..................
		 Employee Code 				: 1065
		 Employee Name 				: Ashutosh
		 Post/Designation 			: Junior Developer
		 Basic pay in Rs. 			: 18000
		 Dearness Allowance in Rs. 		: 5400.0
		 House Rent Allowance in Rs. 		: 3600.0
		 Medical allowance in Rs. 		: 2500
		 -----------------------------------------------------------------------
		 Gross/Total Salary in Rs. 		: 29500.0
		 Income Tax Deduction in Rs. 		: 3540.0
		 ------------------------------------------------------------------------
		 Net Salary in Rs. 			: 25960.0			*/
