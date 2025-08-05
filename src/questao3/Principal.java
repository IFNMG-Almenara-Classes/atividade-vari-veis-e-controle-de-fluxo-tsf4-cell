package questao3;

import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num;
        System.out.print("digite o número: ");
        num = entrada.nextInt();
        if (num%2==0){
            System.out.print("o número é par");
        }
        else{
            System.out.print("o número é ímpar");
        }
    }
}