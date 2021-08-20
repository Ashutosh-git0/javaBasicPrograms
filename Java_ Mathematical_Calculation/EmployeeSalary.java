/* WJA to accept Employee Code, Employee Name, Post/Designation and Basic Pay of the Employee. Calculate Dearness Allowance (i.e.DA) @30% of the Basic Pay. Similarly Calculate House Rent Allowance (i.e.HRA) @20% of the Basic Pay. Calculate and print the Employee Salary Details in the given format as Income Tax is to be deductected @12% of the Gross/Total Salary.
                               = = = Employee Salary Details = = = Current Date&Time = = =
                              Employee Code                                 :.......
                              Employee Name                                 :.......
                              Post/Designation                              :.......
                              Basic Pay in Rs.                              :.......
                              Dearness Allowance in Rs.                     :.......
                              House Rent Allowance in Rs.                   :.......
                              = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =  =
                              Gross/Total Salary in Rs.                     :.......
                              Income Tax Deduction in Rs.                   :.......
                              = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =  =
                              Net Salary in Rs.                             :.......                                                            */

import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;

public class EmployeeSalary{
  public static void main(String[] args){
    Scanner obj = new Scanner(System.in);
    //System.out.println("Employee Details");
    System.out.print("Employee Code: ");
    int empCode = obj.nextInt();
    obj.nextLine();  // skip the new line character
    System.out.print("Employee Name: ");
    String empName = obj.nextLine();
    System.out.print("Employee Post/Designation: ");
    String empPost = obj.nextLine();
    System.out.print("Basic pay in Rs. : ");
    int empBasicPay = obj.nextInt();

    double da = empBasicPay * 0.3;
    double hra = empBasicPay * 0.2;
    double incomeTax = (empBasicPay + da + hra) * 0.12;

    System.out.println("\t\t\t\t = = = Employee Salary Details = = = " + java.time.LocalDateTime.now() + " = = =");
    System.out.println("\t\t\t\t Employee Code \t\t\t\t\t\t: " + empCode);
    System.out.println("\t\t\t\t Employee Name \t\t\t\t\t\t: " + empName);
    System.out.println("\t\t\t\t Post/Designation \t\t\t\t\t: " + empPost);
    System.out.println("\t\t\t\t Basic pay in Rs. \t\t\t\t\t: " + empBasicPay);
    System.out.println("\t\t\t\t Dearness Allowance in Rs. \t\t\t\t: " + da);
    System.out.println("\t\t\t\t House Rent Allowance in Rs. \t\t\t\t: " + hra);
    System.out.println("\t\t\t\t = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =  =");
    System.out.println("\t\t\t\t Gross/Total Salary in Rs. \t\t\t\t: " + (empBasicPay + da + hra));
    System.out.println("\t\t\t\t Income Tax Deduction in Rs. \t\t\t\t: " + incomeTax);
    System.out.println("\t\t\t\t = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =  =");
    System.out.println("\t\t\t\t Net Salary in Rs. \t\t\t\t\t: " + (empBasicPay + da + hra - incomeTax));

  }
}

//Output
Employee Code: Employee Name: Employee Post/Designation: Basic pay in Rs. : 				 = = = Employee Salary Details = = = 2020-08-07T00:42:29.418867 = = =
				 Employee Code 						: 1065
				 Employee Name 						: Ashutosh Kumar
				 Post/Designation 					: Junior Developer
				 Basic pay in Rs. 					: 22000
				 Dearness Allowance in Rs. 				: 6600.0
				 House Rent Allowance in Rs. 				: 4400.0
				 = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =  =
				 Gross/Total Salary in Rs. 				: 33000.0
				 Income Tax Deduction in Rs. 				: 3960.0
				 = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =  =
				 Net Salary in Rs. 					: 29040.0
