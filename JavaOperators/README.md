# Java Operators

Java operators are the symbols that are used to perform various operations on variables and values. By using these operators, we can perform operations like addition, subtraction, checking less than or greater than, etc.

There are different types of operators in Java, we have listed them below −

- **Arithmetic Operators**
- **Relational Operators**
- **Logical Operators**
- **Bitwise Operators**
- **Assignment Operators**
- **Unary Operators**
- **Ternary Operator (Conditional Operator)**

## Java Arithmetic Operators

Arithmetic operators are used in mathematical expressions in the same way that they are used in algebra. The following table lists the arithmetic operators:

Assume integer variable `A` holds `10` and variable `B` holds `20`, then:

| Operator | Description                                                   | Example         |
|----------|---------------------------------------------------------------|-----------------|
| `+`      | Adds values on either side of the operator.                    | `A + B` will give `30` |
| `-`      | Subtracts right-hand operand from left-hand operand.           | `A - B` will give `-10` |
| `*`      | Multiplies values on either side of the operator.              | `A * B` will give `200` |
| `/`      | Divides left-hand operand by right-hand operand.               | `B / A` will give `2` |
| `%`      | Divides left-hand operand by right-hand operand and returns remainder. | `B % A` will give `0` |
| `++`     | Increases the value of operand by 1.                           | `B++` gives `21` |
| `--`     | Decreases the value of operand by 1.                           | `B--` gives `19` |

```java 
public class ArithmeticExample {
    public static void main(String[] args) {
        int a = 10, b = 5;
        
        // Addition
        System.out.println("a + b = " + (a + b)); // 15
        
        // Subtraction
        System.out.println("a - b = " + (a - b)); // 5
        
        // Multiplication
        System.out.println("a * b = " + (a * b)); // 50
        
        // Division
        System.out.println("a / b = " + (a / b)); // 2
        
        // Modulus
        System.out.println("a % b = " + (a % b)); // 0
    }
}
```

When the above code is compiled and executed, it produces the following result
### Output
```java 
a + b = 15
a - b = 5
a * b = 50
a / b = 2
a % b = 0
```


## Java Assignment Operators

Assignment operators are used to assign values to variables. These operators modify the value of a variable based on the operation performed. The most commonly used assignment operator is `=`, but Java provides multiple compound assignment operators for shorthand operations.

Following are the assignment operators supported by Java language:

## Java Assignment Operators

Assignment operators are used to assign values to variables. These operators modify the value of a variable based on the operation performed. The most commonly used assignment operator is `=`, but Java provides multiple compound assignment operators for shorthand operations.

The following table lists assignment operators in Java:

| Operator | Description                                                                 | Example                               |
|----------|-----------------------------------------------------------------------------|---------------------------------------|
| `=`      | Simple assignment operator. Assigns values from right side operands to left side operand. | `C = A + B` will assign value of `A + B` into `C` |
| `+=`     | Add AND assignment operator. Adds right operand to the left operand and assigns the result to left operand. | `C += A` is equivalent to `C = C + A` |
| `-=`     | Subtract AND assignment operator. Subtracts right operand from the left operand and assigns the result to left operand. | `C -= A` is equivalent to `C = C - A` |
| `*=`     | Multiply AND assignment operator. Multiplies right operand with the left operand and assigns the result to left operand. | `C *= A` is equivalent to `C = C * A` |
| `/=`     | Divide AND assignment operator. Divides left operand with the right operand and assigns the result to left operand. | `C /= A` is equivalent to `C = C / A` |
| `%=`     | Modulus AND assignment operator. Takes modulus using two operands and assigns the result to left operand. | `C %= A` is equivalent to `C = C % A` |
| `<<=`    | Left shift AND assignment operator.                                         | `C <<= 2` is same as `C = C << 2`     |
| `>>=`    | Right shift AND assignment operator.                                        | `C >>= 2` is same as `C = C >> 2`     |
| `&=`     | Bitwise AND assignment operator.                                           | `C &= 2` is same as `C = C & 2`       |
| `^=`     | Bitwise exclusive OR and assignment operator.                              | `C ^= 2` is same as `C = C ^ 2`       |
| `|=`     | Bitwise inclusive OR and assignment operator.                              | `C |= 2` is same as `C = C | 2`       |

### Example

```java
public class AssignmentOperatorExample {
    public static void main(String[] args) {
        int A = 10;
        int B = 20;
        int C;

        C = A + B;
        System.out.println("C = A + B: " + C);

        C += A;
        System.out.println("C += A: " + C);

        C -= A;
        System.out.println("C -= A: " + C);

        C *= A;
        System.out.println("C *= A: " + C);

        C /= A;
        System.out.println("C /= A: " + C);

        C %= A;
        System.out.println("C %= A: " + C);

        C <<= 2;
        System.out.println("C <<= 2: " + C);

        C >>= 2;
        System.out.println("C >>= 2: " + C);

        C &= 2;
        System.out.println("C &= 2: " + C);

        C ^= 2;
        System.out.println("C ^= 2: " + C);

        C |= 2;
        System.out.println("C |= 2: " + C);
    }
}
```

## Java Relational Operators

Relational operators are used to compare two values. These operators return a boolean result: `true` if the condition is met and `false` otherwise. Relational operators are commonly used in decision-making statements like `if` conditions and loops.

