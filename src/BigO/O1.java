package BigO;

public class O1 { // // O(1)  -- Constant Complexity   Veri seti ne kadar büyük olursa olsun çalıştırılma süresi sabit olan algoritmalara
    public static void main(String[] args) {
// Array ne kadar büyük olursa olsun çalıştırılma süresi sabit  olacak (10  ,  100   ,1000 )


        // Task1 :Arrayın son elemanını ekrana bas
        int [] arr = {10 ,2, 20 ,40 ,55, 7};
        System.out.println(arr[arr.length -1]);// 0(1)

        // Task2 :Veriln bir sayının çift olup olmadığını bu
        int x=24;
        if(x%2==0) System.out.println("Cift");  // 0(1)



    }


}

/*
array eleman sayısı kaç olursa olsun Burada Big O(1) dir
Verilen tasklerde sonuca tek bir kod satırı ile ulaşılır
 */
