/*4.Write a java application to print the given message format:-
             10
             9
             8
             .
             .
             .
             1
             Blast Off!        */

public class Pattern1D{
  public static void main(String[] args){
    int num = 10;
    while (num >= 1){
      System.out.println(num);
      num --;
    }
    System.out.println("Blast Off!");
  }
}

//Output
10
9
8
7
6
5
4
3
2
1
Blast Off!
