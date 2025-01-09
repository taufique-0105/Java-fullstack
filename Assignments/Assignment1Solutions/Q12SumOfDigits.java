package Assignments.Assignment1Solutions;

import java.util.Scanner;

public class Q12SumOfDigits {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number to find the sum of its digits: ");
    int num = sc.nextInt();
    int sum = 0;
    while(num != 0) {
      sum += num % 10;
      num /= 10;
    }
    System.out.println("Sum of digits is " + sum);
    sc.close();
  }
}
