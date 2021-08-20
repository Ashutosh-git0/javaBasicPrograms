/* Write a java application to accept mnth no., check and display the corresponding month name.   */

import java.util.Scanner;

public class CheckMonth{
  public static void main(String[] args){
    Scanner obj = new Scanner(System.in);
    System.out.print("Month Number : ");
    int month = obj.nextInt();
    String monthName;

    switch (month) {
      case 1:
        monthName = "JANUARY";
        break;
      case 2:
        monthName = "FEBRUARY";
        break;
      case 3:
        monthName = "MARCH";
        break;
      case 4:
        monthName = "APRIL";
        break;
      case 5:
        monthName = "MAY";
        break;
      case 6:
        monthName = "JUNE";
        break;
      case 7:
        monthName = "JULY";
        break;
      case 8:
        monthName = "AUGUST";
        break;
      case 9:
        monthName = "SEPTEMBER";
        break;
      case 10:
        monthName = "OCTOBER";
        break;
      case 11:
        monthName = "NOVEMBER";
        break;
      case 12:
        monthName = "DECEMBER";
        break;
      default:
        monthName = "Invalid Month";
      break;
    }
    System.out.println(monthName);

  }
}

//Output
Month Number : MAY
Month Number : JANUARY
