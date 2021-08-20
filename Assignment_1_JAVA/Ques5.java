public class Ques5 {
  public static void main(String[] args) {
    int i,j;
    int num = 1;

    for (i = 0; i < 4; i++) {
      for (j = 0; j <= i; j++) {
        System.out.print(num);
        System.out.print("\t");
      }
      System.out.println();
      num++;
    }
  }
}
