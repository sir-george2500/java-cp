## Unicode System in Java

**Unicode** is an international character set that encompasses a vast range of characters, symbols, and scripts from many languages across the globe.

The **Java programming language**, being platform-independent, has built-in support for Unicode characters, allowing developers to create applications that can work seamlessly with diverse languages and scripts.

### Before Unicode

There were multiple standards used to represent character encoding:

- **ASCII** – for the United States.  
- **ISO 8859-1** – for Western European languages.  
- **KOI-8** – for Russian.  
- **GB18030** and **BIG-5** – for Chinese.

Due to these standards, some characters used **single-byte encoding**, others used **two-byte encoding**, and sometimes the **same code represented different characters** in different languages. This made multinational application development difficult.

### Unicode Solution

To overcome these shortcomings, the **Unicode system** was developed, where **each character is represented by 2 bytes**.

As Java was developed for multilingual support, it adopted the Unicode system.

- The lowest Unicode value is represented by `\u0000`.
- The highest Unicode value is represented by `\uFFFF`.


## Approaches: Working with Unicode Characters & Values

There are two approaches for working with Unicode characters in Java:  
**Using Unicode Escape Sequences** and **Directly Storing Unicode Characters**.

- The first approach involves representing Unicode characters using **escape sequences**, which is useful when the characters cannot be directly typed or displayed in the Java code.  
- The second approach involves **directly storing Unicode characters** in variables and is more convenient when the characters can be directly typed or displayed.

The choice of approach depends on the specific requirements of the program.  
In general:
- **Approach 2** is simpler and more convenient when the characters can be typed or displayed directly.
- **Approach 1** is necessary when they cannot.

---

### 1. Using Unicode Escape Sequences

One way to store Unicode characters in Java is by using **Unicode escape sequences**.  
An escape sequence is a series of characters that represent a special character.  

In Java, a Unicode escape sequence starts with the characters `\u` followed by **four hexadecimal digits** representing the Unicode code point of the desired character.

#### Example: Use of Unicode Escape Sequences

```java
package com.tutorialspoint;

public class UnicodeCharacterDemo {
   public static void main(String[] args) {   		 
      // Unicode escape sequence
      char unicodeChar = '\u0041';  // Code point for 'A'
      
      System.out.println("Stored Unicode Character: " + unicodeChar);
   }
}
```

#### Output
```java 

Stored Unicode Character: A
```


In the above code snippet, the Unicode escape sequence `\u0041` represents the character `'A'`.  
This escape sequence is assigned to the `char` variable `unicodeChar`, and the stored character is then printed to the console.

### Example 1: Assigning Unicode Character to Variable

```java
package package;

public class UnicodeCharacterDemo {
   public static void main(String[] args) {
      // Storing Unicode character directly
      char unicodeChar = 'A';  
      // Directly storing the character 'A'
      System.out.println("Stored Unicode Character: " + unicodeChar);
   }
}
```
```
```
```
```


#### output 

```java

Stored Unicode Character: A
```


```
```
