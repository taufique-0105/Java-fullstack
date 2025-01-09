package Assignments.Assignment1Solutions;

import java.util.Scanner;

public class Q01EvenOdd {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number to check even or odd: ");
    int num = sc.nextInt();
    if(num <= 0) {
      System.out.println("Invalid number");
    }
    else if(num % 2 == 0) {
      System.out.println(num + " is even");
    }
    else {
      System.out.println(num + " is odd");
    }
    sc.close();
  }
}