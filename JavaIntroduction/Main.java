import java.util.*;

public class Main{
    public static void main(String[] args){
        int num1 = 60; // 0011 1100
        int num2 = 13; // 0000 1101


        // Give me the bit value
        int result = num1<<2; // 1111 0000  = 1x128+1x64+1x32+1x16 = 240
        int result2 = num1>>2; // 0000 1111 = 1x8+1x4+1x2+1x1 = 15

        int result3 = num1>>>2;

        System.out.println(result);


    }



}