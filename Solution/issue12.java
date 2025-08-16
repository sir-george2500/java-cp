// Q12. What are the valid characters that can be used in Java identifiers?
//
// Answer. identifiers in the Java programming language can use the letters,
// underscores,and numbers. But the numbers can't be before or at the beginning
// of the identifier and the letters follow the rule of case sensitivity. But
// while using the letters or words it is advise not to use keywords or
// functions of the Java language and that your identifiers should be concise
// and descriptive.
//

public class issue12 {
  public static void main(String[] args) {
    int _num = 0; // using underscores
    int num_ = 0; // using underscores
    int Num = 0; // case sensitivity not the same as num.
    int num = 0; // case sensitivity not the same as Num.
    int num1 = 0; // using numbers the right naming convention in Java.
    int 1num = 0; // is absolutely wrong naming convention in Java.
  }
}
