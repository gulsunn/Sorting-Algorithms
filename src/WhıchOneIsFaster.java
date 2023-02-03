import BubbleSort.BubbleSort;
import InsertionSort.InsertionSort;
import MergeSort.MergeSort;
import QuickSort.QuickSort;
import SelectionSort.SelectionSort;
import ShellSort.ShellSort;

import java.util.Arrays;
import java.util.Random;

public class WhıchOneIsFaster {
    public static void main(String[] args) {

        int[] siraliDizi = createOrderArray(100000);

        int[] arr = createArray(100000);
        int[] arr2 = Arrays.copyOf(arr,arr.length);//Arrayin kopyasını oluşturduk
        int[] arr3= Arrays.copyOf(arr,arr.length);//Arrayin kopyasını oluşturduk
        int[] arr4= Arrays.copyOf(arr,arr.length);//Arrayin kopyasını oluşturduk
        int[] arr5= Arrays.copyOf(arr,arr.length);//Arrayin kopyasını oluşturduk
        int[] arr6= Arrays.copyOf(arr,arr.length);//Arrayin kopyasını oluşturduk
        int[] arr7= Arrays.copyOf(arr,arr.length);//Arrayin kopyasını oluşturduk




        long startTime;
        long endTime;
        double estimatedTime;

        //InsertionSort

        startTime=System.currentTimeMillis();
        InsertionSort.insertionSort(arr2);
        endTime=System.currentTimeMillis();
        estimatedTime=(double)(endTime-startTime)/1000;
        System.out.println("Insertion Sort = "+estimatedTime);


        //Selection Sort

        startTime=System.currentTimeMillis();
        SelectionSort.selectionSort(arr);
        endTime=System.currentTimeMillis();
        estimatedTime=(double)(endTime-startTime)/1000;
        System.out.println("Selection Sort = "+estimatedTime);


        //BubbleSort

        startTime=System.currentTimeMillis();
        BubbleSort.bubbleSort(arr3);
        endTime=System.currentTimeMillis();
        estimatedTime= (double)(endTime-startTime) / 1000;
        System.out.println("BubbleSort = " + estimatedTime);


        //MergeSort
        startTime=System.currentTimeMillis();
        MergeSort.mergeSort(arr4,0,arr4.length-1);
        endTime=System.currentTimeMillis();
        estimatedTime=(double)(endTime-startTime)/1000;
        System.out.println("Merge Sort = "+estimatedTime);

        //Quick Sort
        startTime=System.currentTimeMillis();
        QuickSort.quickSort(arr5,0,arr5.length-1);
        endTime=System.currentTimeMillis();
        estimatedTime=(double)(endTime-startTime)/1000;
        System.out.println("Quick Sort = "+estimatedTime);

        //Shell Sort

        startTime=System.currentTimeMillis();
        ShellSort.shellSort(arr6);
        endTime=System.currentTimeMillis();
        estimatedTime=(double)(endTime-startTime)/1000;
        System.out.println("Shell Sort = "+estimatedTime);

        // Arrays.sort()
        startTime=System.currentTimeMillis();
        Arrays.sort(arr7);
        endTime=System.currentTimeMillis();
        estimatedTime= (double)(endTime-startTime) / 1000;
        System.out.println("Arrays.Sort = " + estimatedTime);

    }
    public  static int[] createArray(int elemanSayisi){

        int[] arr = new int[elemanSayisi];
        Random random = new Random();

        for (int i = 0; i <arr.length ; i++) {

            arr[i] = random.nextInt(10000);

        }
        return arr;
    }

    public static  int[] createOrderArray(int elemanSayisi){
        int[] arr = new int[elemanSayisi];
        for(int i =0 ; i<arr.length;i++) {
            arr[i]=i;
        }
        return arr;

    }

    /*
    Elimizdeki liste randomsa insertion sort daha mantıklı
    Eleman sayısı(veri seti) küçükse selection sort ve insertion yakın fakat eleman sayısı çok büyükse insertion sort çok daha hızlıdır
    Veri seti yüksekse bubble sort performansı düşüktür
     */

}
