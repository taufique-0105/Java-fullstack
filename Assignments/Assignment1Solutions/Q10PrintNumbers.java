package Assignments.Assignment1Solutions;

import java.util.Scanner;

public class Q10PrintNumbers {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter first and last number of the range: ");
    int first = sc.nextInt();
    int last = sc.nextInt();
    for(int i = first; i<=last; i++) {
      System.out.print(i + " ");
    }
    sc.close();
  }
}
