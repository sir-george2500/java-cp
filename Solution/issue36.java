// Q.36 How do you perform explicit type casting (narrowing) in Java? Provide a
// code snippet
//
// Answer: Explicit type casting in java is when a variable with a larger data
// type is being assign to a variable of a much smaller data type. In that case
// the you would need to explicitly indicate that the larger data type is being
// passed on to the smaller data type.
//

public class issue36 {
  public static void main(String[] args) {
    double numOne = 45.0;
    int numTwo = (int) numOne;

    System.out.println(numTwo);
    System.out.println(numOne);
  }
}
