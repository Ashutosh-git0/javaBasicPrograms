/* WJA to two no.'s , calculate and display its product and difference value */

import java.util.Scanner;

public class ProductDifference{
  public static void main(String[] args){
    Scanner obj = new Scanner(System.in);

    System.out.print("First Number : ");
    int firstNo = obj.nextInt();
    System.out.print("Second Number : ");
    int secondNo = obj.nextInt();

    System.out.println("Product of numbers: " + (firstNo * secondNo));
    System.out.println("Differnce of numbers: " + (firstNo - secondNo));
  }
}

//Output
First Number : Second Number : Product of numbers: 1360
Differnce of numbers: 69
