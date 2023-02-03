package InsertionSort;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {

        int[] arr = {7,4,5,9,8,2,1};

        System.out.println("Sıralamadan önce Array");
        System.out.println(Arrays.toString(arr));

        System.out.println("*******************************");

        System.out.println("Insertion Sort işlemi sonrası Array");
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static void insertionSort(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > temp) {//swap e uygun
                arr[j + 1] = arr[j];  //Bir sonraki ile yer değiştiriyoruz
                j = j - 1;
            }
            arr[j + 1] = temp;
        }
    }
}


