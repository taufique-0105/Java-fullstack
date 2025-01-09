package Assignments.Assignment1Solutions;

import java.util.Scanner;

public class Q02Prime {
  public static void main(String[] args) {
    System.out.println("Enter number to check for prime number: ");
    Scanner scanner = new Scanner(System.in);
    int number = scanner.nextInt();
    boolean isPrime = isPrime(number);
      if(isPrime) {
        System.out.println(number + " is a prime number");
      }
      else {
        System.out.println(number + " is not a prime number");
      }
      scanner.close();
    }
    public static boolean isPrime(int number) {
      if (number <= 1) {
        return false;
      }
      for (int i = 2; i <= Math.sqrt(number); i++) {
        if (number % i == 0) {
          return false;
        }
      }
      return true;
    }
  }
