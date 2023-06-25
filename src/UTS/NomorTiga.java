package UTS;

public class NomorTiga {
  


    public static void NomorTiga(int array[]){
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
        System.out.println("Sebelum Pengurutan Angka");
        for(int i:arr1){
            System.out.println(i+" ");
        }
        System.out.println();

        NomorTiga(arr1);//mengurutkan array

        System.out.println("Setelah Pengurutan Angka");
        for(int i:arr1){
            System.out.println(i+" ");
        }
      
        }
}



