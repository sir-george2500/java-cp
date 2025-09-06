// Advanced OOP Concepts Demo

public class AdvancedOOPDemo {
    public static void main(String[] args) {
        System.out.println("=== Advanced OOP Concepts Demo ===\n");
        
        // 1. Composition vs Inheritance Demo
        System.out.println("1. Composition vs Inheritance:");
        demonstrateComposition();
        System.out.println();
        
        // 2. Inner Classes Demo
        System.out.println("2. Inner Classes:");
        demonstrateInnerClasses();
        System.out.println();
        
        // 3. Advanced Polymorphism
        System.out.println("3. Advanced Polymorphism:");
        demonstrateAdvancedPolymorphism();
        System.out.println();
        
        // 4. Interface Default Methods
        System.out.println("4. Interface Default Methods:");
        demonstrateInterfaceDefaults();
        System.out.println();
        
        // 5. Method Overloading
        System.out.println("5. Method Overloading:");
        demonstrateMethodOverloading();
        System.out.println();
        
        // 6. Design Patterns in Action
        System.out.println("6. Design Patterns:");
        demonstrateDesignPatterns();
    }
    
    private static void demonstrateComposition() {
        Engine v8Engine = new Engine("V8", 400);
        GPS advancedGPS = new GPS();
        ModernCar luxuryCar = new ModernCar("Mercedes", v8Engine, advancedGPS);
        
        luxuryCar.start();
        luxuryCar.navigateTo("Downtown");
    }
    
    private static void demonstrateInnerClasses() {
        OuterClass outer = new OuterClass();
        
        // Non-static inner class
        OuterClass.InnerClass inner = outer.new InnerClass();
        inner.accessOuter();
        
        // Static nested class
        OuterClass.StaticNestedClass nested = new OuterClass.StaticNestedClass();
        nested.doSomething();
        
        // Method with local inner class
        outer.methodWithLocalClass();
        
        // Anonymous inner class
        outer.createAnonymousClass();
    }
    
    private static void demonstrateAdvancedPolymorphism() {
        // Using interfaces for loose coupling
        Drawable[] drawables = {
            new Triangle(3, 4, 5),
            new AdvancedCircle("Green", 7.5),
            new AdvancedRectangle("Purple", 5.0, 8.0)
        };
        
        for (Drawable drawable : drawables) {
            drawable.draw();
            drawable.display(); // Default method
            if (drawable instanceof Colorable) {
                ((Colorable) drawable).setColor("Rainbow");
                System.out.println("New color: " + ((Colorable) drawable).getColor());
            }
            System.out.println("---");
        }
    }
    
    private static void demonstrateInterfaceDefaults() {
        Drivable car = new AdvancedCar();
        car.performSafetyCheck(); // Default method from interface
        car.accelerate();
        car.brake();
    }
    
    private static void demonstrateMethodOverloading() {
        Calculator calc = new Calculator();
        
        System.out.println("2 + 3 = " + calc.add(2, 3));
        System.out.println("2.5 + 3.7 = " + calc.add(2.5, 3.7));
        System.out.println("1 + 2 + 3 = " + calc.add(1, 2, 3));
        System.out.println("'Hello' + 'World' = " + calc.add("Hello", "World"));
        
        // Varargs example
        System.out.println("Sum of 1,2,3,4,5 = " + calc.sum(1, 2, 3, 4, 5));
    }
    
    private static void demonstrateDesignPatterns() {
        // Singleton pattern
        DatabaseConnection db1 = DatabaseConnection.getInstance();
        DatabaseConnection db2 = DatabaseConnection.getInstance();
        System.out.println("Same instance? " + (db1 == db2));
        db1.connect();
        
        // Strategy pattern
        PaymentContext context = new PaymentContext();
        
        context.setStrategy(new CreditCardStrategy());
        context.processPayment(100.0);
        
        context.setStrategy(new PayPalStrategy());
        context.processPayment(50.0);
    }
}

// Supporting classes for advanced concepts

// Composition example
class Engine {
    private String type;
    private int horsepower;
    
