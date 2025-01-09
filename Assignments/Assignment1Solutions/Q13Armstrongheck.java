package Assignments.Assignment1Solutions;

import java.util.Scanner;

public class Q13Armstrongheck {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number to check if it is an Armstrong number: ");
    int num = sc.nextInt();
    int sum = 0;

    int temp = num;
    int digits = String.valueOf(num).length();
    System.out.println(digits);
    while(temp != 0) {
      sum += Math.pow(temp % 10, digits);
      temp /= 10;
    }
    if(sum == num) {
      System.out.println(num + " is an Armstrong number.");
    }
    else {
      System.out.println(num + " is not an Armstrong number.");
    }
    sc.close();
  }
}

