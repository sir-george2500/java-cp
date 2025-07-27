// Q20. Write code that declares a double variable to hold the value 123.456
// using scientific notation.
//
// Answer: The value 123.456 when converted to the scientific notation is
// written as 1.23456×10^2, but java does not support that format directly. So
// we would have to use the java built in format which uses an e which means
// exponent in place of th 10.
//
//

public class issue20 {
  public static void main(String[] args) {
    double value = 1.23456e2;
    System.out.println(value);
  }
}
