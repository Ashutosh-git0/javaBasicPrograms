/* WJA to accept temperature in Celcius. Convert the given temperature in equivalent Fahrenheit using formula [F=9/5C+32]     */

import java.util.Scanner;

public class CelciusToFahrenheit{
  public static void main(String[] args){
    Scanner obj = new Scanner(System.in);
    System.out.print("Temperature in Celcius: ");
    float tempCelcius = obj.nextFloat();
    float tempFahrenheit = (tempCelcius * 9) / 5 + 32;

    System.out.println("Temperature in Fahrenheit: " + tempFahrenheit);
  }
}

//Output
Temperature in Celcius: Temperature in Fahrenheit: 97.988
