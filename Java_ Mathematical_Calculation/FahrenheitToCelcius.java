/* WJA to accept temperature in fahrenheit. Convert the given temperature in equivalent Celcius using formula [C=5/9(F-32)]     */

import java.util.Scanner;

public class FahrenheitToCelcius{
  public static void main(String[] args){
    Scanner obj = new Scanner(System.in);
    System.out.print("Temperature in Fahrenheit: ");
    float tempFahrenheit = obj.nextFloat();
    double tempCelcius = (tempFahrenheit - 32) * 5 / 9;
    System.out.println("Temperature In Celcius: " + tempCelcius);
  }
}

//Output
Temperature in Fahrenheit: Temperature In Celcius: 36.66666793823242
