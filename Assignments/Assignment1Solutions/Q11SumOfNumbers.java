package Assignments.Assignment1Solutions;

import java.util.Scanner;

public class Q11SumOfNumbers {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter first and last number of the range: ");
    int first = sc.nextInt();
    int last = sc.nextInt();
    int sum = 0;
    for(int i = first; i<=last; i++) {
      sum += i;
    }
    System.out.println("Sum of numbers from " + first + " to " + last + " is " + sum);
    sc.close();
  }
}
