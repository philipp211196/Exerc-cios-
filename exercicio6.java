package Exercicios_listas;

import java.util.Scanner;

public class exercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int id;
        System.out.println("Qual a sua idade?");
        id = sc.nextInt();
        if (id >=0 && id < 12) {
            System.out.println("Infantil");
        }
        if (id > 13 && id < 17) {
            System.out.println("Adolescente.");
        }
        if (id > 18 && id < 64) {
            System.out.println("Adulto");
        }if (id>=65){
            System.out.println("Idoso");
        }
        }
    }

