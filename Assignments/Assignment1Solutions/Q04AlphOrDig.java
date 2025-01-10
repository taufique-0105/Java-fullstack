package Assignments.Assignment1Solutions;

import java.util.Scanner;

public class Q04AlphOrDig {
  public static void main(String[] args) {
    System.out.println("Enter a character: ");
    Scanner sc = new Scanner(System.in);
    char c = sc.next().charAt(0);
    charCheck(c);
    sc.close();
  }
  public static void charCheck(int c) {
    if (Character.isLetter(c)) {
      System.out.println(c + " is an alphabet.");
    } else if (Character.isDigit(c)) {
      System.out.println(c + " is a digit.");
    } else {
      System.out.println(c + " is neither an alphabet nor a digit.");
    }
  }
}
