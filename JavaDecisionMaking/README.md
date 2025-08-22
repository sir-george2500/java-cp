# Java Decision Making and Loops

Java provides structures to control the flow of your program's execution. These include decision-making statements that evaluate conditions and loops that allow repetitive execution of code blocks.

## Decision Making Statements:
- **if statement**
- **if-else statement**
- **nested if statement**
- **if-else-if ladder**
- **switch statement**

## Loop Statements:
- **for loop**
- **enhanced for loop (for-each)**
- **while loop**
- **do-while loop**

## 1. Java if Statement

The `if` statement is the most fundamental decision-making statement. It tells your program to execute a certain section of code only if a specified condition evaluates to `true`.

### Syntax

```java
if (Boolean_expression) {
   // Statements to execute if the Boolean expression is true
}
```

### How it Works
1. The Boolean expression is evaluated.
2. If the expression evaluates to `true`, the statements inside the if block are executed.
3. If the expression evaluates to `false`, the statements inside the if block are skipped.

### Example

```java
public class IfStatementExample {
   public static void main(String[] args) {
      int x = 10;
      
      if (x > 5) {
         System.out.println("x is greater than 5");
      }
      
      System.out.println("This statement is outside the if block");
   }
}
```

### Output
```
x is greater than 5
This statement is outside the if block
```

## 2. Java if-else Statement

The `if-else` statement is an extension of the `if` statement that provides an alternative path of execution when the condition evaluates to `false`.

### Syntax

```java
if (Boolean_expression) {
   // Statements to execute if the Boolean expression is true
} else {
   // Statements to execute if the Boolean expression is false
}
```

### Example

```java
public class IfElseExample {
   public static void main(String[] args) {
      int x = 3;
      
      if (x > 5) {
         System.out.println("x is greater than 5");
      } else {
         System.out.println("x is less than or equal to 5");
      }
   }
}
```

### Output
```
x is less than or equal to 5
```

## 3. Java if-else-if Ladder

The `if-else-if` ladder allows you to check multiple conditions in sequence.

### Syntax

```java
if (condition1) {
   // Statements to execute if condition1 is true
} else if (condition2) {
   // Statements to execute if condition2 is true
} else if (condition3) {
   // Statements to execute if condition3 is true
} else {
   // Statements to execute if all conditions are false
}
```

### Example

```java
public class IfElseIfExample {
   public static void main(String[] args) {
      int score = 75;
      
      if (score >= 90) {
         System.out.println("Grade: A");
      } else if (score >= 80) {
         System.out.println("Grade: B");
      } else if (score >= 70) {
         System.out.println("Grade: C");
      } else if (score >= 60) {
         System.out.println("Grade: D");
      } else {
         System.out.println("Grade: F");
      }
   }
}
```

### Output
```
Grade: C
```

## 4. Nested if Statement

Java allows you to nest `if` statements within other `if` or `else` blocks.

### Syntax

```java
if (condition1) {
   // Statements to execute if condition1 is true
   if (condition2) {
      // Statements to execute if both condition1 and condition2 are true
   }
}
```

### Example

```java
public class NestedIfExample {
   public static void main(String[] args) {
      int age = 25;
      boolean hasLicense = true;
      
      if (age >= 18) {
         System.out.println("You are an adult");
         
         if (hasLicense) {
            System.out.println("You can drive a car");
         } else {
            System.out.println("You need to get a license to drive");
         }
      } else {
         System.out.println("You are a minor");
      }
   }
}
```

### Output
```
You are an adult
You can drive a car
```

## 5. Java switch Statement

The `switch` statement provides an elegant way to test a variable against multiple values when there are many possible execution paths based on the value of a single variable.

### Syntax

```java
switch (expression) {
   case value1:
      // Statements to execute if expression equals value1
      break; // Optional
   case value2:
      // Statements to execute if expression equals value2
      break; // Optional
   // More cases can be added
   default: // Optional
      // Statements to execute if no match is found
}
```

### Important Notes about switch
- The `expression` must evaluate to a `byte`, `short`, `int`, `char`, `String` (from Java 7), or an `enum`.
- The `break` statement is used to terminate the switch statement. If omitted, execution continues to the next case.
- The `default` case is optional and handles all values that don't match any of the case values.

### Example

