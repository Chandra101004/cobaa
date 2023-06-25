package Tugas;

import java.util.Scanner;

public class StudiKasus3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
            System.out.print("Masukkan total pembelian: ");
            int totalPembelian = input.nextInt();
            System.out.print("Masukkan jumlah uang yang diberikan: ");
            int uangDiberikan = input.nextInt();
            pembayaran(totalPembelian, uangDiberikan);
            }
        public static void pembayaran(int totalPembelian, int uangDiberikan) {
            int kembalian = uangDiberikan - totalPembelian;
            System.out.println("Uang kembalian Anda adalah: " + kembalian);
           
            int[] uangPecahan = {20000, 10000, 5000, 1000, 500}; 
            int[] jumlahPecahan = new int[uangPecahan.length];
           
            for (int i = 0; i < uangPecahan.length; i++) {
                 while (kembalian >= uangPecahan[i]) {
                     kembalian -= uangPecahan[i];
                    jumlahPecahan[i]++;
            }
            }
            for (int i = 0; i < uangPecahan.length; i++) {
                if (jumlahPecahan[i] > 0) {
                    System.out.println(jumlahPecahan[i] + " lembar " + 
    uangPecahan[i] + " rupiah");
            }
    }
        }
    }
            
