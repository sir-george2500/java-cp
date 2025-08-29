import java.util.*;
public class Issue51{
    public static void main(String[] args){
        // The Java statement to create a Scanner object for console input:
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.println("Hello " + name + ", you are " + age + " years old!");


        scanner.close();
    }
}