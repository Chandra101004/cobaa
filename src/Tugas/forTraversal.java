package Tugas;

import java.util.Scanner;

public class forTraversal {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Masukkan jumlah berat badan yang akan dihtung : ");
        int beratBdnMhs = sc.nextInt();

        double total = 0;
        for (int i=0; i<5; i++){
            System.out.print("Berat badan mahasiswa ke-"+i+" : ");
            double berat = sc.nextDouble();
            total += berat;
        }
        double rataRata = (double) total / beratBdnMhs;
        System.out.println("Rata Rata berat badan mahasiswa adalah "+rataRata);

    }
}
