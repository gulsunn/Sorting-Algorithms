package ShellSort;

import java.util.Arrays;

public class ShellSort {
    public static void main(String[] args) {


        int arr[] = {5,3,4,2};

        System.out.println("Shell Sort Öncesi Array");
        System.out.println(Arrays.toString(arr));
        System.out.println("--------------------------");
        System.out.println("Shell Sort Sonrası Array");
        shellSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static void shellSort(int[] a) {
        int insert ;
        int moveItem;
        for(int gap=a.length/2 ; gap>0 ; gap/=2 )
        {
            for(int next=gap; next<a.length;next++)
            {
                insert=a[next];
                moveItem=next;
                while(moveItem>=gap && insert < a[moveItem-gap])
                {
                    a[moveItem] = a[moveItem-gap];
                    moveItem= moveItem-gap;
                }
                a[moveItem]=insert;
            }
        }
    }

}
