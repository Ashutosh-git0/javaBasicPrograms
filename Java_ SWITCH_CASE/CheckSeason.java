/* Write a java application to accept mnth no., check and display the corresponding season name to which month belongs.
               Month No.      ------------------       Season Name
               11,12,1,2         ------------------       Winter Season
               3,4,5,6            -------------------       Summer Season
               7,8,9,10          -------------------       Rainy Season                   */

import java.util.Scanner;

public class CheckSeason{
  public static void main(String[] args){
    Scanner obj = new Scanner(System.in);
    System.out.print("Month Number : ");
    int monthNo = obj.nextInt();
    String monthName;
    String seasonName;

    switch (monthNo) {
      case 1:
        monthName = "JANUARY";
        seasonName = "Winter Season";
        break;
      case 2:
        monthName = "FEBRUARY";
        seasonName = "Winter Season";
        break;
      case 3:
        monthName = "MARCH";
        seasonName = "Summer Season";
        break;
      case 4:
        monthName = "APRIL";
        seasonName = "Summer Season";
        break;
      case 5:
        monthName = "MAY";
        seasonName = "Summer Season";
        break;
      case 6:
        monthName = "JUNE";
        seasonName = "Summer Season";
        break;
      case 7:
        monthName = "JULY";
        seasonName = "Rainy Season";
        break;
      case 8:
        monthName = "AUGUST";
        seasonName = "Rainy Season";
        break;
      case 9:
        monthName = "SEPTEMBER";
        seasonName = "Rainy Season";
        break;
      case 10:
        monthName = "OCTOBER";
        seasonName = "Rainy Season";
        break;
      case 11:
        monthName = "NOVEMBER";
        seasonName = "Winter Season";
        break;
      case 12:
        monthName = "DECEMBER";
        seasonName = "Winter Season";
        break;
      default:
        monthName = "Wrong Month";
        seasonName = "Wrong Season";
      break;
    }
    System.out.println(monthName + " comes in " + seasonName + ".");
  }
}

//Output
Month Number : JUNE comes in Summer Season.
Month Number : NOVEMBER comes in Winter Season.
