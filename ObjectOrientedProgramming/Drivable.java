// Drivable.java - Interface demonstrating polymorphism
public interface Drivable {
    void accelerate();
    void brake();
    void turn(String direction);
    
    // Default method (Java 8+)
    default void performSafetyCheck() {
        System.out.println("Performing safety check...");
    }
}