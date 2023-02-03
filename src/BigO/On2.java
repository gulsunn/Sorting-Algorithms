package BigO;

public class On2 {  // O(n^2) -->Quadratic Complexitiy
    public static void main(String[] args) {

        int count=0;  // cycle sayısı (işlem sayısı)
        int[] arr = {2,1,5};

    //Task :Her elemanı kendi dahil olmak üzere diğer elemanlarla topla  (iç içe for döngüsü gerekir) (iç içe bir for varsa time complexity si :O(n^2 dir)

        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.println(arr[i] + arr[j]);
                count++;
            }
        }
        System.out.println("count : "+count);  // count : 9 yani array eleman sayısının(n:3) karesi
    }
}

// cycle eleman sayısının karesi kadar n 3 ise cycle 9
