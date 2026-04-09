package Exercicios_listas2_;

import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1,n2;
        System.out.println("Digite um numero, voce vera se ele e divisivel por 2 e por 3 .");
        n1= sc.nextInt();
        if (n1%2==0&&n1%3==0){
            System.out.println("Seu numero e divisivel ");}
        else {
            System.out.println("seu numero nao e divisivel ");}
    }
}
