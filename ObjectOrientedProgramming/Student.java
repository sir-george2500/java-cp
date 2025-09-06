// Student.java - Static members example
public class Student {
    private static int totalStudents = 0;  // Static variable shared by all instances
    private String name;                   // Instance variable unique to each object
    private int id;
    
    // Static block - executed when class is first loaded
    static {
        System.out.println("Student class is being loaded...");
    }
    
    public Student(String name) {
        this.name = name;
        this.id = ++totalStudents;  // Increment and assign
    }
    
    // Static method - belongs to class, not instance
    public static int getTotalStudents() {
        return totalStudents;
    }
    
    // Instance method - requires an object to call
    public void study() {
        System.out.println(name + " (ID: " + id + ") is studying");
    }
    
    public void displayInfo() {
        System.out.println("Student: " + name + ", ID: " + id);
    }
    
    // Getters
    public String getName() { return name; }
    public int getId() { return id; }
}