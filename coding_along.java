import java.util.Scanner;
import java.util.Date;
import java.time.Year;

public class coding_along{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        Date date1 = new Date(125, 1, 12);
        Date date2 = new Date(98, 1, 12);

        int age = date1.getYear() - date2.getYear();
        System.out.println(age);


        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Hey" + " " + name);

        System.out.println("PLease enter your first number: ");
        int num1 = scanner.nextInt();

        System.out.println("PLease enter your second number: ");
        int num2 = scanner.nextInt();

        System.out.println("Your result is: " + (num1 + num2));
        scanner.close();

    }
}