```java
public class SwitchExample {
   public static void main(String[] args) {
      int day = 4;
      String dayName;
      
      switch (day) {
         case 1:
            dayName = "Monday";
            break;
         case 2:
            dayName = "Tuesday";
            break;
         case 3:
            dayName = "Wednesday";
            break;
         case 4:
            dayName = "Thursday";
            break;
         case 5:
            dayName = "Friday";
            break;
         case 6:
            dayName = "Saturday";
            break;
         case 7:
            dayName = "Sunday";
            break;
         default:
            dayName = "Invalid day";
      }
      
      System.out.println("Day: " + dayName);
   }
}
```

### Output
```
Day: Thursday
```

### Switch with Fall-Through (Omitting break)

When you omit the `break` statement, execution "falls through" to the next case, which can be useful for cases that share the same code.

```java
public class SwitchFallThroughExample {
   public static void main(String[] args) {
      int day = 3;
      
      switch (day) {
         case 1:
         case 2:
         case 3:
         case 4:
         case 5:
            System.out.println("It's a weekday");
            break;
         case 6:
         case 7:
            System.out.println("It's a weekend");
            break;
         default:
            System.out.println("Invalid day");
      }
   }
}
```

### Output
```
It's a weekday
```

### Switch with String (Java 7 and later)

From Java 7, you can use `String` in the switch expression.

```java
public class SwitchStringExample {
   public static void main(String[] args) {
      String fruit = "Apple";
      
      switch (fruit) {
         case "Apple":
            System.out.println("Red fruit");
            break;
         case "Banana":
            System.out.println("Yellow fruit");
            break;
         case "Kiwi":
            System.out.println("Green fruit");
            break;
         default:
            System.out.println("Unknown fruit");
      }
   }
}
```

### Output
```
Red fruit
```

### Switch with enum

Using `enum` with switch is a common and clean approach:

```java
public class SwitchEnumExample {
   enum Day { MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY }
   
   public static void main(String[] args) {
      Day today = Day.WEDNESDAY;
      
      switch (today) {
         case MONDAY:
            System.out.println("Start of work week");
            break;
         case TUESDAY:
         case WEDNESDAY:
         case THURSDAY:
            System.out.println("Midweek");
            break;
         case FRIDAY:
            System.out.println("End of work week");
            break;
         case SATURDAY:
         case SUNDAY:
            System.out.println("Weekend");
            break;
      }
   }
}
```

### Output
```
Midweek
```

## 6. Enhanced Switch (Java 12 and later)

Java 12 introduced an enhanced version of the `switch` statement that can be used as an expression and removes the need for `break` statements.

### Syntax

```java
// As a statement
switch (expression) {
   case value1 -> code_to_execute;
   case value2 -> code_to_execute;
   default -> code_to_execute;
}

// As an expression
result = switch (expression) {
   case value1 -> expression1;
   case value2 -> expression2;
   default -> expressionDefault;
};
```

### Example

```java
public class EnhancedSwitchExample {
   public static void main(String[] args) {
      int day = 3;
      
      String dayType = switch (day) {
         case 1, 2, 3, 4, 5 -> "Weekday";
         case 6, 7 -> "Weekend";
         default -> "Invalid day";
      };
      
      System.out.println(dayType);
   }
}
```

### Output
```
Weekday
```

## 7. Ternary Operator (Conditional Operator)

The ternary operator `? :` is a concise way to write simple if-else statements.

### Syntax

```java
variable = (condition) ? expressionIfTrue : expressionIfFalse;
```

### Example

```java
public class TernaryOperatorExample {
   public static void main(String[] args) {
      int age = 15;
      String status = (age >= 18) ? "Adult" : "Minor";
      
      System.out.println("Status: " + status);
   }
}
```

### Output
```
Status: Minor
```

# Flow Charts in Java Decision Making

Flow charts provide a visual representation of the program logic, making it easier to understand the flow of execution in decision-making structures.

## Basic if Statement Flow Chart

```
      ┌─────────────┐
      │   Start     │
      └──────┬──────┘
             ▼
      ┌─────────────┐
      │ Condition?  │
      └──────┬──────┘
             ▼
        ┌────┴───┐
        │        │
      Yes│        │No
        │        │
        ▼        ▼
┌───────────┐    │
│  Execute  │    │
│   Block   │    │
└─────┬─────┘    │
      │          │
      ▼          ▼
┌─────────────────┐
│      End        │
└─────────────────┘
```

## if-else Statement Flow Chart

