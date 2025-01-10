package Assignments.Assignment1Solutions;

public class Q16Pattern2 {
  public static void main(String[] args) {
    for(int i=1;i<=5;i++){
      for(int j=5;j>5-i;j--){
        System.out.print(j+" ");
      }
      System.out.println();
    }
  }
}
