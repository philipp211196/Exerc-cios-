package Exercicios_listas2_;

import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int id,ida;
        System.out.println("Digite a sua data de nascimento e a data atual.");
        id = sc.nextInt();
        ida= sc.nextInt();
        id = ida-id;
        if (id>=18){
            System.out.println("Maior de idade.");
        }
        else {
            System.out.println("Menor de idade.");
        }
    }
}
