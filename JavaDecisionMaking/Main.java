import java.util.*;
//import construction.*;
import tmath.*;
///  access modifier class ClassName
/// public , pivate , protected , default
///

public class Main{
    public static void main(String[] args){
      System.out.println("Enter two numbers: ");
      Scanner sc = new Scanner(System.in);

      float a = sc.nextFloat();
        float b = sc.nextFloat();

      Calculator obj = new Calculator();

      float sum = obj.add(a,b);
      System.out.println("Sum is: " + sum);

    }
}