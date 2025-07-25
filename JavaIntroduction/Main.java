import java.util.*;

public class Main {

    public static void merge(int[] arr, int low ,int mid, int high){
        int[] temp = new int[high - low + 1];
        int left = low;
        int right = mid + 1;
        int k = 0;

        while(left<=mid && right <= high){
            if(arr[left] <= arr[right]){
                temp[k++] = arr[left++];
            }else{
                temp[k++] = arr[right++];
            }
        }

        while(left<=mid){
            temp[k++] = arr[left++];
        }

        while(right<=high){
            temp[k++] = arr[right++];
        }

        for(int i = low; i<=high; i++){
            arr[i] = temp[i-low];
        }

    }
    public static void ms(int[] arr, int low , int high){
        if(low>=high) return;

        int mid = (low+high) / 2;

        ms(arr,low,mid);
        ms(arr,mid+1,high);
        merge(arr,low,mid,high);
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        String[] input = sc.nextLine().split(",");

        int[] arr = new int[input.length];

        for(int i = 0; i<input.length;i++){
            arr[i] = Integer.parseInt(input[i].trim());
        }

        int n = input.length;
        ms(arr,0,n-1);

        System.out.println(Arrays.toString(arr));
    }
}