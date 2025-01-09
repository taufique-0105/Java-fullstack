package Assignments.Assignment1Solutions;

import java.util.Scanner;

public class Q14PrimeNumbers {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of prime numbers to print: ");
    int num = sc.nextInt();
    int count = 0;
    int i = 2;
    while (count != num) {
      if(isPrime(i)) {
        System.out.print(i + " ");
        count++;
      }
      i++;
    }
    sc.close();
  }

  public static boolean isPrime(int n) {
    if (n <= 1) return false;
    for (int i = 2; i <= Math.sqrt(n); i++) {
      if (n % i == 0) return false;
    }
    return true;
  }
}
