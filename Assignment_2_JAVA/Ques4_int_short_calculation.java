/* 4.WJA to create a variable of int and short datatype. Print their values,
add, subtract, multiply and divide them and print the result in a separate line. */

public class Ques4_int_short_calculation {
  public static void main (String[] args) {
    int num1 = 100;
    short num2 = 25;

    System.out.println("num1 = " + num1 + "\nnum2 = " + num2);
    System.out.println("\nAddition = " + (int) (num1 + num2) +
                       "\nSubtraction = " + (int) (num1 - num2) +
                       "\nMultiplication = " + (int) (num1 * num2) +
                       "\nDivide = " + (int) (num1 / num2));
  }
}

// Output


num1 = 100
num2 = 25

Addition = 125
Subtraction = 75
Multiplication = 2500
Divide = 4
