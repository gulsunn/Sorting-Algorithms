package MergeSort;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {

         int arr[] = {5,3,4,2};

        System.out.println("Merge Sort Öncesi Array");
        System.out.println(Arrays.toString(arr));
        System.out.println("--------------------------");
        System.out.println("Merge Sort Sonrası Array");
        mergeSort(arr,0, arr.length-1);
        System.out.println(Arrays.toString(arr));

    }

    public static void merge(int arr[], int left, int middle, int right) {


        int low = middle - left + 1;    // soldaki bölünmüş küçük arrayin size ı  (size of left sub-array)
        int high = right - middle;  // sağ taraftaki küçük alt array  (size of right sub-array)

        int[] L = new int[low];
        int[] R = new int[high];

        int i = 0, j = 0;
        for (i=0; i < low; i++) {  // Soldaki alt arraye elemanlar kopyalandı    (high sağ low sol taraf)
            L[i] = arr[left + i];
        }

        for (j = 0; j < high; j++) {  // Sağdaki alt arraye elemanlar kopyalandı
            R[j] = arr[middle + 1 + j];
        }

        //Sortlamaya başlanacak indexi al
        int k = left;
        i = 0;
        j = 0;

        //Merge başla
        while (i < low && j < high)  //Sol ve sağ alt arrayler merge işlemi yapıldı
        {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        while (i < low) {
            arr[k] = L[i];
            i++;
            k++;
        }
        while (j < high) {
            arr[k] = R[j];
            j++;
            k++;
        }

    }

    public static void mergeSort(int arr[], int left, int right) {
        int middle;
        if (left < right) {
            middle = (left + right) / 2;

            mergeSort(arr, left, middle);  // sol alt array
            mergeSort(arr, middle + 1, right); // sağ alt array
            merge(arr, left, middle, right);  //Sağ ve sol alt arraylar birleştiriliyor (merge)
        }

    }

}
