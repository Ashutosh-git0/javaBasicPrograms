/* 2.WJA to create one-one variables of each primitive datatype
      which Java supports, initialize them with some data and
      print each of them in a separate line alongwith their name.
      Change the value of each variables and the again print their
      value with their name. */

      public class Ques2_datatype_withName_changedVariable {
        public static void main(String[] args) {
          int num = 1000;
          short s = 200;
          byte a = 10;
          double temperature = 36.6;
          float f = 40000000;
          long l = 300000000;
          char grade = 'A';
          boolean lookingForJob = true;

          System.out.println("int num = " + num +
                              "\nshort s = " + s +
                              "\nbyte a = " + a +
                              "\ndouble temperature = " + temperature +
                              "\nfloat f = " + f +
                              "\nlong l = " + l +
                              "\nchar grade = " + grade +
                              "\nboolean lookingForJob = " + lookingForJob + "\n\n");

            num = 200;
            s = 500;
            a = 60;
            temperature = 98.8;
            f = 900000;
            l = 65000000;
            grade = 'B';
            lookingForJob = false;
            System.out.println("int num = " + num +
                                "\nshort s = " + s +
                                "\nbyte a = " + a +
                                "\ndouble temperature = " + temperature +
                                "\nfloat f = " + f +
                                "\nlong l = " + l +
                                "\nchar grade = " + grade +
                                "\nboolean lookingForJob = " + lookingForJob);

        }
      }

//Output
int num = 1000
short s = 200
byte a = 10
double temperature = 36.6
float f = 4.0E7
long l = 300000000
char grade = A
boolean lookingForJob = true


int num = 200
short s = 500
byte a = 60
double temperature = 98.8
float f = 900000.0
long l = 65000000
char grade = B
boolean lookingForJob = false
