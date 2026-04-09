package Exercicios_listas2_;

import java.util.Scanner;

public class exercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1,n2;
        System.out.println("Digite 2 numeros , veremos se o primeiro e divisivel pelo segundo.");
        n1 = sc.nextInt();
        n2 = sc.nextInt();
        n1 = n1%n2;
        if (n1==0){
            System.out.println("Divisão exata");
        }else {
            System.out.println("O resto da divisão é: "+n1);}
    }
}
