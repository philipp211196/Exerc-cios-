package Exercicios_listas;

import java.util.Scanner;

public class exercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1;
        int n2;
        System.out.println("Digite 2 numeros para vermos se são iguais.");
        n1 = sc.nextInt(); n2 = sc.nextInt();
        if (n1==n2){
            System.out.println("Numeros iguais " +n1+ " = " +n2);}
        else {
            System.out.println("Numeros diferentes ");
    }
}}
