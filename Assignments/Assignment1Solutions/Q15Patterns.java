package Assignments.Assignment1Solutions;

import java.util.Scanner;

public class Q15Patterns {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the pattern number(1-7): ");
    int num = sc.nextInt();
    switch (num) {
      case 1:
        pattern1();
        break;
      case 2:
        pattern2();
        break;
      case 3:
        pattern3();
        break;
      case 4:
        pattern4();
        break;
      case 5:
        pattern5();
        break;
      case 6:
        pattern6();
        break;
      case 7:
        pattern7();
        break;
      default:
        System.out.println("Invalid pattern number");
        break;
    }
    sc.close();
  }

  public static void pattern1() {
    for (int i = 1; i <= 5; i++) {
      for (int j = 1; j <= 5; j++) {
        System.out.print("* ");
      }
      System.out.println();
    }
  }

  public static void pattern2() {
    for (int i = 1; i <= 5; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print(i);
      }
      System.out.println();
    }
  }

  public static void pattern3() {
    for (int i = 1; i <= 5; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print(j);
      }
      System.out.println();
    }
  }

  public static void pattern4() {
    for (int i = 5; i >= 1; i--) {
      for (int j = 1; j < i; j++) {
        System.out.print(" ");
      }
      for (int j = 5; j >= i; j--) {
        System.out.print("*");
      }
      System.out.println();
    }
  }

  public static void pattern5() {
    for (int i = 5; i >= 1; i--) {
      for (int j = 1; j < i; j++) {
        System.out.print(" ");
      }
      for (int j = 5; j >= i; j--) {
        System.out.print("* ");
      }
      System.out.println();
    }
  }

  public static void pattern6() {
    for (int i = 5; i >= 1; i--) {
      for (int j = 5; j >= i; j--) {
        System.out.print(" ");
      }
      for (int j = 1; j <= i; j++) {
        System.out.print("* ");
      }
      System.out.println();
    }
  }

  public static void pattern7() {
    int rows = 5; // Number of rows in the triangle

    for (int i = 0; i < rows; i++) {
      // Printing spaces for alignment
      for (int j = 0; j < rows - i; j++) {
        System.out.print(" ");
      }

      int number = 1; // Starting value
      for (int j = 0; j <= i; j++) {
        System.out.print(number + " ");
        // Calculate the next number in the row
        number = number * (i - j) / (j + 1);
      }
      System.out.println();
    }
  }
}