    public Engine(String type, int horsepower) {
        this.type = type;
        this.horsepower = horsepower;
    }
    
    public void start() {
        System.out.println(type + " engine (" + horsepower + "HP) starting...");
    }
    
    public void stop() {
        System.out.println(type + " engine stopping...");
    }
}

class GPS {
    public void navigate(String destination) {
        System.out.println("🗺️ GPS navigating to: " + destination);
    }
    
    public void recalculateRoute() {
        System.out.println("🔄 Recalculating route...");
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

// Inner classes example
class OuterClass {
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

// Advanced shape implementations
interface Drawable {
    void draw();
    void erase();
    
    default void display() {
        System.out.println("Displaying the drawable object");
    }
}

interface Colorable {
    void setColor(String color);
    String getColor();
}

class Triangle implements Drawable, Colorable {
    private String color;
    private double side1, side2, side3;
    
    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.color = "Black";
    }
    
    @Override
    public void draw() {
        System.out.println("Drawing a " + color + " triangle with sides: " + side1 + ", " + side2 + ", " + side3);
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

class AdvancedCircle extends Circle implements Drawable, Colorable {
    public AdvancedCircle(String color, double radius) {
        super(color, radius);
    }
    
    @Override
    public void draw() {
        System.out.println("Drawing a " + getColor() + " circle with radius: " + getRadius());
    }
    
    @Override
    public void erase() {
        System.out.println("Erasing the circle");
    }
    
    @Override
    public void setColor(String color) {
        // Implementation would update the color field
        System.out.println("Circle color changed to: " + color);
    }
}

class AdvancedRectangle extends Rectangle implements Drawable, Colorable {
    public AdvancedRectangle(String color, double length, double width) {
        super(color, length, width);
    }
    
    @Override
    public void draw() {
        System.out.println("Drawing a " + getColor() + " rectangle: " + getLength() + "x" + getWidth());
    }
    
    @Override
    public void erase() {
        System.out.println("Erasing the rectangle");
    }
    
    @Override
    public void setColor(String color) {
        System.out.println("Rectangle color changed to: " + color);
    }
}

// Advanced car for interface defaults
class AdvancedCar implements Drivable {
    @Override
    public void accelerate() {
        System.out.println("🚗 Advanced car accelerating with turbo boost!");
    }
    
    @Override
    public void brake() {
        System.out.println("🛑 Advanced car braking with regenerative braking!");
    }
    
    @Override
    public void turn(String direction) {
        System.out.println("🔄 Advanced car turning " + direction + " with all-wheel steering!");
    }
}

// Method overloading and varargs
class Calculator {
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
        return a + " " + b;
    }
    
    // Varargs example
    public int sum(int... numbers) {
        int total = 0;
        for (int num : numbers) {
            total += num;
        }
        return total;
    }
    
    // Generic method example
    public <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}

// Strategy Pattern implementation
interface PaymentStrategy {
    void pay(double amount);
}

class CreditCardStrategy implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("💳 Paid $" + amount + " using Credit Card");
    }
}

class PayPalStrategy implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("🏦 Paid $" + amount + " using PayPal");
    }
}

class PaymentContext {
    private PaymentStrategy strategy;
    
    public void setStrategy(PaymentStrategy strategy) {
        this.strategy = strategy;
    }
    
    public void processPayment(double amount) {
        if (strategy != null) {
            strategy.pay(amount);
        } else {
            System.out.println("No payment strategy set");
        }
    }
}

// Singleton Pattern (thread-safe)
class DatabaseConnection {
    private static volatile DatabaseConnection instance;
    private String connectionString;
    
    private DatabaseConnection() {
        connectionString = "jdbc:mysql://localhost:3306/mydb";
    }
    
    public static DatabaseConnection getInstance() {
        if (instance == null) {
            synchronized (DatabaseConnection.class) {
                if (instance == null) {
                    instance = new DatabaseConnection();
                }
            }
        }
        return instance;
    }
    
    public void connect() {
        System.out.println("🔗 Connected to: " + connectionString);
    }
}