# Object-Oriented Programming (OOP) - Complete Guide

## Table of Contents
1. [Introduction to OOP](#introduction-to-oop)
2. [Core Principles](#core-principles)
3. [Classes and Objects](#classes-and-objects)
4. [Inheritance](#inheritance)
5. [Polymorphism](#polymorphism)
6. [Encapsulation](#encapsulation)
7. [Abstraction](#abstraction)
8. [Advanced Concepts](#advanced-concepts)
9. [Design Patterns](#design-patterns)
10. [Best Practices](#best-practices)
11. [Practical Examples](#practical-examples)

## Introduction to OOP

Object-Oriented Programming (OOP) is a programming paradigm that organizes code around objects rather than functions. It models real-world entities as objects that contain both data (attributes) and code (methods) that operates on that data.

### Why OOP?

- **Modularity**: Code is organized into discrete objects
- **Reusability**: Objects can be reused across different parts of an application
- **Maintainability**: Changes to one object don't affect others
- **Scalability**: Large applications can be managed more effectively
- **Real-world modeling**: Natural way to represent real-world entities

## Core Principles

OOP is built on four fundamental principles:

### 1. Encapsulation
Bundling data and methods that operate on that data within a single unit (class), and restricting access to some components.

### 2. Inheritance
Creating new classes based on existing classes, inheriting their properties and behaviors.

### 3. Polymorphism
The ability of objects of different types to be treated as instances of the same type through a common interface.

### 4. Abstraction
Hiding complex implementation details while showing only essential features of an object.

## Classes and Objects

### What is a Class?
A class is a blueprint or template that defines the structure and behavior of objects. It specifies:
- **Attributes** (data/properties)
- **Methods** (functions/behaviors)
- **Constructor** (initialization logic)

### What is an Object?
An object is an instance of a class - a concrete realization of the class blueprint with actual values for its attributes.

### Example: Car Class

```java
public class Car {
    // Attributes (Instance Variables)
    private String brand;
    private String model;
    private int year;
    private String color;
    private boolean isRunning;
    
    // Constructor
    public Car(String brand, String model, int year, String color) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.color = color;
        this.isRunning = false;
    }
    
    // Methods
    public void start() {
        if (!isRunning) {
            isRunning = true;
            System.out.println(brand + " " + model + " is now running.");
        } else {
            System.out.println("Car is already running.");
        }
    }
    
    public void stop() {
        if (isRunning) {
            isRunning = false;
            System.out.println(brand + " " + model + " has stopped.");
        } else {
            System.out.println("Car is already stopped.");
        }
    }
    
    public void honk() {
        System.out.println("Beep beep!");
    }
    
    // Getters and Setters
    public String getBrand() { return brand; }
    public String getModel() { return model; }
    public int getYear() { return year; }
    public String getColor() { return color; }
    public boolean isRunning() { return isRunning; }
    
    public void setColor(String color) { this.color = color; }
}
```

### Creating and Using Objects

```java
public class CarDemo {
    public static void main(String[] args) {
        // Creating objects (instances of Car class)
        Car myCar = new Car("Toyota", "Camry", 2023, "Blue");
        Car friendsCar = new Car("Honda", "Civic", 2022, "Red");
        
        // Using object methods
        myCar.start();
        myCar.honk();
        
        friendsCar.start();
        friendsCar.stop();
        
        // Accessing object properties through getters
        System.out.println("My car: " + myCar.getBrand() + " " + myCar.getModel());
    }
}
```

## Inheritance

Inheritance allows a class to inherit properties and methods from another class, promoting code reuse and establishing relationships between classes.

### Key Terms:
- **Parent Class** (Superclass/Base Class): The class being inherited from
- **Child Class** (Subclass/Derived Class): The class that inherits from the parent

### Example: Vehicle Hierarchy

```java
// Parent class
public class Vehicle {
    protected String brand;
    protected int year;
    protected double price;
    
    public Vehicle(String brand, int year, double price) {
        this.brand = brand;
        this.year = year;
        this.price = price;
    }
    
    public void start() {
        System.out.println("Vehicle is starting...");
    }
    
    public void stop() {
        System.out.println("Vehicle is stopping...");
    }
    
    public void displayInfo() {
        System.out.println("Brand: " + brand + ", Year: " + year + ", Price: $" + price);
    }
}

// Child class
public class Car extends Vehicle {
    private int numberOfDoors;
    private String fuelType;
    
    public Car(String brand, int year, double price, int numberOfDoors, String fuelType) {
        super(brand, year, price); // Call parent constructor
        this.numberOfDoors = numberOfDoors;
        this.fuelType = fuelType;
    }
    
    // Method overriding
    @Override
    public void start() {
        System.out.println("Car engine is starting with a key...");
    }
    
    // Additional method specific to Car
    public void openTrunk() {
        System.out.println("Trunk is opened.");
    }
    
    @Override
    public void displayInfo() {
        super.displayInfo(); // Call parent method
        System.out.println("Doors: " + numberOfDoors + ", Fuel: " + fuelType);
    }
}

// Another child class
public class Motorcycle extends Vehicle {
    private boolean hasSidecar;
    
    public Motorcycle(String brand, int year, double price, boolean hasSidecar) {
        super(brand, year, price);
        this.hasSidecar = hasSidecar;
    }
    
    @Override
    public void start() {
        System.out.println("Motorcycle is starting with a kick...");
    }
    
    public void wheelie() {
        System.out.println("Performing a wheelie!");
    }
    
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Has sidecar: " + hasSidecar);
    }
}
```

### Types of Inheritance:

1. **Single Inheritance**: One child class inherits from one parent class
2. **Multilevel Inheritance**: Chain of inheritance (A → B → C)
3. **Hierarchical Inheritance**: Multiple child classes inherit from one parent
4. **Multiple Inheritance**: One class inherits from multiple parents (not supported in Java, but achievable through interfaces)

## Polymorphism

Polymorphism allows objects of different types to be treated as instances of the same type through a common interface. There are two main types:

### 1. Compile-time Polymorphism (Method Overloading)

```java
public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }
    
    public double add(double a, double b) {
        return a + b;
    }
    
    public int add(int a, int b, int c) {
        return a + b + c;
    }
    
    public String add(String a, String b) {
        return a + b;
    }
}
```

### 2. Runtime Polymorphism (Method Overriding)

```java
public class PolymorphismDemo {
    public static void main(String[] args) {
        // Polymorphic behavior
        Vehicle[] vehicles = {
            new Car("Toyota", 2023, 25000, 4, "Gasoline"),
            new Motorcycle("Harley", 2022, 15000, false),
            new Car("Tesla", 2024, 45000, 4, "Electric")
        };
        
        // Same method call, different behavior based on actual object type
        for (Vehicle vehicle : vehicles) {
            vehicle.start(); // Calls the appropriate start() method
            vehicle.displayInfo();
            System.out.println("---");
        }
    }
}
```

### Interface-based Polymorphism

```java
interface Drivable {
    void accelerate();
    void brake();
    void turn(String direction);
}

class Car implements Drivable {
    public void accelerate() {
        System.out.println("Car is accelerating smoothly");
    }
    
    public void brake() {
        System.out.println("Car is braking with ABS");
    }
    
    public void turn(String direction) {
        System.out.println("Car is turning " + direction + " with steering wheel");
    }
}

class Boat implements Drivable {
    public void accelerate() {
        System.out.println("Boat is accelerating through water");
    }
    
    public void brake() {
        System.out.println("Boat is slowing down by reducing throttle");
    }
    
    public void turn(String direction) {
        System.out.println("Boat is turning " + direction + " with rudder");
    }
}
```

## Encapsulation

Encapsulation is about bundling data and methods together and controlling access to them.

### Access Modifiers in Java:

- **private**: Accessible only within the same class
- **protected**: Accessible within the same package and subclasses
- **public**: Accessible from anywhere
- **default** (no modifier): Accessible within the same package

### Example: BankAccount with Proper Encapsulation

```java
public class BankAccount {
    private String accountNumber;
    private String accountHolder;
    private double balance;
    private static double minimumBalance = 100.0;
    
    public BankAccount(String accountNumber, String accountHolder, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        if (initialBalance >= minimumBalance) {
            this.balance = initialBalance;
        } else {
            throw new IllegalArgumentException("Initial balance must be at least $" + minimumBalance);
        }
    }
    
    // Controlled access to balance
    public double getBalance() {
        return balance;
    }
    
    // Controlled modification of balance
    public boolean deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited $" + amount + ". New balance: $" + balance);
            return true;
        } else {
            System.out.println("Deposit amount must be positive");
            return false;
        }
    }
    
    public boolean withdraw(double amount) {
        if (amount > 0 && (balance - amount) >= minimumBalance) {
            balance -= amount;
            System.out.println("Withdrew $" + amount + ". New balance: $" + balance);
            return true;
        } else {
            System.out.println("Invalid withdrawal amount or insufficient funds");
            return false;
        }
    }
    
    // Read-only access to account info
    public String getAccountNumber() {
        return accountNumber;
    }
    
    public String getAccountHolder() {
        return accountHolder;
    }
    
    // Static method for minimum balance
    public static double getMinimumBalance() {
        return minimumBalance;
    }
}
```

## Abstraction

Abstraction hides implementation details and shows only essential features. It can be achieved through abstract classes and interfaces.

### Abstract Classes

```java
public abstract class Shape {
    protected String color;
    
    public Shape(String color) {
        this.color = color;
    }
    
    // Abstract method - must be implemented by subclasses
    public abstract double calculateArea();
    public abstract double calculatePerimeter();
    
    // Concrete method - can be used by all subclasses
    public void displayInfo() {
        System.out.println("This is a " + color + " shape");
        System.out.println("Area: " + calculateArea());
        System.out.println("Perimeter: " + calculatePerimeter());
    }
    
    public String getColor() {
        return color;
    }
}

class Circle extends Shape {
    private double radius;
    
    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }
    
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
    
    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

class Rectangle extends Shape {
    private double length;
    private double width;
    
    public Rectangle(String color, double length, double width) {
        super(color);
        this.length = length;
        this.width = width;
    }
    
    @Override
    public double calculateArea() {
        return length * width;
    }
    
    @Override
    public double calculatePerimeter() {
        return 2 * (length + width);
    }
}
```

### Interfaces

```java
interface Drawable {
    void draw();
    void erase();
    
    // Default method (Java 8+)
    default void display() {
        System.out.println("Displaying the drawable object");
    }
    
    // Static method (Java 8+)
    static void printInfo() {
        System.out.println("This is a drawable interface");
    }
}

interface Colorable {
    void setColor(String color);
    String getColor();
}

// Multiple interface implementation
class Triangle implements Drawable, Colorable {
    private String color;
    private double side1, side2, side3;
    
    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    
    @Override
    public void draw() {
        System.out.println("Drawing a triangle with sides: " + side1 + ", " + side2 + ", " + side3);
    }
    
    @Override
    public void erase() {
        System.out.println("Erasing the triangle");
    }
    
    @Override
    public void setColor(String color) {
        this.color = color;
    }
    
    @Override
    public String getColor() {
        return color;
    }
}
```

## Advanced Concepts

### 1. Composition vs Inheritance

**Composition** ("has-a" relationship) is often preferred over inheritance ("is-a" relationship) for better flexibility.

```java
// Composition example
class Engine {
    private String type;
    private int horsepower;
    
    public Engine(String type, int horsepower) {
        this.type = type;
        this.horsepower = horsepower;
    }
    
    public void start() {
        System.out.println(type + " engine starting...");
    }
    
    public void stop() {
        System.out.println(type + " engine stopping...");
    }
}

class GPS {
    public void navigate(String destination) {
        System.out.println("Navigating to: " + destination);
    }
}

class ModernCar {
    private Engine engine;    // Composition
    private GPS gps;         // Composition
    private String brand;
    
    public ModernCar(String brand, Engine engine, GPS gps) {
        this.brand = brand;
        this.engine = engine;
        this.gps = gps;
    }
    
    public void start() {
        engine.start();
        System.out.println(brand + " is ready to drive");
    }
    
    public void navigateTo(String destination) {
        gps.navigate(destination);
    }
}
```

### 2. Static vs Instance Members

```java
class Student {
    private static int totalStudents = 0;  // Static variable
    private String name;                   // Instance variable
    private int id;
    
    public Student(String name) {
        this.name = name;
        this.id = ++totalStudents;  // Increment and assign
    }
    
    // Static method
    public static int getTotalStudents() {
        return totalStudents;
    }
    
    // Instance method
    public void study() {
        System.out.println(name + " is studying");
    }
    
    // Static block - executed when class is first loaded
    static {
        System.out.println("Student class is being loaded");
    }
}
```

### 3. Inner Classes

```java
public class OuterClass {
    private int outerField = 10;
    
    // Non-static inner class
    class InnerClass {
        public void accessOuter() {
            System.out.println("Accessing outer field: " + outerField);
        }
    }
    
    // Static nested class
    static class StaticNestedClass {
        public void doSomething() {
            System.out.println("In static nested class");
        }
    }
    
    // Method with local inner class
    public void methodWithLocalClass() {
        final int localVar = 20;
        
        class LocalInnerClass {
            public void accessLocal() {
                System.out.println("Accessing local variable: " + localVar);
            }
        }
        
        LocalInnerClass local = new LocalInnerClass();
        local.accessLocal();
    }
    
    // Anonymous inner class
    public void createAnonymousClass() {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Anonymous class implementation");
            }
        };
        runnable.run();
    }
}
```

## Design Patterns

Design patterns are reusable solutions to common problems in software design.

### 1. Singleton Pattern

```java
public class DatabaseConnection {
    private static DatabaseConnection instance;
    private String connectionString;
    
    private DatabaseConnection() {
        connectionString = "jdbc:mysql://localhost:3306/mydb";
    }
    
    public static DatabaseConnection getInstance() {
        if (instance == null) {
            instance = new DatabaseConnection();
        }
        return instance;
    }
    
    public void connect() {
        System.out.println("Connected to: " + connectionString);
    }
}
```

### 2. Factory Pattern

```java
abstract class Animal {
    public abstract void makeSound();
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Woof!");
    }
}

class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Meow!");
    }
}

class AnimalFactory {
    public static Animal createAnimal(String type) {
        switch (type.toLowerCase()) {
            case "dog":
                return new Dog();
            case "cat":
                return new Cat();
            default:
                throw new IllegalArgumentException("Unknown animal type: " + type);
        }
    }
}
```

### 3. Observer Pattern

```java
import java.util.*;

interface Observer {
    void update(String message);
}

class Subject {
    private List<Observer> observers = new ArrayList<>();
    private String state;
    
    public void addObserver(Observer observer) {
        observers.add(observer);
    }
    
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }
    
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(state);
        }
    }
    
    public void setState(String state) {
        this.state = state;
        notifyObservers();
    }
}

class NewsSubscriber implements Observer {
    private String name;
    
    public NewsSubscriber(String name) {
        this.name = name;
    }
    
    @Override
    public void update(String message) {
        System.out.println(name + " received news: " + message);
    }
}
```

## Best Practices

### 1. SOLID Principles

**S - Single Responsibility Principle**
Each class should have only one reason to change.

**O - Open/Closed Principle**
Classes should be open for extension but closed for modification.

**L - Liskov Substitution Principle**
Objects of a superclass should be replaceable with objects of its subclasses.

**I - Interface Segregation Principle**
No client should be forced to depend on methods it does not use.

**D - Dependency Inversion Principle**
Depend on abstractions, not on concretions.

### 2. Naming Conventions

```java
// Class names: PascalCase
public class BankAccount { }

// Method names: camelCase
public void calculateInterest() { }

// Variable names: camelCase
private double accountBalance;

// Constants: UPPER_SNAKE_CASE
public static final double MINIMUM_BALANCE = 100.0;

// Interface names: Often start with 'I' or descriptive adjectives
interface Drawable { }
interface Serializable { }
```

### 3. Code Organization

```java
public class WellOrganizedClass {
    // 1. Static variables
    private static final String DEFAULT_NAME = "Unknown";
    
    // 2. Instance variables
    private String name;
    private int age;
    
    // 3. Constructors
    public WellOrganizedClass() {
        this(DEFAULT_NAME, 0);
    }
    
    public WellOrganizedClass(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    // 4. Public methods
    public void publicMethod() {
        // Implementation
    }
    
    // 5. Private methods
    private void privateHelper() {
        // Implementation
    }
    
    // 6. Getters and setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
}
```

## Practical Examples

### 1. Library Management System

```java
import java.util.*;

class Book {
    private String isbn;
    private String title;
    private String author;
    private boolean isAvailable;
    
    public Book(String isbn, String title, String author) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.isAvailable = true;
    }
    
    // Getters and setters
    public String getIsbn() { return isbn; }
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public boolean isAvailable() { return isAvailable; }
    public void setAvailable(boolean available) { isAvailable = available; }
    
    @Override
    public String toString() {
        return title + " by " + author + " (ISBN: " + isbn + ")";
    }
}

class Member {
    private String memberId;
    private String name;
    private List<Book> borrowedBooks;
    
    public Member(String memberId, String name) {
        this.memberId = memberId;
        this.name = name;
        this.borrowedBooks = new ArrayList<>();
    }
    
    public void borrowBook(Book book) {
        borrowedBooks.add(book);
    }
    
    public void returnBook(Book book) {
        borrowedBooks.remove(book);
    }
    
    // Getters
    public String getMemberId() { return memberId; }
    public String getName() { return name; }
    public List<Book> getBorrowedBooks() { return new ArrayList<>(borrowedBooks); }
}

class Library {
    private Map<String, Book> books;
    private Map<String, Member> members;
    
    public Library() {
        books = new HashMap<>();
        members = new HashMap<>();
    }
    
    public void addBook(Book book) {
        books.put(book.getIsbn(), book);
    }
    
    public void addMember(Member member) {
        members.put(member.getMemberId(), member);
    }
    
    public boolean borrowBook(String memberId, String isbn) {
        Member member = members.get(memberId);
        Book book = books.get(isbn);
        
        if (member != null && book != null && book.isAvailable()) {
            book.setAvailable(false);
            member.borrowBook(book);
            System.out.println(member.getName() + " borrowed " + book.getTitle());
            return true;
        }
        return false;
    }
    
    public boolean returnBook(String memberId, String isbn) {
        Member member = members.get(memberId);
        Book book = books.get(isbn);
        
        if (member != null && book != null && !book.isAvailable()) {
            book.setAvailable(true);
            member.returnBook(book);
            System.out.println(member.getName() + " returned " + book.getTitle());
            return true;
        }
        return false;
    }
    
    public void displayAvailableBooks() {
        System.out.println("Available Books:");
        for (Book book : books.values()) {
            if (book.isAvailable()) {
                System.out.println("- " + book);
            }
        }
    }
}
```

### 2. E-commerce System

```java
import java.util.*;

abstract class Product {
    protected String id;
    protected String name;
    protected double price;
    protected int stock;
    
    public Product(String id, String name, double price, int stock) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.stock = stock;
    }
    
    public abstract String getCategory();
    
    public boolean isInStock() {
        return stock > 0;
    }
    
    public boolean reduceStock(int quantity) {
        if (stock >= quantity) {
            stock -= quantity;
            return true;
        }
        return false;
    }
    
    // Getters
    public String getId() { return id; }
    public String getName() { return name; }
    public double getPrice() { return price; }
    public int getStock() { return stock; }
}

class Electronics extends Product {
    private String brand;
    private int warrantyMonths;
    
    public Electronics(String id, String name, double price, int stock, String brand, int warrantyMonths) {
        super(id, name, price, stock);
        this.brand = brand;
        this.warrantyMonths = warrantyMonths;
    }
    
    @Override
    public String getCategory() {
        return "Electronics";
    }
    
    public String getBrand() { return brand; }
    public int getWarrantyMonths() { return warrantyMonths; }
}

class Clothing extends Product {
    private String size;
    private String color;
    
    public Clothing(String id, String name, double price, int stock, String size, String color) {
        super(id, name, price, stock);
        this.size = size;
        this.color = color;
    }
    
    @Override
    public String getCategory() {
        return "Clothing";
    }
    
    public String getSize() { return size; }
    public String getColor() { return color; }
}

class CartItem {
    private Product product;
    private int quantity;
    
    public CartItem(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }
    
    public double getTotalPrice() {
        return product.getPrice() * quantity;
    }
    
    // Getters
    public Product getProduct() { return product; }
    public int getQuantity() { return quantity; }
    public void setQuantity(int quantity) { this.quantity = quantity; }
}

class ShoppingCart {
    private List<CartItem> items;
    
    public ShoppingCart() {
        items = new ArrayList<>();
    }
    
    public void addItem(Product product, int quantity) {
        // Check if product already exists in cart
        for (CartItem item : items) {
            if (item.getProduct().getId().equals(product.getId())) {
                item.setQuantity(item.getQuantity() + quantity);
                return;
            }
        }
        // Add new item
        items.add(new CartItem(product, quantity));
    }
    
    public double getTotalAmount() {
        return items.stream().mapToDouble(CartItem::getTotalPrice).sum();
    }
    
    public List<CartItem> getItems() {
        return new ArrayList<>(items);
    }
    
    public void clear() {
        items.clear();
    }
}

interface PaymentProcessor {
    boolean processPayment(double amount, String paymentDetails);
}

class CreditCardProcessor implements PaymentProcessor {
    @Override
    public boolean processPayment(double amount, String cardNumber) {
        // Simulate payment processing
        System.out.println("Processing credit card payment of $" + amount);
        return true; // Assume payment successful
    }
}

class PayPalProcessor implements PaymentProcessor {
    @Override
    public boolean processPayment(double amount, String email) {
        // Simulate PayPal processing
        System.out.println("Processing PayPal payment of $" + amount + " for " + email);
        return true; // Assume payment successful
    }
}

class Order {
    private String orderId;
    private List<CartItem> items;
    private double totalAmount;
    private Date orderDate;
    private String status;
    
    public Order(String orderId, List<CartItem> items, double totalAmount) {
        this.orderId = orderId;
        this.items = new ArrayList<>(items);
        this.totalAmount = totalAmount;
        this.orderDate = new Date();
        this.status = "Processing";
    }
    
    // Getters
    public String getOrderId() { return orderId; }
    public List<CartItem> getItems() { return new ArrayList<>(items); }
    public double getTotalAmount() { return totalAmount; }
    public Date getOrderDate() { return orderDate; }
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
}
```

## Conclusion

Object-Oriented Programming provides a powerful paradigm for organizing and structuring code. The key benefits include:

- **Modularity**: Breaking down complex problems into manageable pieces
- **Reusability**: Writing code once and using it multiple times
- **Maintainability**: Making changes easier and safer
- **Scalability**: Building large applications more effectively

### Key Takeaways:

1. **Master the four pillars**: Encapsulation, Inheritance, Polymorphism, and Abstraction
2. **Design before coding**: Think about relationships between objects
3. **Favor composition over inheritance** when appropriate
4. **Use interfaces for contracts** and abstract classes for shared implementation
5. **Follow SOLID principles** for better design
6. **Keep classes focused** on a single responsibility
7. **Use meaningful names** and maintain consistent style
8. **Test your classes** in isolation and integration

### Next Steps:

1. Practice implementing the examples provided
2. Study common design patterns (Strategy, Factory, Observer, etc.)
3. Learn about advanced topics like generics, reflection, and annotations
4. Explore frameworks that heavily use OOP principles
5. Read clean code principles and best practices

Object-Oriented Programming is not just about syntax—it's about thinking in terms of objects, their responsibilities, and their interactions. With practice and understanding of these concepts, you'll be able to design and implement robust, maintainable software systems.
