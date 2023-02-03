package QuickSort;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {

        int[] arr ={3,5,4,22,1345,34,11,5};
        System.out.println("QuickSort işlemi öncesi array :");
        System.out.println(Arrays.toString(arr));
        System.out.println("************************");
        System.out.println("QuickSort işlemi sonrası : ");
        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
        System.out.println("***************************");

    }
    public static int partition(int dizi[], int alt, int ust){
        // !!! dizinin son elamanını pivot seçiyoruz
        int pivot = dizi[ust];
        int i =(alt-1);
        //ilk iterasyondaki yer değiştirme işlemine uygun hale getiriyorum
        for(int j=alt; j<ust;j++){
            if(dizi[j]<=pivot){
                i++;
                int temp = dizi[i];
                dizi[i] = dizi[j];
                dizi[j]=temp;
            }

        }
        int temp = dizi[i+1];
        dizi[i+1] = dizi[ust];
        dizi[ust]=temp;

        return i+1;
    }

    public static void quickSort(int dizi[], int alt, int ust) {
        if(alt<ust) {
            int pi = partition(dizi,alt,ust);
            quickSort(dizi,alt,pi-1); // pivotun sol tarafı için recursive
            quickSort(dizi,pi+1,ust);
        }
    }

}
