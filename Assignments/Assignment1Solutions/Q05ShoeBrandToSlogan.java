package Assignments.Assignment1Solutions;

import java.util.Scanner;

public class Q05ShoeBrandToSlogan {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the shoe brand name: ");
    String brand = sc.nextLine();
    String slogan = shoeSlogan(brand);
    System.out.println("The slogan for the brand " + brand + " is: " + slogan);
    sc.close();
  }
    
  private static String shoeSlogan(String brand) {
    String brandx = brand.toLowerCase();
    switch (brandx) {
      case "nike":
        return "Just Do It";

      case "adidas":
        return "Impossible is Nothing";
      
      case "puma":
        return "Forever Faster";
      
      case "reebook":
        return "I am what I am";
    
      default:
        return "Unknown";
    }
  }
}
