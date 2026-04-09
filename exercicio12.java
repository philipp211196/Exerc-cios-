package Exercicios_listas;

import java.util.Scanner;

public class exercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2, num3;

        System.out.println("Digite tres numeros inteiros  ");
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        num3 = sc.nextInt();
        if (num1>num2 && num1>num3){
            System.out.println("O numero "+num1+" e o maior.");
        } else if (num2>num1 && num2>num3) {
            System.out.println("O numero "+num2+" e o maior");
        }
        else {
            System.out.println("O numero "+num3+" e o maior.");
        }
        if (num1<num2 && num1<num3){
            System.out.println("O numero "+num1+" e menor");
        } else if (num2<num1 && num2<num3) {
            System.out.println("O numero "+num2+ " e o menor");
        }else {
            System.out.println("O numero "+num3+" e o menor");
        }
    }
}









