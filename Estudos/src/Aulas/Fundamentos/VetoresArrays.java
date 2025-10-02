package Aulas.Fundamentos;

import java.util.Locale;
import java.util.Scanner;

public class VetoresArrays {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas? ");
        int n = sc.nextInt();
        sc.nextLine();
        double [] Altura = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Imprima o valor " + i+1);
            Altura[i] = sc.nextDouble();
        }

        double soma = 0;
        for (int i = 0; i < n; i++) {
            soma += Altura[i];

        }
        double media = mediaAltura(n, soma);
        System.out.printf("%.2f%n", media);
    }
    public static double mediaAltura(int n, double soma ){
        return soma / n;
    }
}
