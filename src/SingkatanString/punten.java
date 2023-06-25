package SingkatanString;

import java.util.Scanner;

public class punten {
    public static void main(String[] args) throws Exception {
        String huruf;
        boolean lagi;
        boolean tadiSpasi;

        tadiSpasi = true;
        String singkatan;

        Scanner input = new Scanner(System.in);
        singkatan = "";
        lagi = true;
        while(lagi){
            huruf = input.nextLine();
            if (tadiSpasi){
                singkatan = singkatan + huruf;
            }
            if(huruf.equals(".")){
                lagi = false;
            }
            if (huruf.equals("")){
                tadiSpasi = true;
            }
            else{
                tadiSpasi = false;
            }

        }
    System.out.print(singkatan);    
    }

}
