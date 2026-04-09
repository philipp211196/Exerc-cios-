package Exercicios_listas;

import java.util.Scanner;

public class exercicio14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nota ;
        System.out.println("Digite a nota do aluno : ");
        nota= sc.nextDouble();
        if (nota>=7){
            System.out.println("Aprovado, a nota do aluno e : "+nota);}
        else {
            System.out.println("Aluno reprovado, a nota do aluno foi de "+nota);}

    }
}
