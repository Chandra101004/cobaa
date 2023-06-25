package Tugas;

public class PercobaanString {
    public static void main(String[] args) {
        
    String kataKata = "22523003,HR.Ade Chandrawimba";
    // Isilah kataKata dengan NIM dan nama lengkap Anda
    char hasil_charAt;
    int hasil_length;
    String hasil_substring_1;
    String hasil_substring_2;
    boolean hasil_contains;
    String hasil_join;

    hasil_charAt = kataKata.charAt(5);
    hasil_length = kataKata.length();
    hasil_substring_1 = kataKata.substring(5);
    hasil_substring_2 = kataKata.substring(5,10);
    hasil_contains = kataKata.contains("Tidak Ada");
    hasil_join = String.join(kataKata," dan ", "tambahan ");
    
    System.out.println("yang format dicba sendiri yaa!");
}
}


