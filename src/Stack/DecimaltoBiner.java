//NAMA  : HR.Ade Chandrawimba
// NIM : 22523003
// KELAS : E
//ASD
package Stack;

import java.util.Scanner;

public class DecimaltoBiner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan bilangan dalam desimal: ");
        int desimal = scanner.nextInt();
        String binary = convertToBinary(desimal);
        System.out.println("Hasil konversi bilangan desimal " +desimal+ " ke biner adalah " + binary);
    }

    public static String convertToBinary(int desimal) {
        if (desimal == 0) {
            return "0";
        }

        StringBuilder binary = new StringBuilder();
        while (desimal > 0) {
            int remainder = desimal % 2;
            binary.insert(0, remainder);
            desimal = desimal / 2;
        }

        return binary.toString();
    }
}
