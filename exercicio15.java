package Exercicios_listas;

import java.util.Scanner;

public class exercicio15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l1,l2,l3;
        System.out.println("Digite os 3 numeros para vermos se forma um triangulo.");
        l1 = sc.nextInt();
        l2 = sc.nextInt();
        l3 = sc.nextInt();
        if (l1+l2>l3 && l2+l3>l1 && l3+l1>l2){
            System.out.println("Estes numeros formam um triangulo.");
        }else {
            System.out.println("Estes numeros não formam um triangulo.");
        }
    }
}
