import java.util.*;
public class Main{

    public static void main(String[] args){
//      Scanner scanner = new Scanner(System.in);
//      System.out.println("Enter a number betweek 1 and 30");
//      int num = scanner.nextInt();


////      edge case handling
//      if(num < 1 || num > 30){
//          System.out.println("PLease enter a valid number between 1 and 30");
//      }
//
//      if(num % 3 == 0 && num % 5 == 0)
//          System.out.println("FizzBuzz");
//      else if(num % 3 == 0)
//          System.out.println("Fizz");
//      else if(num % 5 == 0)
//          System.out.println("Buzz");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter your age");
        int age = scanner.nextInt();

//       handling edge case
        if(age < 1 ){
            System.out.println("You enter an Invalid age, and age must be Positive");
        }

        if(age > 18 ){
            System.out.println("You are eligible to drive");
            boolean hasLisence = scanner.nextBoolean();

            if(hasLisence)
                System.out.println("You can drive now");
            else
                System.out.println("you cannot drive without a liscense");
        }else
            System.out.println("You must be at least 18 years of age");


    }
}
