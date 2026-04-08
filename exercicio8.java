package Exercicios_listas;

import java.util.Scanner;

public class exercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Digite um numero para ver se ele é positivo ou negativo.");
        num = sc.nextInt();
        if (num>=0) {
            System.out.println("Seu numero é positivo.");
        }else {
            System.out.println("Seu numero e negativo.");
        }
    }
}
