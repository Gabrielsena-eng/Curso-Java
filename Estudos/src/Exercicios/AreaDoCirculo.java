package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class AreaDoCirculo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);
        double area, raio, pi;
        pi = 3.14159;
        System.out.println("Digite o valor do raio do circulo");
        raio = sc.nextDouble();
        area = pi * Math.pow(raio, 2.0);
        sc.close();

        System.out.printf("valor área = %.4f.%n", area);
    }
}