```
      ┌─────────────┐
      │   Start     │
      └──────┬──────┘
             ▼
      ┌─────────────┐
      │ Condition?  │
      └──────┬──────┘
             ▼
        ┌────┴───┐
        │        │
      Yes│        │No
        │        │
        ▼        ▼
┌───────────┐ ┌───────────┐
│  Execute  │ │  Execute  │
│  If Block │ │ Else Block│
└─────┬─────┘ └─────┬─────┘
      │            │
      ▼            ▼
┌─────────────────────┐
│        End          │
└─────────────────────┘
```

## if-else-if Ladder Flow Chart

```
      ┌─────────────┐
      │   Start     │
      └──────┬──────┘
             ▼
      ┌─────────────┐
      │Condition 1? │
      └──────┬──────┘
             ▼
        ┌────┴───┐
        │        │
      Yes│        │No
        │        │
        ▼        ▼
┌───────────┐ ┌─────────────┐
│  Execute  │ │Condition 2? │
│ Block 1   │ └──────┬──────┘
└─────┬─────┘        ▼
      │         ┌────┴───┐
      │         │        │
      │       Yes│        │No
      │         │        │
      │         ▼        ▼
      │  ┌───────────┐ ┌───────────┐
      │  │  Execute  │ │  Execute  │
      │  │ Block 2   │ │ Else Block│
      │  └─────┬─────┘ └─────┬─────┘
      │        │            │
      ▼        ▼            ▼
┌─────────────────────────────┐
│            End              │
└─────────────────────────────┘
```

## Switch Statement Flow Chart

```
      ┌─────────────┐
      │   Start     │
      └──────┬──────┘
             ▼
      ┌─────────────┐
      │ Expression  │
      └──────┬──────┘
             ▼
      ┌─────────────┐
      │  Case 1?    │
      └──────┬──────┘
             ▼
        ┌────┴───┐
        │        │
      Yes│        │No
        │        │
        ▼        ▼
┌───────────┐ ┌─────────────┐
│  Execute  │ │  Case 2?    │
│ Case 1    │ └──────┬──────┘
└─────┬─────┘        ▼
      │         ┌────┴───┐
      │         │        │
      │       Yes│        │No
      │         │        │
      │         ▼        ▼
      │  ┌───────────┐ ┌───────────┐
      │  │  Execute  │ │   More    │
      │  │ Case 2    │ │  Cases... │
      │  └─────┬─────┘ └─────┬─────┘
      │        │            │
      │        │            ▼
      │        │      ┌───────────┐
      │        │      │  Default  │
      │        │      │  Block    │
      │        │      └─────┬─────┘
      ▼        ▼            ▼
┌─────────────────────────────┐
│            End              │
└─────────────────────────────┘
```

# Common Use Cases for Decision Making

Decision making structures are fundamental to programming and are used in various scenarios:

1. **User Authentication**
   - Validating username/password combinations
   - Checking access permissions based on user roles

2. **Form Validation**
   - Ensuring required fields are filled
   - Validating email formats, phone numbers, etc.

3. **Menu Systems**
   - Responding to user menu selections
   - Implementing navigation logic

4. **Game Development**
   - Handling player inputs
   - Managing game states and rules
   - Determining win/lose conditions

5. **Business Logic Implementation**
   - Applying discount rules
   - Calculating taxes based on jurisdiction
   - Implementing complex business workflows

6. **Error Handling**
   - Checking for exceptional conditions
   - Providing appropriate error messages

# Best Practices

1. **Keep conditions simple and readable**
   - Break complex conditions into smaller, more manageable parts
   - Use well-named boolean variables for clarity

2. **Default cases**
   - Always include a default case in switch statements to handle unexpected values

3. **Use proper indentation**
   - Maintain consistent indentation to improve code readability

4. **Consider using enhanced switch (Java 12+)**
   - More concise and less error-prone than traditional switch statements

5. **Be mindful of fall-through in switch**
   - Only omit break statements intentionally
   - Add comments when fall-through is deliberate

6. **Prefer if-else-if for complex conditions**
   - Switch statements are best for simple equality checks
   - Use if-else-if when comparing ranges or using complex conditions

7. **Use ternary operators judiciously**
   - Great for simple conditions
   - Avoid nesting ternary operators as they become hard to read# Java Loops

Loops are used to execute a block of code repeatedly until a specific condition is met. Java supports several types of loops to handle different scenarios.

## 1. Java For Loop

The `for` loop is used when you know in advance how many times you want to execute a statement or block of statements.

### Syntax

