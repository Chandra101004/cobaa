package UTS;

public class NomorSatu {
    public static void NomorSatu(int array[]){
        int n =  array.length;
        for (int j = 1; j < n; j++){
            int key = array[j];
            int i = j-1;
            while ( (i > -1) && ( array [i] > key ) ) {
                array [i+1] = array [i];
                i--;
            }
            array[i+1] = key;
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {22,52,3,3,76,22,45,52,76,19};
        System.out.println("Sebelum Pengurutan Penyisipan");
        for(int i:arr1){
            System.out.println(i+" ");
        }
        System.out.println();

        NomorSatu(arr1);//mengurutkan array

        System.out.println("Setelah Pengurutan Penyisipan");
        for(int i:arr1){
            System.out.println(i+" ");
        }
            System.out.println("Nilai Terbesar yaitu 76 Pada Indeks ke 9");
        }
    }

