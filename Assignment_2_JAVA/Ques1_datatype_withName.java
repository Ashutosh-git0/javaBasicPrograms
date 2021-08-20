/* 1.WJA to create one-one variables of each primitive datatype
      which Java supports, initialize them with some data and
      print each of them in a separate line alongwith their name. */

public class Ques1_datatype_withName {
  public static void main(String[] args) {
      int num = 1000;
      short s = 200;
      byte a = 10;
      double temperature = 36.6;
      float f = 40000000;
      long l = 300000000;
      char grade = 'A';
      //String name = "Ashutosh";
      boolean lookingForJob = true;

      System.out.println("int num = " + num +
                          "\nshort s = " + s +
                          "\nbyte a = " + a +
                          "\ndouble temperature = " + temperature +
                          "\nfloat f = " + f +
                          "\nlong l = " + l +
                          "\nchar grade = " + grade +
                          //"\nString name = " + name +
                          "\nboolean lookingForJob = " + lookingForJob);
  }
}

// Output
int num = 1000
short s = 200
byte a = 10
double temperature = 36.6
float f = 4.0E7
long l = 300000000
char grade = A
//String name = Ashutosh
boolean lookingForJob = true
