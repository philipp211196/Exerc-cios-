package Exercicios_listas;

import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int salario;
        System.out.println("Digite o valor do salario : ");
        salario = sc.nextInt();
        if (salario >=2000) {
            System.out.println("Salario alto ");

        }
        else {
            System.out.println("Salario baixo ");
        }
        sc.close();

    }
}
