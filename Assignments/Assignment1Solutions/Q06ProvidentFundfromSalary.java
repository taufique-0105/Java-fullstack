package Assignments.Assignment1Solutions;

import java.util.Scanner;

public class Q06ProvidentFundfromSalary {
  public static void main(String[] args) {
    System.out.println("Enter the salary of the employee: ");
    Scanner sc = new Scanner(System.in);
    double salary = sc.nextDouble();
    double providentFund = salary * 0.12;
    System.out.println("The provident fund of the employee is: " + providentFund);
    sc.close();
  }
}
