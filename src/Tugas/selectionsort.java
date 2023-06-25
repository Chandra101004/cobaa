package Tugas;

public class selectionsort {
    public static void selectionsort (int[]arr) {
        
    for (int i=0; i <arr.length-1; i++)
    {
        int index = i;
        for (int j=i+1; j<arr.length;j++){
            if(arr[j]<arr[index]){
                index = j;
           }
       }
        int smallerNumber = arr[index];
        arr[index] = arr[i];
        arr[i] = smallerNumber;

        }
    }



public static void main (String a[]){
    int[]arr1 = {22,52,30,03,79}; //isi dengan arrayKu yang dibuat di langkah B.1
    
    System.out.println("Sebelum pengurutan seleksi");
    for(int i:arr1){
        System.out.print(i+"");
   }
    System.out.println();
    
    selectionsort (arr1); //pengurutan array menggunakan pengurutan seleksi
    
    System.out.println("Setelah pengurutan seleksi");
    for(int i:arr1){
        System.out.print(i+"");
   
    
    }
}
    }


