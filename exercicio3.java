package Exercicios_listas;

import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int temp;
        System.out.println("Digite a temperatura :");
        temp = sc.nextInt();
        if (temp>=40){
            System.out.println("temperatura muito elevada ");
        }
        else{
            System.out.println("temperatura dentro dos parametros normais ");
        }
        sc.close();
    }
}
