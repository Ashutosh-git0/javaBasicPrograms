/*3.Write a java application to print the given message format:-
             1
             3
             5
             .
             .
             .
    upto 19          */

public class Pattern1C{
  public static void main(String[] args){
    int num = 1;
    while (num <= 20){
      if ( num % 2 == 0){

      }
      else{
        System.out.println(num + " ");
      }
      num ++;
    }
  }
}

//Output
1 
3 
5 
7 
9 
11 
13 
15 
17 
19 