The following relational operators are supported by Java:

Assume variable `A` holds `10` and variable `B` holds `20`, then −

| Operator | Description                                                       | Example            |
|----------|-------------------------------------------------------------------|--------------------|
| `==`     | Checks if two values are equal. Returns `true` if they are equal. | `A == B` → `false` |
| `!=`     | Checks if two values are not equal. Returns `true` if they are not equal. | `A != B` → `true`  |
| `>`      | Checks if the left operand is greater than the right operand.     | `A > B` → `false`  |
| `<`      | Checks if the left operand is less than the right operand.        | `A < B` → `true`   |
| `>=`     | Checks if the left operand is greater than or equal to the right operand. | `A >= B` → `false` |
| `<=`     | Checks if the left operand is less than or equal to the right operand.    | `A <= B` → `true`  |

### Example

```java
public class RelationalOperatorExample {
    public static void main(String[] args) {
        int A = 10;
        int B = 20;

        System.out.println("A == B: " + (A == B));
        System.out.println("A != B: " + (A != B));
        System.out.println("A > B: " + (A > B));
        System.out.println("A < B: " + (A < B));
        System.out.println("A >= B: " + (A >= B));
        System.out.println("A <= B: " + (A <= B));
    }
}
```

## Java Logical Operators

Logical operators are used to perform logical operations on boolean values. These operators are commonly used in decision-making statements such as `if` conditions and loops to control program flow.

The following table lists the logical operators:

Assume Boolean variable `A` holds `true` and variable `B` holds `false`, then −

| Operator | Description                                                                                     | Example        |
|----------|-------------------------------------------------------------------------------------------------|----------------|
| `&&`     | Logical AND. Returns `true` if both operands are `true`.                                        | `A && B` → `false` |
| `||`     | Logical OR. Returns `true` if either of the operands is `true`.                                 | `A || B` → `true`  |
| `!`      | Logical NOT. Reverses the logical state of its operand. If the condition is `true`, it becomes `false`. | `!A` → `false` |

### Example

```java
public class LogicalOperatorExample {
    public static void main(String[] args) {
        boolean A = true;
        boolean B = false;

        System.out.println("A && B: " + (A && B)); // false
        System.out.println("A || B: " + (A || B)); // true
        System.out.println("!A: " + (!A));         // false
        System.out.println("!B: " + (!B));         // true
    }
}
```

## Java Bitwise Operators

Bitwise operators are used to perform operations at the binary (bit) level. These operators work on individual bits of numbers. They are commonly used in low-level programming, encryption, and performance optimization.

Java defines several bitwise operators, which can be applied to the integer types: `long`, `int`, `short`, `char`, and `byte`.

Bitwise operators work on bits and perform bit-by-bit operations.

Assume if `a = 60` and `b = 13`; in binary format they will be:



### Bitwise Operators Table

| Operator | Description                                                      | Example                | Result (Decimal) |
|----------|------------------------------------------------------------------|------------------------|------------------|
| `&`      | Bitwise AND. Sets each bit to 1 if both bits are 1.              | `a & b` → `0000 1100`  | `12`             |
| `|`      | Bitwise OR. Sets each bit to 1 if at least one of the bits is 1. | `a | b` → `0011 1101`  | `61`             |
| `^`      | Bitwise XOR. Sets each bit to 1 if only one of the bits is 1.    | `a ^ b` → `0011 0001`  | `49`             |
| `~`      | Bitwise Complement. Inverts all the bits (1 → 0 and 0 → 1).      | `~a` → `1100 0011`     | `-61` (Two’s complement) |
| `<<`     | Left Shift. Shifts bits to the left, filling 0s on the right.    | `a << 2` → `1111 0000` | `240`            |
| `>>`     | Right Shift. Shifts bits to the right, preserving the sign bit.  | `a >> 2` → `0000 1111` | `15`             |
| `>>>`    | Unsigned Right Shift. Shifts bits to the right, filling 0s on the left. | `a >>> 2` → `0000 1111` | `15`             |

---

### Example

```java
public class BitwiseOperatorExample {
    public static void main(String[] args) {
        int a = 60; // 0011 1100
        int b = 13; // 0000 1101

        System.out.println("a & b = " + (a & b));   // 12
        System.out.println("a | b = " + (a | b));   // 61
        System.out.println("a ^ b = " + (a ^ b));   // 49
        System.out.println("~a = " + (~a));         // -61
        System.out.println("a << 2 = " + (a << 2)); // 240
        System.out.println("a >> 2 = " + (a >> 2)); // 15
        System.out.println("a >>> 2 = " + (a >>> 2)); // 15
    }
}
```

## Java Miscellaneous Operators

There are a few other operators supported by the Java language.

### Conditional Operator (`? :`)

The conditional operator is also known as the **ternary operator** because it takes three operands. It is used to evaluate Boolean expressions and decide which value should be assigned to a variable based on a condition.

The syntax is:

```java
variable x = (expression) ? value_if_true : value_if_false;
```

```java 

public class TernaryOperatorExample {
    public static void main(String[] args) {
        int a = 10;
        int b;

        // Using the ternary operator to assign value to b
        b = (a > 5) ? 100 : 200;

        System.out.println("Value of b: " + b);
    }
}
```

