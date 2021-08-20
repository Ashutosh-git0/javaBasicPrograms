/* WJA to accept marks obtained in languages C, C++, Java. Calculate and print the total marks obtained in languages as well as percentage as of each language is of 200 marks.
                            = = = = = MARKSHEET = = = = =
                            Marks Obtained in C       :.......
                            Marks Obtained in C++     :.......
                            Marks Obtained in Java    :.......
                            = = = = = = = = = = = = = =
                            Total Marks Obtained      :.......
                            Aggregate                 :.......%                                                                           */


import java.util.Scanner;

public class Marksheet{
  public static void main(String[] args){
    Scanner obj = new Scanner(System.in);
    System.out.print("Marks Obtained in C : ");
    int marksC = obj.nextInt();
    System.out.print("Marks Obtained in C++ : ");
    int marksCPlus = obj.nextInt();
    System.out.print("Marks Obtained in Java : ");
    int marksJava = obj.nextInt();

    System.out.println("\t\t\t\t\t= = = = = MARKSHEET = = = = = = = = =");
    System.out.println("\t\t\t\t\tMarks Obtained in C \t\t : " + marksC);
    System.out.println("\t\t\t\t\tMarks Obtained in C++ \t\t : " + marksCPlus);
    System.out.println("\t\t\t\t\tMarks Obtained in Java \t\t : " + marksJava);
    System.out.println("\t\t\t\t\t= = = = = = = = = = = = = = = = = = =");
    System.out.println("\t\t\t\t\tTotal Marks Obtained \t\t : " + (marksC + marksCPlus + marksJava));
    System.out.println("\t\t\t\t\tAggregate \t\t\t : " + ((marksC + marksCPlus + marksJava) / 3) + "%");

  }
}

//Output
Marks Obtained in C : Marks Obtained in C++ : Marks Obtained in Java : 					= = = = = MARKSHEET = = = = = = = = =
					Marks Obtained in C 		 : 90
					Marks Obtained in C++ 		 : 90
					Marks Obtained in Java 		 : 90
					= = = = = = = = = = = = = = = = = = =
					Total Marks Obtained 		 : 270
					Aggregate 			 : 90%
