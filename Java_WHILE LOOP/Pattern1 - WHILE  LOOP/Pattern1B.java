/*2.Write a java application to print the given message format:-
     2  4  6  8  10...............upto 20.          */

public class Pattern1B{
  public static void main(String[] args){
    int num = 1;
    while (num <= 20){
      if (num % 2 == 0){
        System.out.print(num + " ");
      }
      else{

      }
      num ++;
    }
  }
}

//Output
2 4 6 8 10 12 14 16 18 20 