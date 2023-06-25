package Tugas;

public class insertionsort {
        public static void insertionSort(int array[]) {  
               int n = array.length;  
               for (int j = 1; j < n; j++) {  
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
            
           
              int[] arr1 = {2,2,5,2,3,0,0,3,1}; 
               System.out.println("Sebelum Pengurutan Penyisipan");    
               for(int i:arr1){    
                   System.out.print(i+" ");    
               }    
               System.out.println();    
                   
               insertionSort(arr1);//mengurutkan array    
                  
               System.out.println("Setelah Pengurutan Penyisipan");    
               for(int i:arr1){    
                   System.out.print(i+" ");    
               }    
           }    
       }
       
    

