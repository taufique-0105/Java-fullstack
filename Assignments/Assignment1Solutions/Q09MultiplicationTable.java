package Assignments.Assignment1Solutions;

import java.util.Scanner;

public class Q09MultiplicationTable {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number to find its multiplication table: ");
    int num = sc.nextInt();
    for(int i = 1; i<=10; i++) {
      System.out.println(num + " * " + i + " = " + num*i);
    }
    sc.close();
  }
}
