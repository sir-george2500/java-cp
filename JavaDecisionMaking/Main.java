import java.util.*;

public class Main{

    public static void main(String[] args){

        System.out.println("Enter character Move");
        System.out.print("Move: Up : 1 , \n Down : 2 , \n Left : 3, \n Right : 4 , \n Forward : 5, \n Backward : 6 \n");
        Scanner sc = new Scanner(System.in);

        int moveInput = sc.nextInt();

       /*** Until then loop psuedocode
        *  REPEAT
        *  {
        *
        *
        *  } UNIL (condition to stop)
        *
        * do while
        *
        * ***/

        for (int i =moveInput; i>2; i-=1) {
            System.out.println("the user is now runing");
        }


        System.out.println("The user has stopped runign and walking now ");




    }
}