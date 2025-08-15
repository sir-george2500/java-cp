import java.util.*;
public class LogicalOperators{
    public static void main(String[] args){
        int num1 = 10;
        int num2 = 20;

//        int Scanner scanner = new Scanner(System.in);
//        AND && OR || AND EXCLUSIVE OR XOR
//        !Logical Negation flips the logic output

        if(!((num1 < num2) && (num1 < 100))){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
}