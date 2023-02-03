package BubbleSort;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {

        int[] arr = {7,4,5,9,8,2,1};

        System.out.println("Sıralamadan önce Array");
        System.out.println(Arrays.toString(arr));

        System.out.println("*******************************");

        System.out.println("Bubble Sort işlemi sonrası Array");
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static void bubbleSort(int arr[]){
        boolean swapped = false ;

        do {
            swapped = false;
            // sonsuz döngüye girmemesi için ekledik
            for(int i= 1 ; i<arr.length; i++) {
                if(arr[i-1]>arr[i]) {
                    int temp = arr[i];
                    arr[i] = arr[i-1];
                    arr[i-1] = temp ;
                    swapped =true;
                }

            }

        }while(swapped);
    }
}
