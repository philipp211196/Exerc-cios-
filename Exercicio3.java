package Exercicios_listas2_;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, n1;
        System.out.println("Digite um numero .");
        num = sc.nextInt();
        n1 = num % 5;
        if (n1 == 0) {
            System.out.println("seu numero e multiplo de 5");
        } else {
            System.out.println("seu numero nao e multiplo de 5");
        }


    }}