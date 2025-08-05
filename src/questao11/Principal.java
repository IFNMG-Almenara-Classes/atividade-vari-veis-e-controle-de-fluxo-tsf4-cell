package questao11;

import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num;
        System.out.print("digite um número inteiro e positivo: ");
        num = entrada.nextInt();
        for (int i = 0; i <= num; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}