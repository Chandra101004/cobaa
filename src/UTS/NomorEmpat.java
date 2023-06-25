package UTS;
import java.util.Scanner;

import java.util.Stack;

public class NomorEmpat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nama = "hradechandrawimba";
        Stack <String> stack = new Stack<>();
        for (int i = 0; i < nama.lastIndexOf(nama); i++) {
            stack.push(nama);
    }
    System.out.println("Nama Asli: HR ADE CHANDRAWIMBA");
    while (!stack.empty()) {
        System.out.println(stack.pop());
    }
    for (int i = 0; i < nama.lastIndexOf(nama); i++) {
        stack.push(nama);
    }
    for (int i = 0; i < nama.lastIndexOf(nama); i++) {
        nama = stack.pop();
    }   
    System.out.println("Nama Setelah dibalik: ABMIWARDNAHC EDA RH:");
    for (int i = 0; i < nama.lastIndexOf(nama); i++) {
        System.out.println(nama);
    }
}
}

