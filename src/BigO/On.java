package BigO;

public class On {  // O(n) -->Linear Complexity
    public static void main(String[] args) {
        int [] arr = {10 ,2, 20 ,40 ,55, 7};
    //Arrayin tüm elemanlarını ekrana yazdır

        for (int item:arr) {
            System.out.println(item+", ");  // 6 cycle 6 işlem
        }
    }
}

// Bu örnekte cycle işlem adedi array eleman sayısı ile doğru orantılıdır
// Time Complexitiy  : O (n)  n:eleman sayısı
// Elimizdeki veri seti arttıkça çalıştırılma süresi de doğru orantılı olarak artar

