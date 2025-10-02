package Exercicios.Arrays;

import java.util.Scanner;

public class ExercicioNegativo {
    public static void main(String[] args) {
        /*Faça um programa que leia um número inteiro positivo N (máximo = 10) e depois N números inteiros
        e armazene-os em um vetor. Em seguida, mostrar na tela todos os números negativos lidos.*/

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] x = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Digite um numero: ");
            x[i] = sc.nextInt();
        }
        System.out.println("Números negativos: ");
        for (int i = 0; i < n; i++) {

            if (x[i] < 0){
                System.out.println(x[i]);
            }
        }
    }
}