```java
for (initialization; condition; increment/decrement) {
    // Code to be executed in each iteration
}
```

### How it Works
1. The **initialization** expression initializes the loop counter and is executed once at the beginning.
2. The **condition** is evaluated before each iteration. If it's true, the loop body executes; if false, the loop terminates.
3. After each iteration, the **increment/decrement** expression updates the loop counter.

### Example

```java
public class ForLoopExample {
    public static void main(String[] args) {
        // Print numbers from 1 to 5
        for (int i = 1; i <= 5; i++) {
            System.out.println("Count: " + i);
        }
    }
}
```

### Output
```
Count: 1
Count: 2
Count: 3
Count: 4
Count: 5
```

## 2. Enhanced For Loop (For-Each Loop)

The enhanced `for` loop (also known as the for-each loop) is specifically designed to iterate through arrays and collections. It was introduced in Java 5 to simplify array traversal.

### Syntax

```java
for (dataType item : array/collection) {
    // Code to process each item
}
```

### How it Works
1. The loop automatically iterates through each element in the array or collection.
2. In each iteration, the current element is assigned to the variable specified before the colon.
3. The loop continues until all elements have been processed.

### Example with Array

```java
public class EnhancedForLoopExample {
    public static void main(String[] args) {
        // Define an array of integers
        int[] numbers = {10, 20, 30, 40, 50};
        
        // Use enhanced for loop to iterate through the array
        for (int num : numbers) {
            System.out.println("Number: " + num);
        }
    }
}
```

### Output
```
Number: 10
Number: 20
Number: 30
Number: 40
Number: 50
```

### Example with Collection

```java
import java.util.ArrayList;
import java.util.List;

public class EnhancedForLoopWithCollection {
    public static void main(String[] args) {
        // Create a list of strings
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Date");
        
        // Use enhanced for loop to iterate through the collection
        for (String fruit : fruits) {
            System.out.println("Fruit: " + fruit);
        }
    }
}
```

### Output
```
Fruit: Apple
Fruit: Banana
Fruit: Cherry
Fruit: Date
```

### Advantages of Enhanced For Loop
1. **Simplified syntax** - Cleaner and more readable code
2. **Reduced errors** - No need to manage loop counters and array indices
3. **Safer access** - Eliminates index out-of-bounds errors
4. **Works with any Iterable** - Can be used with arrays, lists, sets, etc.

### Limitations of Enhanced For Loop
1. **No direct access to index** - You can't easily determine the current position in the array/collection
2. **Read-only access** - You can't modify the collection during iteration
3. **No backwards traversal** - Only iterates in the forward direction
4. **Can't skip elements** - Processes every element in sequence

## 3. While Loop

The `while` loop is used when you want to repeatedly execute a block of statements as long as a condition is true.

### Syntax

```java
while (condition) {
    // Code to be executed in each iteration
}
```

### How it Works
1. The condition is evaluated before each iteration.
2. If the condition is true, the loop body executes; if false, the loop terminates.
3. The condition must eventually become false to avoid infinite loops.

### Example

```java
public class WhileLoopExample {
    public static void main(String[] args) {
        int count = 1;
        
        while (count <= 5) {
            System.out.println("Count: " + count);
            count++; // Increment count to avoid infinite loop
        }
    }
}
```

### Output
```
Count: 1
Count: 2
Count: 3
Count: 4
Count: 5
```

## 4. Do-While Loop

The `do-while` loop is similar to the while loop, but it evaluates its condition at the end of each iteration. This ensures that the loop body executes at least once.

### Syntax

```java
do {
    // Code to be executed in each iteration
} while (condition);
```

### How it Works
1. The loop body executes first.
2. Then the condition is evaluated.
3. If the condition is true, the loop repeats; if false, the loop terminates.

### Example

```java
public class DoWhileExample {
    public static void main(String[] args) {
        int count = 1;
        
        do {
            System.out.println("Count: " + count);
            count++;
        } while (count <= 5);
    }
}
```

### Output
```
Count: 1
Count: 2
Count: 3
Count: 4
Count: 5
```

# Practical Examples of Enhanced For Loop (For-Each Loop)

## Example 1: Processing an Array of Objects

