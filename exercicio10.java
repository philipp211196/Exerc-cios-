package Exercicios_listas2_;

import java.util.Scanner;

public class exercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int senha;
        String nome;
        System.out.println("Digite seu nome.");
        nome=sc.nextLine();
        System.out.println("Digite sua senha.");
        senha = sc.nextInt();
        if (senha == 1234) {
            System.out.println("Acesso permitido."+nome);
        } else {
            System.out.println("Acesso negado.");
        }
    }
}