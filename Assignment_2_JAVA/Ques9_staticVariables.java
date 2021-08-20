/* 9.WJA to create one-one static variables of each primitive datatype
      which Java supports, initialize them with some value and
      print each of them in a separate line alongwith their name. */

public class Ques9_staticVariables {

  static int num = 1000;
  static byte b = 20;
  static short s = 200;
  static char c = 'A';
  static long l = 400000000;
  static double d = 6000000;
  static float f = 800000000;
  static boolean isThisGood = true;

  public static void main(String[] args) {

    System.out.println("int num = " + num +
                        "\nshort s = " + s +
                        "\nbyte a = " + b +
                        "\ndouble d = " + d +
                        "\nfloat f = " + f +
                        "\nlong l = " + l +
                        "\nchar c = " + c +
                        "\nboolean isThisGood = " + isThisGood);
  }
}


//Output
int num = 1000
short s = 200
byte a = 20
double d = 6000000.0
float f = 8.0E8
long l = 400000000
char c = A
boolean isThisGood = true
