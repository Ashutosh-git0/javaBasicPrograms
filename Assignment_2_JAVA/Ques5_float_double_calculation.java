/* 5.WJA to create a variable of float and double datatype. Print their values,
add, subtract, multiply and divide them and print the result in a separate line. */

public class Ques5_float_double_calculation {
  public static void main (String[] args) {
    float num1 = 100;
    double num2 = 25;

    System.out.println("num1 = " + num1 + "\nnum2 = " + num2);
    System.out.println("\nAddition = " + (float) (num1 + num2) +
                       "\nSubtraction = " + (float) (num1 - num2) +
                       "\nMultiplication = " + (float) (num1 * num2) +
                       "\nDivide = " + (float) (num1 / num2));
  }
}

//Output
num1 = 100.0
num2 = 25.0

Addition = 125.0
Subtraction = 75.0
Multiplication = 2500.0
Divide = 4.0
