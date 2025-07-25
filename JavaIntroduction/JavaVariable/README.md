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

### Example

```java
// Good
int minutesPerHour = 60;

// OK, but not so easy to understand what m actually is
int m = 60;

```
# Java Numbers

Java has two main groups of **primitive number types**:

---

## 1. Integer Types

Store **whole numbers** (positive or negative) **without decimals**.

### Types:
- `byte`
- `short`
- `int`
- `long`

---

### Byte
- Stores numbers from **-128 to 127**
- Useful to save memory if values fit in this range

```java
byte myNum = 100;
System.out.println(myNum);

```


## Short

- Stores numbers from **-32,768 to 32,767**

```java
short myNum = 5000;
System.out.println(myNum);
```

## Int

- Stores numbers from **-2,147,483,648 to 2,147,483,647**
- Most commonly used integer type

```java
int myNum = 100000;
System.out.println(myNum);
```


## Long

- Stores numbers from **-9,223,372,036,854,775,808 to 9,223,372,036,854,775,807**
- Use when `int` range is exceeded
- End literal with `L`

```java
long myNum = 15000000000L;
System.out.println(myNum);
```


## Double

### Example
```java
double myNum = 19.99d;
System.out.println(myNum);
```

## Use float or double?

- The precision of a floating point value indicates how many digits it can have after the decimal point.
- `float` precision: about **6-7 decimal digits**.
- `double` precision: about **16 decimal digits**.
- Therefore, it is **safer to use `double`** for most calculations where precision matters.

---

## Scientific Numbers

- Floating point numbers can be represented in **scientific notation** using an `"e"` or `"E"` to indicate powers of 10.
