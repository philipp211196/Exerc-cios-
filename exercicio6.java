package Exercicios_listas2_;

import java.util.Scanner;

public class exercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1,n2;
        System.out.println("Escreva dois numeros.");
        n1 = sc.nextInt();
        n2 = sc.nextInt();
        if (n1>n2){
            System.out.println("O numero "+n1+" e o maior.");
        }else {
            System.out.println("O numero " + n2 + " e o maior.");
        }
    }
}
