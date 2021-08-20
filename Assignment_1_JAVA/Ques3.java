public class Ques3 {
  public static void main(String[] args) {
    int i,j;
    String W="HELLO";
    for (i = 0; i < W.length(); i++) {
      for(j = 0; j <= i; j++) {
        System.out.print(W.charAt(j));
      }
      System.out.println();
    }
  }
}
