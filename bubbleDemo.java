import java.util.*;

public class bubbleDemo {
    public static void main(String[] args){
        int arr[] = {6,5,2,8,9,4};
        int n = arr.length;
        int temp = 0;


        System.out.println("Before sorting");
        for(int num : arr){
            System.out.print(num + " ");
        }

        for(int i =0; i < n - 1; i++){
            for(int j = 0; j < n - i - 1; j++){
                if(arr[j] > arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        System.out.println();
        System.out.println("After sorting");
        for(int num : arr){
            System.out.print(num + " ");
        }
    }
}