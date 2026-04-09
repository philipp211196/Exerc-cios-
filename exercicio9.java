package Exercicios_listas2_;

import java.util.Scanner;

public class exercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double valor;
        double soma;
        System.out.println("Qual o valor do seu produto?");
        valor = sc.nextDouble();
        if (valor >= 100) {
            soma = valor - (valor * 0.1);
            System.out.printf("O valor do seu produto com desconto ficara: R$%.2f%n", soma);
        } else {
            System.out.printf("valor sem desconto R$%.2f%n", valor);

        }
    }}
