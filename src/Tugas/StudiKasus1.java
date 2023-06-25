package Tugas;

public class StudiKasus1 {
    public static void main(String[] args) {
        angka(101004);
}
        static void angka (int a){
        int count = 0;
        while(a != 0){
        a /= 10;
        count++;
        }
    System.out.println("Banyak digit dari bilangan tersebut adalah: " + count);
}
}

    
