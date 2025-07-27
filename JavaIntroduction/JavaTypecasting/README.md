# Java Type Casting

Type casting is a technique that is used either by the compiler or a programmer to convert one data type to another in Java. **Type casting is also known as type conversion.**  
For example, converting `int` to `double`, `double` to `int`, `short` to `int`, etc.

There are two types of type casting allowed in Java programming:

1. **Widening type casting**
2. **Narrowing type casting**


## Widening Type Casting

Widening type casting is also known as **implicit type casting** in which a smaller type is converted into a larger type. This process is done automatically by the compiler.

### Hierarchy

Here is the hierarchy of widening type casting in Java:
```Java
byte → short → char → int → long → float → double
```


The compiler performs this type conversion automatically instead of the programmer. It changes the type of the variables at **compile time**.  
Type conversion occurs only from a **smaller data type to a larger data type**.


### Example

In this example, we are adding an integer and a double number, storing the result in a double variable to display the sum. The integer is **implicitly cast** to a double during the addition.

#### Code

```java
package mypackage;

public class Tester {
   // Main driver method
   public static void main(String[] args) {
      // Define int variables
      int num1 = 5004;
      double num2 = 2.5;
      double sum = num1 + num2;
      
      // Show output
      System.out.println("The sum of " + num1 + " and " + num2 + " is " + sum);
   }
}
```

#### output 
```java
The sum of 5004 and 2.5 is 5006.5
```


## Type Conversion Error

A **type conversion error** occurs when you try to assign a value of a **larger data type** to a variable of a **smaller data type** without explicitly converting it.

The Java compiler performs **implicit type conversion** when assigning values between compatible types, but it does **not allow conversion from a larger data type to a smaller one** without explicit type casting.

### Example

In the example below, we demonstrate how a type conversion error occurs. We created an integer variable `num1` and a double variable `num2`. The sum of `num1` and `num2` will be a double. When we try to store this sum in an integer variable, the compiler produces an error.

#### Code

```java
package mypackage;

public class Tester {
   public static void main(String[] args) {
      int num1 = 5004;
      double num2 = 2.5;

      // This will cause an error: incompatible types
      int sum = num1 + num2;

      System.out.println("Sum: " + sum);
   }
}
```


#### error 

```java

error: incompatible types: possible lossy conversion from double to int
      int sum = num1 + num2;
                ^
```

## Narrowing Type Casting

Narrowing type casting is also known as **explicit type casting** or **explicit type conversion**, and it is performed **manually by the programmer**. In narrowing type casting, a **larger data type** is converted into a **smaller data type**.

When a programmer changes the variable type in code, we can use the **cast operator** to change the type of the variable.  
For example, converting `double` to `int` or `int` to `double`.

### Syntax

Below is the syntax for narrowing type casting (manual type conversion):

```java
double doubleNum = (double) num;
```
```
```


The above statement converts the variable `num` into a double type.

### Example

In the example below, we define the `num` variable of integer type and initialize it with a value. We also define the `doubleNum` variable of double type and store the `num` variable's value after converting it to double.

Next, we create the `convertedInt` variable of integer type and store the double value after converting it back to int. In the output, we can observe the value of the double and int variables.

```java 

package mypackage;

public class Tester {
   // Main driver method
   public static void main(String[] args) {
      // Define int variable
      int num = 5004;

      // Type casting int to double
      double doubleNum = (double) num;
      // Show output
      System.out.println("The value of " + num + " after converting to the double is " + doubleNum);

      // Type casting double to int
      int convertedInt = (int) doubleNum;
      // Show output
      System.out.println("The value of " + doubleNum + " after converting to the int again is " + convertedInt);
   }
}
```
```
```
```
```

#### output 
```java

The value of 5004 after converting to the double is 5004.0
The value of 5004.0 after converting to the int again is 5004
```


```
```
