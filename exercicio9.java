package Exercicios_listas;

import java.util.Scanner;

public class exercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int temp;
        System.out.println("Qual a Temperatura ?");
        temp= sc.nextInt();

        if (temp <=0 &&  temp< 15) {
            System.out.println("Frio");
        }
        if (temp >= 15 && temp < 25) {
            System.out.println("Agradavél.");
        }
        if (temp >= 25 ) {
            System.out.println("quente");}

    }}

