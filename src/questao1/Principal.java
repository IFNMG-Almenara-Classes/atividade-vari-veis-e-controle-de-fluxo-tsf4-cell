package questao1;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num1, num2;
        System.out.print("digite o primeiro número: ");
        num1 = entrada.nextInt();
        System.out.print("digite o segundo número: ");
        num2 = entrada.nextInt();
        if (num1 > num2 == true) {
            System.out.print("o número 1 é maior que o número 2");
        } else if (num2 > num1) {
            System.out.print("o número 2 é maior que o número 1");
        } else {
            System.out.print("os números são iguais");
        }
    }
}