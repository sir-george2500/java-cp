// Q19. How would you store a large number such as 15000000000 in Java? Show the
// code.
//
// Answer: I would use the long data type to create a variable and store the
// value. As it clearly surpass the limit of the integer data type and
// absolutely can't be store with in a short data type. leaving us the only
// option which is long.
//
//
public class issue19 {
  public static void main(String[] args) {
    long largeNumber = 15000000000L;
    System.out.println(largeNumber);
  }
}
