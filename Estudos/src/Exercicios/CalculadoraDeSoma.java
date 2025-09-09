package Exercicios;

import java.util.Scanner;

public class CalculadoraDeSoma {
    public static void main(String[] args) {
        //Calculadora de números inteiros
        Scanner sc = new Scanner(System.in);
        int num1, num2;
        System.out.println("Digite o primeiro Número:");
        num1 = sc.nextInt();
        sc.nextLine();
        System.out.println("Digite o segundo Número:");
        num2 = sc.nextInt();

        int Soma = num1 + num2;
        sc.close();
        System.out.println("a Soma dos números é igual a " + Soma);
    }
}
