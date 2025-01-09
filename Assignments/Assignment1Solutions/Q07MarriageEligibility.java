package Assignments.Assignment1Solutions;

import java.util.Scanner;

public class Q07MarriageEligibility {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the age of the person: ");
    int age = sc.nextInt();
    System.out.println("Enter salary of the person: ");
    double salary = sc.nextDouble();
    if (age >= 21 && salary >= 45000) {
      System.out.println("The person is eligible for marriage");
    } 
    else {
      System.out.println("The person is not eligible for marriage");
    }
    sc.close();
  }
}