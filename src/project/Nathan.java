package project;

import java.util.Scanner;

public class Nathan{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite sua primeira nota: ");
        double nota1 = sc.nextDouble();
        System.out.println("Digite sua segunda nota: ");
        double nota2 = sc.nextDouble();

        double mediaSimples = (nota1 + nota2) / 2;

        if (mediaSimples >= 7) {
            System.out.println("aprovado");
        }
        else {
            System.out.println("reprovado");
        }
    }
}