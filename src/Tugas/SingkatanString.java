package Tugas;

import java.util.Scanner;

public class SingkatanString{
public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
        
    String kalimat,container ="";
    System.out.println("kalimat atau kata-kata: ");
    kalimat = scan.nextLine();
    disingkat(kalimat, container);
}

    
public static void disingkat(String kalimat, String container){
    for(int i = 0; i< kalimat.length();i++){
                  if (kalimat.charAt(i) == ' ') {
            container =  container + kalimat.charAt(i+1);
        }
}
    String hasil_substring_1 = kalimat.substring(0,1);
    String hasil_singkatan = hasil_substring_1.concat(container);
    
    System.out.println("disingkat sebagai " + hasil_singkatan);
}


}
