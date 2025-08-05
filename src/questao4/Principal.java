package questao4;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num;
        System.out.print("digite a senha: ");
        num = entrada.nextInt();
        if (num==1234){
            System.out.print("ACESSO PERMITIDO");
        }
        else{
            System.out.print("ACESSO NEGADO");
        }
    }
}
