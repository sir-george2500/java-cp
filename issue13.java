// Issue #13: Is the identifier 1stNumber valid in Java? Why or why not?

public class issue13 {
   public static void main(String[] args) {

       // ❌ INVALID: Cannot start with a digit
       // String 1stNumber = "test";  // This causes compilation error

       // Java identifiers must start with:
       // - Letter (a-z, A-Z)
       // - Underscore (_)
       // - Dollar sign ($)
       // They CANNOT start with digits (0-9)

       // ✅ VALID alternatives:
       String firstNumber = "valid";
       String number1 = "valid";
       String _1stNumber = "valid";
       String $1stNumber = "valid";

       // The rule: identifiers must start with letter, underscore, or dollar sign
       // After the first character, digits are allowed

       System.out.println("Valid identifier examples work fine!");
   }
}