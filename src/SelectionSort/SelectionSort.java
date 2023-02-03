package SelectionSort;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int [] arr = {7,4,5,9,8,2,1};
        System.out.println("Sıralamadan önce Array");
        System.out.println(Arrays.toString(arr));

        System.out.println("*******************************");

        System.out.println("Selection Sort işlemi sonrası Array");
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    //     --------- SELECTION SORT --------------

    public static void selectionSort(int arr[]){
        int min;  // kendinden sonra gelen(sağındakilerin) en küçüğünün indexini atamak için
        int count=0;

        for (int i = 0; i < arr.length ; i++) {
            min=i;
            for (int j = i+1; j < arr.length ; j++) {  // int j = i+1 kıyaslamaya bir sonrakinden başlaması için
               if(arr[j]<arr[min]) {  //true ise
                   min = j ;
               }
              //  System.out.println(Arrays.toString(arr));
              //  count++;
            }
            //Swap işlemi (en küçüğü bulduk ya)
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] =temp;

        }
        //System.out.println("count : "+count);
    }
}

// Cycle 49 eleman sayısının karesi 7^2 --> O(49) worst case