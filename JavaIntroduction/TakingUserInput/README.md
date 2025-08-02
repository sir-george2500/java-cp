# User Input in Java

To take input from the user in Java, the **Scanner** class is used.  
The Scanner class is a built-in class of the `java.util` package.

The Java Scanner class provides many built-in methods to take different types of user inputs from the users.

# How to Use Scanner Class to Take User Input?

The following are the steps to use the **Scanner** class for user input in Java:

### Step 1: Import Scanner Class

First, you need to import the Scanner class to use its methods.  
To import the Scanner class, use the following import statement:

```java
import java.util.Scanner
```

### Step 2: Create Scanner Class's Object

After importing the Scanner class, you need to create its object to use its methods.  
To create an object of the Scanner class, invoke the `Scanner()` constructor.

Below is the statement to create an object of the Scanner class:

```java
Scanner sc = new Scanner(System.in);
```


### Step 3: Take User Input

The **Scanner** class provides a variety of methods which are useful to take user input of different types.  
For example, if you want to input an integer value, use the `nextInt()` method.

The following is the statement to take user input in Java:

```java
int num = sc.nextInt();
```

The above statement will wait for an integer input from the user.  
When the user provides an integer value, that value will be assigned to the `age` variable.

## Example of User Input in Java

In the following example, we are reading two integers from the user, calculating their sum, and printing the result:

```java 

// Importing the class
import java.util.Scanner;

public class AddTwoNumbers {
   public static void main(String[] args) {
      // Creating an object of Scanner class
      Scanner sc = new Scanner(System.in);

      // Reading two Integer numbers
      // using nextInt() method
      System.out.print("Enter the first number: ");
      int num1 = sc.nextInt();

      System.out.print("Enter the second number: ");
      int num2 = sc.nextInt();

      // Calculating the sum
      int sum = num1 + num2;

      // Printing the su
      System.out.println("The sum of the two numbers is: " + sum);
   }
}
```

### output 

```java 

Enter the first number: 10
Enter the second number: 20
The sum of the two numbers is: 30
```


# Methods for Different Types of User Inputs

The **Scanner** class provides different methods for different types of user inputs.  
To explore all methods for different user inputs, look at the table below:

| Sr.No. | Method & Description |
|--------|-----------------------|
| 1 | **String next()**<br>This method finds and returns the next complete token from this scanner. |
| 2 | **BigDecimal nextBigDecimal()**<br>This method scans the next token of the input as a `BigDecimal`. |
| 3 | **BigInteger nextBigInteger()**<br>This method scans the next token of the input as a `BigInteger`. |
| 4 | **boolean nextBoolean()**<br>This method scans the next token of the input into a boolean value and returns that value. |
| 5 | **byte nextByte()**<br>This method scans the next token of the input as a byte. |
| 6 | **double nextDouble()**<br>This method scans the next token of the input as a double. |
| 7 | **float nextFloat()**<br>This method scans the next token of the input as a float. |
| 8 | **int nextInt()**<br>This method scans the next token of the input as an int. |
| 9 | **String nextLine()**<br>This method advances this scanner past the current line and returns the input that was skipped. |
| 10 | **long nextLong()**<br>This method scans the next token of the input as a long. |
| 11 | **short nextShort()**<br>This method scans the next token of the input as a short. |


# Integer Input from the User

The `nextInt()` method is used to take input of an integer from the user.

## Example

In the following example, we are taking an integer as an input:

```java 

// Importing the class
import java.util.Scanner;

public class IntegerInput {
   public static void main(String[] args) {
      // Creating an object of Scanner class
      Scanner sc = new Scanner(System.in);

      // Reading an Integer Input
      System.out.print("Input an integer value: ");
      int int_num = sc.nextInt();

      System.out.print("The input is : " + int_num);
   }
}
```

### output

```java

Input an integer value: 101
The input is : 101
```


# Float Input from the User

The `nextFloat()` method is used to take input of a float value from the user.

## Example

In the following example, we are taking a float as an input:

```java

// Importing the class
import java.util.Scanner;

public class IntegerInput {
   public static void main(String[] args) {
      // Creating an object of Scanner class
      Scanner sc = new Scanner(System.in);

      // Reading a Float Input
      System.out.print("Input a float value: ");
      float float_num = sc.nextFloat();

      System.out.print("The input is : " + float_num);
   }
}
```


### output 
```java 
Input a float value: 12.345
The input is : 12.345
```

