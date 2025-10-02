package Exercicios.Arrays;

import java.util.Locale;
import java.util.Scanner;

public class SomaVetor {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros vocÊ quer digitar: ");
        int n = sc.nextInt();

        double [] vetor = new double[n];
        double soma = 0;

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("digite um numero: ");
            vetor[i] = sc.nextDouble();
            sc.nextLine();
            soma += vetor[i];
        }

        System.out.print("Valores =");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(" " + vetor[i]);
            sc.nextLine();
        }
        double media = soma / n;

        System.out.println("Soma = " + soma);
        System.out.println("Media = " + media);
    }

}
