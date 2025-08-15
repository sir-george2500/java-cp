// Q54. Write a short Java program to read two integers from the user and print their sum.
//
// Answer. Below is a program that takes user input from the console and print out the sum:
//

import java.util.Scanner;

public class issue54 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the first number: ");
    int numOne = sc.nextInt();

    System.out.print("Enter the second number: ");
    int numTwo = sc.nextInt();

    System.out.println(numOne + numTwo);
    sc.close();
  }
}
