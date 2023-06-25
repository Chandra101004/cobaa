package Tugas;

public class ProjectUangKembalian {
    public static void main(String[] args) {
        int[] banyakUang = {0, 1, 1, 0, 1, 0, 0, 0, 0, 0};
        int[] uangPecahan = {500, 1000, 5000, 10000, 20000, 0, 0, 0, 0, 0};
            
        System.out.println("Uang kembalian terdiri dari: ");
        for(int i = uangPecahan.length-1; i >= 0; i--){
                if(banyakUang[i] > 0){
                    System.out.println(banyakUang[i] + " lembar uang pecahan " + uangPecahan[i]);
                }
            }
        }
        
    }
    
