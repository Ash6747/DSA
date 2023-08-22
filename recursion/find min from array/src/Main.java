import java.util.Scanner;
public class Main {


    public static void find(int[] arr, int index, int min){
        if(index >= arr.length){
            System.out.println(min);
            return;
        }
        if(arr[index] < min){
            min = arr[index];
        }
        find(arr,index +1 , min);
    }
    public static void main(String[] args) {
        int a[] = {3,4,2,10,5,9,6};
        find(a,0,Integer.MAX_VALUE);
    }
}