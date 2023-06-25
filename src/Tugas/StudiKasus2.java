package Tugas;

import java.util.Scanner;

public class StudiKasus2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);    
        System.out.print("Masukkan beberapa kata: ");
        String kata = input.nextLine();
        singkatan(kata);
}
    public static void singkatan(String kalimat) {
        String[] kepanjangan = kalimat.split(" ");
        StringBuilder singkatan = new StringBuilder();
        for (String kata : kepanjangan) {
            singkatan.append(kata.charAt(0));
}
            System.out.println("Singkatan dari kata-kata tersebut adalah: " + 
        singkatan);
}


        
    }
    

