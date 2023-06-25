package Stack_Array;

import java.util.Scanner;

public class NotasiPostfix {
      public static void main(String[] args) {
        try (Scanner sc = new  Scanner(System.in)){
            System.out.print("Masukkan Notasi Postfix :");
            String postfix = sc.nextLine();

            StackArray<Double> stack = new StackArray<>(postfix.length());


            try {
                for (int i = 0; i < postfix.length(); i++) {
                    char chr = postfix.charAt(i);

                    if (Character.isDigit(chr)) {
                        stack.push(Double.parseDouble(String.valueOf(chr)));
                    } else if (StackArray.isOperator(String.valueOf(chr))) {
                        if (stack.size() >= 2) {
                            double operand2 = stack.pop();
                            double operand1 = stack.pop();
                            double result = StackArray.operation(operand1, operand2, String.valueOf(chr));
                            stack.push(result);
                        } else {
                            throw new IllegalArgumentException("Invalid postfix expression: " + postfix);
                        }
                    } else {
                        throw new IllegalArgumentException("Invalid character: " + chr);
                    }
                }

                if (stack.size() == 1) {
                    double result = stack.pop();
                    System.out.println("Evaluasi notasi postfix " + postfix);
                    System.out.println("Hasil akhir: " + result);
                } else {
                    throw new IllegalArgumentException("Invalid postfix expression: " + postfix);
                }
            //Pemisahan
            } catch (NumberFormatException e) {
                System.out.println("Evaluasi notasi postfix " + postfix);
                System.out.println("Postfix invalid ");
            } catch (IllegalArgumentException e) {
                System.out.println("Evaluasi notasi postfix " + postfix);
                System.out.println("Postfix invalid " );
            } catch (NullPointerException e) {
                System.out.println("Evaluasi notasi postfix " + postfix);
                System.out.println("Postfix invalid ");
            }
        }
    }
    
}
