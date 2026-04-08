package Exercicios_listas;

import java.util.Scanner;

public class exercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int num1;
        int num2;

        System.out.println("Digite tres numeros inteiros  ");
        num = sc.nextInt();
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        if (num >= num1) {
            if (num > num2) {
                System.out.println("seu maior numero e: "+num);
            }
        } else if (num1>num2) {
            System.out.println("Seu maior numero e: "+num1);
        } else  {
            System.out.println("seu maior numero e: "+num2);
        }
    }}
