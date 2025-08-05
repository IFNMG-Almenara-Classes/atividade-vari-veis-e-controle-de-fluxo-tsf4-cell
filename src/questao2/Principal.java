package questao2;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float peso, altura, imc;
        System.out.print("digite o seu peso: ");
        peso = entrada.nextFloat();
        System.out.print("digite sua altura: ");
        altura = entrada.nextFloat();
        imc = peso / (altura * altura);
        if (imc < 18.5) {
            System.out.print("Seu IMC é " + imc + " e você está magro");
        } else if (imc > 18.5 && imc < 24.9) {
            System.out.print("Seu IMC é " + imc + " e você está saudável");
        } else if (imc > 25 && imc < 29.9) {
            System.out.print("Seu IMC é " + imc + " e você está com sobrepeso");
        } else if (imc > 30 && imc < 34.9) {
            System.out.print("Seu IMC é " + imc + " e você está com obesidade Grau 1");
        } else if (imc > 35 && imc < 39.9) {
            System.out.print("Seu IMC é " + imc + " e você está com obesidade Grau 2 (severa)");
        } else if (imc >= 40) {
            System.out.print("Seu IMC é " + imc + " e você está com obesidade Grau 3 (mórbida)");
        }
    }
}