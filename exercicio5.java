package Exercicios_listas;

import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int id;
        System.out.println("Digite sua idade ");
        id= sc.nextInt();
        if (id>=16 ){
            System.out.println("Voto permitido. ");}
        else {
            System.out.println("Volte depois, voto ainda não permitido. ");}
    }
}
