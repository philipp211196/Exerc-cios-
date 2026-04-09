package Exercicios_listas;

import java.util.Scanner;

public class exercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ano;
        int bis;
        System.out.println("Digite o ano abaixo.");
        ano = sc.nextInt();
        if((ano%4==0)&&(ano%100!= 0)||(ano%400==0)){
            System.out.println("É ano bissexto.");
        }
        else {
            System.out.println("Não é ano bissexto.");
        }

    }
}
