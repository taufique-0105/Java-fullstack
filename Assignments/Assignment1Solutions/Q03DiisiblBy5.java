package Assignments.Assignment1Solutions;

import java.util.Scanner;

public class Q03DiisiblBy5 {
  public static void main(String[] args) {
    System.out.println("Enter the number to check whether it is divisible by 5 or not: ");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    if (n%5 == 0) {
      System.out.println("Number divisible by");
    }
    else {
      System.out.println("Number not divisible by");
    }
    sc.close();
  }
}
