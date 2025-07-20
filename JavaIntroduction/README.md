# What is Java?

**Java** is a popular, high-level, object-oriented programming language created in **1995** by **James Gosling** at **Sun Microsystems** (which was later acquired by Oracle).

Java is now owned by **Oracle**, and it's estimated that **more than 3 billion devices** run Java.

## Java is commonly used for:

- Mobile applications (especially Android apps)
- Desktop applications
- Web applications
- Web servers and application servers
- Games
- Database connections
- And much, much more!


# Why Use Java?

- Java works on different platforms (Windows, Mac, Linux, Raspberry Pi, etc.)
- It is one of the most popular programming languages in the world
- It has a large demand in the current job market
- It is easy to learn and simple to use
- It is open-source and free
- It is secure, fast, and powerful
- It has huge community support (tens of millions of developers)
- Java is an object-oriented language which gives a clear structure to programs and allows code to be reused, lowering development costs
- As Java is close to C++ and C#, it makes it easy for programmers to switch to Java or vice versa

# Get Started

When you are finished with this tutorial, you will be able to:

- Write basic Java programs
- Create real-life examples

> 💡 *No prior programming experience is necessary to begin learning Java!*


# Getting Started with Java

Java is a powerful, platform-independent programming language. Here's how to get started writing and running Java code on your machine.

## ✅ Step 1: Install Java Development Kit (JDK)

To compile and run Java programs, you need to install the **JDK** (Java Development Kit).

- Visit: [https://www.oracle.com/java/technologies/javase-downloads.html](https://www.oracle.com/java/technologies/javase-downloads.html)
- Download and install the JDK for your operating system.
- After installation, verify it by running in your terminal or command prompt:

```bash
java -version
javac -version
```
```


# Java Code Compilation Process

The Java compilation process converts human-readable Java source code into machine-executable bytecode. Below is a step-by-step explanation of how Java code is compiled and executed.


### Writing the Source Code
- Java code is written in plain text files with a `.java` extension (e.g., `MyProgram.java`).
- The code contains classes, methods, and other Java constructs following the language's syntax.

### Compilation by the Java Compiler (javac)
- The Java compiler, `javac`, processes the `.java` file.
- It checks for syntax errors and translates the source code into bytecode, producing a `.class` file (e.g., `MyProgram.class`).
- Bytecode is a platform-independent intermediate representation of the program.

### Bytecode Generation
- The `.class` file contains bytecode, which is a set of instructions for the Java Virtual Machine (JVM).
- Bytecode is portable, meaning it can run on any device with a compatible JVM, regardless of the underlying hardware or operating system.

### Class Loading by the JVM
- When the program is executed (using the `java` command), the JVM loads the `.class` file into memory.
- The Class Loader subsystem handles loading, linking, and initializing the classes.

### Bytecode Verification
- The JVM verifies the bytecode to ensure it is valid and safe (e.g., no invalid operations or security violations).
- This step prevents corrupted or malicious code from running.

### Execution by the JVM
- The JVM interprets or compiles the bytecode into native machine code using the Just-In-Time (JIT) compiler.
- The JIT compiler optimizes the bytecode for the specific hardware, improving performance.
- The program is then executed, producing the desired output.

## Key Components
- **Java Compiler (javac)**: Converts source code to bytecode.
- **Java Virtual Machine (JVM)**: Executes bytecode, providing platform independence.
- **Just-In-Time (JIT) Compiler**: Optimizes bytecode to native code at runtime.

## Example Workflow
1. Write a Java program:
   ```java
   public class MyProgram {
       public static void main(String[] args) {
           System.out.println("Hello, World!");
       }
   }
```
```

