package Assignments.Assignment1Solutions;

import java.util.Scanner;

public class Q08Factorial {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number to find its factorial: ");
    int number = sc.nextInt();
    fact(number);
    sc.close();
  }
  public static void fact(int number) {
    int factorial = 1;
    if (number < 0) {
      System.out.println("Factorial of negative number is not possible.");
    }
    else if (number == 0) {
      System.out.println("Factorial of 0 is 1.");
    }
    else {
      for(int i = 1; i<=number; i++) {
        factorial *= i;
      }
      System.out.println("Factorial of " + number + " is " + factorial);
    }
  }
}
