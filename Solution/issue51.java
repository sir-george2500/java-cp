
// Q51.Write the Java statement to create a Scanner object for taking input from the console.
//
// Answer. Below is the syntax for creating a scanner object for taking input from the console or user.
//
//

import java.util.Scanner;

public class issue51 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); // creating a new scanner object and initializing it to method.
    sc.close(); // scanner class being close to avoid leakage of data.
  }
}
