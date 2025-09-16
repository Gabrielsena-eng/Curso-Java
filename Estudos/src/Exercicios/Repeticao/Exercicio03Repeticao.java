package Exercicios.Repeticao;

import java.util.Scanner;

public class Exercicio03Repeticao {
    public static void main(String[] args) {
        //Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1.
        //Lembrando que, por definição, fatorial de 0 é 1.

        Scanner sc = new Scanner(System.in);

        double N = sc.nextInt();
        double fatorial = N;

        if (N == 0) {
            fatorial = 1;
        }
        else {
        for (double i = 1; i < N ; i++) {
            fatorial = fatorial * (N - i);
          }
        }
        System.out.printf("%.400f.%n", fatorial);
    }
}
