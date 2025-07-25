# Java Basics – Step by Step Notes

## 1. Java Syntax

### Example Program: `Main.java`
```java
public class Main {
  public static void main(String[] args) {
    System.out.println("Hello World");
  }
}
```

## Explanation

### Class Declaration
- Every Java program must be inside a class.
- The class name should **start with an uppercase letter** (e.g., `Main`).
- The file name must **match the class name** (e.g., `Main.java`).

### Case Sensitivity
- Java is case-sensitive: `MyClass` and `myclass` are different.

### Running the Program
- Save the file as `Main.java`.
- Compile and run using Java tools (ensure Java is installed).

### Output
```java
Hello World
```

## 2. The `main()` Method

- Required entry point of every Java program.

### Syntax
```java
public static void main(String[] args)
```


## 4. Java Comments

### Single-Line Comment
- Starts with `//`

```java
// This is a comment
System.out.println("Hello World");
```


## 5. Java Variables

### Definition
- Variables are **containers for data**.
- Each variable has a **type** and **name**.

---

### Common Types
- `String` → Text, `"Hello"`
- `int` → Integer numbers, `123`
- `float` → Decimal numbers, `19.99f`
- `char` → Single character, `'A'`
- `boolean` → True/false values


## Java Identifiers

### What are Identifiers?
- All Java variables must be identified with **unique names**.
- These unique names are called **identifiers**.
- Identifiers can be:
  - Short names (like `x` and `y`)
  - Descriptive names (like `age`, `sum`, `totalVolume`)

---

### Note
- It is recommended to use **descriptive names** to make code understandable and maintainable.

---

### Example

```java
// Good
int minutesPerHour = 60;

// OK, but not so easy to understand what m actually is
int m = 60;

```
```
```
```
```
