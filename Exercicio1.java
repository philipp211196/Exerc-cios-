package Exercicios_listas2_;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num,n1;
        System.out.println("Digite um numero .");
        num = sc.nextInt();
        n1=num%2;
        if (n1==0){
            System.out.println("Seu numero e par "+n1);
        } else {
            System.out.println("Seu numero e impar "+n1);
        }
    }
}
