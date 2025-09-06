public class BasicOOPDemo {
    public static void main(String[] args) {
        System.out.println("=== Object-Oriented Programming Demo ===\n");
        
        // 1. Basic Class and Object Creation
        System.out.println("1. Creating and using objects:");
        Car myCar = new Car("Toyota", "Camry", 2023, "Blue");
        myCar.start();
        myCar.honk();
        myCar.stop();
        System.out.println();
        
        // 2. Inheritance Demo
        System.out.println("2. Inheritance demonstration:");
        Vehicle[] vehicles = {
            new Car("Honda", 2022, 25000, 4, "Gasoline"),
            new Motorcycle("Yamaha", 2023, 8000, false)
        };
        
        for (Vehicle vehicle : vehicles) {
            vehicle.start();
            vehicle.displayInfo();
            System.out.println("---");
        }
        
        // 3. Polymorphism Demo
        System.out.println("3. Polymorphism with interfaces:");
        Drivable[] drivables = {
            new Car("Tesla", 2024, 50000, 4, "Electric"),
            new Boat()
        };
        
        for (Drivable drivable : drivables) {
            drivable.accelerate();
            drivable.turn("left");
            drivable.brake();
            System.out.println("---");
        }
        
        // 4. Encapsulation Demo
        System.out.println("4. Encapsulation with BankAccount:");
        BankAccount account = new BankAccount("123456", "John Doe", 500.0);
        System.out.println("Initial balance: $" + account.getBalance());
        
        account.deposit(200);
        account.withdraw(150);
        account.withdraw(600); // This should fail
        System.out.println();
        
        // 5. Abstract Classes and Shapes
        System.out.println("5. Abstraction with shapes:");
        Shape[] shapes = {
            new Circle("Red", 5.0),
            new Rectangle("Blue", 4.0, 6.0)
        };
        
        for (Shape shape : shapes) {
            shape.displayInfo();
            System.out.println("---");
        }
        
        // 6. Static members demo
        System.out.println("6. Static members:");
        Student student1 = new Student("Alice");
        Student student2 = new Student("Bob");
        Student student3 = new Student("Charlie");
        
        System.out.println("Total students: " + Student.getTotalStudents());
        student1.study();
        System.out.println();
        
        // 7. Design Pattern Demo - Factory
        System.out.println("7. Factory Pattern:");
        Animal dog = AnimalFactory.createAnimal("dog");
        Animal cat = AnimalFactory.createAnimal("cat");
        dog.makeSound();
        cat.makeSound();
        System.out.println();
        
        // 8. Observer Pattern Demo
        System.out.println("8. Observer Pattern:");
        Subject newsAgency = new Subject();
        NewsSubscriber subscriber1 = new NewsSubscriber("Alice");
        NewsSubscriber subscriber2 = new NewsSubscriber("Bob");
        
        newsAgency.addObserver(subscriber1);
        newsAgency.addObserver(subscriber2);
        
        newsAgency.setState("Breaking: New Java Version Released!");
        System.out.println();
        
        // 9. Library Management System Demo
        System.out.println("9. Library Management System:");
        Library library = new Library();
        
        // Add books
        library.addBook(new Book("978-0134685991", "Effective Java", "Joshua Bloch"));
        library.addBook(new Book("978-0135166307", "Clean Code", "Robert Martin"));
        
        // Add members
        library.addMember(new Member("M001", "Alice Johnson"));
        library.addMember(new Member("M002", "Bob Smith"));
        
        // Borrow and return books
        library.borrowBook("M001", "978-0134685991");
        library.displayAvailableBooks();
        library.returnBook("M001", "978-0134685991");
        library.displayAvailableBooks();
        System.out.println();
        
        // 10. E-commerce Demo
        System.out.println("10. E-commerce System:");
        
        // Create products
        Product laptop = new Electronics("E001", "Gaming Laptop", 1299.99, 5, "ASUS", 24);
        Product shirt = new Clothing("C001", "Cotton T-Shirt", 29.99, 10, "M", "Blue");
        
        // Create shopping cart
        ShoppingCart cart = new ShoppingCart();
        cart.addItem(laptop, 1);
        cart.addItem(shirt, 2);
        
        System.out.println("Cart total: $" + cart.getTotalAmount());
        
        // Process payment
        PaymentProcessor processor = new CreditCardProcessor();
        boolean paymentSuccess = processor.processPayment(cart.getTotalAmount(), "1234-5678-9012-3456");
        
        if (paymentSuccess) {
            Order order = new Order("ORD001", cart.getItems(), cart.getTotalAmount());
            System.out.println("Order created: " + order.getOrderId());
            cart.clear();
        }
        
        System.out.println("\n=== Demo Complete ===");
    }
}

// Supporting classes for the demo

class Car extends Vehicle implements Drivable {
    private int numberOfDoors;
    private String fuelType;
    
    // Constructor for basic car
    public Car(String brand, String model, int year, String color) {
        super(brand, year, 25000); // Default price
        this.numberOfDoors = 4;
        this.fuelType = "Gasoline";
    }
    
    // Constructor for detailed car
    public Car(String brand, int year, double price, int numberOfDoors, String fuelType) {
        super(brand, year, price);
        this.numberOfDoors = numberOfDoors;
        this.fuelType = fuelType;
    }
    
    @Override
    public void start() {
        System.out.println(brand + " car engine is starting...");
    }
    
    @Override
    public void accelerate() {
        System.out.println("Car is accelerating smoothly");
    }
    
    @Override
    public void brake() {
        System.out.println("Car is braking with ABS");
    }
    
    @Override
    public void turn(String direction) {
        System.out.println("Car is turning " + direction + " with steering wheel");
    }
    
    public void honk() {
        System.out.println("Beep beep!");
    }
    
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Doors: " + numberOfDoors + ", Fuel: " + fuelType);
    }
}

class Motorcycle extends Vehicle {
    private boolean hasSidecar;
    
    public Motorcycle(String brand, int year, double price, boolean hasSidecar) {
        super(brand, year, price);
        this.hasSidecar = hasSidecar;
    }
    
    @Override
    public void start() {
        System.out.println(brand + " motorcycle is starting...");
    }
    
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Has sidecar: " + hasSidecar);
    }
}

class Boat implements Drivable {
    @Override
    public void accelerate() {
        System.out.println("Boat is accelerating through water");
    }
    
    @Override
    public void brake() {
        System.out.println("Boat is slowing down by reducing throttle");
    }
    
    @Override
    public void turn(String direction) {
        System.out.println("Boat is turning " + direction + " with rudder");
    }
}