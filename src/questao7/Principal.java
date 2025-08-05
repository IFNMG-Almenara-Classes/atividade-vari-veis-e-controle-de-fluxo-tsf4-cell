package questao7;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float lado1, lado2, lado3;
        System.out.print("digite o primeiro lado: ");
        lado1 = entrada.nextFloat();
        System.out.print("digite o segundo lado: ");
        lado2 = entrada.nextFloat();
        System.out.print("digite o terceiro lado: ");
        lado3 = entrada.nextFloat();
        if (lado1 == lado2 && lado2 == lado3) {
            System.out.print("o triângulo é equilátero ");
        }
        else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3){
            System.out.print("o triângulo é isósceles ");
        }
        else {
            System.out.print("O triângulo é escaleno");
        }
    }
}