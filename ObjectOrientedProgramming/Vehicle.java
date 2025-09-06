// Vehicle.java - Base class for inheritance examples
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
    
    // Getters
    public String getBrand() { return brand; }
    public int getYear() { return year; }
    public double getPrice() { return price; }
}