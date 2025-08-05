package questao5;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num;
        System.out.print("digite o número de laranjas: ");
        num = entrada.nextInt();
        if (num<12){
            System.out.print("O valor total da compra é: " + num * 0.5 + " reais");
        }
        else{
            System.out.print("O valor total da compra é " + num * 0.3 + " reais");
        }
    }
}
