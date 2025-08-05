package questao6;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num1, num2, num3;
        System.out.print("digite o primeiro número: ");
        num1 = entrada.nextInt();
        System.out.print("digite o segundo número: ");
        num2 = entrada.nextInt();
        System.out.print("digite o terceiro número: ");
        num3 = entrada.nextInt();
        if (num1 < num2 && num1 < num3) {
            System.out.print("o número " + num1 + " é o menor");
        } else if (num2 < num1 && num2 < num3) {
            System.out.print("o número " + num2 + " é o menor");
        } else {
            System.out.print("o número " + num3 + " é o menor");
        }
    }
}