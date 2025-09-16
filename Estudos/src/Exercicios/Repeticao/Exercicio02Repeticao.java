package Exercicios.Repeticao;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio02Repeticao {
    public static void main(String[] args) {
        //Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir. Cada caso de teste consiste
        //de 3 valores reais, cada um deles com uma casa decimal. Apresente a média ponderada para cada um destes
        //conjuntos de 3 valores, sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem
        //peso 5.
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            double X = sc.nextDouble();
            double Y = sc.nextDouble();
            double Z = sc.nextDouble();

            double mediaPonderada = (X * 2 + Y * 3 + Z * 5)/ 10;
            System.out.printf("Media Ponderada = %.1f%n", mediaPonderada);
            System.out.println("oi");
        }
    }
}