```java
class Student {
    private String name;
    private int grade;
    
    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }
    
    public String getName() {
        return name;
    }
    
    public int getGrade() {
        return grade;
    }
}

public class EnhancedForWithObjects {
    public static void main(String[] args) {
        // Create an array of Student objects
        Student[] students = {
            new Student("Alice", 85),
            new Student("Bob", 92),
            new Student("Charlie", 78),
            new Student("Diana", 95)
        };
        
        // Calculate average grade using enhanced for loop
        int sum = 0;
        for (Student student : students) {
            System.out.println(student.getName() + " scored " + student.getGrade());
            sum += student.getGrade();
        }
        
        double average = (double) sum / students.length;
        System.out.println("Class average: " + average);
    }
}
```

## Example 2: Working with Multi-dimensional Arrays

```java
public class EnhancedForMultiDimensional {
    public static void main(String[] args) {
        // Create a 3x3 matrix (2D array)
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        // Use nested enhanced for loops to iterate through the matrix
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println(); // New line for each row
        }
    }
}
```

## Example 3: Using Enhanced For Loop with Maps

```java
import java.util.HashMap;
import java.util.Map;

public class EnhancedForWithMap {
    public static void main(String[] args) {
        // Create a map of country and capital
        Map<String, String> countriesAndCapitals = new HashMap<>();
        countriesAndCapitals.put("USA", "Washington D.C.");
        countriesAndCapitals.put("UK", "London");
        countriesAndCapitals.put("Japan", "Tokyo");
        countriesAndCapitals.put("France", "Paris");
        
        // Use enhanced for loop with Map.entrySet()
        for (Map.Entry<String, String> entry : countriesAndCapitals.entrySet()) {
            String country = entry.getKey();
            String capital = entry.getValue();
            System.out.println("The capital of " + country + " is " + capital);
        }
    }
}
```

## Example 4: Enhanced For Loop vs. Traditional For Loop

```java
import java.util.ArrayList;
import java.util.List;

public class LoopComparison {
    public static void main(String[] args) {
        List<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Purple");
        
        System.out.println("Using enhanced for loop:");
        for (String color : colors) {
            System.out.println(color);
        }
        
        System.out.println("\nUsing traditional for loop:");
        for (int i = 0; i < colors.size(); i++) {
            System.out.println(colors.get(i));
        }
    }
}
```

# Flow Charts for Loops

## For Loop Flow Chart

```
      ┌─────────────┐
      │   Start     │
      └──────┬──────┘
             ▼
      ┌─────────────┐
      │Initialization│
      └──────┬──────┘
             ▼
┌─────────────────────┐
│     Condition?      │
└──────────┬──────────┘
           ▼
       ┌───┴───┐
       │       │
    True│       │False
       │       │
       ▼       ▼
┌─────────┐    │
│ Execute │    │
│  Block  │    │
└────┬────┘    │
     │         │
     ▼         │
┌─────────┐    │
│Increment/│    │
│Decrement│    │
└────┬────┘    │
     │         │
     └─────────┘
             ▼
      ┌─────────────┐
      │     End     │
      └─────────────┘
```

## Enhanced For Loop (For-Each) Flow Chart

```
      ┌─────────────┐
      │   Start     │
      └──────┬──────┘
             ▼
      ┌─────────────┐
      │ Get Array/  │
      │ Collection  │
      └──────┬──────┘
             ▼
      ┌─────────────┐
      │ More items? │
      └──────┬──────┘
             ▼
       ┌────┴───┐
       │        │
     Yes│        │No
       │        │
       ▼        ▼
┌─────────────┐ │
│ Get next    │ │
│   item      │ │
└──────┬──────┘ │
       │        │
       ▼        │
┌─────────────┐ │
│ Process     │ │
│   item      │ │
└──────┬──────┘ │
       │        │
       └────────┘
             ▼
      ┌─────────────┐
      │     End     │
      └─────────────┘
```

# Best Practices for Using the Enhanced For Loop

1. **Use for immutable operations**
   - Perfect for reading or processing data without modifying the collection

2. **Consider alternatives when you need the index**
   - If you need the position/index, use the traditional for loop instead

3. **Avoid modifying the collection during iteration**
   - Don't add or remove elements during iteration to avoid `ConcurrentModificationException`

4. **Use it with any Iterable object**
   - Works with arrays, lists, sets, and any class that implements the `Iterable` interface

5. **Use with streams for more complex operations**
   - For more advanced processing, consider Java 8+ streams with the enhanced for loop

6. **Be cautious with performance-critical code**
   - In some cases (rare), the traditional for loop might be marginally faster

7. **Prefer enhanced for loop over iterators when possible**
   - The enhanced for loop is more readable than explicit iterator usage
