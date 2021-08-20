/* 3.WJA to create one-one variables of each primitive datatype
      which Java supports, do not initialize them with any data and
      print each of them in a separate line alongwith their name
       and see what their value is. Run this application multiple
       times and see what their value gets printed on console. */

public class Ques3_datatype_withoutValues {
 public static void main(String[] args) {
   int num;
   short s;
   byte a;
   double temperature;
   float f;
   long l;
   char grade;
   boolean lookingForJob;

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
